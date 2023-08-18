package com.ecews.mqlamisplus.entity.views.visit;


import com.blazebit.persistence.view.EntityView;
import com.blazebit.persistence.view.IdMapping;
import com.blazebit.persistence.view.Mapping;
import com.ecews.mqlamisplus.entity.models.Person.Person;
import com.ecews.mqlamisplus.entity.models.visit.Visit;
import com.ecews.mqlamisplus.entity.views.BiometricView;
import com.ecews.mqlamisplus.entity.views.hiv.*;
import com.ecews.mqlamisplus.entity.views.hts.HtsClientView;
import com.ecews.mqlamisplus.entity.views.hts.IndexElicitationView;
import com.ecews.mqlamisplus.entity.views.hts.RiskStratificationView;
import com.ecews.mqlamisplus.entity.views.prep.PrepClinicView;
import com.ecews.mqlamisplus.entity.views.prep.PrepEligibilityView;
import com.ecews.mqlamisplus.entity.views.prep.PrepEnrollmentView;
import com.ecews.mqlamisplus.entity.views.prep.PrepInterruptionView;


import java.time.LocalDateTime;
import java.util.List;

@EntityView(Visit.class)
public interface VisitView {


    @IdMapping
    Long getId();
    @Mapping("person.uuid")
    String getPerson();

    @Mapping("visitStartDate")
    LocalDateTime getVisitStartDate();

    @Mapping("visitEndDate")
    LocalDateTime getVisitEndDate();


    @Mapping("uuid")
    String getUuid();


    @Mapping("archived")
    Integer getArchived();


    @Mapping("facilityId")
    Long getFacilityId();

    @Mapping("lastModifiedDate")
    LocalDateTime getLastModifiedDate();

//    @Mapping("syncStatus")
//    String getSyncStatus();


//    @Override
//    public boolean isNew() {
//        return id == null;
//    }




    List<ArtPharmacyView> getArtPharmacy();

    List<HivEnrollmentView> getHivEnrollment();

    List<HIVEacView> getHivEac();

    List<EacOutComeView> getEacOutCome();

    List<HIVEacSessionView> getHivEacSession();

    List<ObservationView> getObservation();

    List<HIVStatusTrackerView> getHivStatusTracker();

    List<PrepEnrollmentView> getPrepEnrollment();

    List<PatientTrackerView> getPatientTracker();


}
