package com.javaPolymorphism;

//super/base/parent class
public class Department 
{
	
	//fields
	
	int id;
	String name;
	
	public Department() {
		id = 3039;
		name = "CSE";
	}

	public String getDetails() 
	{
		return "Department [id=" + id + ", name=" + name + "]";
	}	
	

}
