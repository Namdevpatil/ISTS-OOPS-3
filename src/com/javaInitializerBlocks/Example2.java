package com.javaInitializerBlocks;

public class Example2 {
	
	private String text;
	
	public Example2() {

		System.out.println("Hello Constructor");
		
	}
	
	//instance initializer block
	{
		System.out.println("Hello instance initializer block");
	}

	static
	{
		System.out.println("Hello static block-1");
	}
	
	static
	{
		System.out.println("Hello static block-2");
	}
	
}
