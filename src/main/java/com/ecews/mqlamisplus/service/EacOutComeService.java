package com.ecews.mqlamisplus.service;

import com.ecews.mqlamisplus.Repository.hivrepo.EacOutComeRepo;
import com.ecews.mqlamisplus.models.entities.hiv.EacOutCome;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EacOutComeService {

    @Autowired
    EacOutComeRepo eacOutComeRepo;
    public List<EacOutCome> getEacOutComeFromLamisPlusDb() {

       List<EacOutCome>  eacOutComes = eacOutComeRepo.findAll();

       return eacOutComes;

    }
}
