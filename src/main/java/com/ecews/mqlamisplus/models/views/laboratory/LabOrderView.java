package com.ecews.mqlamisplus.models.views.laboratory;

import com.blazebit.persistence.view.EntityView;
import com.blazebit.persistence.view.Mapping;
import com.ecews.mqlamisplus.models.entities.hts.Audit;
import com.ecews.mqlamisplus.models.entities.laboratory.LabOrder;
import com.ecews.mqlamisplus.models.views.hts.AuditView;
import com.ecews.mqlamisplus.utility.LocalDateTimeDeserializer;
import com.ecews.mqlamisplus.utility.LocalDateTimeSerializer;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@EntityView(LabOrder.class)
public interface LabOrderView extends AuditView<String> {


//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name = "id", nullable = false)
//    private Integer id;


    @Mapping("uuid")
    String uuid();


    @Mapping("visit_id")
    Integer visitId();


    @Mapping("patient_id")
    Integer patientId();


    @Mapping("userid")
    String userId();



    @Mapping("order_date")
    LocalDateTime orderDate();


    @Mapping("patient_uuid")
    String patientUuid();

    @Mapping("facility_id")
    Long facilityId();


    @Mapping("archived")
    Integer archived();


//    @JoinColumn(name = "lab_order_id")
//    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
//    private List<Test> tests;
//    @PrePersist
//    public void setFields(){
//        if(archived == null){
//            archived = 0;
//        }
//    }


}
