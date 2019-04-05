package com.inj0hn.restserverapp.endpoint;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.inj0hn.restserverapp.dao.PersonDao;
import com.inj0hn.restserverapp.domain.Person;

@RestController
@RequestMapping("/persons")
public class PersonResource {
	
	@Autowired
	private PersonDao dao;

	@RequestMapping(method = RequestMethod.GET, value = "/{id}")
	public Person getPerson(@PathVariable("id") UUID id) {
		return dao.getPerson(id);
	}
	
	@RequestMapping(method = RequestMethod.GET)
	public List<Person> getPersons() {
		return dao.getPersons();
	}
}
