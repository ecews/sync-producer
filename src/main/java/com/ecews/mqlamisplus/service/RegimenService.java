package com.ecews.mqlamisplus.service;

import com.ecews.mqlamisplus.Repository.RegimentRepo.RegimenRepo;
import com.ecews.mqlamisplus.models.hiv.Regimen;
import com.ecews.mqlamisplus.models.hiv.RegimenType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RegimenService {

    @Autowired
    RegimenRepo regimenRepo;

    public List<Regimen> getAllRegimenTypeFromLamisPlusDb() {

        List<Regimen> regimens = regimenRepo.findAll();

        return regimens;
    }
}
