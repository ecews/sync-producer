package com.ecews.mqlamisplus.models.views.pmtc;


import com.blazebit.persistence.view.EntityView;
import com.blazebit.persistence.view.Mapping;
import com.ecews.mqlamisplus.models.entities.pmtc.InfantPCRTest;
import com.ecews.mqlamisplus.utility.LocalDateTimeDeserializer;
import com.ecews.mqlamisplus.utility.LocalDateTimeSerializer;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.domain.Persistable;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;

@EntityView(InfantPCRTest.class)


public interface InfantPCRTestView extends Persistable<Long>{
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name = "id", nullable = false)
//    private Long id;


    @Mapping("visitDate")
    LocalDate visitDate();

    @Mapping("infantHospitalNumber")
    String infantHospitalNumber();


    @Mapping("ancNumber")
    String ancNumber();

    @Mapping("ageAtTest")
    Long ageAtTest() ;

    @Mapping("testType")
    String testType();

    @Mapping("dateSampleCollected")
    LocalDate dateSampleCollected() ;

    @Mapping("dateSampleSent")
    LocalDate dateSampleSent();

    @Mapping("dateResultReceivedAtFacility")
    LocalDate dateResultReceivedAtFacility();

    @Mapping("dateResultReceivedByCaregiver")
    LocalDate dateResultReceivedByCaregiver();


    @Mapping("results")
    String results();

    @Mapping("uuid")
    String uuid();
    @Override
    @Mapping("isNew")
    public boolean isNew();
}

