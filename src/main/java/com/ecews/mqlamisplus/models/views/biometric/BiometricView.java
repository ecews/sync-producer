package com.ecews.mqlamisplus.models.views.biometric;

import com.blazebit.persistence.view.EntityView;
import com.blazebit.persistence.view.Mapping;
import com.ecews.mqlamisplus.models.entities.biometric.Biometric;
import com.fasterxml.jackson.databind.JsonNode;

import javax.validation.constraints.NotNull;
import java.time.LocalDate;


@EntityView(Biometric.class)
public interface BiometricView {



    @Mapping("person_uuid")
    String personUuid();

    @Mapping("template")
    byte[] template ();

    @Mapping("biometricType")
    @NotNull
    String biometricType ();

    @Mapping("templateType")
    @NotNull
    String templateType();


    @Mapping("date")
    @NotNull
    LocalDate date();


    @Mapping("archived")
    Integer archived = 0;


    @Mapping("iso")
   Boolean iso = false;


    @Mapping("jsonb")
    JsonNode extra();

    @Mapping("deviceName")
    String deviceName();

//    @Override
//    public boolean isNew() {
//        return id == null;
//    }
}
