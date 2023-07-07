package com.ecews.mqlamisplus.service;


import com.ecews.mqlamisplus.Repository.PatientTrackerRepo;
import com.ecews.mqlamisplus.models.entities.hiv.PatientTracker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PatientTrackerService {


    @Autowired
    PatientTrackerRepo patientTrackerRepo;
    public List<PatientTracker> getpatientTrackerFromLamisPlusDb() {

        List<PatientTracker> patientTrackers = patientTrackerRepo.findAll();

        return patientTrackers;
    }
}
