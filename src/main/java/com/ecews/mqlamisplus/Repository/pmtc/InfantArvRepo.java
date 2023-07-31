package com.ecews.mqlamisplus.Repository.pmtc;


import com.ecews.mqlamisplus.entity.models.pmtc.InfantArv;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface InfantArvRepo extends JpaRepository<InfantArv, Long> {


}
