package oops.inheritance;

public class BMW extends Car{
	
	//Method Overriding: when we have a method in the parent class and the same method in the child class:
		//1. with the same name
		//2. with the same number of parameters
		//3. with the same return type
		//Poly+Morphism: dynamic (Run time)
		
	@Override
	public void start()
	{
		System.out.println("Start BMW Car");
		
	}
	
	public void autoParking()
	{
		System.out.println("Auto-Parking");
	}
	

}
