package com.ecews.mqlamisplus.models.views.pmtc;

import com.blazebit.persistence.view.EntityView;
import com.blazebit.persistence.view.Mapping;
import com.ecews.mqlamisplus.models.entities.pmtc.InfantMotherArt;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.domain.Persistable;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;

@EntityView(InfantMotherArt.class)
public interface InfantMotherArtView extends Serializable, Persistable<Long> {
    @Mapping("id")
    Long getId();


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



    @Override
    @Mapping("isNew")
    boolean isNew();
}
