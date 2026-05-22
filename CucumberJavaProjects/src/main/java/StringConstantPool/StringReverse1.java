package StringConstantPool;

import java.util.Scanner;

public class StringReverse1 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter string ");
		
		String a=in.nextLine();
		System.out.println(a);
				
		StringBuilder sc=new StringBuilder(a);
		
		System.out.println(sc.reverse());
		
		in.close();
   }
}
