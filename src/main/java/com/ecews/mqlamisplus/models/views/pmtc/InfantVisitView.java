package com.ecews.mqlamisplus.models.views.pmtc;

import com.blazebit.persistence.view.EntityView;
import com.blazebit.persistence.view.Mapping;
import com.ecews.mqlamisplus.models.entities.pmtc.InfantVisit;
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

@EntityView(InfantVisit.class)


public interface InfantVisitView extends Persistable<Long>{
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

    @Mapping("bodyWeight")
    Long bodyWeight();

    @Mapping("visitStatus")
    String visitStatus();


    @Mapping("ctxStatus")
    String ctxStatus();

    @Mapping("breastFeeding")
    String breastFeeding ();



    @Mapping("uuid")
    String uuid();


    @Mapping("isNew")
    @Override
    public boolean isNew();
}
