package com.ecews.mqlamisplus.Repository.lims;

import com.ecews.mqlamisplus.models.lims.LIMSManifest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface LIMManifestSRepo extends JpaRepository<LIMSManifest,Long> {

}
