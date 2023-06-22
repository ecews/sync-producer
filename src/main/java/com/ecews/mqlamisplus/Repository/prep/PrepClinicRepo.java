package com.ecews.mqlamisplus.Repository.prep;

import com.ecews.mqlamisplus.models.prep.PrepClinic;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface PrepClinicRepo extends JpaRepository<PrepClinic,Long> {


}
