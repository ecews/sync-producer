package com.ecews.mqlamisplus.Repository.pmtc;


import com.ecews.mqlamisplus.models.entities.pmtc.PMTCTEnrollment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface PmtctEnrollmentRepo extends JpaRepository<PMTCTEnrollment, Long> {

}
