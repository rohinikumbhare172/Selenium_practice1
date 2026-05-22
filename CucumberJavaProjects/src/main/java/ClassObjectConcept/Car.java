package ClassObjectConcept;

public class Car {
	
	String name;
	String licenseNumber;
	double price;
	String chasisNumber;
	String color;
	String model;
	static final int wheels = 4;

	public static void main(String[] args) {
			
		Car c1 = new Car();
		c1.name = "BMW";
		c1.licenseNumber = "BMW12121";
		c1.price = 50.55;
		c1.chasisNumber = "BMWCH12121";
		c1.color = "Black";
		c1.model = "X3";
		//c1.wheels = 4; //warning --- not a good practice
		
		System.out.println(c1.name + " "+ c1.licenseNumber);
				
		//how to access the static vars:
		//1. using the class name:
		System.out.println(Car.wheels);
		
		//2. call directly:
		System.out.println(wheels);
		
		//3. using object ref name:
        System.out.println(Car.wheels);//The static field Car.wheels should be accessed in a static way
		
		System.out.println(c1.name + " "+ c1.licenseNumber + " "+ c1.price + " "+ c1.chasisNumber  + " "+ c1.color + " " + c1.model + " "+ Car.wheels);
		
		System.out.println("-------------------");
		
		Car c2 = new Car();
		c2.name = "AUDI";
		c2.licenseNumber = "AUDI12121";
		c2.price = 52.55;
		c2.chasisNumber = "AUDICH12121";
		c2.color = "White";
		c2.model = "A6";
		
		System.out.println(c2.name + " "+ c2.licenseNumber + " "+ c2.price + " "+ c2.chasisNumber  + " "+ c2.color + " " + c2.model + " "+ Car.wheels);

		System.out.println("-------------------");

		Car c3 = new Car();
		c3.name = "Honda";
		c3.licenseNumber = "Honda12121";
		c3.price = 15.55;
		c3.chasisNumber = "HONDACH12121";
		c3.color = "Red";
		c3.model = "city";
		
		System.out.println(c3.name + " "+ c3.licenseNumber + " "+ c3.price + " "+ c3.chasisNumber  + " "+ c3.color + " " + c3.model + " "+ Car.wheels);


	} 

}
