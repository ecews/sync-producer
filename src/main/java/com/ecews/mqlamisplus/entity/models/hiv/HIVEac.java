package com.ecews.mqlamisplus.entity.models.hiv;


import com.ecews.mqlamisplus.entity.models.Person.Person;
import com.ecews.mqlamisplus.entity.models.visit.Visit;
import com.ecews.mqlamisplus.utility.LocalDateDeserializer;
import com.ecews.mqlamisplus.utility.LocalDateSerializer;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.*;
import org.springframework.data.domain.Persistable;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;

@Entity
@Table(name = "hiv_eac")
@Builder(toBuilder = true)
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class HIVEac extends HivAuditEntity implements Serializable, Persistable<Long> {
    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    @JoinColumn(name = "person_uuid", referencedColumnName = "uuid", nullable = false)
    private Person person;
    @ManyToOne
    @JoinColumn(name = "visit_id", referencedColumnName = "uuid", nullable = false)
    private Visit visit;
    private Double lastViralLoad;


    @JsonSerialize(using = LocalDateSerializer.class)
    @JsonDeserialize(using = LocalDateDeserializer.class)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    private LocalDate dateOfLastViralLoad;


    @Column(name = "uuid", nullable = false, unique = true, updatable = false)
    private String uuid;
    private String status;
    private int  archived;
    private Long testResultId;
    private String testGroup;
    private String testName;
    private String labNumber;
    private String reasonToStopEac;

    @Override
    public Long getId() {
        return null;
    }

    @Override
    public boolean isNew() {
        return id == null;
    }


}

