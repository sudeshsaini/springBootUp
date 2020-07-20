package com.fremily.famTree.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.fremily.famTree.model.Person;
import com.fremily.famTree.service.PersonService;

@RestController
public class PersonController {
	@Autowired
	PersonService personService;
	
    @GetMapping(path = "/person")
	public  Iterable<Person> getAllPersons()
	{
		return personService.findAll();
	}
	
    @PostMapping(path = "/person")
	public  Person insertPerson(@RequestBody Person person)
	{
		return personService.createPerson(person);
	}
	

}
