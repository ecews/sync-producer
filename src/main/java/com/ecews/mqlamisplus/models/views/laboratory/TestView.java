package com.ecews.mqlamisplus.models.views.laboratory;

import com.blazebit.persistence.view.EntityView;
import com.blazebit.persistence.view.Mapping;
import com.ecews.mqlamisplus.models.entities.hts.Audit;
import com.ecews.mqlamisplus.models.entities.laboratory.Test;
import com.ecews.mqlamisplus.models.views.hts.AuditView;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@EntityView(Test.class)

public interface TestView extends AuditView<String> {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name = "id", nullable = false)
//    private Integer id;


    @Mapping("uuid")
    String uuid();
    @Mapping("patient_id")
    Integer patientId();
    @Mapping("lab_test_id")
    Integer labTestId();

    @Mapping("description")
    String description();

    @Mapping("lab_number")
    String labNumber();


    @Mapping("lab_test_group_id")
    Integer labTestGroupId();


    @Mapping("order_priority")
    Integer orderPriority();


    @Mapping("unit_measurement")
    String unitMeasurement();


    @Mapping("lab_test_order_status")
    Integer labTestOrderStatus();


    @Mapping("viral_load_indication")
    Integer viralLoadIndication();


    @Mapping("lab_order_id")
    Integer labOrderId();


    @Mapping("patient_uuid")
    String patientUuid();


    @Mapping("facility_id")
    Long facilityId();


    @Mapping("archived")
    Integer archived();


//    @PrePersist
//    public void setFields(){
//        if(archived == null){
//            archived = 0;
//        }
//    }
}
