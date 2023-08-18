package com.ecews.mqlamisplus.entity.views.hiv;



import com.blazebit.persistence.view.EntityView;
import com.blazebit.persistence.view.Mapping;
import com.ecews.mqlamisplus.entity.models.Person.Person;
import com.ecews.mqlamisplus.entity.models.hiv.HIVEac;
import com.ecews.mqlamisplus.entity.models.visit.Visit;
import com.ecews.mqlamisplus.utility.LocalDateDeserializer;
import com.ecews.mqlamisplus.utility.LocalDateSerializer;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.EntityListeners;
import java.time.LocalDate;

@EntityView(HIVEac.class)
public interface HIVEacView {

    @Mapping("id")
    Long getId();

    @Mapping("person.uuid")
    String getPersonUuid();

    @Mapping("visit.uuid")
    String getVisitUuid();

    @Mapping("lastViralLoad")
    Double getLastViralLoad();

    @Mapping("dateOfLastViralLoad")
    @JsonSerialize(using = LocalDateSerializer.class)
    @JsonDeserialize(using = LocalDateDeserializer.class)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    LocalDate getDateOfLastViralLoad();

    @Mapping("uuid")
    String getUuid();

    @Mapping("status")
    String getStatus();

    @Mapping("archived")
    int getArchived();

    @Mapping("testResultId")
    Long getTestResultId();

    @Mapping("testGroup")
    String getTestGroup();

    @Mapping("testName")
    String getTestName();

    @Mapping("labNumber")
    String getLabNumber();

    @Mapping("reasonToStopEac")
    String getReasonToStopEac();

    default boolean isNew() {
        return getId() == null;
    }
}
