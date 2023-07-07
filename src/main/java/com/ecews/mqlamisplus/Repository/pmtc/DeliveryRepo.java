package com.ecews.mqlamisplus.Repository.pmtc;

import com.ecews.mqlamisplus.models.entities.pmtc.Delivery;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface DeliveryRepo extends JpaRepository<Delivery,Long> {


}
