package com.ecews.mqlamisplus.service;

import com.ecews.mqlamisplus.Repository.laboratory.ResultRepo;
import com.ecews.mqlamisplus.models.laboratory.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ResultService {

    @Autowired
    ResultRepo resultRepo;
    public List<Result> getResultsFromLamisPlusDb() {

        List<Result> results = resultRepo.findAll();

        return results;
    }
}
