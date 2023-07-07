package com.ecews.mqlamisplus.service;

import com.ecews.mqlamisplus.Repository.visitrepo.VisitRepo;
import com.ecews.mqlamisplus.models.entities.visit.Visit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class VisitService {


    @Autowired
    VisitRepo visitRepo;

    public List<Visit> getAllVisitsFromLamisPlusDb(){


        List<Visit> visits = visitRepo.findAll();

        return visits;
    }
}
