package com.ecews.mqlamisplus.entity.views.lims;

import com.blazebit.persistence.view.EntityView;
import com.blazebit.persistence.view.Mapping;
import com.ecews.mqlamisplus.entity.models.lims.LIMSResult;

@EntityView(LIMSResult.class)
public interface LIMSResultView {
    @Mapping("id")
    Integer getId();

    @Mapping("uuid")
    String getUuid();

    @Mapping("sampleID")
    String getSampleID();

    @Mapping("pcrLabSampleNumber")
    String getPcrLabSampleNumber();

    @Mapping("visitDate")
    String getVisitDate();

    @Mapping("dateSampleReceivedAtPcrLab")
    String getDateSampleReceivedAtPcrLab();

    @Mapping("resultDate")
    String getResultDate();

    @Mapping("testResult")
    String getTestResult();

    @Mapping("assayDate")
    String getAssayDate();

    @Mapping("approvalDate")
    String getApprovalDate();

    @Mapping("dateResultDispatched")
    String getDateResultDispatched();

    @Mapping("sampleStatus")
    String getSampleStatus();

    @Mapping("sampleTestable")
    String getSampleTestable();

    @Mapping("manifestRecordID")
    Integer getManifestRecordID();

    @Mapping("transferStatus")
    String getTransferStatus();

    @Mapping("testedBy")
    String getTestedBy();

    @Mapping("approvedBy")
    String getApprovedBy();

    @Mapping("dateTransferredOut")
    String getDateTransferredOut();

    @Mapping("reasonNotTested")
    String getReasonNotTested();

    @Mapping("otherRejectionReason")
    String getOtherRejectionReason();

    @Mapping("sendingPcrLabID")
    String getSendingPcrLabID();

    @Mapping("sendingPcrLabName")
    String getSendingPcrLabName();
}
