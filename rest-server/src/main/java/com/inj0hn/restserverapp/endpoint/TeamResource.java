package com.inj0hn.restserverapp.endpoint;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.inj0hn.restserverapp.dao.TeamDao;
import com.inj0hn.restserverapp.domain.Team;

@RestController
@RequestMapping("/teams")
public class TeamResource {

	@Autowired
	private TeamDao dao;
	
	@RequestMapping(method = RequestMethod.GET, value = "/{name}")
	public Team getTeam(@PathVariable("name") String name) {
		return dao.getTeam(name);
	}
	
	@RequestMapping(method = RequestMethod.GET)
	public List<Team> getTeams() {
		return dao.getTeams();
	}
}
