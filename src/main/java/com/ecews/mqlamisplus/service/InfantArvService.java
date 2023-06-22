package com.ecews.mqlamisplus.service;

import com.ecews.mqlamisplus.Repository.pmtc.InfantArvRepo;
import com.ecews.mqlamisplus.models.pmtc.InfantArv;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InfantArvService {

    @Autowired
    InfantArvRepo infantArvRepo;

    public List<InfantArv> getInfantArvLamisPlusDb() {

        List<InfantArv> infantArvs = infantArvRepo.findAll();

        return  infantArvs;

    }
}
