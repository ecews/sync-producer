package com.ecews.mqlamisplus.controllers;


import com.ecews.mqlamisplus.entity.views.PersonView;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Slf4j
@RequestMapping("/api/v1/initialSync")
public class InitialClientSyncController {


//    @GetMapping("/")
//    public List<PersonView> getPersons (){
//        return personService.getAllPerson();
//    }
}
