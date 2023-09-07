package com.ecews.mqlamisplus.publisher.kafkaproducer.impl;


import com.ecews.mqlamisplus.entity.enumerations.SyncStatus;
import com.ecews.mqlamisplus.entity.models.dataSync.DataSync;
import com.ecews.mqlamisplus.entity.views.PersonView;
import com.ecews.mqlamisplus.service.DataSyncService;
import com.ecews.mqlamisplus.service.PersonService;
import com.ecews.mqlamisplus.utility.kafka.TopicsConstantsUtils;
import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.core.KafkaProducerException;
import org.springframework.kafka.core.KafkaSendCallback;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.SendResult;
import org.springframework.stereotype.Component;
import org.springframework.util.concurrent.ListenableFuture;
import com.ecews.mqlamisplus.publisher.kafkaproducer.ProducerImpl;
import com.ecews.mqlamisplus.entity.views.parameters.SyncRecordParameters;

import java.util.List;
import java.util.Properties;
import java.util.UUID;

@Component
public class PatientProducer implements ProducerImpl {

    private final KafkaTemplate<String, List<PersonView>> patientsKafkaTemplate;
    private final KafkaTemplate<String, PersonView> patientKafkaTemplate;
    private final PersonService personService;
    private static final Logger logger = LoggerFactory.getLogger(PatientProducer.class.getSimpleName());
    private final DataSyncService dataSyncService;

    public PatientProducer(
            KafkaTemplate<String, List<PersonView>> patientsKafkaTemplate,
            KafkaTemplate<String, PersonView> patientKafkaTemplate,
            PersonService personService,
            DataSyncService dataSyncService,
            Properties properties) {
        this.patientsKafkaTemplate = patientsKafkaTemplate;
        this.patientKafkaTemplate = patientKafkaTemplate;
        this.personService = personService;
        this.dataSyncService = dataSyncService;
    }


    public static void main(String[] args) {
        // Create a Properties object
        Properties properties = new Properties();
//        properties.put("bootstrap.servers", "your-bootstrap-server");
        properties.put("key.serializer", "org.apache.kafka.common.serialization.StringSerializer");
        properties.put("value.serializer", "com.example.PersonViewSerializer");




    }

    @Override
    public void produceAndSyncData(SyncRecordParameters syncRecordParameters) {

        List<PersonView> personViews;

        personViews = personService.getPatientByMaxTime(syncRecordParameters.lastSyncDateTime);

        personViews.stream().forEach(
                patient -> {
                    final ProducerRecord<String, PersonView> record = new ProducerRecord<>(TopicsConstantsUtils.PERSON_TOPIC, patient.getUuid(), patient);
                    ListenableFuture<SendResult<String, PersonView>> future = patientKafkaTemplate
                            .send(record);

                    future
                            .addCallback(new KafkaSendCallback<String, PersonView>() {
                                @Override
                                public void onFailure(KafkaProducerException e) {
                                    logger.error("Old patient -> {}", e.getMessage());
                                }

                                @Override
                                public void onSuccess(SendResult<String, PersonView> result) {
                                    handlePatientProducerSuccess(patient);
                                }
                            });
                }
        );
    }






    public void produceSendToKafkaAndSyncData() {

        List<PersonView> personViews;

        personViews = personService.getAllPerson();

        personViews.stream().forEach(
                patient -> {
//                    final ProducerRecord<String, PersonView> record = new ProducerRecord<>(TopicsConstantsUtils.PERSON_TOPIC, patient.getUuid(), patient);

                    final ProducerRecord<String, PersonView> record = new ProducerRecord<>(TopicsConstantsUtils.PERSON_TOPIC, patient);
//

                    patientKafkaTemplate
                            .send("topic_patient",patient);
//                    ListenableFuture<SendResult<String, PersonView>> future = patientKafkaTemplate
//                            .send(record);
//
//                    future
//                            .addCallback(new KafkaSendCallback<String, PersonView>() {
//                                @Override
//                                public void onFailure(KafkaProducerException e) {
//                                    logger.error("Old patient -> {}", e.getMessage());
//                                }
//
//                                @Override
//                                public void onSuccess(SendResult<String, PersonView> result) {
//                                    handlePatientProducerSuccess(patient);
//                                }
//                            });
                }
        );
    }












    private void handlePatientProducerSuccess(PersonView person){

        // Updating the record status
        personService.updateSyncStatus(person.getUuid(), SyncStatus.PROCESSING.toString());

        DataSync dataSync = dataSyncService.getDataSync(UUID.fromString(person.getUuid()));

        System.out.println(">>>>>>>>>>>>> Sent to Kafka Successfully");

//        SyncRecordParameters syncRecordParameters = new SyncRecordParameters();
//
//        syncRecordParameters.lastSyncDateTime = LocalDateTime.now();
//        syncRecordParameters.facilityId = person.getFacilityId();
//                syncRecordParameters.tableName = ;



//        if(dataSync == null){
//            DataSync newDataSync = new DataSync();
//            newDataSync.setPatientId(UUID.fromString(person.getUuid()));
//            newDataSync.setPatientTableSyncDate(person.getLastModified());
//            newDataSync.setFacilityId(person.getFacilityId());
//            dataSyncService.save(newDataSync);
//
//        }else {
//            // dataSync.setPatientId(UUID.fromString(patient.getUuid()));
//            dataSync.setPatientTableSyncDate(person.getLastModified());
//            dataSyncService.save(dataSync);
//        }


    }


}
