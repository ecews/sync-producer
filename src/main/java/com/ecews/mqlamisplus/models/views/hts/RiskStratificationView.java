package com.ecews.mqlamisplus.models.views.hts;


import com.blazebit.persistence.view.EntityView;
import com.blazebit.persistence.view.Mapping;
import com.ecews.mqlamisplus.models.entities.hts.RiskStratification;
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

@EntityView(RiskStratification.class)

@TypeDefs({
        @TypeDef(name = "string-array", typeClass = StringArrayType.class),
        @TypeDef(name = "int-array", typeClass = IntArrayType.class),
        @TypeDef(name = "json", typeClass = JsonStringType.class),
        @TypeDef(name = "jsonb", typeClass = JsonBinaryType.class),
        @TypeDef(name = "jsonb-node", typeClass = JsonNodeBinaryType.class),
        @TypeDef(name = "json-node", typeClass = JsonNodeStringType.class),
})


public interface RiskStratificationView extends AuditView {



    @Mapping("age")
    int age();


    @Mapping("entry_point")
    String entryPoint();



    @Mapping("dob")
    LocalDate dob();


    @Mapping("testing_setting")
    String testingSetting();


    @Mapping("modality")
    String modality();


    @Mapping("code")
    String code();


    @Mapping("target_group")
    String targetGroup();


    @Mapping("visit_date")
    LocalDate visitDate();


    @Mapping("archived")
    int archived=0;



    @Mapping("risk_assessment")
    Object riskAssessment();



    @Mapping("person_uuid")
    String personUuid();


    @Mapping("community_entry_point ")
    String communityEntryPoint() ;


    @Mapping("facility_id ")
    Long facilityId();

//    @PrePersist
//    public void setFields(){
//        if(StringUtils.isEmpty(code)){
//            code = UUID.randomUUID().toString();
//        }
//    }
}

