package com.ecews.mqlamisplus.models.views.prep;


import com.blazebit.persistence.view.EntityView;
import com.blazebit.persistence.view.Mapping;
import com.ecews.mqlamisplus.models.entities.Person.Person;
import com.ecews.mqlamisplus.models.entities.hts.Audit;
import com.ecews.mqlamisplus.models.entities.prep.PrepClinic;
import com.ecews.mqlamisplus.models.entities.triage.VitalSign;
import com.ecews.mqlamisplus.models.entities.visit.Visit;
import com.ecews.mqlamisplus.models.views.hts.AuditView;
import com.ecews.mqlamisplus.utility.LocalDateDeserializer;
import com.ecews.mqlamisplus.utility.LocalDateSerializer;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.vladmihalcea.hibernate.type.array.IntArrayType;
import com.vladmihalcea.hibernate.type.array.StringArrayType;
import com.vladmihalcea.hibernate.type.json.JsonBinaryType;
import com.vladmihalcea.hibernate.type.json.JsonNodeBinaryType;
import com.vladmihalcea.hibernate.type.json.JsonNodeStringType;
import com.vladmihalcea.hibernate.type.json.JsonStringType;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.hibernate.annotations.Type;
import org.hibernate.annotations.TypeDef;
import org.hibernate.annotations.TypeDefs;
import org.springframework.util.StringUtils;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.UUID;


@EntityView(PrepClinic.class)
public interface PrepClinicView extends AuditView {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name = "id", nullable = false)
//    private Long id;

    @Mapping(" date_initial_adherence_counseling")
    LocalDate  dateInitialAdherenceCounseling();

    @Mapping("weight")
    Double weight();

    @Mapping("height")
    Double height();

    @Mapping("pregnant")
    String pregnant();

    @Mapping("uuid")
    String uuid();


    @Mapping("prep_enrollment_uuid")
    PrepEnrollment prepEnrollment();

    @Mapping("prep_enrollment_uuid")
    String prepEnrollmentUuid();



    @Mapping("date_prep_start")
    LocalDate datePrepStart();

    @Mapping("regimen_id")
    long regimenId();

    /*@Column(name = "regimen_type_id")
    private long regimenTypeId;*/

    @Mapping("archived")
    Integer archived();

    //Urinalysis Result
    @Mapping("urinalysis_result")
    String urinalysisResult();

    @Mapping("referred")
    Boolean referred();

    @Mapping("duration")
    Integer duration();

    @Mapping("date_referred")
    LocalDate dateReferred();

    @Mapping("vital_sign_uuid")
    String vitalSignUuid();

    @Mapping("person_uuid")
    String personUuid();

    @Mapping("visit_uuid")
    String visitUuid();


    @Mapping("vital_sign_uuid")
    VitalSign vitalSign();


    @Mapping("person_uuid")
    Person person();


    @Mapping("visit_uuid")
    Visit visit();


    @Mapping("regimen_id")
    PrepRegimen regimen();



    @Mapping("next_appointment")
    LocalDate nextAppointment();



    @Mapping("encounter_date")
    LocalDate encounterDate();

    @Mapping("facility_id")
    Long facilityId();

    @Mapping("is_commencement")
    Boolean isCommencement();


    @Mapping("extra")
    Object extra();

    //For clinic
    @Mapping("pulse")
    Double pulse();


    @Mapping("respiratory_rate")
    Double respiratoryRate();


    @Mapping("temperature")
    Double temperature();


    @Mapping("systolic")
    Double systolic();


    @Mapping("diastolic")
    Double diastolic();


    @Mapping("adherence_level")
    String adherenceLevel();


    @Mapping("sti_screening")
    Boolean stiScreening();

    @Mapping("why")
    Boolean why();



    @Mapping("date_prep_given")
    LocalDate datePrepGiven();

    @Mapping("prep_given")
    String prepGiven();

    @Mapping("other_drugs")
    String otherDrugs();

    @Mapping("hiv_test_result")
    String hivTestResult();


    @Mapping("urinalysis")
    Object urinalysis();


    @Mapping("hepatitis")
    Object hepatitis();


    @Mapping("syphilis")
    Object syphilis();


    @Mapping("other_tests_done")
    Object otherTestsDone();


    @Mapping("syndromic_sti_screening")
    Object syndromicStiScreening() ;

    @Mapping("risk_reduction_services")
    String riskReductionServices();


    @Mapping("noted_side_effects")
    String notedSideEffects();


//    @PrePersist
//    public void setFields(){
//        if(StringUtils.isEmpty(uuid)){
//            uuid = UUID.randomUUID().toString();
//        }
//        if(archived == null){
//            archived=0;
//        }
//    }
}

