package com.ecews.mqlamisplus.models.views.hiv;

import com.blazebit.persistence.view.EntityView;
import com.blazebit.persistence.view.Mapping;
import com.ecews.mqlamisplus.models.entities.hiv.Regimen;
import lombok.*;
import org.springframework.data.domain.Persistable;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.List;

@EntityView(Regimen.class)
public interface RegimenView{

    @Mapping("id")
    Long getId();

    @Mapping("description")
    String getDescription();

    @Mapping("composition")
    String getComposition();

    @Mapping("active")
    Boolean getActive();

    @Mapping("priority")
    Integer getPriority();

    @Mapping("regimenDrugs")
    List<RegimenDrug> getRegimenDrugs();

    @Mapping("regimenType")
    RegimenType getRegimenType();

//    @Override
//    default boolean isNew() {
//        return getId() == null;
//    }
}
