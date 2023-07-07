package com.ecews.mqlamisplus.models.views.pmtc;

import com.blazebit.persistence.view.Mapping;
import com.ecews.mqlamisplus.utility.LocalDateTimeDeserializer;
import com.ecews.mqlamisplus.utility.LocalDateTimeSerializer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.vladmihalcea.hibernate.type.array.IntArrayType;
import com.vladmihalcea.hibernate.type.array.StringArrayType;
import com.vladmihalcea.hibernate.type.json.JsonBinaryType;
import com.vladmihalcea.hibernate.type.json.JsonNodeBinaryType;
import com.vladmihalcea.hibernate.type.json.JsonNodeStringType;
import com.vladmihalcea.hibernate.type.json.JsonStringType;
import lombok.Data;
import org.hibernate.annotations.TypeDef;
import org.hibernate.annotations.TypeDefs;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.domain.Persistable;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;

//@MappedSuperclass
//@TypeDefs({
//        @TypeDef(name = "string-array", typeClass = StringArrayType.class),
//        @TypeDef(name = "int-array", typeClass = IntArrayType.class),
//        @TypeDef(name = "json", typeClass = JsonStringType.class),
//        @TypeDef(name = "jsonb", typeClass = JsonBinaryType.class),
//        @TypeDef(name = "jsonb-node", typeClass = JsonNodeBinaryType.class),
//        @TypeDef(name = "json-node", typeClass = JsonNodeStringType.class)
//})

public interface PMTCTTransactionalEntityView extends Serializable, Persistable<Long> {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name = "id", nullable = false)
//    @Mapping("id")
//    Long getId();


    @Mapping("hospitalNumber")
    String getHospitalNumber();


    @Mapping("uuid")
    String getUuid();


    @Mapping("ancNo")
    String getAncNo();



    @Mapping("createdDate")
    LocalDateTime getCreatedDate();




    @Mapping("createdBy")
    String getCreatedBy();




    @Mapping("lastModifiedDate")
    LocalDateTime getLastModifiedDate();



    @Mapping("lastModifiedBy")
    String getLastModifiedBy();



    @Mapping("facilityId")
    Long getFacilityId();




    @Mapping("isNew")
    boolean isNew();
}
