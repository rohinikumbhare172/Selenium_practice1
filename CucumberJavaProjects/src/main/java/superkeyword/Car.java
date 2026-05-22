package superkeyword;

public class Car {

	 public final int minSpeed =100;
	 
	 public Car() {
		 this(200);
		 System.out.println("Car--default const");
	 
	 }
	 
	 public Car(int a) {
		 System.out.println("Car- one parameter const.."+a);
	 }
		
	 public Car(double b) {
		 System.out.println("Car- one parameter const.."+b);
	 }
		 public Car(int a,int b) {
			 System.out.println("Two parameter const.."+a+b);
			 
	 }
		 
		 public void start(int a) {
			 System.out.println("Car--start");
			 
		 }

		 
	 }

