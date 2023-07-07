package com.ecews.mqlamisplus.models.views.hiv;

import com.blazebit.persistence.view.EntityView;
import com.blazebit.persistence.view.Mapping;
import com.ecews.mqlamisplus.models.entities.Person.Person;
import com.ecews.mqlamisplus.models.entities.hiv.EacOutCome;
import com.ecews.mqlamisplus.models.entities.hiv.HIVEac;
import com.ecews.mqlamisplus.models.entities.visit.Visit;
import com.fasterxml.jackson.databind.JsonNode;

import javax.persistence.*;
import java.time.LocalDate;

@EntityView(EacOutCome.class)
public interface EacOutComeView {

    @Mapping("eac")
    HIVEac getEac();

    @Mapping("person")
    Person getPerson();

    @Mapping("visit")
    Visit getVisit();

    @Mapping("repeatViralLoader")
    Double getRepeatViralLoader();

    @Mapping("outcome")
    String getOutcome();

    @Mapping("plan")
    String getPlan();

    @Mapping("planAction")
    JsonNode getPlanAction();

    @Mapping("currentRegimen")
    String getCurrentRegimen();

    @Mapping("switchRegimen")
    String getSwitchRegimen();

    @Mapping("substituteRegimen")
    String getSubstituteRegimen();

    @Mapping("archived")
    Integer getArchived();

    @Mapping("uuid")
    String getUuid();

//    default Long getId() {
//        return null;
//    }

//    default boolean isNew() {
//        return getId() == null;
//    }
}
