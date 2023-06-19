package com.ecews.mqlamisplus.Repository.hivrepo;


import com.ecews.mqlamisplus.models.hts.HtsClient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface HtsClientRepo extends JpaRepository<HtsClient, Long> {


}
