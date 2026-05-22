package JAVA_Practice_Programs;

public class ConstructorExample {

	ConstructorExample(){
		System.out.println("this is no-arg constructor");
		int age=10;
		String name="rohini";
		int employee_Id=102121;
				
	}
	
	ConstructorExample(int age,String nmae,int employee){
		System.out.println("this as Arg constructor");
	}
	void display() { 
		int age;
		String name;
		int employee_Id;
	System.out.println("display method: " +age+ "name"+name+ "employee_Id" +employee_Id);
	}
	
	public static void main(String[] args) {
		ConstructorExample cs=new ConstructorExample();
		cs.display();

	}

}
