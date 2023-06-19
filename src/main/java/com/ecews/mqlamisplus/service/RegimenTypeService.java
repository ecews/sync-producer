package com.ecews.mqlamisplus.service;

import com.ecews.mqlamisplus.Repository.RegimentTypeRepo.RegimenTypeRepo;
import com.ecews.mqlamisplus.models.hiv.HIVDrug;
import com.ecews.mqlamisplus.models.hiv.RegimenType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RegimenTypeService {

    @Autowired
    RegimenTypeRepo regimenTypeRepo;

    public List<RegimenType> getAllRegimenTypeFromLamisPlusDb() {

        List<RegimenType> regimenTypes = regimenTypeRepo.findAll();

        return regimenTypes;
    }
}
