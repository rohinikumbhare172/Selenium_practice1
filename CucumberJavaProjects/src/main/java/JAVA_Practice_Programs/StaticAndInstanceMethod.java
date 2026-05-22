package JAVA_Practice_Programs;

public class StaticAndInstanceMethod {

	public static void main(String[] args) {
		display();
		
		StaticAndInstanceMethod st=new StaticAndInstanceMethod();
		st.show();
	}
	static void display() {
	System.out.println("This is static method");
	}

	void show() {
	System.out.println("This is instance method ,have to create object ");
}


}


