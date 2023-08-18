package com.ecews.mqlamisplus.entity.views.hiv;


import com.blazebit.persistence.view.EntityView;
import com.blazebit.persistence.view.Mapping;
import com.ecews.mqlamisplus.entity.models.hiv.EacOutCome;
import com.fasterxml.jackson.databind.JsonNode;

@EntityView(EacOutCome.class)
public interface EacOutComeView {

    @Mapping("id")
    Long getId();

    @Mapping("eac.uuid")
    String getEacUuid();

    @Mapping("person.uuid")
    String getPersonUuid();

    @Mapping("visit.uuid")
    String getVisitUuid();

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
}
