package com.ecews.mqlamisplus.entity.views;

import com.blazebit.persistence.view.EntityView;
import com.blazebit.persistence.view.FetchStrategy;
import com.blazebit.persistence.view.IdMapping;
import com.blazebit.persistence.view.Mapping;
import com.ecews.mqlamisplus.entity.models.Person.Person;
import com.ecews.mqlamisplus.entity.models.hiv.ARTClinical;
import com.ecews.mqlamisplus.entity.models.hiv.HIVEacSession;
import com.ecews.mqlamisplus.entity.models.hiv.Observation;
import com.ecews.mqlamisplus.entity.models.triage.VitalSign;
import com.ecews.mqlamisplus.entity.views.hiv.*;
//import com.ecews.mqlamisplus.entity.views.hts.HtsClientView;
import com.ecews.mqlamisplus.entity.views.hts.HtsClientView;
import com.ecews.mqlamisplus.entity.views.hts.IndexElicitationView;
import com.ecews.mqlamisplus.entity.views.hts.RiskStratificationView;
import com.ecews.mqlamisplus.entity.views.prep.PrepClinicView;
import com.ecews.mqlamisplus.entity.views.prep.PrepEligibilityView;
import com.ecews.mqlamisplus.entity.views.prep.PrepEnrollmentView;
import com.ecews.mqlamisplus.entity.views.prep.PrepInterruptionView;
import com.ecews.mqlamisplus.entity.views.triage.VitalSignView;
import com.ecews.mqlamisplus.entity.views.visit.VisitView;
import com.ecews.mqlamisplus.utility.JsonNodeConverter;
import com.fasterxml.jackson.databind.JsonNode;

import javax.persistence.Column;
import javax.persistence.Convert;
import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;


@EntityView(Person.class)
public interface PersonView extends Serializable {


    @IdMapping
    Long getId();

    @Mapping("active")
    Boolean active = false;



    @Mapping("contactPoint")
//    @Convert(converter = JsonNodeConverter.class)
//    @Column(columnDefinition = "jsonb")
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


    @Mapping(fetch = FetchStrategy.JOIN)
    List<VisitView> getVisits();


    @Mapping(fetch = FetchStrategy.JOIN)
    List<HtsClientView> getHtsClient();

    @Mapping(fetch = FetchStrategy.JOIN)
    List<PrepEligibilityView> getPrepEligibility();

    @Mapping(fetch = FetchStrategy.JOIN)
    List<PrepClinicView> getPrepClinic();

    @Mapping(fetch = FetchStrategy.JOIN)
    List<PrepInterruptionView> getPrepInterruption();

    @Mapping(fetch = FetchStrategy.JOIN)
    List<ArtClinicalView> getArtClinical();

    @Mapping(fetch = FetchStrategy.JOIN)
    List<VitalSignView> getVitalSign();



//    List<IndexElicitationView> getIndexElicitation();
//

//
//    List<RiskStratificationView> getRiskStratification();
//



//

//
//






//

}
