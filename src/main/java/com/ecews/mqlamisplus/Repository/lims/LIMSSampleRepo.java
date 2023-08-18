package com.ecews.mqlamisplus.Repository.lims;

import com.ecews.mqlamisplus.entity.models.lims.LIMSSample;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface LIMSSampleRepo extends JpaRepository<LIMSSample, Long> {

}
