package com.ecews.mqlamisplus.service;

import com.blazebit.persistence.CriteriaBuilderFactory;
import com.blazebit.persistence.view.EntityViewManager;
import com.blazebit.persistence.view.EntityViewSetting;
import com.ecews.mqlamisplus.entity.models.Person.Person;
import com.ecews.mqlamisplus.entity.views.PersonView;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import java.time.LocalDateTime;
import java.util.List;

@Service
//@RequiredArgsConstructor
public class PersonService {
    public final EntityManager em;
    public final CriteriaBuilderFactory cbf;
    private final EntityViewManager evm;

    public PersonService(EntityManager em, CriteriaBuilderFactory cbf, EntityViewManager evm) {
        this.em = em;
        this.cbf = cbf;
        this.evm = evm;
    }


    public List<PersonView> getAllPerson() {
        var settings = EntityViewSetting.create(PersonView.class);
        var cb = cbf.create(em, PersonView.class)
                .from(Person.class,"p")
//                .select("p")
//                .fetch("htsClient")
                .orderByAsc("p.id");
        return evm.applySetting(settings, cb).getResultList();

        //.withCountQuery(false).getResultList();
        // return patientRepository.findByLastModifiedGreaterThan(patientMaxTime);
    }



    public List<PersonView> getPatientByMaxTime(LocalDateTime personMaxTime) {
        var settings = EntityViewSetting.create(PersonView.class);
        var cb = cbf.create(em, PersonView.class)
                .from(Person.class)
                .orderByAsc("id");
        if (personMaxTime != null){
            cb = cbf.create(em, PersonView.class)
                    .from(Person.class)
                    .where("lastModified").ge(personMaxTime)
                    .orderByAsc("id");
        }
        return evm.applySetting(settings, cb).getResultList();

        //.withCountQuery(false).getResultList();
        // return patientRepository.findByLastModifiedGreaterThan(patientMaxTime);
    }




    @Transactional
    public void updateSyncStatus(String patientUuid, String status) {
        var cb = cbf.update(em, Person.class)
                .set("syncStatus", status)
                .where("uuid").eq(patientUuid);
        cb.executeUpdate();
    }


}
