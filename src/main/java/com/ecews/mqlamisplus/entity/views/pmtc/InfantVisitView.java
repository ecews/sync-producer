package com.ecews.mqlamisplus.entity.views.pmtc;

import com.blazebit.persistence.view.EntityView;
import com.blazebit.persistence.view.Mapping;
import com.ecews.mqlamisplus.entity.models.pmtc.InfantVisit;
import java.time.LocalDate;

@EntityView(InfantVisit.class)
public interface InfantVisitView {
    @Mapping("visitDate")
    LocalDate getVisitDate();

    @Mapping("infantHospitalNumber")
    String getInfantHospitalNumber();

    @Mapping("ancNumber")
    String getAncNumber();

    @Mapping("bodyWeight")
    Long getBodyWeight();

    @Mapping("visitStatus")
    String getVisitStatus();

    @Mapping("ctxStatus")
    String getCtxStatus();

    @Mapping("breastFeeding")
    String getBreastFeeding();

    @Mapping("uuid")
    String getUuid();

    // Add any other necessary methods or mappings for custom logic or associations
}
