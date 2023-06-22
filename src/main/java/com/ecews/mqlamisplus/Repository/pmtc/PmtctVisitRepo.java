package com.ecews.mqlamisplus.Repository.pmtc;


import com.ecews.mqlamisplus.models.pmtc.PmtctVisit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface PmtctVisitRepo extends JpaRepository<PmtctVisit, Long> {


}
