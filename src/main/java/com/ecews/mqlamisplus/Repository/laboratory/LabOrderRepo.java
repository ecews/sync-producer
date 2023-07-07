package com.ecews.mqlamisplus.Repository.laboratory;


import com.ecews.mqlamisplus.models.entities.laboratory.LabOrder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface LabOrderRepo extends JpaRepository<LabOrder,Long> {


}
