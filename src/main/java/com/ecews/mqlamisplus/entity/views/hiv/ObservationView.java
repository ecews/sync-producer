package com.ecews.mqlamisplus.entity.views.hiv;


import com.blazebit.persistence.view.EntityView;
import com.blazebit.persistence.view.Mapping;
import com.ecews.mqlamisplus.entity.models.hiv.Observation;
import com.fasterxml.jackson.databind.JsonNode;
import java.time.LocalDate;

@EntityView(Observation.class)
public interface ObservationView {

    @Mapping("id")
    Long getId();

    @Mapping("dateOfObservation")
    LocalDate getDateOfObservation();

    @Mapping("person.uuid")
    String getPersonUuid();

    @Mapping("visit.uuid")
    String getVisitUuid();

    @Mapping("type")
    String getType();

    @Mapping("uuid")
    String getUuid();

    @Mapping("data")
    JsonNode getData();

    @Mapping("archived")
    int getArchived();
}
