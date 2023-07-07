package com.ecews.mqlamisplus.models.views.laboratory;

import com.blazebit.persistence.view.EntityView;
import com.blazebit.persistence.view.Mapping;
import com.ecews.mqlamisplus.models.entities.hts.Audit;
import com.ecews.mqlamisplus.models.entities.laboratory.Result;
import com.ecews.mqlamisplus.models.views.hts.AuditView;
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

@EntityView(Result.class)

public interface ResultView extends AuditView<String> {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name = "id", nullable = false)
//    private Integer id;


    @Mapping("uuid")
    String uuid();


    @Mapping("assayed_by")
    String assayedBy();



    @Mapping("date_assayed")
    LocalDateTime dateAssayed();


    @Mapping("checked_by")
    String checkedBy();



    @Mapping("date_checked")
    LocalDateTime dateChecked();


    @Mapping("approved_by")
    String approvedBy();



    @Mapping("date_approved")
    LocalDate dateApproved();



    @Mapping("result_reported_by")
    String resultReportedBy();



    @Mapping("date_result_reported")
    LocalDateTime dateResultReported();



    @Mapping("result_reported")
    String resultReported();
    @Mapping("result_report")
    String resultReport();


    @Mapping("test_id")
    Integer testId();


    @Mapping("patient_uuid")
    String patientUuid();


    @Mapping("facility_id")
    Long facilityId();


    @Mapping("patient_id")
    Integer patientId();


    @Mapping("pcr_lab_sample_number")
    String pcrLabSampleNumber();


    @Mapping("date_sample_received_at_pcr_lab")
    LocalDate dateSampleReceivedAtPcrLab();



    @Mapping("date_result_received")
    LocalDateTime dateResultReceived();


    @Mapping("result_received_by")
    String resultReceivedBy();


    @Mapping("archived")
    Integer archived();


    @Mapping("pcr_lab_name")
    String pcrLabName();

//    @PrePersist
//    public void setFields(){
//        if(archived == null){
//            archived = 0;
//        }
//    }
}
