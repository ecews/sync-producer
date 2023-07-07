package com.ecews.mqlamisplus.models.views.laboratory;

import com.blazebit.persistence.view.EntityView;
import com.blazebit.persistence.view.Mapping;
import com.ecews.mqlamisplus.models.entities.laboratory.SampleType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@EntityView(SampleType.class)

public interface SampleTypeView {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name = "id", nullable = false)
//    private Integer id;


    @Mapping("uuid")
    String uuid();


    @Mapping("sample_type_name")
    String sampleTypeName();
}
