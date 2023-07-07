package com.ecews.mqlamisplus.models.entities.hiv;


import com.ecews.mqlamisplus.models.entities.Person.Person;
import com.ecews.mqlamisplus.models.entities.visit.Visit;
import com.ecews.mqlamisplus.utility.LocalDateDeserializer;
import com.ecews.mqlamisplus.utility.LocalDateSerializer;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.*;
import org.hibernate.annotations.Type;
import org.springframework.data.domain.Persistable;

import javax.persistence.*;
import javax.validation.constraints.PastOrPresent;
import java.time.LocalDate;

@Entity
@Table(name = "hiv_observation")
@Builder(toBuilder = true)
@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
@AllArgsConstructor
public class Observation extends HivAuditEntity  implements Persistable<Long> {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;


    @JsonSerialize(using = LocalDateSerializer.class)
    @JsonDeserialize(using = LocalDateDeserializer.class)
    @PastOrPresent(message = "Observation date cannot be in the future")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    private LocalDate dateOfObservation;


    @ManyToOne
    @JoinColumn(name = "person_uuid", referencedColumnName ="uuid", updatable = false)
    private Person person;
    @ManyToOne
    @JoinColumn(name = "visit_id", referencedColumnName = "uuid", nullable = false)
    private Visit visit;
    @Column(name = "type", unique = true)
    private String type;

    @Column(name = "uuid", unique = true, updatable = false)
    private String uuid;


    @Type(type = "jsonb")
    @Column(columnDefinition = "jsonb")
    private JsonNode data;

    @Basic
    @Column(name = "archived")
    private int archived;

    @Override
    public boolean isNew() {
        return id == null;
    }

}

