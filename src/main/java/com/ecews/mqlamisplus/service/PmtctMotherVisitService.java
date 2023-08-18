package com.ecews.mqlamisplus.service;

import com.blazebit.persistence.CriteriaBuilderFactory;
import com.blazebit.persistence.view.EntityViewManager;
import com.blazebit.persistence.view.EntityViewSetting;
import com.ecews.mqlamisplus.Repository.pmtc.PmtctMotherVisitRepo;
import com.ecews.mqlamisplus.entity.models.pmtc.PmtctMotherVisit;
import com.ecews.mqlamisplus.entity.views.pmtc.PmtctMotherVisitView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import java.util.List;

@Service
public class PmtctMotherVisitService {


    @Autowired
    PmtctMotherVisitRepo pmtctMotherVisitRepo;
    public final EntityManager em;
    public final CriteriaBuilderFactory cbf;
    private final EntityViewManager evm;

    public PmtctMotherVisitService(EntityManager em, CriteriaBuilderFactory cbf, EntityViewManager evm) {
        this.em = em;
        this.cbf = cbf;
        this.evm = evm;
    }


    public List<PmtctMotherVisitView> getAllPmtctMotherVisitView() {
        var settings = EntityViewSetting.create(PmtctMotherVisitView.class);
        var cb = cbf.create(em, PmtctMotherVisitView.class)
                .from(PmtctMotherVisit.class)
                .orderByAsc("id");
        return evm.applySetting(settings, cb).getResultList();

        //.withCountQuery(false).getResultList();
        // return patientRepository.findByLastModifiedGreaterThan(patientMaxTime);
    }




    public List<PmtctMotherVisit> getPmtctVisitServiceLamisPlusDb() {

        List<PmtctMotherVisit> pmtctMotherVisits = pmtctMotherVisitRepo.findAll();

        return pmtctMotherVisits;
    }
}
