package com.crud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.crud.entity.Employe;
import com.crud.entity.Project;
import com.crud.repository.EmployeRepo;
import com.crud.repository.ProjectRepo;

@RestController

public class EmployeController {

	@Autowired
	private EmployeRepo employeRepo;
	
	@Autowired
	private ProjectRepo projectRepo;
	
	@GetMapping("/getAllEmploye")
	public List<Employe> getAllemployees(){
		return employeRepo.findAll();
	}
	@PostMapping("/addEmploye")
	public Employe addEmp(@RequestBody Employe employe) {
		return employeRepo.save(employe);
	}
	@PostMapping("/addEmploye/{id}")
	public List<Employe> addEmpbyProject(@RequestBody Employe employe,@PathVariable(value = "id") int id) {
		Project project= projectRepo.findById(id).get();
		employe.setProject(project);
		employeRepo.save(employe);
		return employeRepo.findAll();
	}
	
	@PostMapping("/addmultipleEmployees/{id}")
	public List<Employe> addMultipleEmployees(@RequestBody List<Employe> employes,@PathVariable(value = "id") int id){
		Project project= projectRepo.findById(id).get();
		for(Employe emp:employes) {
			emp.setProject(project);
		}
		return employeRepo.saveAll(employes);
	}
}
