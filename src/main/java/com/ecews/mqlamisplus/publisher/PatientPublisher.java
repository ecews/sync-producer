package com.ecews.mqlamisplus.publisher;


import com.ecews.mqlamisplus.config.MessagingConfig;
import com.ecews.mqlamisplus.models.entities.Patient;
import com.ecews.mqlamisplus.models.entities.PatientStatus;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/patient")
public class PatientPublisher {

    @Autowired
    private RabbitTemplate template;
   @PostMapping("/")
    public String patientOrder(@RequestBody Patient patient){

//        patient.setPatientId(UUID.randomUUID().toString());

//       patient.setPatientId(Integer.valueOf(UUID.randomUUID().toString()));

//       patient.setPatientId(23);

        PatientStatus patientStatus = new PatientStatus(patient.getPatientId(),"PROCESSING", "Patient created successfully");
//        template.convertAndSend(MessagingConfig.EXCHANGE, MessagingConfig.ROUTING_KEY,patientStatus);
       template.convertAndSend(MessagingConfig.EXCHANGE, MessagingConfig.ROUTING_KEY,patient);
        return "Success !!!";

    }


}
