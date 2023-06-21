package com.ecews.mqlamisplus.service;

import com.ecews.mqlamisplus.Repository.lims.LIMSResultRepo;
import com.ecews.mqlamisplus.models.lims.LIMSResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LIMSResultService {
    @Autowired
    LIMSResultRepo limsResultRepo;


    public List<LIMSResult> getLIMSResultFromLamisPlusDb() {

        List<LIMSResult> limsResults = limsResultRepo.findAll();

        return limsResults;

    }
}
