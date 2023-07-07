package com.ecews.mqlamisplus.models.views.hiv;

import com.blazebit.persistence.view.EntityView;
import com.blazebit.persistence.view.Mapping;
import com.ecews.mqlamisplus.models.entities.Person.Person;
import com.ecews.mqlamisplus.models.entities.hiv.PatientTracker;
import com.ecews.mqlamisplus.utility.LocalDateDeserializer;
import com.ecews.mqlamisplus.utility.LocalDateSerializer;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.springframework.data.domain.Persistable;

import javax.persistence.*;
import java.time.LocalDate;

@EntityView(PatientTracker.class)
public interface PatientTrackerView{

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

    @Mapping("statusTracker")
    HIVStatusTrackerView getStatusTracker();

    @Mapping("archived")
    Integer getArchived();

    @Mapping("uuid")
    String getUuid();

    @Mapping("attempts")
    JsonNode getAttempts();

    @Mapping("durationOnART")
    String getDurationOnART();

    @Mapping("dateLastAppointment")
    LocalDate getDateLastAppointment();

    @Mapping("dateReturnToCare")
    LocalDate getDateReturnToCare();

    @Mapping("dateOfDiscontinuation")
    LocalDate getDateOfDiscontinuation();

    @Mapping("dateMissedAppointment")
    LocalDate getDateMissedAppointment();

    @Mapping("person")
    Person getPerson();

    @Mapping("dateOfObservation")
    LocalDate getDateOfObservation();

//    @Override
//    default boolean isNew() {
//        return getId() == null;
//    }
}
