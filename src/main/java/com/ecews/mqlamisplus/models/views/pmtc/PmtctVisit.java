package com.ecews.mqlamisplus.models.views.pmtc;

import com.blazebit.persistence.view.EntityView;
import com.blazebit.persistence.view.Mapping;
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

@EntityView(PmtctVisit.class)

public interface PmtctVisit {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name = "id", nullable = false)
//    private Long id;


    @Mapping("ancNo")
    String ancNo();

    @Mapping("hospitalNumber")
    String hospitalNumber();


    @Mapping("personUuid")
    String personUuid();

    @Mapping("uuid")
    String uuid();

    @Mapping("entryPoint")
    String entryPoint();



    @Mapping("dateOfVisit")
    LocalDate dateOfVisit();


    @Mapping("fpCounseling")
    String fpCounseling();

    @Mapping("fpMethod")
    String fpMethod();

    @Mapping("timeOfViralLoad")
    String timeOfViralLoad();

    @Mapping("dateOfViralLoad")
    LocalDate dateOfViralLoad();


    @Mapping("gaOfViralLoad")
    Integer gaOfViralLoad();

    @Mapping("resultOfViralLoad")
    Integer resultOfViralLoad();


    @Mapping("dsd")
    String dsd();


    @Mapping("dsdOption")
    String dsdOption();

    @Mapping("dsdModel")
    String dsdModel();

    @Mapping("maternalOutcome")
    String  maternalOutcome();

    @Mapping("dateOfMaternalOutcome")
    LocalDate dateOfMaternalOutcome();

    @Mapping("visitStatus")
    String visitStatus();

    @Mapping("transferTo")
    String transferTo();

    @Mapping
    LocalDate nextAppointmentDate();



//    @Override
//    public boolean isNew() {
//        return false;
//    }

}
