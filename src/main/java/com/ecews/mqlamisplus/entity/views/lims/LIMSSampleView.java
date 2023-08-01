package com.ecews.mqlamisplus.entity.views.lims;


import com.blazebit.persistence.view.EntityView;
import com.blazebit.persistence.view.Mapping;
import com.ecews.mqlamisplus.entity.models.lims.LIMSSample;
import com.fasterxml.jackson.databind.JsonNode;

@EntityView(LIMSSample.class)
public interface LIMSSampleView {
    @Mapping("id")
    Integer getId();

    @Mapping("uuid")
    String getUuid();

    @Mapping("pid")
    String getPid();

    @Mapping("sampleID")
    String getSampleID();

    @Mapping("patientID")
    JsonNode getPatientID();

    @Mapping("sampleType")
    String getSampleType();

    @Mapping("sampleOrderedBy")
    String getSampleOrderedBy();

    @Mapping("sampleOrderDate")
    String getSampleOrderDate();

    @Mapping("sampleCollectedBy")
    String getSampleCollectedBy();

    @Mapping("sampleCollectionDate")
    String getSampleCollectionDate();

    @Mapping("sampleCollectionTime")
    String getSampleCollectionTime();

    @Mapping("dateSampleSent")
    String getDateSampleSent();

    @Mapping("indicationVLTest")
    String getIndicationVLTest();

    @Mapping("firstName")
    String getFirstName();

    @Mapping("surName")
    String getSurName();

    @Mapping("Sex")
    String getSex();

    @Mapping("Age")
    String getAge();

    @Mapping("dateOfBirth")
    String getDateOfBirth();

    @Mapping("pregnantBreastFeedingStatus")
    String getPregnantBreastFeedingStatus();

    @Mapping("artCommencementDate")
    String getArtCommencementDate();

    @Mapping("drugRegimen")
    String getDrugRegimen();

    @Mapping("sendingFacilityID")
    String getSendingFacilityID();

    @Mapping("sendingFacilityName")
    String getSendingFacilityName();

    @Mapping("priority")
    String getPriority();

    @Mapping("priorityReason")
    String getPriorityReason();

    @Mapping("manifestRecordID")
    Integer getManifestRecordID();

}

