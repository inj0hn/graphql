package com.inj0hn.restserverapp.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Repository;

import com.inj0hn.restserverapp.domain.Person;

@Repository
public class PersonDao {
	
	private static final List<Person> persons;
	static {
		persons = new ArrayList<Person>();
		persons.add(new Person(UUID.randomUUID(), "foo", "bar"));
		persons.add(new Person(UUID.randomUUID(), "fubar", "foo"));
		persons.add(new Person(UUID.randomUUID(), "bar", "foo"));
	}

	public Person getPerson(UUID id) {
		return persons.stream()
				.filter(person -> person.getId() == id)
				.findAny().orElse(null);
	}
	
	public List<Person> getPersons() {
		return persons;
	}
}
