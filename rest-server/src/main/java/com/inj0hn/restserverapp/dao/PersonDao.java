package com.inj0hn.restserverapp.dao;

import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Repository;

import com.inj0hn.restserverapp.domain.Person;

@Repository
public class PersonDao {

	public Person getPerson(UUID id) {
		return null;
	}
	
	public List<Person> getPersons() {
		return null;
	}
}
