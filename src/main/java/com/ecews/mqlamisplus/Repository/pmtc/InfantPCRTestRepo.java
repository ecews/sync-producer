package com.ecews.mqlamisplus.Repository.pmtc;


import com.ecews.mqlamisplus.entity.models.pmtc.InfantPCR;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface InfantPCRTestRepo extends JpaRepository<InfantPCR, Long> {


}
