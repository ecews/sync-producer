package com.ecews.mqlamisplus.models.views.visit;


import com.blazebit.persistence.view.EntityView;
import com.blazebit.persistence.view.Mapping;
import com.ecews.mqlamisplus.models.entities.Person.Person;
import com.ecews.mqlamisplus.models.entities.visit.Visit;

import java.time.LocalDateTime;

@EntityView(Visit.class)
public interface VisitView {



    @Mapping("person_uuid")
    Person person();



    @Mapping("visit_start_date")
    LocalDateTime visitStartDate();



    @Mapping("visit_end_date")
    LocalDateTime visitEndDate();


    @Mapping("uuid")
    String uuid();




    @Mapping("archived")
    Integer archived();

//    @Override
//    public boolean isNew() {
//        return id == null;
//    }


}
