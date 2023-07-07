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
import java.io.Serializable;
import java.time.LocalDate;

@Entity
@Table(name = "hiv_eac_session")
@Builder(toBuilder = true)
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class HIVEacSession extends HivAuditEntity implements Serializable, Persistable<Long> {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;
    @ManyToOne
    @JoinColumn(name = "eac_id", referencedColumnName = "uuid", nullable = false)
    private  HIVEac eac;
    @ManyToOne
    @JoinColumn(name = "person_uuid", referencedColumnName = "uuid", nullable = false)
    private Person person;
    @ManyToOne
    @JoinColumn(name = "visit_id", referencedColumnName = "uuid", nullable = false)
    private Visit visit;

    @Type(type = "jsonb")
    @Column(columnDefinition = "jsonb")
    private JsonNode barriers;
    @Type(type = "jsonb")
    @Column(columnDefinition = "jsonb")
    private JsonNode intervention;
    private String barriersOthers;
    private String interventionOthers;
    private String comment;


    @JsonSerialize(using = LocalDateSerializer.class)
    @JsonDeserialize(using = LocalDateDeserializer.class)
    private LocalDate followUpDate;


    @JsonSerialize(using = LocalDateSerializer.class)
    @JsonDeserialize(using = LocalDateDeserializer.class)
    private LocalDate eacSessionDate;


    private String referral;
    private String adherence;
    private String status;
    @Column(name = "uuid", nullable = false, unique = true, updatable = false)
    private String uuid;
    private int  archived;
    @Override
    public boolean isNew() {
        return id == null;
    }
}