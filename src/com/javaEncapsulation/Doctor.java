package com.javaEncapsulation;

public class Doctor 
{

	//fields
	private String doctorName;
	private String doctorSpecialization;
	
	//constructor overloading
	//default constructor
	public Doctor() 
	{
		doctorName = "abc";
		doctorSpecialization="asd";
	}

	//parameterized constructor
	
	public Doctor(String doctorName) 
	{
		this.doctorName = doctorName;
	}
	
	public Doctor(String doctorName, String doctorSpecialization) 
	{
		this.doctorName = doctorName;
		this.doctorSpecialization = doctorSpecialization;
	}

	//method
	public String getDoctor() 
	{
		return "Doctor [doctorName=" + doctorName + ", doctorSpecialization=" + doctorSpecialization + "]";
	}

}
