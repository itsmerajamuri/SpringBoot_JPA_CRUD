package com.crud.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.crud.entity.Course;
import com.crud.entity.Student;
import com.crud.repository.CourseRepo;

@RestController
public class CourseController {
   
	@Autowired
	private CourseRepo courseRepo;
	@PostMapping("/addCourse")
	public Course addCourse(@RequestBody Course course) {
		List<Course> courses=new ArrayList<>();
		courses.add(course);
		List<Student> students=course.getStudents();
		for(Student student:students) {
			
			student.setCourses(courses);
		}
		return  courseRepo.save(course);
	}
	
	@GetMapping("/allCourses")
	public List<Course> getAllCourses(){
		return courseRepo.findAll();
	}
}
