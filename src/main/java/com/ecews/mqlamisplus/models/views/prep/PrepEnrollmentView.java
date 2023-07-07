package com.ecews.mqlamisplus.models.views.prep;

import com.blazebit.persistence.view.EntityView;
import com.blazebit.persistence.view.Mapping;
import com.ecews.mqlamisplus.models.entities.Person.Person;
import com.ecews.mqlamisplus.models.entities.hts.Audit;
import com.ecews.mqlamisplus.models.entities.prep.PrepEligibility;
import com.ecews.mqlamisplus.models.entities.prep.PrepEnrollment;
import com.ecews.mqlamisplus.models.entities.visit.Visit;
import com.ecews.mqlamisplus.models.views.hts.AuditView;
import com.ecews.mqlamisplus.utility.LocalDateDeserializer;
import com.ecews.mqlamisplus.utility.LocalDateSerializer;
import com.fasterxml.jackson.annotation.JsonFormat;
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


@EntityView(PrepEnrollment.class)

public interface PrepEnrollmentView extends AuditView {
//    @Id
//    @Column(name = "id", updatable = false)
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id;

    @Mapping("uniqueId")
    String uniqueId();

    @Mapping("status")
    String status();



    @Mapping("date_started")
    LocalDate dateStarted();


    @Mapping("person")
    Person person();


    @Mapping("visit_uuid")
    Visit visit();

    @Mapping("uuid")
    String uuid();

    @Mapping("archived")
    Integer archived();

    @Mapping("person_uuid")
    String personUuid();

    @Mapping("visitUuid")
    String visitUuid();


    @Mapping("extra")
    Object extra();

    @Mapping("facilityId")
    Long facilityId();

    @Mapping("prepEligibilityUuid")
    String prepEligibilityUuid();


    @Mapping("prepEligibility")
    PrepEligibility prepEligibility();

    @Mapping("supporterName")
    String supporterName();

    @Mapping("supporterRelationshipType")
    String supporterRelationshipType();

    @Mapping("supporterPhone")
    String supporterPhone();

    @Mapping("riskType")
    String riskType();

    @Mapping("ancUniqueArtNo")
    String ancUniqueArtNo();



    @Mapping("date_enrolled")
    LocalDate dateEnrolled();



    @Mapping("dateReferred")
    LocalDate dateReferred();

    @Mapping("hivTestingPoint")
    String hivTestingPoint();



    @Mapping("date_last_hiv_negative_test")
    LocalDate dateOfLastHivNegativeTest();

//    @PrePersist
//    public void setFields();
}
