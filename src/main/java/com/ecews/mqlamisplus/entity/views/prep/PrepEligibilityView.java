package com.ecews.mqlamisplus.entity.views.prep;


import com.blazebit.persistence.view.EntityView;
import com.blazebit.persistence.view.Mapping;
import com.ecews.mqlamisplus.entity.models.prep.PrepEligibility;
import java.time.LocalDate;

@EntityView(PrepEligibility.class)
public interface PrepEligibilityView {
    @Mapping("uniqueId")
    String getUniqueId();

    @Mapping("visitDate")
    LocalDate getVisitDate();

    @Mapping("score")
    Integer getScore();

    @Mapping("hivRisk")
    Object getHivRisk();

    @Mapping("stiScreening")
    Object getStiScreening();

    @Mapping("drugUseHistory")
    Object getDrugUseHistory();

    @Mapping("personalHivRiskAssessment")
    Object getPersonalHivRiskAssessment();

    @Mapping("sexPartnerRisk")
    Object getSexPartnerRisk();

    @Mapping("personUuid")
    String getPersonUuid();

    @Mapping("sexPartner")
    String getSexPartner();

    @Mapping("counselingType")
    String getCounselingType();

    @Mapping("firstTimeVisit")
    Boolean getFirstTimeVisit();

    @Mapping("numChildrenLessThanFive")
    Integer getNumChildrenLessThanFive();

    @Mapping("numWives")
    Integer getNumWives();

    @Mapping("targetGroup")
    String getTargetGroup();

    @Mapping("extra")
    Object getExtra();

    @Mapping("facilityId")
    Long getFacilityId();

    @Mapping("uuid")
    String getUuid();

    @Mapping("archived")
    Integer getArchived();

    // Add mappings for other desired properties

    // Add any other necessary methods or mappings for custom logic or associations
}

