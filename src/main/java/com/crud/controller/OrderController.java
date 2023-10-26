package com.crud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.crud.repository.OrderRepo;

@RestController
public class OrderController {

	@Autowired
	private OrderRepo orderRepo;
	
	@DeleteMapping("/deletedOrderByid/{id}")
	public String deleteOrderById(@PathVariable(value = "id") int id) {
		orderRepo.deleteById(id);
		return "order deleted Successfully";
	}
}
