package JAVA_Practice_Programs;

public class Constructor2 {
	
	//data member of the class
	String name;
	int id;
	
	//parameterized constructor
	Constructor2(String name1,int id1)
	{
		this.name = name1;
		this.id=id1;
	}

	//Method to display object data
	void display() {
		System.out.println("Name :"+name + " and ID:"+id); 
	}
	
	public static void main(String[] args) {
		
		Constructor2 c=new Constructor2("Rohini",31);
		c.display();
		

	}

}
