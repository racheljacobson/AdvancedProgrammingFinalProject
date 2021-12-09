package com.sw409.studentlibrarydemo.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="libraryTable")
public class Library {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer ISSD; //ISSD is book id
	String title;
	private Integer days; //how many days left until due date
	
	@ManyToOne
	@JsonIgnore
	private Student student;

	public Integer getBookid() {
		return ISSD;
	}

	public void setBookid(Integer ISSD) {
		this.ISSD = ISSD;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}
	
	public Library(Integer ISSD, String title, Integer days) {
		
		this.ISSD = ISSD;
		this.title = title;
		//this.student = student;
		this.days = days;
	}

	public Integer getDays() {
		return days;
	}

	public void setDays(Integer days) {
		this.days = days;
	}

	

}
