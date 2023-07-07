package com.ecews.mqlamisplus.models.views.hiv;

import com.blazebit.persistence.view.EntityView;
import com.blazebit.persistence.view.Mapping;
import com.ecews.mqlamisplus.models.entities.hiv.HIVDrug;
import com.ecews.mqlamisplus.models.entities.hiv.Regimen;
import com.ecews.mqlamisplus.models.entities.hiv.RegimenDrug;
import lombok.*;
import org.springframework.data.domain.Persistable;

import javax.persistence.*;
import java.util.Objects;

@EntityView(RegimenDrug.class)
public interface RegimenDrugView{

    @Mapping("id")
    Long getId();

    @Mapping("drug")
    HIVDrug getDrug();

    @Mapping("regimen")
    Regimen getRegimen();

//    @Override
//    default boolean isNew() {
//        return getId() == null;
//    }

//    @Override
//    default int hashCode() {
//        return Objects.hash(getId());
//    }

//    @Override
//    default boolean equals(Object obj) {
//        if (this == obj) {
//            return true;
//        }
//        if (obj == null || getClass() != obj.getClass()) {
//            return false;
//        }
//        RegimenDrugView other = (RegimenDrugView) obj;
//        return Objects.equals(getId(), other.getId());
//    }
}
