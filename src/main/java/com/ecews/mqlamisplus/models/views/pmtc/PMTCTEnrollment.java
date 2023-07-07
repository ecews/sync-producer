package com.ecews.mqlamisplus.models.views.pmtc;

import com.blazebit.persistence.view.EntityView;
import com.blazebit.persistence.view.Mapping;
import com.ecews.mqlamisplus.utility.LocalDateDeserializer;
import com.ecews.mqlamisplus.utility.LocalDateSerializer;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.domain.Persistable;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;
import java.time.LocalDate;

@EntityView(PMTCTEnrollment.class)
public interface PMTCTEnrollment extends PMTCTTransactionalEntityView{

    @Mapping("pmtctEnrollmentDate")
    LocalDate pmtctEnrollmentDate();

    @Mapping()
     Integer gravida();

    @Mapping
    Integer gAWeeks();


    @Mapping("entryPoint")
    String entryPoint();

    @Mapping("artStartDate")
    LocalDate artStartDate();

    @Mapping("artStartTime")
    String artStartTime();


    @Mapping("tbStatus")
    String tbStatus();



//
//    @Override
//    public boolean isNew() {
//        return false;
//    }
}
