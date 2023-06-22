package com.ecews.mqlamisplus.service;

import com.ecews.mqlamisplus.Repository.pmtc.PmtctVisitRepo;
import com.ecews.mqlamisplus.models.pmtc.PmtctVisit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PmtctVisitService {

    @Autowired
    PmtctVisitRepo pmtctVisitRepo;

    public List<PmtctVisit> getPmtctVisitServiceLamisPlusDb() {

        List<PmtctVisit> pmtctVisits = pmtctVisitRepo.findAll();

        return  pmtctVisits;
    }
}
