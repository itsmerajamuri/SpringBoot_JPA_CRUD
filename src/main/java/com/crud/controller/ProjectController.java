package com.crud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.crud.entity.Project;
import com.crud.repository.ProjectRepo;

@RestController
public class ProjectController {

	@Autowired
	private ProjectRepo projectRepo;
	
	@GetMapping("/allProjects")
	public List<Project> getAllProjects(){
		return projectRepo.findAll();
	}
	
	
}
