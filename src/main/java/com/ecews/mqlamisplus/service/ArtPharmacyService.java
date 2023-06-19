package com.ecews.mqlamisplus.service;

import com.ecews.mqlamisplus.Repository.hivrepo.ArtPharmacyRepo;
import com.ecews.mqlamisplus.models.hiv.ArtPharmacy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class ArtPharmacyService {

    @Autowired
    ArtPharmacyRepo artPharmacyRepo;
    public List<ArtPharmacy> getAllArtPharmacyFromLamisPlusDb() {

        List<ArtPharmacy> biometric = artPharmacyRepo.findAll();

        return biometric;
    }

}
