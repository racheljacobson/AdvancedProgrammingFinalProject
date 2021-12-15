package com.sw409.studentlibrarydemo.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sw409.studentlibrarydemo.models.Student;
import com.sw409.studentlibrarydemo.repositories.StudentRepository;
 
@Service
public class StudentService {
	@Autowired
	StudentRepository stuRepo;

	List<Student> stuList = new ArrayList<>();
	
	//CREATE --> POST
	public Student addStudent(Student stu) {
        stuList.add(stu);
		return stuRepo.save(stu);
    }

	//READ --> GET
	public ArrayList<Student> getAllStudents() {
		return (ArrayList<Student>) stuRepo.findAll();
	}

	//UPDATE --> PATCH 
	public void updateStudent(Integer id, Student stu) {
		Student oldInfoStudent = stuRepo.findById(id).get(); //get student by id
		oldInfoStudent.setBooks(stu.getBooks()); //updates book list for that student
		stuRepo.save(stu);
	}

	//DELETE
	public void deleteStudent(Integer id) {
		stuRepo.deleteById(id); //deletes a student from the list 
	}



    

}
