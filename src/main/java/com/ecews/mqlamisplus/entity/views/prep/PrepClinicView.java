package com.ecews.mqlamisplus.entity.views.prep;


import com.blazebit.persistence.view.EntityView;
import com.blazebit.persistence.view.Mapping;
import com.ecews.mqlamisplus.entity.models.prep.PrepClinic;
import java.time.LocalDate;

@EntityView(PrepClinic.class)
public interface PrepClinicView {
    @Mapping("dateInitialAdherenceCounseling")
    LocalDate getDateInitialAdherenceCounseling();

    @Mapping("weight")
    Double getWeight();

    @Mapping("height")
    Double getHeight();

    @Mapping("pregnant")
    String getPregnant();

    @Mapping("uuid")
    String getUuid();

    @Mapping("datePrepStart")
    LocalDate getDatePrepStart();

    @Mapping("regimenId")
    long getRegimenId();

    @Mapping("archived")
    Integer getArchived();

    // Add mappings for other desired properties

    // Add any other necessary methods or mappings for custom logic or associations
}

