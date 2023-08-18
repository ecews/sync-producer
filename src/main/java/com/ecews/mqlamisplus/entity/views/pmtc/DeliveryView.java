package com.ecews.mqlamisplus.entity.views.pmtc;


import com.blazebit.persistence.view.EntityView;
import com.blazebit.persistence.view.Mapping;
import com.ecews.mqlamisplus.entity.models.pmtc.Delivery;
import java.time.LocalDate;

@EntityView(Delivery.class)
public interface DeliveryView {
    @Mapping("dateOfDelivery")
    LocalDate getDateOfDelivery();

    @Mapping("bookingStatus")
    String getBookingStatus();

    @Mapping("gAWeeks")
    Integer getGAWeeks();

    @Mapping("romDeliveryInterval")
    String getRomDeliveryInterval();

    @Mapping("modeOfDelivery")
    String getModeOfDelivery();

    @Mapping("episiotomy")
    String getEpisiotomy();

    @Mapping("vaginalTear")
    String getVaginalTear();

    @Mapping("feedingDecision")
    String getFeedingDecision();

    @Mapping("maternalOutcome")
    String getMaternalOutcome();

    @Mapping("childGivenArvWithin72")
    String getChildGivenArvWithin72();

    @Mapping("childStatus")
    String getChildStatus();

    @Mapping("hivExposedInfantGivenHbWithin24hrs")
    String getHivExposedInfantGivenHbWithin24hrs();

    @Mapping("deliveryTime")
    String getDeliveryTime();

    @Mapping("onArt")
    String getOnArt();

    @Mapping("artStartedLdWard")
    String getArtStartedLdWard();

    @Mapping("HBStatus")
    String getHBStatus();

    @Mapping("HCStatus")
    String getHCStatus();

    @Mapping("referalSource")
    String getReferalSource();

    @Mapping("numberOfInfantsAlive")
    Integer getNumberOfInfantsAlive();

    @Mapping("numberOfInfantsDead")
    Integer getNumberOfInfantsDead();

    // Add any other necessary methods or mappings for custom logic or associations
}

