package com.fremily.famTree.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fremily.famTree.model.Person;
import com.fremily.famTree.repository.PersonRepository;

@Service
public class PersonService {
	@Autowired
	private PersonRepository personRepository;
	
	public List <Person> findAll() {
		
		return (List<Person>) personRepository.findAll();
	}

}
