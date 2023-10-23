package com.crud.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.entity.Employee;
import com.crud.repository.EmployeeRepo;
import com.crud.repository.RoleRepo;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeRepo employeeRepo;
	@Autowired
	private RoleRepo rolesRepo;

	public Employee addEmployee(Employee employee) {
		
		
		
		return employeeRepo.save(employee);
		
	}

	public Employee updateEmployee(Employee empl, int id) {
		Optional<Employee> optional = employeeRepo.findById(id);

		if (!optional.isPresent()) {
			throw new ArithmeticException("id isnot present");
		}
		return employeeRepo.save(empl);
	}

//Another way of doing update query			
	public Employee updateEmployee1(Employee empl) {

		return employeeRepo.save(empl);

	}
	public List<Employee> getAllEmployees(){
		return employeeRepo.findAll();
	}
	public void deleteById(int id) {
		 employeeRepo.deleteById(id);
	}
	
	public List<Employee> getEmployeeByName(String name) {
		return employeeRepo.findByName(name);
	}
	
	public List<Employee> orderByName(){
		return employeeRepo.findByOrderByNameDesc();
	}
	
	public List<Employee> orderByNameByAsc(){
		return employeeRepo.findByOrderByName();
	}
	
	public List<Employee> startsWith(String name){
		return employeeRepo.findByNameStartingWith(name);
	}
	
	public List<Employee> containing(String name){
		return employeeRepo.findByNameContaining(name);
	}
	
	public List<Employee> notContaining(String name){
		return employeeRepo.findByNameNotContaining(name);
	}

}
