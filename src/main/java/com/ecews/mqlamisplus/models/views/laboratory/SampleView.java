package com.ecews.mqlamisplus.models.views.laboratory;

import com.blazebit.persistence.view.EntityView;
import com.blazebit.persistence.view.Mapping;
import com.ecews.mqlamisplus.models.entities.hts.Audit;
import com.ecews.mqlamisplus.models.entities.laboratory.Sample;
import com.ecews.mqlamisplus.models.views.hts.AuditView;
import com.ecews.mqlamisplus.utility.LocalDateDeserializer;
import com.ecews.mqlamisplus.utility.LocalDateSerializer;
import com.ecews.mqlamisplus.utility.LocalDateTimeDeserializer;
import com.ecews.mqlamisplus.utility.LocalDateTimeSerializer;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;

@EntityView(Sample.class)

public interface SampleView extends AuditView<String> {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name = "id", nullable = false)
//    private Integer id;
    @Mapping("uuid")
    String uuid();


    @Mapping("sample_number")
    String SampleNumber();

    @Mapping("sample_type_id")
    Integer sampleTypeId();


    @Mapping("sample_collection_mode")
    Integer sampleCollectionMode();



    @Mapping("date_sample_collected")
    LocalDateTime dateSampleCollected();



    @Mapping("comment_sample_collected")
    String commentSampleCollected();

    @Mapping("sample_collected_by")
    String sampleCollectedBy();



    @Mapping("date_sample_verified")
    LocalDateTime dateSampleVerified();



    @Mapping("comment_sample_verified")
    String commentSampleVerified();


    @Mapping("sample_verified_by")
    String sampleVerifiedBy();


    @Mapping("sample_accepted")
    String sampleAccepted();


    @Mapping("test_id")
    Integer testId();


    @Mapping("patient_uuid")
    String patientUuid();


    @Mapping("facility_id")
    Long facilityId();


    @Mapping("patient_id")
    Integer patientId();


    @Mapping("sample_logged_remotely")
    Integer sampleLoggedRemotely();



    @Mapping("date_sample_logged_remotely")
    LocalDate dateSampleLoggedRemotely();



    @Mapping("archived")
    Integer archived();

//    @PrePersist
//    public void setFields(){
//        if(archived == null){
//            archived = 0;
//        }
//    }
}

