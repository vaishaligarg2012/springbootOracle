package com.web.spring.controller;


import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.web.spring.model.Project;

@RestController  
@RequestMapping("/webapp")
public class ProjectMVCController {   
                  
	@RequestMapping(value="greet", method=RequestMethod.GET)
	public ModelAndView hello(){
		  
		return new ModelAndView("greeting","msg","Welcome to spring MVC using Boot");
	}   
	
	@RequestMapping(value="addproject", method=RequestMethod.POST)
	public ModelAndView addProject(Project project, ModelAndView mv) {
	
		mv.addObject("id", project.getId());
		mv.addObject("name", project.getName());
		mv.addObject("duration", project.getDuration());
		mv.setViewName("projectinfo");
		return mv;
		
	}
	@RequestMapping(value="showPage", method=RequestMethod.GET)
	public ModelAndView showPage() {
		return new ModelAndView("projectinput","command", new Project());
	}
	
	
	
}  
 