package com.ecews.mqlamisplus.service;


import com.ecews.mqlamisplus.Repository.prep.PrepEnrollmentRepo;
import com.ecews.mqlamisplus.models.entities.prep.PrepEnrollment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PrepEnrollmentService {

    @Autowired
    PrepEnrollmentRepo prepEnrollmentRepo;

    public List<PrepEnrollment> getPrepEnrollmentFromLamisPlusDb() {

        List<PrepEnrollment> prepEnrollments = prepEnrollmentRepo.findAll();

        return prepEnrollments;

    }
}
