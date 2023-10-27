package com.crud.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crud.entity.Project;

public interface ProjectRepo extends JpaRepository<Project, Integer> {

}
