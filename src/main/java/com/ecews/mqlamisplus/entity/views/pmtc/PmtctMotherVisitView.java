package com.ecews.mqlamisplus.entity.views.pmtc;


import com.blazebit.persistence.view.EntityView;
import com.blazebit.persistence.view.Mapping;
import com.ecews.mqlamisplus.entity.models.pmtc.PmtctMotherVisit;
import java.time.LocalDate;

@EntityView(PmtctMotherVisit.class)
public interface PmtctMotherVisitView {
    @Mapping("ancNo")
    String getAncNo();

    @Mapping("hospitalNumber")
    String getHospitalNumber();

    @Mapping("personUuid")
    String getPersonUuid();

    @Mapping("uuid")
    String getUuid();

    @Mapping("entryPoint")
    String getEntryPoint();

    @Mapping("dateOfVisit")
    LocalDate getDateOfVisit();

    @Mapping("fpCounseling")
    String getFpCounseling();

    @Mapping("fpMethod")
    String getFpMethod();

    @Mapping("timeOfViralLoad")
    String getTimeOfViralLoad();

    @Mapping("dateOfViralLoad")
    LocalDate getDateOfViralLoad();

    @Mapping("gaOfViralLoad")
    Integer getGaOfViralLoad();

    @Mapping("resultOfViralLoad")
    Integer getResultOfViralLoad();

    @Mapping("dsd")
    String getDsd();

    @Mapping("dsdOption")
    String getDsdOption();

    @Mapping("dsdModel")
    String getDsdModel();

    @Mapping("maternalOutcome")
    String getMaternalOutcome();

    @Mapping("dateOfMaternalOutcome")
    LocalDate getDateOfMaternalOutcome();

    @Mapping("visitStatus")
    String getVisitStatus();

    @Mapping("transferTo")
    String getTransferTo();

    @Mapping("nextAppointmentDate")
    LocalDate getNextAppointmentDate();

    // Add any other necessary methods or mappings for custom logic or associations
}
