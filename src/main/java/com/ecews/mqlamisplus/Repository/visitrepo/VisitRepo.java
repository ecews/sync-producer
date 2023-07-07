package com.ecews.mqlamisplus.Repository.visitrepo;

import com.ecews.mqlamisplus.models.entities.visit.Visit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


@RepositoryRestResource
public interface VisitRepo extends JpaRepository<Visit, Long> {
}
