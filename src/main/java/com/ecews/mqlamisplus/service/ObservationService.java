package com.ecews.mqlamisplus.service;

import com.ecews.mqlamisplus.Repository.hivrepo.ObservationRepo;
import com.ecews.mqlamisplus.entity.models.hiv.Observation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ObservationService {

    @Autowired
    ObservationRepo observationRepo;


    public List<Observation> getObservationFromLamisPlusDb() {

        List<Observation> observations = observationRepo.findAll();

        return observations;
    }
}
