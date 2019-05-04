package com.capgemini.controller;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.onetomany.Certificates;
import com.capgemini.onetomany.Person;
import com.capgemini.service.PersonService;

@RestController
public class PersonController {

	@Autowired
	PersonService service;

	@RequestMapping("/")
	public void add() {
		Set<Certificates> set = new HashSet<Certificates>();
		Certificates c1 = new Certificates(301, "java");
		Certificates c2 = new Certificates(302, "c");
		Certificates c3 = new Certificates(303, "Dbms");
		set.add(c1);
		set.add(c2);
		set.add(c3);

		Person person = new Person(101, "Henry",set);
		service.save(person);
		
	}

	@RequestMapping("/new")
	public Person getPerson() {
		Person person = service.findById(101).get();
		return person;
	}

}
