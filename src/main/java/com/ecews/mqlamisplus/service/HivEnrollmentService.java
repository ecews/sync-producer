package com.ecews.mqlamisplus.service;

import com.ecews.mqlamisplus.Repository.hivrepo.HivEnrollmentRepo;
import com.ecews.mqlamisplus.models.entities.hiv.HivEnrollment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class HivEnrollmentService {
    @Autowired
    HivEnrollmentRepo hivenrollmentrepo;


    public List<HivEnrollment> getHivDrugsFromLamisPlusDb() {

        List<HivEnrollment> hivEnrollments = hivenrollmentrepo.findAll();

        return hivEnrollments;
    }

}
