package com.ecews.mqlamisplus.service;


import com.ecews.mqlamisplus.Repository.prep.PrepEligibilityRepo;
import com.ecews.mqlamisplus.entity.models.prep.PrepEligibility;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PrepEligibilityService {

    @Autowired
    PrepEligibilityRepo prepEligibilityRepo;

    public List<PrepEligibility> getPrepEligibilityFromLamisPlusDb() {

        List<PrepEligibility> prepEligibilities = prepEligibilityRepo.findAll();

        return  prepEligibilities;

    }
}
