package com.sw409.studentlibrarydemo.services;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sw409.studentlibrarydemo.models.Student;
import com.sw409.studentlibrarydemo.repositories.StudentRepository;

@Service
public class StudentService {
	@Autowired
	StudentRepository stuRepo;
	public ArrayList<Student> getAllStudents() {
		return (ArrayList<Student>) stuRepo.findAll();
	}

}
