package com.crud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.crud.entity.Employee;
import com.crud.service.EmployeeService;

@RestController
public class EmployeeConntroller {
	
	@Autowired
	private EmployeeService  employeeService;
	@PostMapping("/addEmp")
	public Employee addEMplEmployee(@RequestBody Employee employee) {
		return employeeService.addEmployee(employee);
	}
	
	@PutMapping("/updateEmp/{id}")
	public Employee updateEmployee(@PathVariable(value = "id") int id, @RequestBody Employee employee) {
		return employeeService.updateEmployee( employee,id);
	}
	
	@PutMapping("update")
	public Employee updateemp(@RequestBody Employee employee) {
		return employeeService.updateEmployee1(employee);
	}
	@GetMapping("/allEmp")
	public List<Employee> getAllEmployees(){
		return employeeService.getAllEmployees();
	}
	
	@DeleteMapping("/delete/{id}")
	public String getDeleteById(@PathVariable(value = "id") int id) {
		employeeService.deleteById(id);
		return "employee deleted successfully";
	}
	@GetMapping("/getByName/{name}")
	public List<Employee> getByName(@PathVariable (value="name") String name) {
		return employeeService.getEmployeeByName(name);
	}
	
	@GetMapping("/orderByName")
	public List<Employee> orderByName(){
		return employeeService.orderByName();
	}
	
	@GetMapping("/orderByNameAsc")
	public List<Employee> orderByNameAsc(){
		return employeeService.orderByNameByAsc();
	}
	
	@GetMapping("/startsWith/{name}")
	public List<Employee> stratsWith(@PathVariable(value = "name") String name){
		return employeeService.startsWith(name);
	}
	
	@GetMapping("/containing/{name}")
	public List<Employee> containing(@PathVariable (value = "name") String name){
		return employeeService.containing(name);
	}
	@GetMapping("/notContaining/{name}")
	public List<Employee> notContaining(@PathVariable (value = "name") String name){
		return employeeService.notContaining(name);
	}
	

}
