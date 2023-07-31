package com.ecews.mqlamisplus.entity.models.pmtc;

import com.ecews.mqlamisplus.utility.LocalDateDeserializer;
import com.ecews.mqlamisplus.utility.LocalDateSerializer;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.domain.Persistable;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;

@Entity
@Table(name = "pmtct_infant_arv",  schema = "public")
@Data
@NoArgsConstructor
public class InfantArv implements Serializable, Persistable<Long>
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @JsonSerialize(using = LocalDateSerializer.class)
    @JsonDeserialize(using = LocalDateDeserializer.class)
    private LocalDate visitDate;


    private String infantHospitalNumber;
    private String ancNumber;
    private String infantArvType;
    private String infantArvTime;
    private String arvDeliveryPoint;
    private String uuid;
    private String ageAtCtx;

    @Override
    public Long getId() {
        return null;
    }

    @Override
    public boolean isNew() {
        return false;
    }
}
