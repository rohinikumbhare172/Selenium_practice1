package ExceptionHandling;

public class Employee {
	
	String name;
	
	public static void testing() {
	System.out.println("A");
	System.out.println("A2");
	System.out.println("A3");
	
	try {
		int i=9/0; //AE
		System.out.println("Hello");
		Employee obj=new Employee();
		
		obj=null;
		System.out.println(obj.name);  //NPE(Null pointer exception)
		
	}
	
	catch(NullPointerException e) {
		System.out.println("NPE is coming...");
		e.printStackTrace();
	}
	
	catch(ArithmeticException e) {
		System.out.println("AE is coming..");
		e.printStackTrace();
	}
		
	catch(Exception e) {
		System.out.println("Some exception is coming..");
		e.printStackTrace();
	} 
	
	catch(Throwable e) {
		System.out.println("Some exception os coming 2");
		e.printStackTrace();
		
	}
	System.out.println("Bye...!!!");
		
	}
	
	public static void main(String[] args) {
		
		testing();
		
	}
	
	

}
