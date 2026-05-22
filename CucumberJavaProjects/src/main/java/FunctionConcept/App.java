package FunctionConcept;

public class App {
	
	public static void t1(){
		System.out.println("This is t1 method");
		App.t2();
		
		System.out.println("-----in  t1()-------");
	}
	
	public static void t2(){
		System.out.println("t2 method");
		 System.out.println("----in t2() --------");
	}
	
	public static void t3() {
		System.out.println("t3 Method");
		
	}
	
	public void m1(){
		System.out.println("m1 Non-static method");
		
	}
	public void m2() { 
	System.out.println("m2- non-static");
	m1();
	}
	
	public void m3() {
		System.out.println("m3- non-static");
		App.t3(); // NS calling static method
	}
	
	

	public static void main(String args[]) {
		App a=new App();
		t1();
		a.m1();
		a.m2();
		a.m3();   //NS calling by giving object reference
		t3();
		
		//S --> S : use class name
				//NS --> NS : direct calling
				//NS --> S: use class name
				//S --> NS: use class object ref name
				
	}

	
	
	
}
