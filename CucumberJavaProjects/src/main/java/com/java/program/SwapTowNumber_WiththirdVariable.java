package com.java.program;

import java.util.Scanner;

public class SwapTowNumber_WiththirdVariable {

	public static void main(String[] args) {
	 Scanner sc= new Scanner(System.in);
	 System.out.println("Enter first number a = ");
	 int a = sc.nextInt();
	 
	 System.out.println("Enter Second Number b=");
	 int b= sc.nextInt();
	 
	 int c=a;
	 a=b;
	 b=c;
	 
	 System.out.println("Nubers after Swappinng a= "+a+" and b= "+b);
	 sc.close();
	}
 
}
