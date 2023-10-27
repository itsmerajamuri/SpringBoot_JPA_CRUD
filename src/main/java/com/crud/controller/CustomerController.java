package com.crud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.crud.repository.CustomerRepo;

@RestController
public class CustomerController {
 
	
	@Autowired
	private CustomerRepo customerRepo;
	
	
	
	@DeleteMapping("/deleteCCustomerBy/{id}")
	public String deleteCustomer(@PathVariable(value="id") int id) {
		customerRepo.deleteById(id);
		return "deletedSuccessfully";
	}
}
