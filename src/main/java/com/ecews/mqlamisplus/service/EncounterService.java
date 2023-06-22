package com.ecews.mqlamisplus.service;


import com.ecews.mqlamisplus.Repository.PersonRepo.EncounterRepo;
import com.ecews.mqlamisplus.models.Person.Encounter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EncounterService {


    @Autowired
    EncounterRepo encounterRepo;
    public List<Encounter> getEncounterFromLamisPlusDb() {

        List<Encounter> encounters = encounterRepo.findAll();

        return encounters;

    }
}
