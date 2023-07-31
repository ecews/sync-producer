package com.ecews.mqlamisplus.entity.views.hiv;

import com.blazebit.persistence.view.EntityView;
import com.blazebit.persistence.view.Mapping;
import com.ecews.mqlamisplus.entity.models.hiv.ArtPharmacy;
import com.fasterxml.jackson.databind.JsonNode;

import java.time.LocalDate;

@EntityView(ArtPharmacy.class)
public interface ArtPharmacyView {
    @Mapping("id")
    Long getId();

    @Mapping("person.uuid")
    String getPersonUuid();

    @Mapping("visit.uuid")
    String getVisitUuid();

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
}