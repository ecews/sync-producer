package com.ecews.mqlamisplus.Repository.hivrepo;

import com.ecews.mqlamisplus.entity.models.hiv.HIVStatusTracker;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface HIVStatusTrackerRepo extends JpaRepository<HIVStatusTracker, Long> {


}
