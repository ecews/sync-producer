package com.ecews.mqlamisplus.Repository.hivrepo;

import com.ecews.mqlamisplus.models.entities.hiv.Observation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ObservationRepo extends JpaRepository<Observation, Long> {


}
