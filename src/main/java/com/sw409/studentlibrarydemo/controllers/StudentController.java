package com.sw409.studentlibrarydemo.controllers;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sw409.studentlibrarydemo.models.Student;
import com.sw409.studentlibrarydemo.services.StudentService;

@RestController 
public class StudentController {
	@Autowired
	StudentService stuService;
	@GetMapping("api/student")
	public ArrayList<Student> getAllStudents() {
		return stuService.getAllStudents();
	}

}
