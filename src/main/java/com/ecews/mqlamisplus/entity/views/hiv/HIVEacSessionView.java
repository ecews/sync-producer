package com.ecews.mqlamisplus.entity.views.hiv;

import com.blazebit.persistence.view.EntityView;
import com.blazebit.persistence.view.Mapping;
import com.ecews.mqlamisplus.entity.models.hiv.HIVEacSession;
import com.fasterxml.jackson.databind.JsonNode;
import java.time.LocalDate;

@EntityView(HIVEacSession.class)
public interface HIVEacSessionView {

    @Mapping("id")
    Long getId();

    @Mapping("eac.uuid")
    String getEacUuid();

    @Mapping("person.uuid")
    String getPersonUuid();

    @Mapping("visit.uuid")
    String getVisitUuid();

    @Mapping("barriers")
    JsonNode getBarriers();

    @Mapping("intervention")
    JsonNode getIntervention();

    @Mapping("barriersOthers")
    String getBarriersOthers();

    @Mapping("interventionOthers")
    String getInterventionOthers();

    @Mapping("comment")
    String getComment();

    @Mapping("followUpDate")
    LocalDate getFollowUpDate();

    @Mapping("eacSessionDate")
    LocalDate getEacSessionDate();

    @Mapping("referral")
    String getReferral();

    @Mapping("adherence")
    String getAdherence();

    @Mapping("status")
    String getStatus();

    @Mapping("uuid")
    String getUuid();

    @Mapping("archived")
    int getArchived();
}
