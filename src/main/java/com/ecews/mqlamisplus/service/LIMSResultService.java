package com.ecews.mqlamisplus.service;

import com.blazebit.persistence.CriteriaBuilderFactory;
import com.blazebit.persistence.view.EntityViewManager;
import com.blazebit.persistence.view.EntityViewSetting;
import com.ecews.mqlamisplus.Repository.lims.LIMSResultRepo;
import com.ecews.mqlamisplus.entity.models.Person.Person;
import com.ecews.mqlamisplus.entity.models.lims.LIMSResult;
import com.ecews.mqlamisplus.entity.views.PersonView;
import com.ecews.mqlamisplus.entity.views.lims.LIMSResultView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import java.util.List;

@Service
public class LIMSResultService {
    @Autowired
    LIMSResultRepo limsResultRepo;


    public final EntityManager em;
    public final CriteriaBuilderFactory cbf;
    private final EntityViewManager evm;

    public LIMSResultService(EntityManager em, CriteriaBuilderFactory cbf, EntityViewManager evm) {
        this.em = em;
        this.cbf = cbf;
        this.evm = evm;
    }



    public List<LIMSResult> getLIMSResultFromLamisPlusDb() {

        List<LIMSResult> limsResults = limsResultRepo.findAll();

        return limsResults;

    }



    public List<LIMSResultView> getAllPerson() {
        var settings = EntityViewSetting.create(LIMSResultView.class);
        var cb = cbf.create(em, LIMSResultView.class)
                .from(LIMSResult.class)
                .orderByAsc("id");
        return evm.applySetting(settings, cb).getResultList();

        //.withCountQuery(false).getResultList();
        // return patientRepository.findByLastModifiedGreaterThan(patientMaxTime);
    }


}
