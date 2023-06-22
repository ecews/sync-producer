package com.ecews.mqlamisplus.service;

import com.ecews.mqlamisplus.Repository.pmtc.InfantMotherArtRepo;
import com.ecews.mqlamisplus.models.pmtc.InfantMotherArt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InfantMotherArtService {

    @Autowired
    InfantMotherArtRepo infantMotherArtRepo;
    public List<InfantMotherArt> getInfanMothertArtLamisPlusDb() {


        List<InfantMotherArt> infantMotherArts = infantMotherArtRepo.findAll();

        return infantMotherArts;
    }
}
