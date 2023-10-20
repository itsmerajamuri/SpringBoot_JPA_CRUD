package com.crud.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crud.entity.Employee;

public interface EmployeeRepo extends JpaRepository<Employee, Integer>{
	
	//select * from student where name ="?"
	
	public List<Employee> findByName(String name);
	
	public List<Employee> findByOrderByNameDesc();

	public List<Employee> findByOrderByName();
	
	public List<Employee> findByNameStartingWith(String name);
	
	public List<Employee> findByNameContaining(String name);
	
	public List<Employee> findByNameNotContaining(String name);
	
	

}
