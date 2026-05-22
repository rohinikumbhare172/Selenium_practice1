package com.java.program;

public class StaticMethod2 {
	
	static int num=100;
	static String str="GeeksforGeeks";
	
	//Static Method
	
	static void display()
	{
		System.out.println("Static num is:"+num);
		System.out.println("Static String is:"+str);
		
	}
	
	//non-static method
	void nonstatic() {
		display();
	}
	public static void main(String args[]) {
		StaticMethod2 obj=new StaticMethod2();
		obj.nonstatic();
		
		StaticMethod2.display();
		}
}


//In a static environment, 
// this and super are not allowed to be used.
