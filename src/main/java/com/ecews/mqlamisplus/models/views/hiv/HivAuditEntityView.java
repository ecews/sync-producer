package com.ecews.mqlamisplus.models.views.hiv;

import com.blazebit.persistence.view.Mapping;
import com.ecews.mqlamisplus.utility.LocalDateTimeDeserializer;
import com.ecews.mqlamisplus.utility.LocalDateTimeSerializer;
import com.ecews.mqlamisplus.utility.SecurityUtils;
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
import lombok.ToString;
import org.hibernate.annotations.TypeDef;
import org.hibernate.annotations.TypeDefs;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.time.LocalDateTime;

@EntityListeners({AuditingEntityListener.class})
public interface HivAuditEntityView {

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

//    @PrePersist
//    @PreUpdate
//    default void update() {
//        setLastModifiedDate(LocalDateTime.now());
//        setLastModifiedBy(SecurityUtils.getCurrentUserLogin().orElse(""));
//    }
}
