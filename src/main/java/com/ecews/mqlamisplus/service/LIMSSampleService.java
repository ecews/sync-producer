package com.ecews.mqlamisplus.service;

import com.blazebit.persistence.CriteriaBuilderFactory;
import com.blazebit.persistence.view.EntityViewManager;
import com.blazebit.persistence.view.EntityViewSetting;
import com.ecews.mqlamisplus.Repository.lims.LIMSSampleRepo;
import com.ecews.mqlamisplus.entity.models.Person.Person;
import com.ecews.mqlamisplus.entity.models.lims.LIMSSample;
import com.ecews.mqlamisplus.entity.views.PersonView;
import com.ecews.mqlamisplus.entity.views.lims.LIMSSampleView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import java.util.List;

@Service
public class LIMSSampleService {

    @Autowired
    LIMSSampleRepo limsSampleRepo;



    public final EntityManager em;
    public final CriteriaBuilderFactory cbf;
    private final EntityViewManager evm;

    public LIMSSampleService(EntityManager em, CriteriaBuilderFactory cbf, EntityViewManager evm) {
        this.em = em;
        this.cbf = cbf;
        this.evm = evm;
    }

    public List<LIMSSample> getLIMSSampleFromLamisPlusDb() {

        List<LIMSSample> limsSamples = limsSampleRepo.findAll();

        return limsSamples;
    }


    public List<LIMSSampleView> getAllPerson() {
        var settings = EntityViewSetting.create(LIMSSampleView.class);
        var cb = cbf.create(em, LIMSSampleView.class)
                .from(LIMSSample.class)
                .orderByAsc("id");
        return evm.applySetting(settings, cb).getResultList();

        //.withCountQuery(false).getResultList();
        // return patientRepository.findByLastModifiedGreaterThan(patientMaxTime);
    }

}
