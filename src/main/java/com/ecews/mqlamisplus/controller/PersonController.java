package com.ecews.mqlamisplus.controller;

import com.ecews.mqlamisplus.service.PersonService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@Slf4j
@RestController
@RequestMapping("/api/v1/persons")
public class PersonController {



   private final PersonService personService ;

    public PersonController(PersonService personService) {
        this.personService = personService;
    }

//    @GetMapping
//    public List<PersonView> getAllPersons(){
//
//        var patients = personService.getAllPersons();
//
//        // AtomicReference<LocalDateTime> maxLastModifiedDateForPerson = null;
//
//        Integer targetSize = 100;
//
//        // Batching to max of 100 per payload
//        // TODO introduce SpringBatch
//        var newList = IntStream.range(0, patients.size())
//                        .boxed()
//                                .collect(Collectors.groupingBy(partition -> (partition / targetSize),
//                                        Collectors.mapping(elementIndex -> patients.get(elementIndex), Collectors.toList()))).values();
//
//        System.out.println("Original List size ****** " + patients.size());
//        System.out.println("New List size ****** " + newList.size());
//        newList.forEach(l -> {
//
//            List<InitialPersonPull> initialPersonPulls = new ArrayList<>();
//
//            var patientUUIDs = l.stream()
//                            .map(PersonView::getUuid)
//                                    .collect(Collectors.toList());
//
//            l.stream()
//                    .parallel()
//                    .forEach(list -> {
//                        // Currrently getting for one
//                        InitialPersonPull initialPersonPull = new InitialPersonPull();
//
//                        initialPersonPull.setMessageType("Initial");
//
//                                // Get all Lab order
//                                var listOfPatientLabOrders = getPatientLabOrders(patientUUIDs);
//
//                                listOfPatientLabOrders.stream()
//                                        .filter()
//
//                                // Compare and take for each patient
//
//                        initialPersonPull.setInitialLabOrderPulls();
//
//                        // Get all result
//                        var listOfAllResult = getPatientResult(patientUUIDs);
//                        // get current patient result list
//                        var currentResultList = ***
//                        initialPersonPull.setInitialResultPulls(currentResultList);
//
//                        initialPersonPulls.add(initialPersonPull);
//                    });
//
//
//            System.out.println("List size ****** " + l.size());
//
//
//        });
//
//        /*patients
//                .stream()
//                .parallel()
//                        .forEach(p -> {
//                            // Get and set lab order
//
//                            // Get and set result
//
//                            // Get and set pharmacy
//
//                            maxLastModifiedDateForPerson.set(p.getLastModifiedDate());
//                        });
//*/
//
//        // System.out.println("MAX Date is *************** " + maxLastModifiedDate);
//
//        return patients;
//    }

}
