package com.ecews.mqlamisplus.models.views.prep;

import com.blazebit.persistence.view.EntityView;
import com.blazebit.persistence.view.Mapping;
import com.ecews.mqlamisplus.models.entities.Person.Person;
import com.ecews.mqlamisplus.models.entities.hts.Audit;
import com.ecews.mqlamisplus.models.views.hts.AuditView;
import com.ecews.mqlamisplus.utility.LocalDateTimeDeserializer;
import com.ecews.mqlamisplus.utility.LocalDateTimeSerializer;
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

@EntityView(PrepInterruption.class)
public interface PrepInterruption extends AuditView {
//    @Id
//    @Column(name = "id", updatable = false)
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id;

    @Mapping("interruption_type")
    String interruptionType();



    @Mapping("interruptionDate")
    LocalDate interruptionDate();

    @Mapping("dateClientDied")
    LocalDate dateClientDied();

    @Mapping("causeOfDeath")
    String causeOfDeath();

    @Mapping("sourceOfDeathInfo")
    String sourceOfDeathInfo();




    @Mapping("dateClientReferredOut")
    LocalDate dateClientReferredOut();

    @Mapping("facilityReferredTo")
    String facilityReferredTo();

    @Mapping("interruption_reason")
    String interruptionReason();

    @Mapping("person_uuid")
    String personUuid();

    /*@Column(name = "visit_uuid")
    private String visitUuid;*/

    @Mapping("person")
    Person person();

    /*@ManyToOne
    @JoinColumn(name = "visit_uuid", referencedColumnName = "uuid", insertable = false, updatable = false)
    private Visit visit;*/

    @Mapping("archived")
    Integer getArchived();

    @Mapping("uuid")
    String uuid();

    @Mapping("facilityId")
    Long facilityId();


    @Mapping("extra")
    Object extra();



    @Mapping("dateSeroConverted")
    LocalDate dateSeroConverted();




    @Mapping("dateRestartPlacedBackMedication")
    LocalDate dateRestartPlacedBackMedication();

    @Mapping("linkToArt")
    Boolean linkToArt();

//    @PrePersist
//    public void setFields();
}