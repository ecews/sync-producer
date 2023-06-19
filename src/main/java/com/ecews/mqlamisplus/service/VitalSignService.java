package com.ecews.mqlamisplus.service;

import com.ecews.mqlamisplus.Repository.VitalSign.VitalSignRepo;
import com.ecews.mqlamisplus.models.Person.Person;
import com.ecews.mqlamisplus.models.triage.VitalSign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VitalSignService {


    @Autowired
    VitalSignRepo vitalSignRepo;


    public List<VitalSign> getVitalSignsFromLamisPlusDb(){

        List<VitalSign> vitalSigns = vitalSignRepo.findAll();

        return vitalSigns;
    }
}
