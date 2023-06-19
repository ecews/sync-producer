package com.ecews.mqlamisplus.models.DestinationPerson;



import javax.persistence.*;

import com.ecews.mqlamisplus.models.PatientAuditEntity;
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
import com.fasterxml.jackson.databind.JsonNode;
import org.springframework.data.domain.Persistable;

@Entity
@Table(name = "patient_person_demodb")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class DestinationPerson extends PatientAuditEntity implements Persistable, Serializable {


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


    @Override
    public boolean isNew() {
        return id == null;
    }
}


