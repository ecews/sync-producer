package com.ecews.mqlamisplus.Repository;

import com.ecews.mqlamisplus.models.hiv.PatientTracker;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface PatientTrackerRepo extends JpaRepository<PatientTracker,Long> {


}
