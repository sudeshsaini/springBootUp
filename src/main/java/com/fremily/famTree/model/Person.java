package com.fremily.famTree.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "person")
public class Person {
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private Long Id;
	private String firstName;
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	private String lastName ;
	
	public Long getId() {
		return Id;
	}
	public void setId(Long id) {
		Id = id;
	}

	
}
