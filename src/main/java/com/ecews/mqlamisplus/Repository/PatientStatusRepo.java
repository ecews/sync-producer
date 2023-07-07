package com.ecews.mqlamisplus.Repository;

import com.ecews.mqlamisplus.models.entities.PatientStatus;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
@Qualifier("destinationDataSource")
public interface PatientStatusRepo extends JpaRepository<PatientStatus,Long> {


}
