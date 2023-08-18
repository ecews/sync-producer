package com.ecews.mqlamisplus.entity.models.Person;



import javax.persistence.*;

import com.ecews.mqlamisplus.entity.models.PatientAuditEntity;
import com.ecews.mqlamisplus.entity.models.biometric.Biometric;
import com.ecews.mqlamisplus.entity.models.hiv.*;
//import com.ecews.mqlamisplus.entity.models.hiv.HivEnrollment;
import com.ecews.mqlamisplus.entity.models.hts.HtsClient;
import com.ecews.mqlamisplus.entity.models.hts.IndexElicitation;
import com.ecews.mqlamisplus.entity.models.hts.RiskStratification;
import com.ecews.mqlamisplus.entity.models.prep.PrepClinic;
import com.ecews.mqlamisplus.entity.models.prep.PrepEligibility;
import com.ecews.mqlamisplus.entity.models.prep.PrepEnrollment;
import com.ecews.mqlamisplus.entity.models.prep.PrepInterruption;
import com.ecews.mqlamisplus.entity.models.triage.VitalSign;
import com.ecews.mqlamisplus.entity.models.visit.Visit;
import com.ecews.mqlamisplus.entity.views.PersonView;
import com.ecews.mqlamisplus.entity.views.hiv.HIVEacView;
import com.ecews.mqlamisplus.entity.views.hiv.HIVStatusTrackerView;
import com.ecews.mqlamisplus.utility.LocalDateDeserializer;
import com.ecews.mqlamisplus.utility.LocalDateSerializer;
import com.ecews.mqlamisplus.utility.LocalDateTimeDeserializer;
import com.ecews.mqlamisplus.utility.LocalDateTimeSerializer;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Type;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

import com.fasterxml.jackson.databind.JsonNode;
import org.springframework.data.domain.Persistable;

@Entity
@Table(name = "patient_person")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Person extends PatientAuditEntity implements Persistable, Serializable {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;
    @Column(name = "active", nullable = false)
    private Boolean active = false;
    @Type(type = "jsonb-node")
    @Column(columnDefinition = "jsonb")
    private JsonNode contactPoint;
    @Type(type = "jsonb-node")
    @Column(columnDefinition = "jsonb")
    private JsonNode address;
    @Type(type = "jsonb-node")
    @Column(columnDefinition = "jsonb")
    private JsonNode gender;
    @Type(type = "jsonb-node")
    @Column(columnDefinition = "jsonb")
    private JsonNode identifier;
    @Column(name = "deceased")
    private Boolean deceased;

    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    @Column(name = "deceased_date_time")
    private LocalDateTime deceasedDateTime;


    @Type(type = "jsonb-node")
    @Column(columnDefinition = "jsonb")
    private JsonNode  maritalStatus;
    @Type(type = "jsonb-node")
    @Column(columnDefinition = "jsonb")
    private JsonNode employmentStatus;
    @Type(type = "jsonb-node")
    @Column(columnDefinition = "jsonb")
    private JsonNode education;
    @Column(name = "sex", nullable = false)
    private  String sex;
    @Type(type = "jsonb-node")
    @Column(columnDefinition = "jsonb")
    private JsonNode organization;
    @Type(type = "jsonb-node")
    @Column(columnDefinition = "jsonb")
    private JsonNode contact;


    @JsonSerialize(using = LocalDateSerializer.class)
    @JsonDeserialize(using = LocalDateDeserializer.class)
    @Column(name = "date_of_birth", nullable = false)
    private LocalDate dateOfBirth;


    @JsonSerialize(using = LocalDateSerializer.class)
    @JsonDeserialize(using = LocalDateDeserializer.class)
    @Column(name = "date_of_registration", nullable = false)
    private LocalDate dateOfRegistration;


    @Basic
    @Column(name = "archived")
    private Integer archived;

    @Column(name = "nin_number")
    private  String ninNumber;

    @Column(name = "emr_id")
    private  String emrId;

    @Column(name = "uuid", nullable = false, unique = true, updatable = false)
    private String uuid;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "surname")
    private String surname;

    @Column(name = "other_name")
    private String otherName;
    @Column(name = "hospital_number")
    private String hospitalNumber;
    @Column(name = "is_date_of_birth_estimated")
    private Boolean isDateOfBirthEstimated;

    @Column(name = "full_name")
    private String fullName;
//
//    @Column(name = "case_manager_id")
//    private Long caseManagerId;

    @OneToMany
    private List<Visit> visits;


    @OneToMany
    private List<Biometric> biometric;


    @OneToMany
    private List<ARTClinical> artClinical;



//    @OneToMany
//    private List<PatientTracker>  patientTracker;
//

    @OneToMany
    private List<IndexElicitation>  indexElicitation;

    @OneToMany
    private List<HtsClient>  htsClient;

    @OneToMany
    private List<RiskStratification>  riskStratification;

    @OneToMany
    private List<PrepEligibility>  prepEligibility;

    @OneToMany
    private List<PrepClinic>  prepClinic;

    @OneToMany
    private List<PrepInterruption> prepInterruption;

    @OneToMany
    private List<VitalSign> vitalSign;








    @Override
    public Object getId() {
        return null;
    }

    @Override
    public boolean isNew() {
        return id == null;
    }
}


