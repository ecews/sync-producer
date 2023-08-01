package com.ecews.mqlamisplus.service;


import com.blazebit.persistence.CriteriaBuilderFactory;
import com.blazebit.persistence.view.EntityViewManager;
import com.blazebit.persistence.view.EntityViewSetting;
import com.ecews.mqlamisplus.Repository.pmtc.InfantPCRTestRepo;
import com.ecews.mqlamisplus.entity.models.Person.Person;
import com.ecews.mqlamisplus.entity.models.pmtc.InfantPCR;
import com.ecews.mqlamisplus.entity.views.PersonView;
import com.ecews.mqlamisplus.entity.views.pmtc.InfantPCRView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import java.util.List;

@Service
public class InfantPCRService {

    @Autowired
    private InfantPCRTestRepo infantPCRTestRepo;
    public final EntityManager em;
    public final CriteriaBuilderFactory cbf;
    private final EntityViewManager evm;

    public InfantPCRService(EntityManager em, CriteriaBuilderFactory cbf, EntityViewManager evm) {
        this.em = em;
        this.cbf = cbf;
        this.evm = evm;
    }


    public List<InfantPCRView> getAllInfantPCR() {
        var settings = EntityViewSetting.create(InfantPCRView.class);
        var cb = cbf.create(em, InfantPCRView.class)
                .from(InfantPCR.class)
                .orderByAsc("id");
        return evm.applySetting(settings, cb).getResultList();

        //.withCountQuery(false).getResultList();
        // return patientRepository.findByLastModifiedGreaterThan(patientMaxTime);
    }



    public List<InfantPCR> getInfantPCRTestLamisPlusDb() {

        List<InfantPCR> infantPCRS = infantPCRTestRepo.findAll();

        return infantPCRS;


    }
}
