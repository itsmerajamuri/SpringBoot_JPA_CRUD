package com.crud.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.entity.Role;
import com.crud.repository.RoleRepo;

@Service
public class RoleService {
	
	@Autowired
	private RoleRepo repo;
	
	public Role addRole(Role role) {
		return repo.save(role);
	}
	
	public List<Role> getAll(){
		return repo.findAll();
	}

}
