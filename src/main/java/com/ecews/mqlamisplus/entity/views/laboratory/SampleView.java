package com.ecews.mqlamisplus.entity.views.laboratory;


import com.blazebit.persistence.view.EntityView;
import com.blazebit.persistence.view.Mapping;
import com.ecews.mqlamisplus.entity.models.laboratory.Sample;
import com.ecews.mqlamisplus.utility.LocalDateDeserializer;
import com.ecews.mqlamisplus.utility.LocalDateSerializer;
import com.ecews.mqlamisplus.utility.LocalDateTimeDeserializer;
import com.ecews.mqlamisplus.utility.LocalDateTimeSerializer;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import java.time.LocalDate;
import java.time.LocalDateTime;

@EntityView(Sample.class)
public interface SampleView {
    @Mapping("id")
    Integer getId();

    @Mapping("uuid")
    String getUuid();

    @Mapping("SampleNumber")
    String getSampleNumber();

    @Mapping("sampleTypeId")
    Integer getSampleTypeId();

    @Mapping("sampleCollectionMode")
    Integer getSampleCollectionMode();

    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    @Mapping("dateSampleCollected")
    LocalDateTime getDateSampleCollected();

    @Mapping("commentSampleCollected")
    String getCommentSampleCollected();

    @Mapping("sampleCollectedBy")
    String getSampleCollectedBy();

    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    @Mapping("dateSampleVerified")
    LocalDateTime getDateSampleVerified();

    @Mapping("commentSampleVerified")
    String getCommentSampleVerified();

    @Mapping("sampleVerifiedBy")
    String getSampleVerifiedBy();

    @Mapping("sampleAccepted")
    String getSampleAccepted();

    @Mapping("testId")
    Integer getTestId();

    @Mapping("patientUuid")
    String getPatientUuid();

    @Mapping("facilityId")
    Long getFacilityId();

    @Mapping("patientId")
    Integer getPatientId();

    @Mapping("sampleLoggedRemotely")
    Integer getSampleLoggedRemotely();

    @JsonSerialize(using = LocalDateSerializer.class)
    @JsonDeserialize(using = LocalDateDeserializer.class)
    @Mapping("dateSampleLoggedRemotely")
    LocalDate getDateSampleLoggedRemotely();

    @Mapping("archived")
    Integer getArchived();

//
//    @Mapping("setFields")
//    default void setFields() {
//        if (getArchived() == null) {
//            setArchived(0);
//        }
//    }
}

