package com.sw409.studentlibrarydemo.repositories;

import org.springframework.data.repository.CrudRepository;

import com.sw409.studentlibrarydemo.models.Student;

public interface StudentRepository extends CrudRepository<Student, Integer>{

}
