package com.company.person_address_one_to_one.service.impl;

import com.company.person_address_one_to_one.DTO.AddPersonDTO;
import com.company.person_address_one_to_one.model.Address;
import com.company.person_address_one_to_one.model.Person;
import com.company.person_address_one_to_one.repository.PersonRepository;
import com.company.person_address_one_to_one.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonServiceImpl implements PersonService {

    @Autowired
    private PersonRepository personRepository;
    @Override
    public Person savePerson(AddPersonDTO addPersonDTO) {

        Address address = new Address();
        address.setDistrict(addPersonDTO.getDistrict());
        address.setCity(addPersonDTO.getCity());
        address.setStreet(addPersonDTO.getStreet());
        address.setHouseNo(addPersonDTO.getHouseNo());

        Person person = new Person();
        person.setName(addPersonDTO.getName());
        person.setAge(addPersonDTO.getAge());
        person.setEmail(addPersonDTO.getEmail());
        person.setPassword(addPersonDTO.getPassword());
        person.setAddress(address);

        personRepository.save(person);
        return person;
    }
}
