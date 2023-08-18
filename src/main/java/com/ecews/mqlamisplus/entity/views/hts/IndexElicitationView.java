package com.ecews.mqlamisplus.entity.views.hts;


import com.blazebit.persistence.view.EntityView;
import com.blazebit.persistence.view.Mapping;
import com.ecews.mqlamisplus.entity.models.hts.IndexElicitation;
import com.ecews.mqlamisplus.utility.LocalDateDeserializer;
import com.ecews.mqlamisplus.utility.LocalDateSerializer;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import java.time.LocalDate;

@EntityView(IndexElicitation.class)
public interface IndexElicitationView {

    @Mapping("id")
    Long getId();

    @Mapping("dob")
    @JsonSerialize(using = LocalDateSerializer.class)
    @JsonDeserialize(using = LocalDateDeserializer.class)
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
    @JsonSerialize(using = LocalDateSerializer.class)
    @JsonDeserialize(using = LocalDateDeserializer.class)
    LocalDate getDatePartnerCameForTesting();

    @Mapping("htsClientUuid")
    String getHtsClientUuid();

    @Mapping("archived")
    Integer getArchived();

    @Mapping("uuid")
    String getUuid();

    @Mapping("facilityId")
    Long getFacilityId();

    @Mapping("extra")
    Object getExtra();

    @Mapping("offeredIns")
    String getOfferedIns();

    @Mapping("acceptedIns")
    String getAcceptedIns();
}

