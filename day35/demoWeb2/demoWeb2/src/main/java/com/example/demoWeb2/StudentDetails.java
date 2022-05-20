package com.example.demoWeb2;

import org.springframework.beans.factory.annotation.Autowired;

public class StudentDetails {
	private Student stud;
	
	@Autowired
	public StudentDetails(Student stud) {
		this.stud=stud;
	}

	void setData() {
		stud.setId(100);
		stud.setName("shweta");
		
	}
	void shoData() {
		System.out.println(stud.getId());
		System.out.println(stud.getName());
	}
}
