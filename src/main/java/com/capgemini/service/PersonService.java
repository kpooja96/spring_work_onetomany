package com.capgemini.service;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.onetomany.Person;

@RestController
public interface PersonService extends JpaRepository<Person, Integer>{

}
