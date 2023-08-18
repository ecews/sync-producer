package com.ecews.mqlamisplus.entity.views.pmtc;

import com.blazebit.persistence.view.EntityView;
import com.blazebit.persistence.view.Mapping;
import com.ecews.mqlamisplus.entity.models.pmtc.PMTCTEnrollment;
import java.time.LocalDate;

@EntityView(PMTCTEnrollment.class)
public interface PMTCTEnrollmentView {
    @Mapping("pmtctEnrollmentDate")
    LocalDate getPmtctEnrollmentDate();

    @Mapping("gravida")
    Integer getGravida();

    @Mapping("gAWeeks")
    Integer getGAWeeks();

    @Mapping("entryPoint")
    String getEntryPoint();

    @Mapping("artStartDate")
    LocalDate getArtStartDate();

    @Mapping("artStartTime")
    String getArtStartTime();

    @Mapping("tbStatus")
    String getTbStatus();

    // Add any other necessary methods or mappings for custom logic or associations
}
