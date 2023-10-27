package com.crud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.crud.entity.Address;
import com.crud.entity.Employee;
import com.crud.repository.AddressRepo;

@RestController
public class AddressController {

	@Autowired
	private AddressRepo addressRepo;
	

    
	@PostMapping("/addAddress")
	public Address addAddress() {
       Address address=new Address("hhh", "tttttt");
       address.setEmployee(new Employee("pavan", 9000000, 700000));
       
		Employee employee = address.getEmployee();
		employee.setAddress(address);


		return addressRepo.save(address);
	}

	@GetMapping("/allAdress")
	public List<Address> getAllAdress() {
		return addressRepo.findAll();
	}
	@DeleteMapping("/del")
	public String deleteById(@RequestParam(value = "id",required = true) int id ) {
		
		 addressRepo.deleteById(id);
		return "deleted successfully";
	}

}
