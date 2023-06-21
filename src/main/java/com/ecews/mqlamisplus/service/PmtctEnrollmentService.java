package com.ecews.mqlamisplus.service;


import com.ecews.mqlamisplus.Repository.pmtc.PmtctEnrollmentRepo;
import com.ecews.mqlamisplus.models.pmtc.PMTCTEnrollment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PmtctEnrollmentService {

    @Autowired
    PmtctEnrollmentRepo pmtctEnrollmentRepo;
    public List<PMTCTEnrollment> getPmtctFromLamisPlusDb() {


        List<PMTCTEnrollment> pmtctEnrollments= pmtctEnrollmentRepo.findAll();

        return pmtctEnrollments;


    }
}
