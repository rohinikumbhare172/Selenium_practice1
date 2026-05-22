package inheritance;

public class Person {
	private String name,address;
	private int age;
	
	//default constructor
	public Person() {
		this.name="";
		this.address="pppppp"; 
		this.age=0;
		} 
	
	// parameterized constructor
	public Person(String name,String address,int age) {
		this.name=name;
		this.address=address;
		this.age=age;
		}
		
	public void display() {
		System.out.println("This is parent method");
		System.out.println("name:"+ name+ " address:" +address+ " and age is :"+age);
		
	}
	
}
