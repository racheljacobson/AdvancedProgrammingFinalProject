package com.sw409.studentlibrarydemo.models;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
 
@Entity(name = "studentTable")

public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Integer stuid;
	String name; //do we want first and last names?
	
	@OneToMany(mappedBy = "student")
	private List<Library> books;

	public Integer getStuid() {
		return stuid;
	}

	public void setStuid(Integer stuid) {
		this.stuid = stuid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Library> getBooks() {
		return books;
	}

	public void setBooks(List<Library> books) {
		this.books = books;
	}
	
	public Student() {
		
	}
	
	public Student(Integer stuid, String name, List<Library> books) {
		this.stuid = stuid;
		this.name = name;
		this.books = books;
	}

}
