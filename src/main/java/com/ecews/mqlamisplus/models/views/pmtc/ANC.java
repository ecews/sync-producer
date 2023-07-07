package com.ecews.mqlamisplus.models.views.pmtc;

import com.blazebit.persistence.view.EntityView;
import com.blazebit.persistence.view.Mapping;
import com.ecews.mqlamisplus.utility.LocalDateDeserializer;
import com.ecews.mqlamisplus.utility.LocalDateSerializer;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Type;
import org.springframework.data.domain.Persistable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;
import java.time.LocalDate;

@EntityView(ANC.class)
public interface ANC extends PMTCTTransactionalEntityView{



    @Mapping("firatAncDate")
    LocalDate firstAncDate();


    @Mapping("gravida")
    Integer gravida();

    @Mapping("parity")
    Integer parity();



    @Mapping("LMP")
   LocalDate LMP();

    @Mapping("expectedDeliveryDate")
   LocalDate expectedDeliveryDate();



    @Mapping("gAWeeks")
    Integer gAWeeks();

    @Mapping("hivDiognosicTime")
    String hivDiognosicTime();


    @Mapping("testedSyphilis")
    String testedSyphilis();


    @Mapping("testResultSyphilis")
    String testResultSyphilis();


    @Mapping("treatedSyphilis")
    String treatedSyphilis();



    @Mapping("testedSyphilis")
    String referredSyphilisTreatment();



    @Mapping("pmtctHtsInfo")
    JsonNode pmtctHtsInfo();




    @Mapping("partnerNotification")
    JsonNode partnerNotification();


    @Mapping("personUuid")
    String personUuid();



    @Mapping("archived")
    Long archived();


    @Mapping("status")
    String status();



    @Mapping("staticHivStatus")
    String staticHivStatus();

    @Mapping("sourceOfReferral")
    String sourceOfReferral();




    @Mapping("lastVisitDate")
    LocalDate lastVisitDate();


    @Mapping("nextAppointmentDate")
    LocalDate nextAppointmentDate();


    @Mapping("defaultDays")
    Integer defaultDays();


    @Mapping("partnerInformation")
    JsonNode partnerInformation();


//    @Override
//    public boolean isNew() {
//        return false;
//    }


}
