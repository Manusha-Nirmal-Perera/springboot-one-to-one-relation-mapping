package com.company.person_address_one_to_one.service;

import com.company.person_address_one_to_one.DTO.AddPersonDTO;
import com.company.person_address_one_to_one.model.Person;

public interface PersonService {
    Person savePerson(AddPersonDTO addPersonDTO);
}
