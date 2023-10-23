package com.crud.service;

import java.util.ArrayList;
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
	
	public Student addStudent(Student student,String name) {
	     Course course1= courseRepo.findByCoursename(name);
	    
		List<Course> courses=new ArrayList<>();
		courses.add(course1);
		student.setCourses(courses);
		
		return studentRepo.save(student);
	}
}


