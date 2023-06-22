package com.ecews.mqlamisplus.Repository.prep;


import com.ecews.mqlamisplus.models.prep.PrepEligibility;
import com.ecews.mqlamisplus.models.prep.PrepEnrollment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface PrepEnrollmentRepo extends JpaRepository<PrepEnrollment, Long> {



}
