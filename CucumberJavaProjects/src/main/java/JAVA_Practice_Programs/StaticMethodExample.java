package JAVA_Practice_Programs;

public class StaticMethodExample {

	static void method1 () {
		System.out.println("this is static method");
			
	 }
	
	void method2() {
		System.out.println("this is Non-Static method");
	}

	public static void main(String[] args) {
		
	 method1(); //no need to create an abject for static method

	 StaticMethodExample s1=new StaticMethodExample();
	 s1.method2();
	}

}
