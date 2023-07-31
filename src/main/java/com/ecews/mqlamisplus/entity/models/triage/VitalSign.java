package com.ecews.mqlamisplus.entity.models.triage;

import com.ecews.mqlamisplus.entity.models.PatientAuditEntity;
import com.ecews.mqlamisplus.entity.models.Person.Person;
import com.ecews.mqlamisplus.entity.models.visit.Visit;
import com.ecews.mqlamisplus.utility.LocalDateTimeDeserializer;
import com.ecews.mqlamisplus.utility.LocalDateTimeSerializer;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.*;

import org.springframework.data.domain.Persistable;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.time.LocalDateTime;

@Builder
@Entity
@Table(name = "triage_vital_sign")
@NoArgsConstructor
@Setter
@Getter
@AllArgsConstructor
@EqualsAndHashCode
public class VitalSign extends PatientAuditEntity implements Persistable<Long>, Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;
    private Double bodyWeight;
    private Double diastolic;

    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    private LocalDateTime captureDate;


    private Double height;
    private Double temperature;
    private Double pulse;
    private Double respiratoryRate;
    @ManyToOne(optional = false)
    @JoinColumn(name = "person_uuid", nullable = false, referencedColumnName = "uuid")
    private Person person;

    @OneToOne(optional = false)
    @JoinColumn(name = "visit_id", nullable = false, referencedColumnName = "uuid")
    private Visit visit;

    private Double systolic;

    private Integer archived;
    @NotNull
    @Column(name = "uuid", nullable = false, unique = true, updatable = false)
    private String uuid;

    @Override
    public Long getId() {
        return null;
    }

    @Override
    public boolean isNew() {
        return id == null;
    }
}
