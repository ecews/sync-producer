package com.ecews.mqlamisplus.service;


import com.ecews.mqlamisplus.Repository.pmtc.AncRepo;
import com.ecews.mqlamisplus.entity.models.pmtc.ANC;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AncService {

    @Autowired
    AncRepo ancRepo;

    public List<ANC> getAncFromLamisPlusDb() {

        List<ANC> ancs = ancRepo.findAll();

        return ancs;

    }
}
