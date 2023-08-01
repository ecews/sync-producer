package com.ecews.mqlamisplus.service;


import com.blazebit.persistence.CriteriaBuilderFactory;
import com.blazebit.persistence.view.EntityViewManager;
import com.blazebit.persistence.view.EntityViewSetting;
import com.ecews.mqlamisplus.Repository.pmtc.PmtctEnrollmentRepo;
import com.ecews.mqlamisplus.entity.models.Person.Person;
import com.ecews.mqlamisplus.entity.models.pmtc.PMTCTEnrollment;
import com.ecews.mqlamisplus.entity.views.PersonView;
import com.ecews.mqlamisplus.entity.views.pmtc.PMTCTEnrollmentView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import java.util.List;

@Service
public class PmtctEnrollmentService {

    public PmtctEnrollmentService(EntityManager em, CriteriaBuilderFactory cbf, EntityViewManager evm) {
        this.em = em;
        this.cbf = cbf;
        this.evm = evm;
    }

    @Autowired
    PmtctEnrollmentRepo pmtctEnrollmentRepo;
    public final EntityManager em;
    public final CriteriaBuilderFactory cbf;
    private final EntityViewManager evm;




    public List<PMTCTEnrollmentView> getAllPMTCTEnrollment() {
        var settings = EntityViewSetting.create(PMTCTEnrollmentView.class);
        var cb = cbf.create(em, PMTCTEnrollmentView.class)
                .from(PMTCTEnrollment.class)
                .orderByAsc("id");
        return evm.applySetting(settings, cb).getResultList();

        //.withCountQuery(false).getResultList();
        // return patientRepository.findByLastModifiedGreaterThan(patientMaxTime);
    }


    public List<PMTCTEnrollment> getPmtctFromLamisPlusDb() {


        List<PMTCTEnrollment> pmtctEnrollments= pmtctEnrollmentRepo.findAll();

        return pmtctEnrollments;


    }
}
