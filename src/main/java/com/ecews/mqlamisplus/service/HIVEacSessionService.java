package com.ecews.mqlamisplus.service;

import com.ecews.mqlamisplus.Repository.hivrepo.HIVEacSessionRepo;
import com.ecews.mqlamisplus.models.entities.hiv.HIVEacSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HIVEacSessionService {

    @Autowired
    HIVEacSessionRepo hivEacSessionRepo;
    public List<HIVEacSession> getHIVEacSessionFromLamisPlusDb() {

        List<HIVEacSession> hivEacSessions = hivEacSessionRepo.findAll();

        return hivEacSessions;
    }
}
