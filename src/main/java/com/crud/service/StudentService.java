package com.crud.service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.entity.Course;
import com.crud.entity.Student;
import com.crud.repository.CourseRepo;
import com.crud.repository.StudentRepo;

@Service
public class StudentService {

	@Autowired
	private StudentRepo studentRepo;
	
	@Autowired
	private CourseRepo courseRepo;
	
	public Student addStudent(Student student,List<String> courseNames) {
		/*
		 * Course course1= courseRepo.findByCoursename(name);
		 * 
		 * List<Course> courses=new ArrayList<>(); courses.add(course1);
		 */
		
		List<Course> courses= courseRepo.findByCoursenameIn(courseNames);
		student.setCourses(courses);
		
		return studentRepo.save(student);
	}
	
	public List<Student> getAllStudents(){
		return studentRepo.findAll();
	}
}


