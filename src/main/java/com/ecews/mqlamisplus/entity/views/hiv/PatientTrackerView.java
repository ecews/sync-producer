package com.ecews.mqlamisplus.entity.views.hiv;


import com.blazebit.persistence.view.EntityView;
import com.blazebit.persistence.view.Mapping;
import com.ecews.mqlamisplus.entity.models.hiv.PatientTracker;
import com.ecews.mqlamisplus.utility.LocalDateDeserializer;
import com.ecews.mqlamisplus.utility.LocalDateSerializer;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import java.time.LocalDate;

@EntityView(PatientTracker.class)
public interface PatientTrackerView {

    @Mapping("id")
    Long getId();

    @Mapping("dsdStatus")
    String getDsdStatus();

    @Mapping("dsdModel")
    String getDsdModel();

    @Mapping("reasonForTracking")
    String getReasonForTracking();

    @Mapping("careInFacilityDiscountinued")
    String getCareInFacilityDiscountinued();

    @Mapping("reasonForDiscountinuation")
    String getReasonForDiscountinuation();

    @Mapping("causeOfDeath")
    String getCauseOfDeath();

    @Mapping("reasonForLossToFollowUp")
    String getReasonForLossToFollowUp();

    @Mapping("referredFor")
    String getReferredFor();

    @Mapping("referredForOthers")
    String getReferredForOthers();

    @Mapping("reasonForTrackingOthers")
    String getReasonForTrackingOthers();

    @Mapping("causeOfDeathOthers")
    String getCauseOfDeathOthers();

    @Mapping("reasonForLossToFollowUpOthers")
    String getReasonForLossToFollowUpOthers();

    @Mapping("statusTracker.uuid")
    String getStatusTrackerUuid();

    @Mapping("archived")
    Integer getArchived();

    @Mapping("uuid")
    String getUuid();

    @Mapping("attempts")
    JsonNode getAttempts();

    @Mapping("durationOnART")
    String getDurationOnART();

    @Mapping("dateLastAppointment")
    @JsonSerialize(using = LocalDateSerializer.class)
    @JsonDeserialize(using = LocalDateDeserializer.class)
    LocalDate getDateLastAppointment();

    @Mapping("dateReturnToCare")
    @JsonSerialize(using = LocalDateSerializer.class)
    @JsonDeserialize(using = LocalDateDeserializer.class)
    LocalDate getDateReturnToCare();

    @Mapping("dateOfDiscontinuation")
    @JsonSerialize(using = LocalDateSerializer.class)
    @JsonDeserialize(using = LocalDateDeserializer.class)
    LocalDate getDateOfDiscontinuation();

    @Mapping("dateMissedAppointment")
    @JsonSerialize(using = LocalDateSerializer.class)
    @JsonDeserialize(using = LocalDateDeserializer.class)
    LocalDate getDateMissedAppointment();

    @Mapping("person.uuid")
    String getPersonUuid();

    @Mapping("dateOfObservation")
    @JsonSerialize(using = LocalDateSerializer.class)
    @JsonDeserialize(using = LocalDateDeserializer.class)
    LocalDate getDateOfObservation();
}

