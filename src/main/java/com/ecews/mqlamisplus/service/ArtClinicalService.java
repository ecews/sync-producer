package com.ecews.mqlamisplus.service;

import com.ecews.mqlamisplus.Repository.hivrepo.ArtClinicalRepo;
import com.ecews.mqlamisplus.models.hiv.ARTClinical;
import com.ecews.mqlamisplus.models.hiv.HivEnrollment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArtClinicalService {

    @Autowired
    ArtClinicalRepo artClinicalRepo;
    public List<ARTClinical> getArtClinicalFromLamisPlusDb() {

        List<ARTClinical> artClinicals = artClinicalRepo.findAll();

        return artClinicals;
    }
}
