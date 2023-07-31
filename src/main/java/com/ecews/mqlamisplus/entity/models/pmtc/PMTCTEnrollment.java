package com.ecews.mqlamisplus.entity.models.pmtc;

import com.ecews.mqlamisplus.utility.LocalDateDeserializer;
import com.ecews.mqlamisplus.utility.LocalDateSerializer;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.domain.Persistable;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;
import java.time.LocalDate;

@Entity
@Table(name = "pmtct_enrollment",  schema = "public")
@Data
@NoArgsConstructor
public class PMTCTEnrollment extends PMTCTTransactionalEntity implements Serializable, Persistable<Long> {

    @JsonSerialize(using = LocalDateSerializer.class)
    @JsonDeserialize(using = LocalDateDeserializer.class)
    private LocalDate pmtctEnrollmentDate;


    private Integer gravida;
    private Integer gAWeeks;
    private String entryPoint;

    @JsonSerialize(using = LocalDateSerializer.class)
    @JsonDeserialize(using = LocalDateDeserializer.class)
    private LocalDate artStartDate;


    private String artStartTime;
    private String tbStatus;


    @Override
    public Long getId() {
        return null;
    }

    @Override
    public boolean isNew() {
        return false;
    }
}
