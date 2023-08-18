package com.ecews.mqlamisplus.entity.views.prep;


import com.blazebit.persistence.view.EntityView;
import com.blazebit.persistence.view.Mapping;
import com.ecews.mqlamisplus.entity.models.prep.PrepEnrollment;
import java.time.LocalDate;

@EntityView(PrepEnrollment.class)
public interface PrepEnrollmentView {
    @Mapping("uniqueId")
    String getUniqueId();

    @Mapping("status")
    String getStatus();

    @Mapping("dateStarted")
    LocalDate getDateStarted();

    @Mapping("personUuid")
    String getPersonUuid();

    @Mapping("visitUuid")
    String getVisitUuid();

    @Mapping("uuid")
    String getUuid();

    @Mapping("archived")
    Integer getArchived();

    @Mapping("extra")
    Object getExtra();

    @Mapping("facilityId")
    Long getFacilityId();

    @Mapping("prepEligibilityUuid")
    String getPrepEligibilityUuid();

    @Mapping("supporterName")
    String getSupporterName();

    @Mapping("supporterRelationshipType")
    String getSupporterRelationshipType();

    @Mapping("supporterPhone")
    String getSupporterPhone();

    @Mapping("riskType")
    String getRiskType();

    @Mapping("ancUniqueArtNo")
    String getAncUniqueArtNo();

    @Mapping("dateEnrolled")
    LocalDate getDateEnrolled();

    @Mapping("dateReferred")
    LocalDate getDateReferred();

    @Mapping("hivTestingPoint")
    String getHivTestingPoint();

    @Mapping("dateOfLastHivNegativeTest")
    LocalDate getDateOfLastHivNegativeTest();

    // Add mappings for other desired properties

    // Add any other necessary methods or mappings for custom logic or associations
}
