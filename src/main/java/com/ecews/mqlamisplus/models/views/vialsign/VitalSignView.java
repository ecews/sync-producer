package com.ecews.mqlamisplus.models.views.vialsign;


import com.blazebit.persistence.view.EntityView;
import com.blazebit.persistence.view.Mapping;
import com.ecews.mqlamisplus.models.entities.Person.Person;
import com.ecews.mqlamisplus.models.entities.triage.VitalSign;
import com.ecews.mqlamisplus.models.entities.visit.Visit;

import java.time.LocalDateTime;

@EntityView(VitalSign.class)
public interface VitalSignView {

    @Mapping("bodyWeight")
   Double bodyWeight();

    @Mapping("diastolic")
   Double diastolic();


    @Mapping("captureDate")
    LocalDateTime captureDate();


    @Mapping("height")
    Double height();

    @Mapping("temperature")
    Double temperature();

    @Mapping("pulse")
    Double pulse();

    @Mapping("respiratoryRate")
    Double respiratoryRate();


    @Mapping("person")
    Person person();


    @Mapping("visit")
    Visit visit();

    @Mapping("systolic")
    Double systolic();

    @Mapping("archived")
    Integer archived();

    @Mapping("uuid")
    String uuid();

//    @Override
//    public boolean isNew() {
//        return id == null;
//    }
}
