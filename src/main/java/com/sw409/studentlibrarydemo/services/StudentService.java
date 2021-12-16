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
	
	//CREATE --> POST student info and the list of their books
	public Student addStudent(Student stu) {
        stuList.add(stu);
		return stuRepo.save(stu);
    }

	//READ --> GET retrieves all students and their checked out books
	public List<Student> getAllStudents() {
		return (List<Student>) stuRepo.findAll();
	}

	//get books for specified stuid
	public Student getStudent(int id){
		return stuRepo.findById(id).get();
	}

	//public List<Student> getStudentBook(String book) {
	//	List<Student> bookList = new ArrayList<>(); //create new list of students (will only be a list of one) 
	//	for (int i=0; i<stuList.size(); i++) {
	//		if(bookList.get(i).getBooks().equals(book)) {
	//			bookList.add(stuList.get(i)); //add patient w specified illness to pList
	//		}
	//	}  return bookList;
	//}

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
