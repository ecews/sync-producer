package com.ecews.mqlamisplus.entity.views.hiv;

import com.blazebit.persistence.view.EntityView;
import com.blazebit.persistence.view.Mapping;
import com.ecews.mqlamisplus.entity.models.Person.Person;
import com.ecews.mqlamisplus.entity.models.hiv.ARTClinical;
import com.ecews.mqlamisplus.entity.models.hiv.HivEnrollment;
import com.ecews.mqlamisplus.entity.models.triage.VitalSign;
import com.ecews.mqlamisplus.entity.models.visit.Visit;
import com.fasterxml.jackson.databind.JsonNode;

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

    @Mapping("hivEnrollment.uuid")
    String getHivEnrollment();

    @Mapping("regimenId")
    long getRegimenId();

    @Mapping("regimenTypeId")
    long getRegimenTypeId();

    @Mapping("artStatusId")
    Long getArtStatusId();

    @Mapping("archived")
    Integer getArchived();

    @Mapping("vitalSign.uuid")
    String getVitalSign();

    @Mapping("whoStagingId")
    Long getWhoStagingId();

    @Mapping("person.uuid")
    String getPerson();

    @Mapping("visit.uuid")
    String getVisit();

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


    @Mapping("cryptococcalScreeningStatus")
    String getCryptococcalScreeningStatus();


    @Mapping("cervicalCancerScreeningStatus")
    String getCervicalCancerScreeningStatus();


    @Mapping("cervicalCancerTreatmentProvided")
    String getCervicalCancerTreatmentProvided();

    @Mapping("hepatitisScreeningResult")
    String getHepatitisScreeningResult();


    @Mapping("familyPlaning")
    String getFamilyPlaning();

    @Mapping("familyPlaning")
    String getOnFamilyPlaning();


    @Mapping("levelOfAdherence")
    String getLevelOfAdherence();


    @Mapping("tbStatus")
    String getTbStatus();


    @Mapping("tbPrevention")
    String getTbPrevention();

    @Mapping("aRVDrugsRegimen")
    JsonNode getARVDrugsRegimen();


    @Mapping("viralLoadOrder")
    JsonNode getViralLoadOrder();

    @Mapping("extra")
    JsonNode getExtra();

    @Mapping("cd4Count")
    String getCd4Count();

    @Mapping("cd4SemiQuantitative")
    String getCd4SemiQuantitative();

    @Mapping("cd4FlowCytometry")
    Integer getCd4FlowCytometry();

    @Mapping("pregnancyStatus")
    String getPregnancyStatus();

    @Mapping("cd4Type")
    String getCd4Type();

//    default boolean isNew() {
//        return id == null;
//    }
}
