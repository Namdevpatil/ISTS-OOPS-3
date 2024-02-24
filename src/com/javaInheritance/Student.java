package com.javaInheritance;


//sub/derived/child class
//Inheritance
public class Student extends Department{
	
	/*
	 * int id; 
	 * String name;
	 */
	double marks;	
	
	public Student() {
		id = 2020;
		name = "Ganesh";
		marks = 78.89;
	}

	public String getStudentDetails()
	{
		return "Student [id=" + id + ", name=" + name + ", marks=" + marks + "]";
	}	

}
