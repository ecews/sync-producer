package com.ecews.mqlamisplus.models.views.hts;

import com.blazebit.persistence.view.EntityView;
import com.blazebit.persistence.view.Mapping;
import com.ecews.mqlamisplus.models.entities.Person.Person;

import javax.persistence.Id;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@EntityView(com.ecews.mqlamisplus.models.entities.hts.IndexElicitation.class)
public interface IndexElicitationView extends AuditView {

    @Mapping("dob")
    LocalDate getDob();

    @Mapping("isDateOfBirthEstimated")
    Boolean getIsDateOfBirthEstimated();

    @Mapping("sex")
    Long getSex();

    @Mapping("address")
    String getAddress();

    @Mapping("lastName")
    String getLastName();

    @Mapping("firstName")
    String getFirstName();

    @Mapping("middleName")
    String getMiddleName();

    @Mapping("phoneNumber")
    String getPhoneNumber();

    @Mapping("altPhoneNumber")
    String getAltPhoneNumber();

    @Mapping("hangOutSpots")
    String getHangOutSpots();

    @Mapping("physicalHurt")
    Long getPhysicalHurt();

    @Mapping("threatenToHurt")
    Long getThreatenToHurt();

    @Mapping("notificationMethod")
    Long getNotificationMethod();

    @Mapping("partnerTestedPositive")
    Long getPartnerTestedPositive();

    @Mapping("relationshipToIndexClient")
    Long getRelationshipToIndexClient();

    @Mapping("sexuallyUncomfortable")
    Long getSexuallyUncomfortable();

    @Mapping("currentlyLiveWithPartner")
    Boolean getCurrentlyLiveWithPartner();

    @Mapping("datePartnerCameForTesting")
    LocalDate getDatePartnerCameForTesting();

    @Mapping("htsClientUuid")
    String getHtsClientUuid();

    @Mapping("archived")
    int getArchived();

    @Mapping("uuid")
    String getUuid();

    @Mapping("facilityId")
    Long getFacilityId();

    @Mapping("extra")
    Object getExtra();

    @Mapping("htsClient")
    HtsClientView getHtsClient();

    // Implement AuditView interface
    @Override
    @Mapping("createdBy")
    String getCreatedBy();


    @Mapping("dateCreated")
    LocalDateTime getDateCreated();


    @Mapping("modifiedBy")
    String getModifiedBy();

    @Mapping("dateModified")
    LocalDateTime getDateModified();

}
