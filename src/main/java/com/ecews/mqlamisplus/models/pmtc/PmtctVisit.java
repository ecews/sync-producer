package com.ecews.mqlamisplus.models.pmtc;

import com.ecews.mqlamisplus.utility.LocalDateTimeDeserializer;
import com.ecews.mqlamisplus.utility.LocalDateTimeSerializer;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.domain.Persistable;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;

@Entity
@Table(name = "pmtct_mother_visitation",  schema = "public")
@Data
@NoArgsConstructor
public class PmtctVisit implements Serializable, Persistable<Long>
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;
    private String ancNo;
    private String hospitalNumber;
    private String personUuid;
    private String uuid;
    private String entryPoint;


    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    private LocalDate dateOfVisit;


    private String fpCounseling;
    private String fpMethod;
    private String timeOfViralLoad;

    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    private LocalDate dateOfViralLoad;


    private Integer gaOfViralLoad;
    private Integer resultOfViralLoad;
    private String dsd;
    private String dsdOption;
    private String dsdModel;
    private String  maternalOutcome;

    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    private LocalDate dateOfMaternalOutcome;


    private String visitStatus;
    private String transferTo;

    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    private LocalDate nextAppointmentDate;



    @Override
    public boolean isNew() {
        return false;
    }

}
