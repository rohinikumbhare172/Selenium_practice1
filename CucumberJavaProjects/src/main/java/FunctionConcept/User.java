package FunctionConcept;

import java.util.Scanner;

public class User {

	public int getMarks(String studentName) {
		System.out.println("Getting the marks for :"+studentName);
		
		if(studentName.equals("snehal")) {
			return 100;
		
	}else if(studentName.equals("vijay")){
				return 101;
	} else if(studentName.equals("Rohini")) {
					return 102;
	}else if(studentName.equals("Naveen")) {
					return 103;
	} else {
							System.out.println("Student is not found.."+studentName);
							return 0;
						}
	}
				
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String m1= sc.nextLine();
		System.out.println(m1);
		
		User u1= new User();
		        
		
		
		
		

	}

}
 