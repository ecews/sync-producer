package com.ecews.mqlamisplus.entity.views;

import com.blazebit.persistence.view.EntityView;
import com.blazebit.persistence.view.IdMapping;
import com.blazebit.persistence.view.Mapping;
import com.ecews.mqlamisplus.entity.models.Person.Person;
import com.ecews.mqlamisplus.entity.models.hiv.ARTClinical;
import com.ecews.mqlamisplus.entity.views.hiv.ArtClinicalView;
import com.ecews.mqlamisplus.entity.views.hiv.ArtPharmacyView;
import com.ecews.mqlamisplus.entity.views.hiv.HIVEacView;
import com.ecews.mqlamisplus.entity.views.hiv.HivEnrollmentView;
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


//

}
