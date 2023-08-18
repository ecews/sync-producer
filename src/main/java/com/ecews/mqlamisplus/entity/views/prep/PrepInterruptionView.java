package com.ecews.mqlamisplus.entity.views.prep;


import com.blazebit.persistence.view.EntityView;
import com.blazebit.persistence.view.Mapping;
import com.ecews.mqlamisplus.entity.models.prep.PrepInterruption;
import java.time.LocalDate;

@EntityView(PrepInterruption.class)
public interface PrepInterruptionView {
    @Mapping("interruptionType")
    String getInterruptionType();

    @Mapping("interruptionDate")
    LocalDate getInterruptionDate();

    @Mapping("dateClientDied")
    LocalDate getDateClientDied();

    @Mapping("causeOfDeath")
    String getCauseOfDeath();

    @Mapping("sourceOfDeathInfo")
    String getSourceOfDeathInfo();

    @Mapping("dateClientReferredOut")
    LocalDate getDateClientReferredOut();

    @Mapping("facilityReferredTo")
    String getFacilityReferredTo();

    @Mapping("interruptionReason")
    String getInterruptionReason();

    @Mapping("personUuid")
    String getPersonUuid();

    @Mapping("uuid")
    String getUuid();

    @Mapping("facilityId")
    Long getFacilityId();

    @Mapping("extra")
    Object getExtra();

    @Mapping("dateSeroConverted")
    LocalDate getDateSeroConverted();

    @Mapping("dateRestartPlacedBackMedication")
    LocalDate getDateRestartPlacedBackMedication();

    @Mapping("linkToArt")
    Boolean getLinkToArt();

    // Add mappings for other desired properties

    // Add any other necessary methods or mappings for custom logic or associations
}
