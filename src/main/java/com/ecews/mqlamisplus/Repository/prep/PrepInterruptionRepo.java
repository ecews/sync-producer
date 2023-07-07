package com.ecews.mqlamisplus.Repository.prep;


import com.ecews.mqlamisplus.models.entities.prep.PrepInterruption;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface PrepInterruptionRepo extends JpaRepository<PrepInterruption, Long> {


}
