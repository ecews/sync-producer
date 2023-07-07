package com.ecews.mqlamisplus.models.views.lims;

import com.blazebit.persistence.view.EntityView;
import com.blazebit.persistence.view.Mapping;
import com.ecews.mqlamisplus.models.entities.lims.LIMSResult;
import com.ecews.mqlamisplus.utility.LocalDateTimeDeserializer;
import com.ecews.mqlamisplus.utility.LocalDateTimeSerializer;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@EntityView(LIMSResult.class)

public interface LIMSManifestView {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name = "id", nullable = false)
//    private Integer id;
    @Mapping("uuid")
    String uuid();

    @Mapping("manifest_id")
    String manifestID();


    @Mapping("sending_facility_id")
    String sendingFacilityID();



    @Mapping("sending_facility_name")
    String sendingFacilityName();


    @Mapping("receiving_lab_id")
    String receivingLabID();


    @Mapping("receiving_lab_name")
    String receivingLabName();


    @Mapping("date_scheduled_for_pickup")
    String dateScheduledForPickup();



    @Mapping("temperature_at_pickup")
    String temperatureAtPickup();



    @Mapping("sample_packaged_by")
    String samplePackagedBy();



    @Mapping("courier_rider_name")
    String courierRiderName();


    @Mapping("courier_contact")
    String courierContact();


    @Mapping("manifest_status")
    String manifestStatus();



    @Mapping("create_date")
    LocalDateTime createDate();



    @Mapping("facility_id")
    Long facilityId();


    @Mapping("facility_uuid")
    String facilityUuid();

   @Mapping("sampleInformation")
    List<LIMSSample> sampleInformation();
}
