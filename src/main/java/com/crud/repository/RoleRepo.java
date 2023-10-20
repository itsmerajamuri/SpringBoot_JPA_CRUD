package com.crud.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crud.entity.Role;

public interface RoleRepo extends JpaRepository<Role, Integer>{

}
