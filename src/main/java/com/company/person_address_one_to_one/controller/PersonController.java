package com.company.person_address_one_to_one.controller;

import com.company.person_address_one_to_one.DTO.AddPersonDTO;
import com.company.person_address_one_to_one.model.Person;
import com.company.person_address_one_to_one.service.PersonService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "api/person")
public class PersonController {

    @Autowired
    private PersonService personService;

    @PostMapping(value = "/add")
    public Person addPerson(@Valid @RequestBody AddPersonDTO addPersonDTO){
        return personService.savePerson(addPersonDTO);
    }

}
