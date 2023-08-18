package com.ecews.mqlamisplus.entity.models.visit;

import com.ecews.mqlamisplus.entity.models.PatientAuditEntity;
import com.ecews.mqlamisplus.entity.models.Person.Person;
import com.ecews.mqlamisplus.entity.models.biometric.Biometric;
import com.ecews.mqlamisplus.entity.models.hiv.*;
import com.ecews.mqlamisplus.entity.models.hts.HtsClient;
import com.ecews.mqlamisplus.entity.models.hts.IndexElicitation;
import com.ecews.mqlamisplus.entity.models.hts.RiskStratification;
import com.ecews.mqlamisplus.entity.models.prep.PrepClinic;
import com.ecews.mqlamisplus.entity.models.prep.PrepEligibility;
import com.ecews.mqlamisplus.entity.models.prep.PrepEnrollment;
import com.ecews.mqlamisplus.entity.models.prep.PrepInterruption;
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
import java.util.List;

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


//    @OneToMany
//    private List<Biometric> biometric;

    @OneToMany
    private List<ArtPharmacy> artPharmacy;


    @OneToMany
    private List<HivEnrollment> hivEnrollment;



    @OneToMany
    private List<HIVEac>  hivEac;

    @OneToMany
    private List<EacOutCome>  eacOutCome;


    @OneToMany
    private List<HIVEacSession>  hivEacSession;

    @OneToMany
    private List<Observation>  observation;

    @OneToMany
    private List<HIVStatusTracker>  hivStatusTracker;

    @OneToMany
    private List<PatientTracker>  patientTracker;


//    @OneToMany
//    private List<IndexElicitation>  indexElicitation;

//    @OneToMany
//    private List<HtsClient>  htsClient;
//
//    @OneToMany
//    private List<RiskStratification>  riskStratification;

//    @OneToMany
//    private List<PrepEligibility>  prepEligibility;

    @OneToMany
    private List<PrepEnrollment>  prepEnrollment;

//    @OneToMany
//    private List<PrepClinic>  prepClinic;

//    @OneToMany
//    private List<PrepInterruption> prepInterruption;


















    @Override
    public Long getId() {
        return null;
    }

    @Override
    public boolean isNew() {
        return id == null;
    }
}
