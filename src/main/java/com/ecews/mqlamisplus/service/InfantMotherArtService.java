package com.ecews.mqlamisplus.service;

import com.blazebit.persistence.CriteriaBuilderFactory;
import com.blazebit.persistence.view.EntityViewManager;
import com.blazebit.persistence.view.EntityViewSetting;
import com.ecews.mqlamisplus.Repository.pmtc.InfantMotherArtRepo;
import com.ecews.mqlamisplus.entity.models.Person.Person;
import com.ecews.mqlamisplus.entity.models.pmtc.InfantMotherArt;
import com.ecews.mqlamisplus.entity.views.PersonView;
import com.ecews.mqlamisplus.entity.views.pmtc.InfantMotherArtView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import java.util.List;

@Service
public class InfantMotherArtService {

    public InfantMotherArtService(EntityManager em, CriteriaBuilderFactory cbf, EntityViewManager evm) {
        this.em = em;
        this.cbf = cbf;
        this.evm = evm;
    }

    @Autowired
    InfantMotherArtRepo infantMotherArtRepo;
    public final EntityManager em;
    public final CriteriaBuilderFactory cbf;
    private final EntityViewManager evm;




    public List<InfantMotherArtView> getAllInfantMotherArt() {
        var settings = EntityViewSetting.create(InfantMotherArtView.class);
        var cb = cbf.create(em, InfantMotherArtView.class)
                .from(InfantMotherArt.class)
                .orderByAsc("id");
        return evm.applySetting(settings, cb).getResultList();

        //.withCountQuery(false).getResultList();
        // return patientRepository.findByLastModifiedGreaterThan(patientMaxTime);
    }


    public List<InfantMotherArt> getInfanMothertArtLamisPlusDb() {


        List<InfantMotherArt> infantMotherArts = infantMotherArtRepo.findAll();

        return infantMotherArts;
    }
}
