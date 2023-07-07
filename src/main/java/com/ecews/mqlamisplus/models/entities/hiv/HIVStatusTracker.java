package com.ecews.mqlamisplus.models.entities.hiv;


import com.ecews.mqlamisplus.models.entities.Person.Person;
import com.ecews.mqlamisplus.models.entities.visit.Visit;
import com.ecews.mqlamisplus.utility.LocalDateDeserializer;
import com.ecews.mqlamisplus.utility.LocalDateSerializer;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.*;
import org.springframework.data.domain.Persistable;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.PastOrPresent;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.time.LocalDate;

@Entity
@Table(name = "hiv_status_tracker")
@Builder(toBuilder = true)
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@EqualsAndHashCode(of = "id")
public class HIVStatusTracker extends HivAuditEntity implements Persistable<Long>, Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "hiv_status", nullable = false)
    @NonNull
    private String hivStatus;


    @JsonSerialize(using = LocalDateSerializer.class)
    @JsonDeserialize(using = LocalDateDeserializer.class)
    @PastOrPresent
    @Column(name = "status_date", nullable = false)
    @NotNull
    private LocalDate statusDate;
    @ManyToOne
    @JoinColumn(name = "person_id", referencedColumnName = "uuid", nullable = false)
    private Person person;
    @ManyToOne
    @JoinColumn(name = "visit_id", referencedColumnName = "uuid")
    private Visit visit;

    @Column(name = "tracking_outcome")
    private String trackOutcome;

    @PastOrPresent
    @Column(name = "track_date")
    private LocalDate trackDate;


    @JsonSerialize(using = LocalDateSerializer.class)
    @JsonDeserialize(using = LocalDateDeserializer.class)
    @Column(name = "agreed_date")
    private LocalDate agreedDate;

    @Size(max = 100)
    @Column(name = "reason_for_interruption")
    private String reasonForInterruption;

    @Size(max = 100)
    @Column(name = "CAUSE_OF_DEATH")
    private String causeOfDeath;

    private Boolean auto = false;

    @Column(name = "uuid", nullable = false, unique = true, updatable = false)
    private String uuid;

    @Basic
    @Column(name = "archived")
    private int archived;

    @Override
    public boolean isNew() {
        return id == null;
    }


}

