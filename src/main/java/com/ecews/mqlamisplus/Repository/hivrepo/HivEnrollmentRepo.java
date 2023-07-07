package com.ecews.mqlamisplus.Repository.hivrepo;

import com.ecews.mqlamisplus.models.entities.hiv.HivEnrollment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface HivEnrollmentRepo extends JpaRepository<HivEnrollment,Long> {

}
