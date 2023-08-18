package com.ecews.mqlamisplus.service;


import com.ecews.mqlamisplus.Repository.hts.IndexElicitationRepo;
import com.ecews.mqlamisplus.entity.models.hts.IndexElicitation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class IndexElicitationService {

    @Autowired
    IndexElicitationRepo indexElicitationRepo;


    public List<IndexElicitation> getindexElicitationsFromLamisPlusDb() {

        List<IndexElicitation> indexElicitations = indexElicitationRepo.findAll();

        return  indexElicitations;

    }
}
