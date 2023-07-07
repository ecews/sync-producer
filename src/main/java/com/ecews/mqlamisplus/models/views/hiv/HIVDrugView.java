package com.ecews.mqlamisplus.models.views.hiv;

import com.blazebit.persistence.view.Mapping;
import com.ecews.mqlamisplus.models.entities.hiv.RegimenDrug;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.ToString;
import org.springframework.data.domain.Persistable;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.List;

@Entity
public interface HIVDrugView{

//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Basic(optional = false)
//    @Mapping("id")
//    Long getId();



    @Mapping("abbrev")
    String getAbbrev();



    @Mapping("name")
    String getName();



    @Mapping("strength")
    String getStrength();



    @Mapping("packSize")
    int getPackSize();




    @Mapping("doseForm")
    String getDoseForm();


    @Mapping("morning")
    Integer getMorning();


    @Mapping("afternoon")
    Integer getAfternoon();


    @Mapping("evening")
    Integer getEvening();


    @Mapping("evening")
    List<RegimenDrug> getRegimenDrugs();



//    default boolean isNew() {
//        return getId() == null;
//    }
}
