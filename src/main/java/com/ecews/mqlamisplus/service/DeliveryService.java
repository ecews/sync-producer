package com.ecews.mqlamisplus.service;


import com.ecews.mqlamisplus.Repository.pmtc.DeliveryRepo;
import com.ecews.mqlamisplus.entity.models.pmtc.Delivery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeliveryService {

    @Autowired
    DeliveryRepo deliveryRepo;

    public List<Delivery> getDeliveryFromLamisPlusDb() {

        List<Delivery> deliveries = deliveryRepo.findAll();

        return  deliveries;

    }
}
