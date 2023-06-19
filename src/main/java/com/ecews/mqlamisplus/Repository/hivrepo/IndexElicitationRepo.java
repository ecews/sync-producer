package com.ecews.mqlamisplus.Repository.hivrepo;

import com.ecews.mqlamisplus.models.hts.IndexElicitation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


@RepositoryRestResource
public interface IndexElicitationRepo extends JpaRepository<IndexElicitation, Long> {


}
