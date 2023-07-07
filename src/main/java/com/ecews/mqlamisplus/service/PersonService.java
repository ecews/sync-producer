package com.ecews.mqlamisplus.service;

import com.ecews.mqlamisplus.Repository.PersonRepo.PersonRepo;
import com.ecews.mqlamisplus.models.entities.DestinationPerson.DestinationPerson;
import com.ecews.mqlamisplus.models.entities.Person.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonService {

    @Autowired
    private PersonRepo personRepo;
    public DestinationPerson convertPersonToPersonCopy(Person person) {
        DestinationPerson destinationPerson = new DestinationPerson();
        destinationPerson.setId(person.getId());
        destinationPerson.setActive(person.getActive());
        destinationPerson.setContactPoint(person.getContactPoint());
        destinationPerson.setAddress(person.getAddress());
        destinationPerson.setGender(person.getGender());
        destinationPerson.setIdentifier(person.getIdentifier());
        destinationPerson.setDeceased(person.getDeceased());
        destinationPerson.setDeceasedDateTime(person.getDeceasedDateTime());
        destinationPerson.setMaritalStatus(person.getMaritalStatus());
        destinationPerson.setEmploymentStatus(person.getEmploymentStatus());
        destinationPerson.setEducation(person.getEducation());
        destinationPerson.setSex(person.getSex());
        destinationPerson.setOrganization(person.getOrganization());
        destinationPerson.setContact(person.getContact());
        destinationPerson.setDateOfBirth(person.getDateOfBirth());
        destinationPerson.setDateOfRegistration(person.getDateOfRegistration());
        destinationPerson.setArchived(person.getArchived());
        destinationPerson.setNinNumber(person.getNinNumber());
        destinationPerson.setEmrId(person.getEmrId());
        destinationPerson.setUuid(person.getUuid());
        destinationPerson.setFirstName(person.getFirstName());
        destinationPerson.setSurname(person.getSurname());
        destinationPerson.setOtherName(person.getOtherName());
        destinationPerson.setHospitalNumber(person.getHospitalNumber());
        destinationPerson.setIsDateOfBirthEstimated(person.getIsDateOfBirthEstimated());
        destinationPerson.setFullName(person.getFullName());

        // Set PersonAuditEntity properties
        destinationPerson.setCreatedDate(person.getCreatedDate());
        destinationPerson.setCreatedBy(person.getCreatedBy());
        destinationPerson.setLastModifiedDate(person.getLastModifiedDate());
        destinationPerson.setLastModifiedBy(person.getLastModifiedBy());
        destinationPerson.setFacilityId(person.getFacilityId());

        return destinationPerson;
    }


    public List<Person> getAllPersonsFromLamisPlusDb(){

        List<Person> persons = personRepo.findAll();

        return persons;
    }
}
