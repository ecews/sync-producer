package com.ecews.mqlamisplus.models.views.laboratory;

import com.blazebit.persistence.view.EntityView;
import com.blazebit.persistence.view.Mapping;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;


@EntityView(LabTest.class)

public interface LabTest {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name = "id", nullable = false)
//    private Integer id;


    @Mapping("lab_test_name")
    String labTestName();

    @Mapping("unit")
    String unit();


    @Mapping("uuid")
    String uuid();


    @Mapping("labtestgroup_id")
    Integer labTestGroupId();

//    @ManyToMany
//    @JoinTable(
//            name = "laboratory_sampletype_labtest_link",
//            joinColumns = @JoinColumn(name = "labtest_id"),
//            inverseJoinColumns = @JoinColumn(name = "sample_type_id"))

   @Mapping("laboratory_sampletype_labtest_link")
   List<SampleType> sampleType();

}
