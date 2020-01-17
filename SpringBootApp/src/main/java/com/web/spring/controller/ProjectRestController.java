package com.web.spring.controller;
import java.util.List;
import java.util.Optional;

import javax.persistence.Id;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import com.web.spring.model.Project;
import com.web.spring.repository.ProjectCrudRepository;
import com.web.spring.service.ProjectService;
@RestController
@RequestMapping("dbservice")
public class ProjectRestController {
	@Autowired
	private ProjectService projDao;
	@Autowired
	private ProjectCrudRepository pcrud;
	
	
	@RequestMapping(value="greet",method=RequestMethod.GET,produces="text/plain")
	public String greet() {
		return "Welcome to Project Api....";
	}
	@RequestMapping(value="getprojlist",method=RequestMethod.GET,produces={"application/json","application/xml"})
	public Iterable<Project> getProjects() {
		return projDao.getProjects();
	}
	@RequestMapping(value="getprojbyId/{id}",method=RequestMethod.GET,produces={"application/json","application/xml"})
	public Optional<Project> getAllProjects(@PathVariable int id) {
		Optional<Project> pro =  pcrud.findById(id);
		  
		
		return pro;
	}								

	@RequestMapping(value="createProject", method=RequestMethod.POST)
	public boolean createProject(@RequestBody Project proj) {
		
		boolean  p = projDao.createProject(proj);
		
		return p;
	}
	
	
	
}
