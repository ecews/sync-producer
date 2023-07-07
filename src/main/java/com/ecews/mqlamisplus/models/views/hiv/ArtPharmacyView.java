package com.ecews.mqlamisplus.models.views.hiv;

import com.blazebit.persistence.view.EntityView;
import com.blazebit.persistence.view.Mapping;
import com.ecews.mqlamisplus.models.entities.Person.Person;
import com.ecews.mqlamisplus.models.entities.hiv.ArtPharmacy;
import com.ecews.mqlamisplus.models.entities.visit.Visit;
import com.ecews.mqlamisplus.utility.LocalDateDeserializer;
import com.ecews.mqlamisplus.utility.LocalDateSerializer;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.PastOrPresent;
import java.time.LocalDate;

@EntityView(ArtPharmacy.class)
public interface ArtPharmacyView {

    @Mapping("visitDate")
    LocalDate getVisitDate();

    @Mapping("adrScreened")
    Boolean getAdrScreened();

    @Mapping("prescriptionError")
    Boolean getPrescriptionError();

    @Mapping("adherence")
    Boolean getAdherence();

    @Mapping("mmdType")
    String getMmdType();

    @Mapping("uuid")
    @Column(nullable = false, unique = true, updatable = false)
    String getUuid();

    @Mapping("nextAppointment")
    LocalDate getNextAppointment();

    @Mapping("extra")
    JsonNode getExtra();

    @Mapping("adverseDrugReactions")
    JsonNode getAdverseDrugReactions();

    @Mapping("isDevolve")
    Boolean getIsDevolve();

    @Mapping("refillPeriod")
    Integer getRefillPeriod();

    @Mapping("deliveryPoint")
    String getDeliveryPoint();

    @Mapping("dsdModel")
    String getDsdModel();

    @Mapping("dsdModelType")
    String getDsdModelType();

    @Mapping("refill")
    String getRefill();

    @Mapping("refillType")
    String getRefillType();

    @Mapping("iptType")
    String getIptType();

    @Mapping("visitType")
    String getVisitType();

    @Mapping("ipt")
    JsonNode getIpt();

    @Mapping("archived")
    int getArchived();

    @Mapping("person")
    Person getPerson();

    @Mapping("visit")
    Visit getVisit();

//    default boolean isNew() {
//        return id == null;
//    }
}
