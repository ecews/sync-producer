package com.ecews.mqlamisplus.models.views.prep;

import com.blazebit.persistence.view.EntityView;
import com.blazebit.persistence.view.Mapping;
import com.ecews.mqlamisplus.models.entities.Person.Person;
import com.ecews.mqlamisplus.models.entities.hts.Audit;
import com.ecews.mqlamisplus.models.entities.prep.PrepEligibility;
import com.ecews.mqlamisplus.models.views.hts.AuditView;
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

@EntityView(PrepEligibility.class)
//@TypeDefs({
//        @TypeDef(name = "string-array", typeClass = StringArrayType.class),
//        @TypeDef(name = "int-array", typeClass = IntArrayType.class),
//        @TypeDef(name = "json", typeClass = JsonStringType.class),
//        @TypeDef(name = "jsonb", typeClass = JsonBinaryType.class),
//        @TypeDef(name = "jsonb-node", typeClass = JsonNodeBinaryType.class),
//        @TypeDef(name = "json-node", typeClass = JsonNodeStringType.class),
//})
public interface PrepEligibilityView  extends AuditView{
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name = "id", nullable = false)
//    private Long id;

    @Mapping("uniqueId")
    String uniqueId();

    @Mapping("visitDate")
    LocalDate visitDate();

    @Mapping("score")
    Integer score();


    @Mapping("hivRisk")
    Object hivRisk();


    @Mapping("stiScreening")
    Object stiScreening();


    @Mapping("drugUseHistory")
    Object drugUseHistory();


    @Mapping("personalHivRiskAssessment")
    Object personalHivRiskAssessment();


    @Mapping("sexPartnerRisk")
    Object sexPartnerRisk();

    @Mapping("personUuid")
    String personUuid();

    @Mapping("sexPartner")
    String sexPartner();

    @Mapping("counselingType")
    String counselingType();

    @Mapping("firstTimeVisit")
    Boolean firstTimeVisit();

    @Mapping("numChildrenLessThanFive")
    Integer numChildrenLessThanFive();

    @Mapping("numWives")
    Integer numWives();

    @Mapping("targetGroup")
    String targetGroup();


    @Mapping("extra")
    Object extra();

    @Mapping("facilityId")
    Long facilityId();

    @Mapping("uuid")
    String uuid();

    @Mapping("archived")
    Integer archived();


    @Mapping("person")
    Person person();

//    @PrePersist
//    public void setFields();
}
