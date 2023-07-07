package com.ecews.mqlamisplus.service;

import com.ecews.mqlamisplus.Repository.hts.HtsClientRepo;
import com.ecews.mqlamisplus.models.entities.hts.HtsClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HtsClientService {
    @Autowired
    HtsClientRepo htsClientRepo;
    public List<HtsClient> gethtsClientFromLamisPlusDb() {

        List<HtsClient> htsClients = htsClientRepo.findAll();

        return htsClients;
    }
}
