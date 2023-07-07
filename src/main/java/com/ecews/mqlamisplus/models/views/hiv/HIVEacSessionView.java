package com.ecews.mqlamisplus.models.views.hiv;

import com.blazebit.persistence.view.EntityView;
import com.blazebit.persistence.view.Mapping;
import com.ecews.mqlamisplus.models.entities.hiv.HIVEacSession;
import com.ecews.mqlamisplus.models.views.person.PersonView;
import com.ecews.mqlamisplus.models.views.visit.VisitView;
import lombok.*;
import org.springframework.data.domain.Persistable;

import javax.persistence.*;
import java.time.LocalDate;

@EntityView(HIVEacSession.class)
public interface HIVEacSessionView {

    @Mapping("id")
    Long getId();

    @Mapping("eac")
    HIVEacView getEac();

    @Mapping("person")
    PersonView getPerson();

    @Mapping("visit")
    VisitView getVisit();

    @Mapping("barriers")
    Object getBarriers();

    @Mapping("intervention")
    Object getIntervention();

    @Mapping("barriersOthers")
    String getBarriersOthers();

    @Mapping("interventionOthers")
    String getInterventionOthers();

    @Mapping("comment")
    String getComment();

    @Mapping("followUpDate")
    LocalDate getFollowUpDate();

    @Mapping("eacSessionDate")
    LocalDate getEacSessionDate();

    @Mapping("referral")
    String getReferral();

    @Mapping("adherence")
    String getAdherence();

    @Mapping("status")
    String getStatus();

    @Mapping("uuid")
    String getUuid();

    @Mapping("archived")
    int getArchived();

//    @Override
//    default boolean isNew() {
//        return getId() == null;
//    }
}
