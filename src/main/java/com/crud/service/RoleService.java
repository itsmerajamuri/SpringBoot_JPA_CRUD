package com.crud.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.entity.Role;
import com.crud.repository.EmployeeRepo;
import com.crud.repository.RoleRepo;

@Service
public class RoleService {

	@Autowired
	private RoleRepo roleRepo;
	
	
	@Autowired
	private EmployeeRepo employeeRepo;
	public Role addRole(Role role) {
		return roleRepo.save(role);
	}
}
