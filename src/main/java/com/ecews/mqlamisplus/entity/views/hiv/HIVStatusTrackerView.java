package com.ecews.mqlamisplus.entity.views.hiv;

import com.blazebit.persistence.view.EntityView;
import com.blazebit.persistence.view.Mapping;
import com.ecews.mqlamisplus.entity.models.hiv.HIVStatusTracker;
import com.ecews.mqlamisplus.utility.LocalDateDeserializer;
import com.ecews.mqlamisplus.utility.LocalDateSerializer;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import java.time.LocalDate;

@EntityView(HIVStatusTracker.class)
public interface HIVStatusTrackerView {

    @Mapping("id")
    Long getId();

    @Mapping("hivStatus")
    String getHivStatus();

    @Mapping("statusDate")
    @JsonSerialize(using = LocalDateSerializer.class)
    @JsonDeserialize(using = LocalDateDeserializer.class)
    LocalDate getStatusDate();

    @Mapping("person.uuid")
    String getPersonUuid();

    @Mapping("visit.uuid")
    String getVisitUuid();

    @Mapping("trackOutcome")
    String getTrackOutcome();

    @Mapping("trackDate")
    @JsonSerialize(using = LocalDateSerializer.class)
    @JsonDeserialize(using = LocalDateDeserializer.class)
    LocalDate getTrackDate();

    @Mapping("agreedDate")
    @JsonSerialize(using = LocalDateSerializer.class)
    @JsonDeserialize(using = LocalDateDeserializer.class)
    LocalDate getAgreedDate();

    @Mapping("reasonForInterruption")
    String getReasonForInterruption();

    @Mapping("causeOfDeath")
    String getCauseOfDeath();

    @Mapping("auto")
    Boolean getAuto();

    @Mapping("uuid")
    String getUuid();

    @Mapping("archived")
    int getArchived();
}
