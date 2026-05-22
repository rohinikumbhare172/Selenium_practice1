package com.java.program;

public class InstanceVariable {
	
	public String name;
	public int age=19;

	//default constructor
	
	public InstanceVariable()
	{
		this.name="rohini";
		
	}
	
	public static void main(String[] args) {
		InstanceVariable obj=new InstanceVariable();
		System.out.println("Student name is: "+obj.name);
		System.out.println("Student age is : "+obj.age);
	
	}
		
}
