package com.web.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.web.spring.model.Project;
import com.web.spring.repository.ProjectCrudRepository;
//implements CommandLineRunne
@SpringBootApplication
public class SpringBootAppApplication  { 
 
	public static void main(String[] args) {
		SpringApplication.run(SpringBootAppApplication.class, args);
		System.out.println("App is running...."); 
	}
	
//	@Autowired
//	ProjectCrudRepository repos;
//	
//
//	@Override
//	public void run(String... args) throws Exception {
//		// TODO Auto-generated method stub
//		
//		repos.save(new Project(100,"Java Trgg",34));
//		
//		System.out.println(repos.findAll());
//		
//	}

}

   