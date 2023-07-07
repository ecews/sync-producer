package com.ecews.mqlamisplus.models.views.hiv;

import com.blazebit.persistence.view.EntityView;
import com.blazebit.persistence.view.Mapping;
import com.ecews.mqlamisplus.models.entities.Person.Person;
import com.ecews.mqlamisplus.models.entities.hiv.HIVEac;
import com.ecews.mqlamisplus.models.entities.visit.Visit;
import com.ecews.mqlamisplus.utility.LocalDateDeserializer;
import com.ecews.mqlamisplus.utility.LocalDateSerializer;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.*;
import org.springframework.data.domain.Persistable;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;

@EntityView(HIVEac.class)
public interface HIVEacView {


    @Mapping("person")
    Person getPerson();

    @Mapping("visit")
    Visit getVisit();


    @Mapping("lastViralLoad")
    Double lastViralLoad();

    @Mapping("dateOfLastViralLoad")
    LocalDate getDateOfLastViralLoad();


    @Mapping("uuid")
    String uuid();

    @Mapping("status")
    String status();

    @Mapping("archived")
    int archived();

    @Mapping("testResultId")
    Long testResultId();

    @Mapping("testGroup")
    String testGroup();

    @Mapping("testName")
    String testName();

    @Mapping("labNumber")
    String labNumber();

    @Mapping("reasonToStopEac")
    String reasonToStopEac();

//    @Override
//    public boolean isNew() {
//        return getId() == null;
//    }
}
