package com.ecews.mqlamisplus.models.views.hiv;

import com.blazebit.persistence.view.EntityView;
import com.blazebit.persistence.view.Mapping;
import com.ecews.mqlamisplus.models.entities.Person.Person;
import com.ecews.mqlamisplus.models.entities.hiv.ARTClinical;
import com.ecews.mqlamisplus.models.entities.visit.Visit;
import com.ecews.mqlamisplus.utility.LocalDateDeserializer;
import com.ecews.mqlamisplus.utility.LocalDateSerializer;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import javax.persistence.*;
import javax.validation.constraints.PastOrPresent;
import java.time.LocalDate;

@EntityView(ARTClinical.class)
public interface ArtClinicalView {

    @Mapping("visitDate")
    LocalDate getVisitDate();

    @Mapping("cd4")
    Long getCd4();

    @Mapping("cd4Percentage")
    Long getCd4Percentage();

    @Mapping("isCommencement")
    Boolean getIsCommencement();

    @Mapping("functionalStatusId")
    Long getFunctionalStatusId();

    @Mapping("clinicalStageId")
    Long getClinicalStageId();

    @Mapping("clinicalNote")
    String getClinicalNote();

    @Mapping("uuid")
    String getUuid();

    @Mapping("hivEnrollment")
    String getHivEnrollment();

    @Mapping("regimenId")
    long getRegimenId();

    @Mapping("regimenTypeId")
    long getRegimenTypeId();

    @Mapping("artStatusId")
    Long getArtStatusId();

    @Mapping("archived")
    Integer getArchived();

    @Mapping("vitalSign")
    String getVitalSign();

    @Mapping("whoStagingId")
    Long getWhoStagingId();

    @Mapping("person")
    Person getPerson();

    @Mapping("visit")
    Visit getVisit();

    @Mapping("oiScreened")
    String getOiScreened();

    @Mapping("stiIds")
    String getStiIds();

    @Mapping("stiTreated")
    String getStiTreated();

    @Mapping("opportunisticInfections")
    JsonNode getOpportunisticInfections();

    @Mapping("adrScreened")
    String getAdrScreened();

    @Mapping("adverseDrugReactions")
    JsonNode getAdverseDrugReactions();

    @Mapping("adherenceLevel")
    String getAdherenceLevel();

    @Mapping("adheres")
    JsonNode getAdheres();

    @Mapping("nextAppointment")
    LocalDate getNextAppointment();

    @Mapping("lmpDate")
    LocalDate getLmpDate();

    @Mapping("tbScreen")
    JsonNode getTbScreen();

    @Mapping("isViralLoadAtStartOfArt")
    Boolean getIsViralLoadAtStartOfArt();

    @Mapping("viralLoadAtStartOfArt")
    Double getViralLoadAtStartOfArt();

    @Mapping("dateOfViralLoadAtStartOfArt")
    LocalDate getDateOfViralLoadAtStartOfArt();


    @Mapping("CryptococcalScreeningStatus")
    String getCryptococcalScreeningStatus();


    @Mapping("CervicalCancerScreeningStatus")
    String getCervicalCancerScreeningStatus();


    @Mapping("CervicalCancerTreatmentProvided")
    String getCervicalCancerTreatmentProvided();

    @Mapping("HepatitisScreeningResult")
    String getHepatitisScreeningResult();


    @Mapping("FamilyPlaning")
    String getFamilyPlaning();

    @Mapping("OnFamilyPlaning")
    String getOnFamilyPlaning();


    @Mapping("LevelOfAdherence")
    String getLevelOfAdherence();


    @Mapping("TbStatus")
    String getTbStatus();


    @Mapping("TbPrevention")
    String getTbPrevention();

    @Mapping("ARVDrugsRegimen")
    JsonNode getARVDrugsRegimen();


    @Mapping("ViralLoadOrder")
    JsonNode getViralLoadOrder();

    @Mapping("Extra")
    JsonNode getExtra();

    @Mapping("Cd4Count")
    String getCd4Count();

    @Mapping("Cd4SemiQuantitative")
    String getCd4SemiQuantitative();

    @Mapping("Cd4FlowCytometry")
    Integer getCd4FlowCytometry();

    @Mapping("PregnancyStatus")
    String getPregnancyStatus();

    @Mapping("Cd4Type")
    String getCd4Type();

//    default boolean isNew() {
//        return id == null;
//    }
}
