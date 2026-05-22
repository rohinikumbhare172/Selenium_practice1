package ClassObjectConcept;

public class Employee {
	
	String name;
	int age;
	int empID;
	String deptName;
	char gender;
	boolean isPermanent;
	double salary;

	public static void main(String[] args) {
		//class : Category ,blueprint --fields/class variable/instance variable vars
		//Object/instance: physical entity-properties
		//Objects are non-primitive - no fixed memory 
		
		
		//create the object :using new keyword
		//Employee -class name
		//e1 -- object/ref name/-- store in stack memory
		//new Employee -- actual object stored in HEAP memory.
		
		Employee e1=new Employee();
		
		e1.name="Rohini";
		e1.age=30;
		e1.deptName="ENTC";
		e1.empID=122345;
		e1.gender='F';
		e1.isPermanent=true;
		e1.salary=102310;
		
		System.out.println(e1.age);
		System.out.println(e1.name);
		System.out.println(e1.deptName);
		
		Employee e2=new Employee();
		e2.age=45;
		System.out.println(e2.name);
		
		//
		
		
		
	}

}
