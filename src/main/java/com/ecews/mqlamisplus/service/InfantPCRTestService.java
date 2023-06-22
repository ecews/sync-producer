package com.ecews.mqlamisplus.service;


import com.ecews.mqlamisplus.Repository.pmtc.InfantPCRTestRepo;
import com.ecews.mqlamisplus.models.pmtc.InfantPCRTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InfantPCRTestService {

    @Autowired
    private InfantPCRTestRepo infantPCRTestRepo;
    public List<InfantPCRTest> getInfantPCRTestLamisPlusDb() {

        List<InfantPCRTest> infantPCRTests = infantPCRTestRepo.findAll();

        return  infantPCRTests;


    }
}
