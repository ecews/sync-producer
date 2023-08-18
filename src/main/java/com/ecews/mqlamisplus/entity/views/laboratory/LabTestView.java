package com.ecews.mqlamisplus.entity.views.laboratory;

import com.blazebit.persistence.view.EntityView;
import com.blazebit.persistence.view.Mapping;
import com.ecews.mqlamisplus.entity.models.laboratory.LabTest;
import com.ecews.mqlamisplus.entity.models.laboratory.SampleType;

import java.util.List;

@EntityView(LabTest.class)
public interface LabTestView {
    @Mapping("id")
    Integer getId();

    @Mapping("labTestName")
    String getLabTestName();

    @Mapping("unit")
    String getUnit();

    @Mapping("uuid")
    String getUuid();

    @Mapping("labTestGroupId")
    Integer getLabTestGroupId();

    // Map the list of SampleType entities to a list of SampleTypeView interfaces
    @Mapping("sampleType.id")
    List<Integer> getSampleType();

    // Add any other necessary methods or mappings for custom logic or associations
}
