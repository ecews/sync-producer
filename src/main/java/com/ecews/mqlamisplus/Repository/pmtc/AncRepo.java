package com.ecews.mqlamisplus.Repository.pmtc;


import com.ecews.mqlamisplus.entity.models.pmtc.ANC;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface AncRepo extends JpaRepository<ANC, Long> {


}
