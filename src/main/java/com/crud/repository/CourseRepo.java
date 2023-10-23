package com.crud.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crud.entity.Course;

public interface CourseRepo extends JpaRepository<Course, Integer> {

	public Course findByCoursename(String courseName);
}
