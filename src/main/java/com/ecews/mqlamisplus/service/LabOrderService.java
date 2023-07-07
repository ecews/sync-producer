package com.ecews.mqlamisplus.service;

import com.ecews.mqlamisplus.Repository.laboratory.LabOrderRepo;
import com.ecews.mqlamisplus.models.entities.laboratory.LabOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LabOrderService {

    @Autowired
    LabOrderRepo labOrderRepo;
    public List<LabOrder> getLabOrderFromLamisPlusDb() {

        List<LabOrder> labOrders = labOrderRepo.findAll();

        return labOrders;
    }
}
