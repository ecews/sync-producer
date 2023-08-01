package com.ecews.mqlamisplus.entity.views.lims;

import com.blazebit.persistence.view.EntityView;
import com.blazebit.persistence.view.Mapping;
import com.ecews.mqlamisplus.entity.models.lims.LIMSManifest;
import com.ecews.mqlamisplus.entity.models.lims.LIMSSample;

import java.time.LocalDateTime;
import java.util.List;

@EntityView(LIMSManifest.class)
public interface LIMSManifestView {
    @Mapping("id")
    Integer getId();

    @Mapping("uuid")
    String getUuid();

    @Mapping("manifestID")
    String getManifestID();

    @Mapping("sendingFacilityID")
    String getSendingFacilityID();

    @Mapping("sendingFacilityName")
    String getSendingFacilityName();

    @Mapping("receivingLabID")
    String getReceivingLabID();

    @Mapping("receivingLabName")
    String getReceivingLabName();

    @Mapping("dateScheduledForPickup")
    String getDateScheduledForPickup();

    @Mapping("temperatureAtPickup")
    String getTemperatureAtPickup();

    @Mapping("samplePackagedBy")
    String getSamplePackagedBy();

    @Mapping("courierRiderName")
    String getCourierRiderName();

    @Mapping("courierContact")
    String getCourierContact();

    @Mapping("manifestStatus")
    String getManifestStatus();

    @Mapping("createDate")
    LocalDateTime getCreateDate();

    @Mapping("facilityId")
    Long getFacilityId();

    @Mapping("facilityUuid")
    String getFacilityUuid();


    @Mapping("sampleInformation.manifestRecordID")
    List<Integer> getSampleInformation();


}
