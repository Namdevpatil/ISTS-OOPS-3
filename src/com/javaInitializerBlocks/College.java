package com.javaInitializerBlocks;

public class College {
	
	//fields
	private int collegeCode;
	private String collegeName;
	private String collegeAddress;
	
	//constructor
	public College()
	{
		System.out.println("constructor");
	}
	
	//instance initializer block
	{
		System.out.println("instance initializer block");
	}

	public College(int collegeCode, String collegeName, String collegeAddress) {
		this.collegeCode = collegeCode;
		this.collegeName = collegeName;
		this.collegeAddress = collegeAddress;
	}

	@Override
	public String toString() 
	{
		return "College [collegeCode=" + collegeCode + ", collegeName=" + collegeName + ", collegeAddress="
				+ collegeAddress + "]";
	}
	
	

}
