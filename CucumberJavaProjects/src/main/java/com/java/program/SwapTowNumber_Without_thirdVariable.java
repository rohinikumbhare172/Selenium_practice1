package com.java.program;

import java.util.Scanner;

public class SwapTowNumber_Without_thirdVariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter First Number");
		int x= sc.nextInt();
		
		System.out.println("Enter Second Number");
		int y=sc.nextInt();
		
		System.out.println("Numbers to Swap x= "+x+"2nd Number y= "+y);
		
		x= x+y;
		y=x-y;
		x=x-y;
		
		System.out.println("Numbers after Swap x= "+x+"2nd Number y= "+y);
		
		sc.close();
	}

}
