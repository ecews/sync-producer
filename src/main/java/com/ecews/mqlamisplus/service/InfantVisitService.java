package com.ecews.mqlamisplus.service;

import com.blazebit.persistence.CriteriaBuilderFactory;
import com.blazebit.persistence.view.EntityViewManager;
import com.blazebit.persistence.view.EntityViewSetting;
import com.ecews.mqlamisplus.Repository.pmtc.InfantVisitRepo;
import com.ecews.mqlamisplus.entity.models.pmtc.InfantVisit;
import com.ecews.mqlamisplus.entity.views.pmtc.InfantVisitView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import java.util.List;

@Service
public class InfantVisitService {

    @Autowired
    InfantVisitRepo infantVisitRepo;
    public final EntityManager em;
    public final CriteriaBuilderFactory cbf;
    private final EntityViewManager evm;

    public InfantVisitService(EntityManager em, CriteriaBuilderFactory cbf, EntityViewManager evm) {
        this.em = em;
        this.cbf = cbf;
        this.evm = evm;
    }


    public List<InfantVisitView> getAllInfantVisit() {
        var settings = EntityViewSetting.create(InfantVisitView.class);
        var cb = cbf.create(em, InfantVisitView.class)
                .from(InfantVisit.class)
                .orderByAsc("id");
        return evm.applySetting(settings, cb).getResultList();

        //.withCountQuery(false).getResultList();
        // return patientRepository.findByLastModifiedGreaterThan(patientMaxTime);
    }


    public List<InfantVisit> getInfantVisitServiceLamisPlusDb() {

        List<InfantVisit> infantVisits = infantVisitRepo.findAll();

        return  infantVisits;
    }
}
