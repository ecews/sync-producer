package com.ecews.mqlamisplus.service;


import com.ecews.mqlamisplus.Repository.hivrepo.IndexElicitationRepo;
import com.ecews.mqlamisplus.models.hts.IndexElicitation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
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
