package com.ecews.mqlamisplus.entity.views.pmtc;


import com.blazebit.persistence.view.EntityView;
import com.blazebit.persistence.view.Mapping;
import com.ecews.mqlamisplus.entity.models.pmtc.InfantPCR;
import java.time.LocalDate;

@EntityView(InfantPCR.class)
public interface InfantPCRView {
    @Mapping("visitDate")
    LocalDate getVisitDate();

    @Mapping("infantHospitalNumber")
    String getInfantHospitalNumber();

    @Mapping("ancNumber")
    String getAncNumber();

    @Mapping("ageAtTest")
    Long getAgeAtTest();

    @Mapping("testType")
    String getTestType();

    @Mapping("dateSampleCollected")
    LocalDate getDateSampleCollected();

    @Mapping("dateSampleSent")
    LocalDate getDateSampleSent();

    @Mapping("dateResultReceivedAtFacility")
    LocalDate getDateResultReceivedAtFacility();

    @Mapping("dateResultReceivedByCaregiver")
    LocalDate getDateResultReceivedByCaregiver();

    @Mapping("results")
    String getResults();

    @Mapping("uuid")
    String getUuid();

    // Add any other necessary methods or mappings for custom logic or associations
}

