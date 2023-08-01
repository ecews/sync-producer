package com.ecews.mqlamisplus.entity.views.pmtc;


import com.blazebit.persistence.view.EntityView;
import com.blazebit.persistence.view.Mapping;
import com.ecews.mqlamisplus.entity.models.pmtc.InfantMotherArt;
import java.time.LocalDate;

@EntityView(InfantMotherArt.class)
public interface InfantMotherArtView {
    @Mapping("visitDate")
    LocalDate getVisitDate();

    @Mapping("ancNumber")
    String getAncNumber();

    @Mapping("motherArtInitiationTime")
    String getMotherArtInitiationTime();

    @Mapping("regimenTypeId")
    Long getRegimenTypeId();

    @Mapping("regimenId")
    Long getRegimenId();

    @Mapping("uuid")
    String getUuid();

}

