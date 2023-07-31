package com.ecews.mqlamisplus.service;

import com.ecews.mqlamisplus.Repository.lims.LIMSSampleRepo;
import com.ecews.mqlamisplus.entity.models.lims.LIMSSample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LIMSSampleService {

    @Autowired
    LIMSSampleRepo limsSampleRepo;
    public List<LIMSSample> getLIMSSampleFromLamisPlusDb() {

        List<LIMSSample> limsSamples = limsSampleRepo.findAll();

        return limsSamples;
    }
}
