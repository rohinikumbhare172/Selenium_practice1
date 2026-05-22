package com.java.program;

//the static method does not have
//access to the instance variable


public class StaticMethods {
	
	static int a=40;
	int b=50;
	
	void simpleDisplay()
	{
		System.out.println(a);
		System.out.println(b);
	}
	
	//Static method declaration
 static void staticDisplay()
 {
	 System.out.println(a);
 }
	public static void main(String[] args) {
		StaticMethods m1=new StaticMethods();
		m1.simpleDisplay();
		
		staticDisplay();

	}

}
