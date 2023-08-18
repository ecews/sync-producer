package com.ecews.mqlamisplus.entity.views.triage;

import com.blazebit.persistence.CriteriaBuilder;
import com.blazebit.persistence.CriteriaBuilderFactory;
import com.blazebit.persistence.view.*;
import com.ecews.mqlamisplus.entity.models.triage.VitalSign;
import com.ecews.mqlamisplus.entity.models.Person.Person;
import com.ecews.mqlamisplus.entity.models.visit.Visit;

import javax.persistence.OneToMany;
import java.time.LocalDateTime;
import java.util.List;

@EntityView(VitalSign.class)
public interface VitalSignView {
    @IdMapping
    Long getId();

    Double getBodyWeight();

    Double getDiastolic();

    LocalDateTime getCaptureDate();

    Double getHeight();

    Double getTemperature();

    Double getPulse();

    Double getRespiratoryRate();

    Double getSystolic();

    String getUuid();


    @Mapping("person.uuid")
    String getPersonUuid();

    @Mapping("visit.uuid")
    String getVisitUuid();

    Integer getArchived();




}

