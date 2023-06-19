package com.ecews.mqlamisplus.Repository;

import com.ecews.mqlamisplus.models.Patient;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
@Qualifier("destinationDataSource")
public interface PatientRepo extends JpaRepository<Patient,Long> {

}
