package com.ecews.mqlamisplus.models.views.hiv;

import com.blazebit.persistence.view.EntityView;
import com.blazebit.persistence.view.Mapping;
import com.ecews.mqlamisplus.models.entities.Person.Person;
import com.ecews.mqlamisplus.models.entities.hiv.HivEnrollment;
import com.ecews.mqlamisplus.models.entities.visit.Visit;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.JsonNode;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.ZonedDateTime;

@EntityView(HivEnrollment.class)
public interface HivEnrollmentView {

    @Mapping("id")
    Long getId();

    @Mapping("uniqueId")
    String getUniqueId();

    @Mapping("entryPointId")
    Long getEntryPointId();

    @Mapping("targetGroupId")
    Long getTargetGroupId();

    @Mapping("dateConfirmedHiv")
    LocalDate getDateConfirmedHiv();

    @Mapping("dateEnrolledPMTCT")
    LocalDate getDateEnrolledPMTCT();

    @Mapping("sourceOfReferrerId")
    Long getSourceOfReferrerId();

    @Mapping("timeHivDiagnosis")
    ZonedDateTime getTimeHivDiagnosis();

    @Mapping("pregnant")
    Boolean isPregnant();

    @Mapping("breastfeeding")
    Boolean isBreastfeeding();

    @Mapping("dateOfRegistration")
    LocalDate getDateOfRegistration();

    @Mapping("statusAtRegistrationId")
    Long getStatusAtRegistrationId();

    @Mapping("enrollmentSettingId")
    Long getEnrollmentSettingId();

    @Mapping("dateStarted")
    LocalDate getDateStarted();

    @Mapping("sendMessage")
    Boolean isSendMessage();

    @Mapping("person")
    Person getPerson();

    @Mapping("visit")
    Visit getVisit();

    @Mapping("uuid")
    String getUuid();

    @Mapping("archived")
    int getArchived();

    @Mapping("facilityName")
    String getFacilityName();

    @Mapping("ovcNumber")
    String getOvcNumber();

    @Mapping("houseHoldNumber")
    String getHouseHoldNumber();

    @Mapping("careEntryPointOther")
    String getCareEntryPointOther();

    @Mapping("referredToOVCPartner")
    String getReferredToOVCPartner();

    @Mapping("referredFromOVCPartner")
    String getReferredFromOVCPartner();

    @Mapping("dateReferredToOVCPartner")
    LocalDate getDateReferredToOVCPartner();

    @Mapping("dateReferredFromOVCPartner")
    LocalDate getDateReferredFromOVCPartner();

    @Mapping("dateOfLpm")
    LocalDate getDateOfLpm();

    @Mapping("pregnancyStatusId")
    Long getPregnancyStatusId();

    @Mapping("tbStatusId")
    Long getTbStatusId();

    @Mapping("lipName")
    String getLipName();

//    default boolean isNew() {
//        return getId() == null;
//    }
}
