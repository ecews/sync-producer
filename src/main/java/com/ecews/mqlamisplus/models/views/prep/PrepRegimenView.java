package com.ecews.mqlamisplus.models.views.prep;



import com.blazebit.persistence.view.EntityView;
import com.blazebit.persistence.view.Mapping;
import com.ecews.mqlamisplus.models.entities.prep.PrepClinic;
import com.ecews.mqlamisplus.models.entities.prep.PrepRegimen;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;


@EntityView(PrepRegimen.class)
public interface PrepRegimenView{
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name = "id", nullable = false)
//    private Long id;

    @Mapping("code")
    String code();

    @Mapping("regimen")
    String regimen();

    @Mapping("composition")
    String composition();

    @Mapping("description")
    String description();


    @Mapping("archived")
    String archived();

//    @OneToMany(mappedBy = "regimen")
//    @JsonIgnore
//    @ToString.Exclude
//    List<PrepClinic> allClinics;
}

