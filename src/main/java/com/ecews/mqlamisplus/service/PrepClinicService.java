package com.ecews.mqlamisplus.service;

import com.ecews.mqlamisplus.Repository.prep.PrepClinicRepo;
import com.ecews.mqlamisplus.entity.models.prep.PrepClinic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PrepClinicService {


    @Autowired
    PrepClinicRepo prepClinicRepo;
    public List<PrepClinic> getPrepClinicFromLamisPlusDb() {

        List<PrepClinic> prepClinics = prepClinicRepo.findAll();

        return prepClinics;

    }
}
