package com.ecews.mqlamisplus.entity.views.pmtc;

import com.blazebit.persistence.view.EntityView;
import com.blazebit.persistence.view.Mapping;
import com.ecews.mqlamisplus.entity.models.pmtc.InfantArv;
import java.time.LocalDate;

@EntityView(InfantArv.class)
public interface InfantArvView {
    @Mapping("visitDate")
    LocalDate getVisitDate();

    @Mapping("infantHospitalNumber")
    String getInfantHospitalNumber();

    @Mapping("ancNumber")
    String getAncNumber();

    @Mapping("infantArvType")
    String getInfantArvType();

    @Mapping("infantArvTime")
    String getInfantArvTime();

    @Mapping("arvDeliveryPoint")
    String getArvDeliveryPoint();

    @Mapping("uuid")
    String getUuid();

    @Mapping("ageAtCtx")
    String getAgeAtCtx();

    // Add any other necessary methods or mappings for custom logic or associations
}

