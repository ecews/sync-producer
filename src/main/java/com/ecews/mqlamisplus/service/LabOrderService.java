package com.ecews.mqlamisplus.service;

import com.blazebit.persistence.CriteriaBuilderFactory;
import com.blazebit.persistence.view.EntityViewManager;
import com.blazebit.persistence.view.EntityViewSetting;
import com.ecews.mqlamisplus.Repository.laboratory.LabOrderRepo;
import com.ecews.mqlamisplus.entity.models.laboratory.LabOrder;
import com.ecews.mqlamisplus.entity.views.laboratory.LabOrderView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import java.util.List;

@Service
public class LabOrderService {

    @Autowired
    LabOrderRepo labOrderRepo;


    public final EntityManager em;
    public final CriteriaBuilderFactory cbf;
    private final EntityViewManager evm;



    public LabOrderService(EntityManager em, CriteriaBuilderFactory cbf, EntityViewManager evm) {
        this.em = em;
        this.cbf = cbf;
        this.evm = evm;
    }

    public List<LabOrder> getLabOrderFromLamisPlusDb() {

        List<LabOrder> labOrders = labOrderRepo.findAll();

        return labOrders;
    }


    public List<LabOrderView> getAllLabOrder() {
        var settings = EntityViewSetting.create(LabOrderView.class);
        var cb = cbf.create(em, LabOrderView.class)
                .from(LabOrder.class)
                .orderByAsc("id");
        return evm.applySetting(settings, cb).getResultList();

        //.withCountQuery(false).getResultList();
        // return patientRepository.findByLastModifiedGreaterThan(patientMaxTime);
    }


}
