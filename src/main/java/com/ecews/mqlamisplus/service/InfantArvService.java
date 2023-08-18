package com.ecews.mqlamisplus.service;

import com.blazebit.persistence.CriteriaBuilderFactory;
import com.blazebit.persistence.view.EntityViewManager;
import com.blazebit.persistence.view.EntityViewSetting;
import com.ecews.mqlamisplus.Repository.pmtc.InfantArvRepo;
import com.ecews.mqlamisplus.entity.models.Person.Person;
import com.ecews.mqlamisplus.entity.models.pmtc.InfantArv;
import com.ecews.mqlamisplus.entity.views.PersonView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import java.util.List;

@Service
public class InfantArvService {



    public InfantArvService(EntityManager em, CriteriaBuilderFactory cbf, EntityViewManager evm) {
        this.em = em;
        this.cbf = cbf;
        this.evm = evm;
    }


    @Autowired
    InfantArvRepo infantArvRepo;
    public final EntityManager em;
    public final CriteriaBuilderFactory cbf;
    private final EntityViewManager evm;



    public List<PersonView> getAllPerson() {
        var settings = EntityViewSetting.create(PersonView.class);
        var cb = cbf.create(em, PersonView.class)
                .from(Person.class)
                .orderByAsc("id");
        return evm.applySetting(settings, cb).getResultList();

        //.withCountQuery(false).getResultList();
        // return patientRepository.findByLastModifiedGreaterThan(patientMaxTime);
    }


    public List<InfantArv> getInfantArvLamisPlusDb() {

        List<InfantArv> infantArvs = infantArvRepo.findAll();

        return  infantArvs;

    }
}
