package com.ecews.mqlamisplus.Repository.laboratory;


import com.ecews.mqlamisplus.entity.models.laboratory.Test;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface TestRepo extends JpaRepository<Test, Long> {


}
