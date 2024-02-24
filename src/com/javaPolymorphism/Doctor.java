package com.javaPolymorphism;

public class Doctor 
{
	
	private String doctorName;
	private String doctorSpecialization;
	
	
	//default constructor
	public Doctor() 
	{
		doctorName = "abc";
		doctorSpecialization="asd";
	}

	//parameterized constructor
	public Doctor(String doctorName, String doctorSpecialization) {
		this.doctorName = doctorName;
		this.doctorSpecialization = doctorSpecialization;
	}

	//method
	public String getDoctor() 
	{
		return "Doctor [doctorName=" + doctorName + ", doctorSpecialization=" + doctorSpecialization + "]";
	}

}
