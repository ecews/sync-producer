package com.ecews.mqlamisplus.service;

import com.ecews.mqlamisplus.Repository.hivrepo.HIVEacRepo;
import com.ecews.mqlamisplus.models.hiv.ARTClinical;
import com.ecews.mqlamisplus.models.hiv.HIVEac;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HIVEacService {

   @Autowired
    HIVEacRepo hivEacRepo;
    public List<HIVEac> getHIVEacFromLamisPlusDb() {

        List<HIVEac> hivEacs = hivEacRepo.findAll();

        return hivEacs;
    }
}
