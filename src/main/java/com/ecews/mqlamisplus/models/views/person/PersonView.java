package com.ecews.mqlamisplus.models.views.person;


import com.blazebit.persistence.view.EntityView;
import com.blazebit.persistence.view.Mapping;
import com.ecews.mqlamisplus.models.entities.Person.Person;
import com.fasterxml.jackson.databind.JsonNode;

import java.time.LocalDateTime;

@EntityView(Person.class)
public interface PersonView {



    @Mapping("active")
    Boolean getActive();

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

     LocalDateTime getLastModifiedDate();

     String getUuid();

//
//    @Type(type = "jsonb-node")
//    @Column(columnDefinition = "jsonb")
//    private JsonNode  maritalStatus;
//    @Type(type = "jsonb-node")
//    @Column(columnDefinition = "jsonb")
//    private JsonNode employmentStatus;
//    @Type(type = "jsonb-node")
//    @Column(columnDefinition = "jsonb")
//    private JsonNode education;
//    @Column(name = "sex", nullable = false)
//    private  String sex;
//    @Type(type = "jsonb-node")
//    @Column(columnDefinition = "jsonb")
//    private JsonNode organization;
//    @Type(type = "jsonb-node")
//    @Column(columnDefinition = "jsonb")
//    private JsonNode contact;
//
//
//    @JsonSerialize(using = LocalDateSerializer.class)
//    @JsonDeserialize(using = LocalDateDeserializer.class)
//    @Column(name = "date_of_birth", nullable = false)
//    private LocalDate dateOfBirth;
//
//
//    @JsonSerialize(using = LocalDateSerializer.class)
//    @JsonDeserialize(using = LocalDateDeserializer.class)
//    @Column(name = "date_of_registration", nullable = false)
//    private LocalDate dateOfRegistration;
//
//
//    @Basic
//    @Column(name = "archived")
//    private Integer archived;
//
//    @Column(name = "nin_number")
//    private  String ninNumber;
//
//    @Column(name = "emr_id")
//    private  String emrId;
//

//
//    @Column(name = "first_name")
//    private String firstName;
//
//    @Column(name = "surname")
//    private String surname;
//
//    @Column(name = "other_name")
//    private String otherName;
//    @Column(name = "hospital_number")
//    private String hospitalNumber;
//    @Column(name = "is_date_of_birth_estimated")
//    private Boolean isDateOfBirthEstimated;
//
//    @Column(name = "full_name")
//    private String fullName;
////
////    @Column(name = "case_manager_id")
////    private Long caseManagerId;
//
//
//    @Override
//    public boolean isNew() {
//        return id == null;
//    }
}
