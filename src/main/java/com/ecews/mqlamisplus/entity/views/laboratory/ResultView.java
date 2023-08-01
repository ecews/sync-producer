package com.ecews.mqlamisplus.entity.views.laboratory;

import com.blazebit.persistence.view.EntityView;
import com.blazebit.persistence.view.Mapping;
import com.ecews.mqlamisplus.entity.models.laboratory.Result;
import com.ecews.mqlamisplus.utility.LocalDateTimeDeserializer;
import com.ecews.mqlamisplus.utility.LocalDateTimeSerializer;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import java.time.LocalDate;
import java.time.LocalDateTime;

@EntityView(Result.class)
public interface ResultView {
    @Mapping("id")
    Integer getId();

    @Mapping("uuid")
    String getUuid();

    @Mapping("assayedBy")
    String getAssayedBy();

    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    @Mapping("dateAssayed")
    LocalDateTime getDateAssayed();

    @Mapping("checkedBy")
    String getCheckedBy();

    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    @Mapping("dateChecked")
    LocalDateTime getDateChecked();

    @Mapping("approvedBy")
    String getApprovedBy();

    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    @Mapping("dateApproved")
    LocalDate getDateApproved();

    @Mapping("resultReportedBy")
    String getResultReportedBy();

    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    @Mapping("dateResultReported")
    LocalDateTime getDateResultReported();

    @Mapping("resultReported")
    String getResultReported();

    @Mapping("resultReport")
    String getResultReport();

    @Mapping("testId")
    Integer getTestId();

    @Mapping("patientUuid")
    String getPatientUuid();

    @Mapping("facilityId")
    Long getFacilityId();

    @Mapping("patientId")
    Integer getPatientId();

    @Mapping("pcrLabSampleNumber")
    String getPcrLabSampleNumber();

    @Mapping("dateSampleReceivedAtPcrLab")
    LocalDate getDateSampleReceivedAtPcrLab();

    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    @Mapping("dateResultReceived")
    LocalDateTime getDateResultReceived();

    @Mapping("resultReceivedBy")
    String getResultReceivedBy();

    @Mapping("archived")
    Integer getArchived();

    @Mapping("pcrLabName")
    String getPcrLabName();


//
//    @Mapping("setFields")
//    default void setFields() {
//        if (getArchived() == null) {
//            setArchived(0);
//        }
//    }
}

