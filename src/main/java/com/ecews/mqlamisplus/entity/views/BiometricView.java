package com.ecews.mqlamisplus.entity.views;

import com.blazebit.persistence.view.EntityView;
import com.blazebit.persistence.view.Mapping;
import com.ecews.mqlamisplus.entity.models.biometric.Biometric;
import com.fasterxml.jackson.databind.JsonNode;

import javax.persistence.Column;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;
import java.time.LocalDateTime;


@EntityView(Biometric.class)
public interface BiometricView {



    @Mapping("person.uuid")
    String getPersonUuid();

    @Mapping("template")
    byte[] getTemplate ();

    @Mapping("biometricType")
//    @NotNull
    String getBiometricType ();

    @Mapping("templateType")
//    @NotNull
    String getTemplateType();


    @Mapping("date")
//    @NotNull
    LocalDate getDate();


    @Mapping("archived")
    Integer getArchived ();


    @Mapping("iso")
   Boolean getIso ();


    @Mapping("extra")
    JsonNode getExtra();

    @Mapping("deviceName")
    String getDeviceName();


    @Mapping("lastModifiedDate")
//    @NotNull
    LocalDateTime getLastModifiedDate();

    @Mapping("facilityId")
    Long getFacilityId();



//    @Mapping("syncStatus")
//    String getSyncStatus();
//    @Override
//    public boolean isNew() {
//        return id == null;
//    }
}
