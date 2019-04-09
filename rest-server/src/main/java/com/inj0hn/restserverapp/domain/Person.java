package com.inj0hn.restserverapp.domain;

import java.util.UUID;

public class Person {
	private UUID id;
	private String firstName;
	private String lastName;
	
	public Person(UUID id, String firstName, String lastName) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public UUID getId() {
		return id;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
}
