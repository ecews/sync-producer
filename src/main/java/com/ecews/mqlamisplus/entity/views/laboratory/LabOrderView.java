package com.ecews.mqlamisplus.entity.views.laboratory;

import com.blazebit.persistence.view.EntityView;
import com.blazebit.persistence.view.Mapping;
import com.ecews.mqlamisplus.entity.models.laboratory.LabOrder;
import com.ecews.mqlamisplus.utility.LocalDateTimeDeserializer;
import com.ecews.mqlamisplus.utility.LocalDateTimeSerializer;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import java.time.LocalDateTime;

@EntityView(LabOrder.class)
public interface LabOrderView {


    @Mapping("id")
    Integer getId();

    @Mapping("uuid")
    String getUuid();

    @Mapping("visitId")
    Integer getVisitId();

    @Mapping("patientId")
    Integer getPatientId();

    @Mapping("userId")
    String getUserId();

    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    @Mapping("orderDate")
    LocalDateTime getOrderDate();

    @Mapping("patientUuid")
    String getPatientUuid();

    @Mapping("facilityId")
    Long getFacilityId();

    @Mapping("archived")
    Integer getArchived();


//
//    @Mapping("setFields")
//    default void setFields() {
//        if (getArchived() == null) {
//            setArchived(0);
//        }
//    }

}
