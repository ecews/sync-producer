package com.ecews.mqlamisplus.entity.models.visit;

import com.ecews.mqlamisplus.entity.models.PatientAuditEntity;
import com.ecews.mqlamisplus.entity.models.Person.Person;
import com.ecews.mqlamisplus.utility.LocalDateTimeDeserializer;
import com.ecews.mqlamisplus.utility.LocalDateTimeSerializer;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.*;
import org.springframework.data.domain.Persistable;

import javax.persistence.*;
import javax.validation.constraints.PastOrPresent;
import java.io.Serializable;
import java.time.LocalDateTime;

@Entity
@Table(name = "patient_visit")
@NoArgsConstructor
@Setter
@Getter
@AllArgsConstructor
@EqualsAndHashCode
@Builder
public class Visit extends PatientAuditEntity implements Persistable<Long>, Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @ManyToOne(optional = false)
    @JoinColumn(name = "person_uuid", nullable = false, referencedColumnName = "uuid")
    private Person person;

    @PastOrPresent
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    @Column(name = "visit_start_date", nullable = false)
    private LocalDateTime visitStartDate;


    @PastOrPresent
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    @Column(name = "visit_end_date")
    private LocalDateTime visitEndDate;


    @PastOrPresent
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    @Column(name = "last_modified_date")
    private LocalDateTime lastModifiedDate;


    @Column(name = "uuid", nullable = false, unique = true, updatable = false)
    private String uuid;


    private Integer archived;

    @Override
    public Long getId() {
        return null;
    }

    @Override
    public boolean isNew() {
        return id == null;
    }
}
