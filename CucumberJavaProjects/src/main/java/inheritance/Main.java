package inheritance;

public class Main {
	public static void main(String args[]) 
	{
		Person p1=new Person("p1","jkjka1",20);
		Person p2 = new Person("bengaluru","koyna",20);
		p1.display();
		p2.display();
		
		Employee e1 =new Employee("rohini0","koyna",30,90,40989.12);
		e1.display();
		}

}
