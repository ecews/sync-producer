package com.ecews.mqlamisplus.service;


import com.ecews.mqlamisplus.Repository.lims.LIMManifestSRepo;
import com.ecews.mqlamisplus.models.lims.LIMSManifest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LIMSManifestService {

    @Autowired
    LIMManifestSRepo limManifestSRepo;
    public List<LIMSManifest> getLIMSManifestFromLamisPlusDb() {

        List<LIMSManifest> limsManifests = limManifestSRepo.findAll();

        return  limsManifests;
    }
}
