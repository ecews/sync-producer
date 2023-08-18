package com.ecews.mqlamisplus.entity.models.laboratory;

import com.ecews.mqlamisplus.entity.models.hts.Audit;
import com.ecews.mqlamisplus.utility.LocalDateTimeDeserializer;
import com.ecews.mqlamisplus.utility.LocalDateTimeSerializer;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "laboratory_order")
public class LabOrder extends Audit<String> {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;
    @Column(name = "uuid")
    private String uuid;
    @Column(name = "visit_id")
    private Integer visitId;
    @Column(name = "patient_id")
    private Integer patientId;
    @Column(name = "userid")
    private String userId;


    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    @Column(name = "order_date")
    private LocalDateTime orderDate;



    @Column(name = "patient_uuid")
    private String patientUuid;
    @Column(name = "facility_id")
    private Long facilityId;
    @Column(name = "archived")
    private Integer archived;


//    @JoinColumn(name = "lab_order_id")
//    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
//    private List<Test> tests;
    @PrePersist
    public void setFields(){
        if(archived == null){
            archived = 0;
        }
    }
}
