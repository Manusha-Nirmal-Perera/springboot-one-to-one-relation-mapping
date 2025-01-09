package com.company.person_address_one_to_one.repository;

import com.company.person_address_one_to_one.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> {
}
