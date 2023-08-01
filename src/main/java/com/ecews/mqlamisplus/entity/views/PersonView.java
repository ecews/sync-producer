package com.ecews.mqlamisplus.entity.views;

import com.blazebit.persistence.view.EntityView;
import com.blazebit.persistence.view.IdMapping;
import com.blazebit.persistence.view.Mapping;
import com.ecews.mqlamisplus.entity.models.Person.Person;
import com.ecews.mqlamisplus.entity.models.hiv.ARTClinical;
import com.ecews.mqlamisplus.entity.models.hiv.HIVEacSession;
import com.ecews.mqlamisplus.entity.views.hiv.*;
//import com.ecews.mqlamisplus.entity.views.hts.HtsClientView;
import com.ecews.mqlamisplus.entity.views.hts.HtsClientView;
import com.ecews.mqlamisplus.entity.views.hts.IndexElicitationView;
import com.ecews.mqlamisplus.entity.views.hts.RiskStratificationView;
import com.ecews.mqlamisplus.entity.views.prep.PrepClinicView;
import com.ecews.mqlamisplus.entity.views.prep.PrepEligibilityView;
import com.ecews.mqlamisplus.entity.views.prep.PrepEnrollmentView;
import com.ecews.mqlamisplus.entity.views.prep.PrepInterruptionView;
import com.ecews.mqlamisplus.entity.views.visit.VisitView;
import com.fasterxml.jackson.databind.JsonNode;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;


@EntityView(Person.class)
public interface PersonView {


    @IdMapping
    Long getId();

    @Mapping("active")
    Boolean active = false;

    @Mapping("contactPoint")
    JsonNode getContactPoint();

    @Mapping("address")
    JsonNode getAddress();

    @Mapping("gender")
    JsonNode getGender();

    @Mapping("identifier")
    JsonNode getIdentifier();
    @Mapping("deceased")
    Boolean getDeceased();

    @Mapping("deceasedDateTime")
    LocalDateTime getDeceasedDateTime();

    @Mapping("maritalStatus")
    JsonNode  getMaritalStatus();

    @Mapping("employmentStatus")
    JsonNode getEmploymentStatus();

    @Mapping("education")
    JsonNode getEducation();

    @Mapping("sex")
    String getSex();

    @Mapping("organization")
    JsonNode getOrganization();

    @Mapping("contact")
    JsonNode getContact();

    @Mapping("dateOfBirth")
    LocalDate getDateOfBirth();

    @Mapping("dateOfRegistration")
    LocalDate getDateOfRegistration();

    @Mapping("archived")
    Integer getArchived();

    @Mapping("ninNumber")
    String getNinNumber();

    @Mapping("emrId")
    String getEmrId();

    @Mapping("uuid")
    String getUuid();

    @Mapping("firstName")
    String getFirstName();

    @Mapping("surname")
    String getSurname();

    @Mapping("otherName")
    String getOtherName();
    @Mapping("hospitalNumber")
    String getHospitalNumber();
    @Mapping("isDateOfBirthEstimated")
    Boolean getIsDateOfBirthEstimated();

    @Mapping("fullName")
    String getFullName();

    List<VisitView> getVisits();

    List<BiometricView> getBiometric();

    List<ArtPharmacyView> getArtPharmacy();

    List<HivEnrollmentView> getHivEnrollment();

    List<ArtClinicalView> getArtClinical();

    List<HIVEacView> getHivEac();

    List<EacOutComeView> getEacOutCome();

    List<HIVEacSessionView> getHivEacSession();

    List<ObservationView> getObservation();

    List<HIVStatusTrackerView> getHivStatusTracker();

   List<PatientTrackerView> getPatientTracker();

    List<IndexElicitationView> getIndexElicitation();

    List<HtsClientView> getHtsClient();

    List<RiskStratificationView> getRiskStratification();

    List<PrepEligibilityView> getPrepEligibility();

    List<PrepEnrollmentView> getPrepEnrollment();

    List<PrepClinicView> getPrepClinic();

    List<PrepInterruptionView> getPrepInterruption();








//

}
