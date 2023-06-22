package com.ecews.mqlamisplus.service;

import com.ecews.mqlamisplus.Repository.pmtc.InfantVisitRepo;
import com.ecews.mqlamisplus.models.pmtc.InfantVisit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InfantVisitService {

    @Autowired
    InfantVisitRepo infantVisitRepo;
    public List<InfantVisit> getInfantVisitServiceLamisPlusDb() {

        List<InfantVisit> infantVisits = infantVisitRepo.findAll();

        return  infantVisits;
    }
}
