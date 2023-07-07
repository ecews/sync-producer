package com.ecews.mqlamisplus.models.views.lims;

import com.blazebit.persistence.view.EntityView;
import com.blazebit.persistence.view.Mapping;
import com.ecews.mqlamisplus.models.entities.lims.LIMSResult;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@EntityView(LIMSResult.class)
public interface LIMSResultView {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name = "id", nullable = false)
//    private Integer id;
    @Mapping("uuid")
    String uuid();


    @Mapping("sample_id")
    String sampleID();



    @Mapping("pcr_lab_sample_number")
    String pcrLabSampleNumber();


    @Mapping("visit_date")
    String visitDate();




    @Mapping("date_sample_received_at_pcr_lab")
    String dateSampleReceivedAtPcrLab();



    @Mapping("result_date")
    String resultDate();


    @Mapping("test_result")
    String testResult();



    @Mapping("assay_date")
    String assayDate();



    @Mapping("approval_date")
    String approvalDate();



    @Mapping("date_result_dispatched")
    String dateResultDispatched();


    @Mapping("sample_status")
    String sampleStatus();


    @Mapping("sample_testable")
    String sampleTestable();


    @Mapping("manifest_record_id")
    Integer manifestRecordID();

    @Mapping("transfer_status")
    String transferStatus();


    @Mapping("tested_by")
    String  testedBy();


    @Mapping("approved_by")
    String approvedBy();


    @Mapping("date_transferred_out")
    String dateTransferredOut();


    @Mapping("reason_not_tested")
    String reasonNotTested();


    @Mapping("other_rejection_reason")
    String otherRejectionReason();
    @Mapping("sending_pcr_lab_id")
    String sendingPcrLabID();


    @Mapping("sending_pcr_lab_name")
    String sendingPcrLabName();
}
