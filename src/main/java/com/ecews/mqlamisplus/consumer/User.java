//package com.ecews.mqlamisplus.consumer;
//
//import com.ecews.mqlamisplus.Repository.DestinationRepo.DestinationRepo;
//import com.ecews.mqlamisplus.Repository.PersonRepo.PersonRepo;
//import com.ecews.mqlamisplus.config.MessagingConfig;
//import com.ecews.mqlamisplus.Repository.PatientRepo;
//import com.ecews.mqlamisplus.Repository.PatientStatusRepo;
//import com.ecews.mqlamisplus.entity.DestinationPerson.models.DestinationPerson;
//import com.ecews.mqlamisplus.entity.Person.models.Person;
//import com.ecews.mqlamisplus.service.PersonService;
//import org.springframework.amqp.rabbit.annotation.RabbitListener;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Qualifier;
//import org.springframework.stereotype.Component;
//
//
//@Component
//public class User {
//
//@Autowired
//    PatientStatusRepo patientStatusRepo;
//
//@Autowired
//    PatientRepo patientRepo;
//
//    @Autowired
//    @Qualifier("sourceDataSource")
//    private PersonRepo personRepo;
//
//    @Autowired
//    @Qualifier("destinationDataSource")
//    private DestinationRepo destinationRepo;
//
//@Autowired
//    PersonService personService;
//
//
//    @RabbitListener(queues = MessagingConfig.PATIENTQUEUE)
//    public void consumeMessageFromPatientQueue(Person person){
////
////        patientStatusRepo.save(patientStatus);
////        System.out.println("Message Recieved from Queue " + person);
//////
////
////
////        DestinationPerson destinationPerson =  personService.convertPersonToPersonCopy(person);
////
////        destinationRepo.save(destinationPerson);
////
////        System.out.println("All Patients saved in the Database Successfully" + person);
//
//        DestinationPerson destinationPerson = personService.convertPersonToPersonCopy(person);
//
//        // Check if the record with the same UUID already exists in the destination database
//        DestinationPerson existingPerson = destinationRepo.findByUuid(person.getUuid());
//
//        if (existingPerson != null) {
//            // Update the existing record with the new data
//            existingPerson.setFirstName(person.getFirstName());
//            existingPerson.setSurname(person.getSurname());
//            // Update other properties as needed
//
//            destinationRepo.save(existingPerson);
//            System.out.println("Person record updated in the destination database: " + existingPerson);
//        } else {
//            // Insert a new record in the destination database
//            destinationRepo.save(destinationPerson);
//            System.out.println("New person record inserted into the destination database: " + destinationPerson);
//        }
//
//
//    }
//
//}
