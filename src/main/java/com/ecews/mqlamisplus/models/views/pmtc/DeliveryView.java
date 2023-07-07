package com.ecews.mqlamisplus.models.views.pmtc;

import com.blazebit.persistence.view.EntityView;
import com.blazebit.persistence.view.Mapping;
import com.ecews.mqlamisplus.models.entities.pmtc.Delivery;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.domain.Persistable;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;
import java.time.LocalDate;

@EntityView(Delivery.class)
public interface DeliveryView extends PMTCTTransactionalEntityView, Serializable, Persistable<Long> {
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


    @Override
    @Mapping("isNew")
    boolean isNew();
}
