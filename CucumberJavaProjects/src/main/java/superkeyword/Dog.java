package superkeyword;

public class Dog extends SuperKeyword{
		
		 String name="Dog";
	    void printName()
	    {
	    	System.out.println(name);
			System.out.println(super.name);
	    }
		public static void main(String args[]) {
			
			Dog d=new Dog();
			d.printName();
	    }
	}
	

