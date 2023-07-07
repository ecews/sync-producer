package com.ecews.mqlamisplus.models.views.hiv;

import com.blazebit.persistence.view.EntityView;
import com.blazebit.persistence.view.Mapping;
import com.ecews.mqlamisplus.models.entities.hiv.Regimen;
import com.ecews.mqlamisplus.models.entities.hiv.RegimenType;
import lombok.*;
import org.springframework.data.domain.Persistable;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;

@EntityView(RegimenType.class)
public interface RegimenTypeView{

    @Mapping("id")
    Long getId();

    @Mapping("description")
    String getDescription();

    @Mapping("regimens")
    List<Regimen> getRegimens();

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
//        RegimenTypeView other = (RegimenTypeView) obj;
//        return Objects.equals(getId(), other.getId());
//    }
}
