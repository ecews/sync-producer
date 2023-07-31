package com.ecews.mqlamisplus.Repository.hts;

import com.ecews.mqlamisplus.entity.models.hts.IndexElicitation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


@RepositoryRestResource
public interface IndexElicitationRepo extends JpaRepository<IndexElicitation, Long> {


}
