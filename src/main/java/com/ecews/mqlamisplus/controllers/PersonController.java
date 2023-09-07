package com.ecews.mqlamisplus.controllers;

import com.ecews.mqlamisplus.entity.views.PersonView;
import com.ecews.mqlamisplus.publisher.kafkaproducer.impl.PatientProducer;
import com.ecews.mqlamisplus.service.PersonService;
import com.ecews.mqlamisplus.utility.kafka.TopicsConstantsUtils;
import lombok.extern.slf4j.Slf4j;
import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.Producer;
import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.apache.kafka.common.serialization.StringSerializer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Properties;

@RestController
@Slf4j
@RequestMapping("/api/v1/person")
public class PersonController {

    @Autowired
    PersonService personService;

    @Autowired
    PatientProducer patientProducer;

    @GetMapping("/")
    public void getGeneratePersonAndSendToKafka (){


        patientProducer.produceSendToKafkaAndSyncData();
//        return personService.getAllPerson();
    }


    @GetMapping("/persons")
    public List<PersonView> getPersons (){

        return personService.getAllPerson();
    }



    @GetMapping("/personsSerialize")
    public void generatePersonAndSendToken(){


        Properties properties = new Properties();
        properties.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, "localhost:9092");
        properties.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, StringSerializer.class.getName()); // Key serializer
        properties.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, com.ecews.mqlamisplus.config.kafka.CustomPersonViewSerializer.class.getName()); // Custom PersonView serializer

        Producer<String, PersonView> producer = new KafkaProducer<>(properties);

        List<PersonView> personView = personService.getAllPerson();


        personView.stream().forEach(
                patient -> {
                    final ProducerRecord<String, PersonView> record = new ProducerRecord<>(TopicsConstantsUtils.PERSON_TOPIC, patient);
                    producer.send(record);
//                    producer.close();
//
                }
        );


    }

}
