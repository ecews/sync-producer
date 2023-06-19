package com.ecews.mqlamisplus.service;


import com.ecews.mqlamisplus.Repository.hivrepo.HIVStatusTrackerRepo;
import com.ecews.mqlamisplus.models.hiv.HIVStatusTracker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HIVStatusTrackerService {


    @Autowired
    HIVStatusTrackerRepo hivStatusTrackerRepo;

    public List<HIVStatusTracker> getHivStatusTrackerFromLamisPlusDb() {

        List<HIVStatusTracker> hivStatusTrackers = hivStatusTrackerRepo.findAll();

        return  hivStatusTrackers;
    }
}
