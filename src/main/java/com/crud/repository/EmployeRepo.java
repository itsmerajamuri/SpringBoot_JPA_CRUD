package com.crud.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crud.entity.Employe;

public interface EmployeRepo extends JpaRepository<Employe, Integer>{

}
