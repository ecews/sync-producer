package com.ecews.mqlamisplus.service;

import com.ecews.mqlamisplus.Repository.laboratory.TestRepo;
import com.ecews.mqlamisplus.entity.models.laboratory.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TestService {


    @Autowired
    TestRepo testRepo;
    public List<Test> getTestFromLamisPlusDb() {

        List<Test> tests = testRepo.findAll();

        return  tests;

    }
}
