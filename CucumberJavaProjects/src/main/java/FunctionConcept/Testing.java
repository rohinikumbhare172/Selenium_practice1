package FunctionConcept;

public class Testing {

	
	public void getMail() {
		System.out.println("get mail");
	}
	 
	public static void sendMail() {
		System.out.println("Send Mail");
	}
	
	public static void main(String[] args) {
		 Testing t1 = new Testing ();
		 
		 //calling non-static method : create the object 
		 t1.getMail();
		 
		 //how to call static function 
		 
		 //1.using the class name:
		 Testing.sendMail();
		 
		 //2.call it directly:
		 sendMail();
		 
		 //3.using the object ref name:
		// t1.sendMail(); //The static method sendMail() from the type Testing should be accessed in a static way//
		 
		 t1.getMail();
		 
		
	}

}
