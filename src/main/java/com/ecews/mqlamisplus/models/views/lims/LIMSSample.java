package com.ecews.mqlamisplus.models.views.lims;

import com.blazebit.persistence.view.EntityView;
import com.blazebit.persistence.view.Mapping;
import com.fasterxml.jackson.databind.JsonNode;
import com.vladmihalcea.hibernate.type.array.IntArrayType;
import com.vladmihalcea.hibernate.type.array.StringArrayType;
import com.vladmihalcea.hibernate.type.json.JsonBinaryType;
import com.vladmihalcea.hibernate.type.json.JsonNodeBinaryType;
import com.vladmihalcea.hibernate.type.json.JsonNodeStringType;
import com.vladmihalcea.hibernate.type.json.JsonStringType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Type;
import org.hibernate.annotations.TypeDef;
import org.hibernate.annotations.TypeDefs;

import javax.persistence.*;

@EntityView(LIMSSample.class)

public interface LIMSSample {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name = "id", nullable = false)
//    private Integer id;
    @Mapping("uuid")
    String uuid();
    @Mapping("pid")
    String pid();


    @Mapping("sample_id")
    String sampleID();


    @Mapping("patient_id")
    JsonNode patientID();

    @Mapping("sample_type")
    String sampleType();


    @Mapping("sample_ordered_by")
    String sampleOrderedBy();


    @Mapping("sample_order_date")
    String sampleOrderDate();


    @Mapping("sample_collected_by")
    String sampleCollectedBy();


    @Mapping("sample_collection_date")
    String sampleCollectionDate();


    @Mapping("sample_collection_time")
    String sampleCollectionTime();


    @Mapping("date_sample_sent")
    String dateSampleSent();


    @Mapping("indication_vl_test")
    String indicationVLTest();

    @Mapping("first_name")
    String firstName();


    @Mapping("surname")
    String surName();


    @Mapping("sex")
    String Sex();


    @Mapping("age")
    String Age();


    @Mapping("date_of_birth")
    String dateOfBirth();

    @Mapping("pregnant_breast_feeding_status")
    String pregnantBreastFeedingStatus();


    @Mapping("art_commencement_date")
    String artCommencementDate();


    @Mapping("drug_regimen")
    String drugRegimen();

    @Mapping("sending_facility_id")
    String sendingFacilityID();


    @Mapping("sending_facility_name")
    String sendingFacilityName();


    @Mapping("priority")
    String priority();



    @Mapping("priority_reason")
    String priorityReason();

    @Mapping("manifest_record_id")
    Integer manifestRecordID();
}
