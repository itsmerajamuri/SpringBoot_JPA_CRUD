package com.crud.repository;

import java.util.Collection;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crud.entity.Course;

public interface CourseRepo extends JpaRepository<Course, Integer> {

	public Course findByCoursename(String courseName);
	
	public List<Course> findByCoursenameIn(Collection<String> courseName);
}
