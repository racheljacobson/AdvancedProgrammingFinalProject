package com.sw409.studentlibrarydemo.controllers;

//import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sw409.studentlibrarydemo.models.Student;
import com.sw409.studentlibrarydemo.services.StudentService;

@RestController 
@RequestMapping("api/student")
public class StudentController {
	@Autowired
	StudentService stuService;

	//CREATE object--> POST mapping
	@PostMapping("api/student") 
	public Student addStudent(@RequestBody Student stu) {
		return stuService.addStudent(stu);
	}

	//READ --> 
	//GET mapping to get all students
	@GetMapping("api/student")
	public List<Student> getAllStudents() { //array list or list ?
		return stuService.getAllStudents();
	}

	//GET mapping to get student for specified bookid
	@GetMapping("api/student/{ISSD}") 
	private Student getStudent(@PathVariable("ISSD") int ISSD){
		return stuService.getStudent(ISSD);
	}

	//UPDATE --> PATCH mapping
	@PatchMapping("api/student/{stuid}")
	public void updateStudent(@PathVariable("stuid") Integer id, @RequestBody Student stu){
		stuService.updateStudent(id, stu);
	}

	//DELETE --> DELETE mapping
	@DeleteMapping("api/student/{stuid}")
	public void deleteStudent(@PathVariable("stuid") Integer id) {
		stuService.deleteStudent(id);
	}


}
