package com.ecews.mqlamisplus.service;


import com.blazebit.persistence.CriteriaBuilderFactory;
import com.blazebit.persistence.view.EntityViewManager;
import com.blazebit.persistence.view.EntityViewSetting;
import com.ecews.mqlamisplus.Repository.pmtc.DeliveryRepo;
import com.ecews.mqlamisplus.entity.models.Person.Person;
import com.ecews.mqlamisplus.entity.models.pmtc.Delivery;
import com.ecews.mqlamisplus.entity.views.PersonView;
import com.ecews.mqlamisplus.entity.views.pmtc.DeliveryView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import java.util.List;

@Service
public class DeliveryService {

    @Autowired
    DeliveryRepo deliveryRepo;



    public final EntityManager em;
    public final CriteriaBuilderFactory cbf;
    private final EntityViewManager evm;

    public DeliveryService(EntityManager em, CriteriaBuilderFactory cbf, EntityViewManager evm) {
        this.em = em;
        this.cbf = cbf;
        this.evm = evm;
    }


    public List<DeliveryView> getAllDelivery() {
        var settings = EntityViewSetting.create(DeliveryView.class);
        var cb = cbf.create(em, Delivery.class)
                .from(Delivery.class)
                .orderByAsc("id");
        return evm.applySetting(settings, cb).getResultList();

        //.withCountQuery(false).getResultList();
        // return patientRepository.findByLastModifiedGreaterThan(patientMaxTime);
    }


    public List<Delivery> getDeliveryFromLamisPlusDb() {

        List<Delivery> deliveries = deliveryRepo.findAll();

        return  deliveries;

    }
}
