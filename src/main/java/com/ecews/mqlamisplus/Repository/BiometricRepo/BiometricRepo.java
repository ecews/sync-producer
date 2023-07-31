package com.ecews.mqlamisplus.Repository.BiometricRepo;

import com.ecews.mqlamisplus.entity.models.biometric.Biometric;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


@RepositoryRestResource
public interface BiometricRepo extends JpaRepository<Biometric, Long> {


}
