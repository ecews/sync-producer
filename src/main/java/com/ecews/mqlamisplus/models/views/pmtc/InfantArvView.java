package com.ecews.mqlamisplus.models.views.pmtc;

import com.blazebit.persistence.view.EntityView;
import com.blazebit.persistence.view.Mapping;
import com.ecews.mqlamisplus.models.entities.pmtc.InfantArv;
import com.ecews.mqlamisplus.utility.LocalDateDeserializer;
import com.ecews.mqlamisplus.utility.LocalDateSerializer;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.domain.Persistable;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;

@EntityView(InfantArv.class)
public interface InfantArvView extends Serializable, Persistable<Long> {
//    @Mapping("id")
//    Long getId();
//


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



    @Override
    @Mapping("isNew")
    boolean isNew();
}
