package com.ecews.mqlamisplus.service;


import com.ecews.mqlamisplus.Repository.prep.PrepInterruptionRepo;
import com.ecews.mqlamisplus.models.prep.PrepInterruption;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PrepInterruptionService {

    @Autowired
    PrepInterruptionRepo prepInterruptionRepo;

    public List<PrepInterruption> getPrepClinicFromLamisPlusDb() {

        List<PrepInterruption> prepInterruptions = prepInterruptionRepo.findAll();
        return prepInterruptions;
    }
}
