package com.ecews.mqlamisplus.entity.models.hiv;


import com.ecews.mqlamisplus.entity.models.Person.Person;
import com.ecews.mqlamisplus.entity.models.visit.Visit;
import com.ecews.mqlamisplus.utility.LocalDateDeserializer;
import com.ecews.mqlamisplus.utility.LocalDateSerializer;
import com.ecews.mqlamisplus.utility.ZonedDateTimeDeserializer;
import com.ecews.mqlamisplus.utility.ZonedDateTimeSerializer;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.*;
import org.springframework.data.domain.Persistable;

import javax.persistence.*;
import javax.validation.constraints.PastOrPresent;
import java.io.Serializable;
import java.time.LocalDate;
import java.time.ZonedDateTime;

@Entity
@Table(name = "hiv_enrollment")
@Builder(toBuilder = true)
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@EqualsAndHashCode(of = "id")
public class HivEnrollment extends HivAuditEntity implements Persistable<Long>, Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;
    @Column(name = "unique_id")
    @NonNull
    private String uniqueId;
    @Column(name = "entry_point_id")
    private Long entryPointId;
    @Column(name = "target_group_id")
    private Long targetGroupId;


    @JsonSerialize(using = LocalDateSerializer.class)
    @JsonDeserialize(using = LocalDateDeserializer.class)
    @Column(name = "date_confirmed_hiv")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    private LocalDate dateConfirmedHiv;


    @JsonSerialize(using = LocalDateSerializer.class)
    @JsonDeserialize(using = LocalDateDeserializer.class)
    @Column(name = "date_enrolled_pmtct")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    private LocalDate dateEnrolledPMTCT;


    @Column(name = "source_of_referrer_id")
    private Long sourceOfReferrerId;


    @JsonSerialize(using = ZonedDateTimeSerializer.class)
    @JsonDeserialize(using = ZonedDateTimeDeserializer.class)
    @Column(name = "time_hiv_diagnosis")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSZ")
    private ZonedDateTime timeHivDiagnosis;


    @Column(name = "pregnant")
    private Boolean pregnant;
    @Column(name = "breastfeeding")
    private Boolean breastfeeding;


    @JsonSerialize(using = LocalDateSerializer.class)
    @JsonDeserialize(using = LocalDateDeserializer.class)
    @Column(name = "date_of_registration")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    private LocalDate dateOfRegistration;


    @NonNull
    @Column(name = "status_at_registration_id")
    private Long statusAtRegistrationId;
    @Column(name = "enrollment_setting_id")
    @NonNull
    private Long enrollmentSettingId;


    @JsonSerialize(using = LocalDateSerializer.class)
    @JsonDeserialize(using = LocalDateDeserializer.class)
    @Column(name = "date_started")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    private LocalDate dateStarted;


    @Column(name = "send_message")
    private Boolean sendMessage;


    @OneToOne
    @JoinColumn(name = "person_uuid", referencedColumnName = "uuid", nullable = false)
    private Person person;

    @ManyToOne
    @JoinColumn(name = "visit_id", referencedColumnName = "uuid", nullable = false)
    private Visit visit;

    @Column(name = "uuid", nullable = false, unique = true, updatable = false)
    private String uuid;
    @Basic
    @Column(name = "archived")
    private int archived;

    @Basic
    @Column(name = "facility_name")
    private String facilityName;
    @Basic
    @Column(name = "ovc_number")
    private String ovcNumber;

    @Basic
    @Column(name = "house_hold_number")
    private String houseHoldNumber;

    @Basic
    @Column(name = "care_entry_point_other")
    private String careEntryPointOther;

    @Basic
    @Column(name = "referred_to_OVCPartner")
    private String referredToOVCPartner;

    @Basic
    @Column(name = "referred_from_OVCPartner")
    private String referredFromOVCPartner;


    @JsonSerialize(using = LocalDateSerializer.class)
    @JsonDeserialize(using = LocalDateDeserializer.class)
    @PastOrPresent
    @Column(name = "date_referred_to_OVCPartner")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    private LocalDate dateReferredToOVCPartner;


    @JsonSerialize(using = LocalDateSerializer.class)
    @JsonDeserialize(using = LocalDateDeserializer.class)
    @Basic
    @Column(name = "date_referred_from_OVCPartner")
    @PastOrPresent
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    private LocalDate dateReferredFromOVCPartner;


    @JsonSerialize(using = LocalDateSerializer.class)
    @JsonDeserialize(using = LocalDateDeserializer.class)
    @Basic
    @Column(name = "date_of_lpm")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    private LocalDate dateOfLpm;


    @Basic
    @Column(name = "pregnancy_status_id")
    private Long pregnancyStatusId;

    @Basic
    @Column(name = "tb_status_id")
    private Long tbStatusId;

    @Basic
    @Column(name = "lip_name")
    private String lipName;

    @Override
    public Long getId() {
        return null;
    }

    @Override
    public boolean isNew() {

        return id == null;
    }


}
