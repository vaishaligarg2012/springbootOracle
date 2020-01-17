package com.web.spring.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.web.spring.model.Project;
import com.web.spring.repository.ProjectCrudRepository;
@Service
public class ProjectService {
	@Autowired
	private ProjectCrudRepository pcrud;
	
	static ArrayList<Project> plist=new ArrayList<>();
		
	static {
		plist.add(new Project(101,"Samsung",3));
		plist.add(new Project(102,"Fdex",5));
	}

	public Iterable<Project> getProjects(){
		System.out.println(pcrud.findAll());
		return pcrud.findAll();
		
	}
	
	public List<Project> getAllProj(){
		return (List<Project>) pcrud.findAll();
		
	}
	
	public boolean createProject(Project proj) {
		boolean p = pcrud.save(proj) != null;
		
		return p;
		
	}
	
}
