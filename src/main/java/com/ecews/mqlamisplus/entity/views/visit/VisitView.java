package com.ecews.mqlamisplus.entity.views.visit;


import com.blazebit.persistence.view.EntityView;
import com.blazebit.persistence.view.Mapping;
import com.ecews.mqlamisplus.entity.models.Person.Person;
import com.ecews.mqlamisplus.entity.models.visit.Visit;


import java.time.LocalDateTime;

@EntityView(Visit.class)
public interface VisitView {



    @Mapping("person.uuid")
    String getPerson();

    @Mapping("visitStartDate")
    LocalDateTime getVisitStartDate();

    @Mapping("visitEndDate")
    LocalDateTime getVisitEndDate();


    @Mapping("uuid")
    String getUuid();


    @Mapping("archived")
    Integer getArchived();


    @Mapping("facilityId")
    Long getFacilityId();

    @Mapping("lastModifiedDate")
    LocalDateTime getLastModifiedDate();

//    @Mapping("syncStatus")
//    String getSyncStatus();


//    @Override
//    public boolean isNew() {
//        return id == null;
//    }


}
