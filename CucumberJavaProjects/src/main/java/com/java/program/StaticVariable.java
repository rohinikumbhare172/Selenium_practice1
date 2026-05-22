package com.java.program;

public class StaticVariable {
	
	static int age;

	public static void main(String[] args) {
		
		StaticVariable.age=31;
		
		System.out.println("s1 age is ="+StaticVariable.age);
		
		//StaticVariable s2=new StaticVariable(); -- no need to create the object ,we can directly call the value using classname.  
		StaticVariable.age=60;
		System.out.println("s2 age is ="+StaticVariable.age);
		
		System.out.println(age);
		
		age=44;
		System.out.println(age);

	}

}

