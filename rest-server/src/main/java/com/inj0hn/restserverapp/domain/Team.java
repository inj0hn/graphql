package com.inj0hn.restserverapp.domain;

import java.util.List;

public class Team {

	private final String name;
	private final List<Person> members;
	
	public Team(String name, List<Person> members) {
		this.name = name;
		this.members = members;
	}
	
	public String getName() {
		return name;
	}
	
	public List<Person> getMembers() {
		return members;
	}
	
}
