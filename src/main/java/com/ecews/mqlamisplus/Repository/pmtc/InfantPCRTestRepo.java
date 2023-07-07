package com.ecews.mqlamisplus.Repository.pmtc;


import com.ecews.mqlamisplus.models.entities.pmtc.InfantPCRTest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface InfantPCRTestRepo extends JpaRepository<InfantPCRTest, Long> {


}
