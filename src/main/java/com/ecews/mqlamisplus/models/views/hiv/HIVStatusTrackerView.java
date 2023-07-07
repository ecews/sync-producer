package com.ecews.mqlamisplus.models.views.hiv;

import com.blazebit.persistence.view.EntityView;
import com.blazebit.persistence.view.Mapping;
import com.ecews.mqlamisplus.models.entities.Person.Person;
import com.ecews.mqlamisplus.models.entities.hiv.HIVStatusTracker;
import com.ecews.mqlamisplus.models.entities.visit.Visit;
import com.ecews.mqlamisplus.utility.LocalDateDeserializer;
import com.ecews.mqlamisplus.utility.LocalDateSerializer;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.springframework.data.domain.Persistable;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.PastOrPresent;
import javax.validation.constraints.Size;
import java.time.LocalDate;

@EntityView(HIVStatusTracker.class)
public interface HIVStatusTrackerView{

    @Mapping("id")
    Long getId();

    @Mapping("hivStatus")
    @NotNull
    String getHivStatus();

    @Mapping("statusDate")
    LocalDate getStatusDate();

    @Mapping("person")
    Person getPerson();

    @Mapping("visit")
    Visit getVisit();

    @Mapping("trackOutcome")
    String getTrackOutcome();

    @Mapping("trackDate")
    LocalDate getTrackDate();

    @Mapping("agreedDate")
    LocalDate getAgreedDate();

    @Mapping("reasonForInterruption")
    @Size(max = 100)
    String getReasonForInterruption();

    @Mapping("causeOfDeath")
    @Size(max = 100)
    String getCauseOfDeath();

    @Mapping("auto")
    Boolean getAuto();

    @Mapping("uuid")
    String getUuid();

    @Mapping("archived")
    int getArchived();

//    @Override
//    default boolean isNew() {
//        return getId() == null;
//    }
}
