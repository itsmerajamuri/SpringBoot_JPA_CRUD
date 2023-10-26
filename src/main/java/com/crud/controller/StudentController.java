package com.crud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.crud.entity.Student;
import com.crud.service.StudentService;

@RestController
public class StudentController {

	@Autowired
	private StudentService studentService;
	
	@PostMapping("/addStud/{coursename}")
	public Student addStudent(@RequestBody Student student,@PathVariable(value = "coursename") List<String> courseNames) {
		return studentService.addStudent(student,courseNames);
	}
	
	@GetMapping("/allstudents")
	public List<Student> getAllStudents(){
		return studentService.getAllStudents();
	}
	
}
