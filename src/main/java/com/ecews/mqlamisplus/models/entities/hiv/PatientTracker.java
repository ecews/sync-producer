package com.ecews.mqlamisplus.models.entities.hiv;

import com.ecews.mqlamisplus.models.entities.Person.Person;
import com.ecews.mqlamisplus.utility.LocalDateDeserializer;
import com.ecews.mqlamisplus.utility.LocalDateSerializer;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.*;
import org.hibernate.Hibernate;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.Type;
import org.springframework.data.domain.Persistable;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

@Entity
@Table(name = "hiv_patient_tracker")
@Builder(toBuilder = true)
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@DynamicInsert
public class PatientTracker extends HivAuditEntity implements Serializable, Persistable<Long> {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;
    private String dsdStatus;
    private String dsdModel;
    private String reasonForTracking;
    private String careInFacilityDiscountinued;
    private String reasonForDiscountinuation;
    private String causeOfDeath;
    private String reasonForLossToFollowUp;
    private String referredFor;
    private String referredForOthers;
    private String reasonForTrackingOthers;
    private String causeOfDeathOthers;
    private String reasonForLossToFollowUpOthers;
    @ManyToOne
    @JoinColumn(name = "status_uuid", referencedColumnName = "uuid")
    private HIVStatusTracker statusTracker;
    private Integer archived;
    @Column(name = "uuid", nullable = false, unique = true, updatable = false)
    private String uuid;
    @Type(type = "jsonb")
    @Column(columnDefinition = "jsonb", name = "attempts")
    private JsonNode attempts;
    private String durationOnART;



    @JsonSerialize(using = LocalDateSerializer.class)
    @JsonDeserialize(using = LocalDateDeserializer.class)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    private LocalDate dateLastAppointment;



    @JsonSerialize(using = LocalDateSerializer.class)
    @JsonDeserialize(using = LocalDateDeserializer.class)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    private LocalDate dateReturnToCare;



    @JsonSerialize(using = LocalDateSerializer.class)
    @JsonDeserialize(using = LocalDateDeserializer.class)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    private LocalDate dateOfDiscontinuation;



    @JsonSerialize(using = LocalDateSerializer.class)
    @JsonDeserialize(using = LocalDateDeserializer.class)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    private LocalDate dateMissedAppointment;


    @ManyToOne
    @JoinColumn(name = "person_uuid", referencedColumnName = "uuid", nullable = false)
    private Person person;



    @Column(name = "date_of_observation")
    private LocalDate dateOfObservation;

    public boolean isNew() {
        return id == null;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        PatientTracker that = (PatientTracker) o;
        return id != null && Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}