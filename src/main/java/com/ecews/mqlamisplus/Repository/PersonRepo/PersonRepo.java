package com.ecews.mqlamisplus.Repository.PersonRepo;

import com.ecews.mqlamisplus.entity.models.Person.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


@RepositoryRestResource
public interface PersonRepo extends JpaRepository<Person, Long> {




}
