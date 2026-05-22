package inheritance;

public class Employee extends Person{
	private int empno;
	private double salary;
	public Employee() {
		super();
		this.empno=0;
		this.salary=0.0;
		
	}

	public Employee(String name, String address, int age, int empno, double salary)
	{
		super(name,address,age);
		this.empno=empno;
		this.salary=salary;
	}
	
	@Override
		
	public void display() {

		super.display();
		System.out.printf("Employee no:%d\n Salary:%.2f\n",empno,salary);
		
		
	}
	
		
}
