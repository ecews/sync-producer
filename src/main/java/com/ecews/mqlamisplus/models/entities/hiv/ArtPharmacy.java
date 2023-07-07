package com.ecews.mqlamisplus.models.entities.hiv;

import com.ecews.mqlamisplus.models.entities.Person.Person;
import com.ecews.mqlamisplus.models.entities.visit.Visit;
import com.ecews.mqlamisplus.utility.LocalDateDeserializer;
import com.ecews.mqlamisplus.utility.LocalDateSerializer;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.*;
import org.hibernate.annotations.Type;
import org.springframework.data.domain.Persistable;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.PastOrPresent;
import java.io.Serializable;
import java.time.LocalDate;


@Entity
@Table(name = "hiv_art_pharmacy")
@Builder(toBuilder = true)
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class ArtPharmacy extends HivAuditEntity implements Persistable<Long> ,Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @NotNull
    @JoinColumn(name = "person_uuid",referencedColumnName = "uuid")
    @ManyToOne
    private Person person;

    @ManyToOne
    @JoinColumn(name = "visit_id", referencedColumnName = "uuid", nullable = false)
    private Visit visit;




    @JsonSerialize(using = LocalDateSerializer.class)
    @JsonDeserialize(using = LocalDateDeserializer.class)
    @PastOrPresent
    @NotNull
    @Column(name = "visit_date", nullable = false)
    private LocalDate visitDate;

    @Column(name = "ard_screened")
    private Boolean adrScreened;

    @Column(name = "prescription_error")
    private Boolean prescriptionError;

    @Column(name = "adherence")
    private Boolean adherence;

    @Column(name = "mmd_type")
    private String mmdType;

    @Column(nullable = false, unique = true, updatable = false)
    private String uuid;


    @JsonSerialize(using = LocalDateSerializer.class)
    @JsonDeserialize(using = LocalDateDeserializer.class)
    @Column(name = "next_appointment", nullable = false)
    private LocalDate nextAppointment;


    @Type(type = "jsonb-node")
    @Column(columnDefinition = "jsonb")
    private JsonNode extra;
    @Type(type = "jsonb")
    @Column(columnDefinition = "jsonb")
    private JsonNode adverseDrugReactions;
    @Column(name = "is_devolve")
    private Boolean isDevolve;
    @Column(name = "refill_period")
    private Integer refillPeriod;
    @Column(name = "delivery_point")
    private String deliveryPoint;

    @Column(name = "dsd_model")
    private  String dsdModel;

    @Column(name = "dsd_model_type")
    private  String dsdModelType;

    @Column(name = "refill")
    private  String refill ;

    @Column(name = "refill_type ")
    private  String refillType ;
    @Column(name = "ipt_type ")
    private  String iptType;
    @Column(name = "visit_type ")
    private String visitType;
    @Type(type = "jsonb-node")
    @Column(columnDefinition = "jsonb")
    private JsonNode ipt;
    @Basic
    @Column(name = "archived")
    private int archived;

//
//
//    @OneToMany
//    @ToString.Exclude
//    private Set<Regimen> regimens = new LinkedHashSet<> ();
//
//

    @Override
    public boolean isNew() {
        return id == null;
    }
}
