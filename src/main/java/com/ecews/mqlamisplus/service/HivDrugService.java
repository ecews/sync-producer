package com.ecews.mqlamisplus.service;

import com.ecews.mqlamisplus.Repository.hivrepo.HivDrugRepo;
import com.ecews.mqlamisplus.models.entities.hiv.HIVDrug;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HivDrugService {


    @Autowired
    HivDrugRepo hivDrugRepo;
    public List<HIVDrug> getHivDrugsFromLamisPlusDb() {

        List<HIVDrug> hivDrugs = hivDrugRepo.findAll();

        return hivDrugs;
    }
}
