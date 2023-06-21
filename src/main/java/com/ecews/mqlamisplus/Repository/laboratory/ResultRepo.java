package com.ecews.mqlamisplus.Repository.laboratory;

import com.ecews.mqlamisplus.models.laboratory.Result;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface ResultRepo extends JpaRepository <Result, Long> {

}
