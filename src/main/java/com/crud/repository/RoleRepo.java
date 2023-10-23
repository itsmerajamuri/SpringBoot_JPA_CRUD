package com.crud.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crud.entity.Role;

public interface RoleRepo extends JpaRepository<Role, Integer>{
	
	public List<Role> findByType(String type);

}
