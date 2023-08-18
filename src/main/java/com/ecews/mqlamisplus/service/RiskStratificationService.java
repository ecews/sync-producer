package com.ecews.mqlamisplus.service;


import com.ecews.mqlamisplus.Repository.hts.RiskStratificationRepo;
import com.ecews.mqlamisplus.entity.models.hts.RiskStratification;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RiskStratificationService {

    @Autowired
    RiskStratificationRepo riskStratificationRepo;

    public List<RiskStratification> getRiskStratificationFromLamisPlusDb() {

        List<RiskStratification> riskStratifications =  riskStratificationRepo.findAll();

        return riskStratifications;
    }
}
