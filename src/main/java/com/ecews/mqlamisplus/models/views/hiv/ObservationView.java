package com.ecews.mqlamisplus.models.views.hiv;

import com.blazebit.persistence.view.EntityView;
import com.blazebit.persistence.view.Mapping;
import com.ecews.mqlamisplus.models.entities.Person.Person;
import com.ecews.mqlamisplus.models.entities.hiv.Observation;
import com.ecews.mqlamisplus.models.entities.visit.Visit;
import com.ecews.mqlamisplus.utility.LocalDateDeserializer;
import com.ecews.mqlamisplus.utility.LocalDateSerializer;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.springframework.data.domain.Persistable;

import javax.persistence.*;
import javax.validation.constraints.PastOrPresent;
import java.time.LocalDate;

@EntityView(Observation.class)
public interface ObservationView{

    @Mapping("dateOfObservation")
    LocalDate getDateOfObservation();

    @Mapping("person")
    Person getPerson();

    @Mapping("visit")
    Visit getVisit();

    @Mapping("type")
    String getType();

    @Mapping("uuid")
    String getUuid();

    @Mapping("data")
    JsonNode getData();

    @Mapping("archived")
    int getArchived();

//    @Override
//    default boolean isNew() {
//        return getId() == null;
//    }
}
