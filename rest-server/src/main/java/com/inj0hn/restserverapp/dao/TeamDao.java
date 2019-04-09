package com.inj0hn.restserverapp.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Repository;

import com.inj0hn.restserverapp.domain.Person;
import com.inj0hn.restserverapp.domain.Team;

@Repository
public class TeamDao {
	
	private static final List<Team> teams;
	static {
		teams = new ArrayList<Team>();
		teams.add(new Team("foo", createPersons(2)));
		teams.add(new Team("bar", createPersons(3)));
		teams.add(new Team("fubar", createPersons(4)));
	}
	
	private static List<Person> createPersons(int size) {
		List<Person> persons = new ArrayList<Person>();
		for(int i=0; i<size; i++) {
			persons.add(new Person(UUID.randomUUID(), UUID.randomUUID().toString().substring(0, 4), UUID.randomUUID().toString().substring(0, 4)));
		}
		return persons;
	}

	public List<Team> getTeams() {
		return teams;
	}
	
	public Team getTeam(String name) {
		return teams.stream()
				.filter(team -> team.getName().equals(name))
				.findAny().orElse(null);
	}
}
