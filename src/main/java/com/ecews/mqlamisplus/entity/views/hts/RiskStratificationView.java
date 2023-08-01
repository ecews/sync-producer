package com.ecews.mqlamisplus.entity.views.hts;


import com.blazebit.persistence.view.EntityView;
import com.blazebit.persistence.view.Mapping;
import com.ecews.mqlamisplus.entity.models.hts.RiskStratification;

import java.time.LocalDate;
import java.util.UUID;

@EntityView(RiskStratification.class)
public interface RiskStratificationView {
    @Mapping("id")
    Long getId();

    @Mapping("age")
    int getAge();

    @Mapping("entryPoint")
    String getEntryPoint();

    @Mapping("dob")
    LocalDate getDob();

    @Mapping("testingSetting")
    String getTestingSetting();

    @Mapping("modality")
    String getModality();

    @Mapping("code")
    String getCode();

    @Mapping("targetGroup")
    String getTargetGroup();

    @Mapping("visitDate")
    LocalDate getVisitDate();

    @Mapping("archived")
    int getArchived();

    @Mapping("riskAssessment")
    Object getRiskAssessment();

    @Mapping("personUuid")
    String getPersonUuid();

    @Mapping("communityEntryPoint")
    String getCommunityEntryPoint();

    @Mapping("facilityId")
    Long getFacilityId();


    // Add the necessary mappings for any other associations or properties in the entity

//    @Mapping("setFields")
//    default void setFields() {
//        if (getCode() == null || getCode().isEmpty()) {
//            // Generate a UUID for the code if it is empty
//            setCode(UUID.randomUUID().toString());
//        }
//    }

    // Add any other necessary methods or mappings for custom logic or associations
}
