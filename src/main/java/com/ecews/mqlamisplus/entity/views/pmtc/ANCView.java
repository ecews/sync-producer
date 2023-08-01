package com.ecews.mqlamisplus.entity.views.pmtc;

import com.blazebit.persistence.view.EntityView;
import com.blazebit.persistence.view.Mapping;
import com.ecews.mqlamisplus.entity.models.pmtc.ANC;
import com.fasterxml.jackson.databind.JsonNode;

import java.time.LocalDate;

@EntityView(ANC.class)
public interface ANCView {
    @Mapping("firstAncDate")
    LocalDate getFirstAncDate();

    @Mapping("gravida")
    Integer getGravida();

    @Mapping("parity")
    Integer getParity();

    @Mapping("LMP")
    LocalDate getLMP();

    @Mapping("expectedDeliveryDate")
    LocalDate getExpectedDeliveryDate();

    @Mapping("gAWeeks")
    Integer getGAWeeks();

    @Mapping("hivDiognosicTime")
    String getHivDiognosicTime();

    @Mapping("testedSyphilis")
    String getTestedSyphilis();

    @Mapping("testResultSyphilis")
    String getTestResultSyphilis();

    @Mapping("treatedSyphilis")
    String getTreatedSyphilis();

    @Mapping("referredSyphilisTreatment")
    String getReferredSyphilisTreatment();

    @Mapping("pmtctHtsInfo")
    JsonNode getPmtctHtsInfo();

    @Mapping("partnerNotification")
    JsonNode getPartnerNotification();

    @Mapping("personUuid")
    String getPersonUuid();

    @Mapping("archived")
    Long getArchived();

    @Mapping("status")
    String getStatus();

    @Mapping("staticHivStatus")
    String getStaticHivStatus();

    @Mapping("sourceOfReferral")
    String getSourceOfReferral();

    @Mapping("lastVisitDate")
    LocalDate getLastVisitDate();

    @Mapping("nextAppointmentDate")
    LocalDate getNextAppointmentDate();

    @Mapping("defaultDays")
    Integer getDefaultDays();

    @Mapping("partnerInformation")
    JsonNode getPartnerInformation();

    // Add any other necessary methods or mappings for custom logic or associations
}
