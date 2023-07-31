package com.ecews.mqlamisplus.service;


import com.ecews.mqlamisplus.Repository.laboratory.SampleRepo;
import com.ecews.mqlamisplus.entity.models.laboratory.Sample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SampleService {

    @Autowired
    SampleRepo sampleRepo;

    public List<Sample> getSampleFromLamisPlusDb() {

        List<Sample> samples = sampleRepo.findAll();

        return samples;

    }
}

