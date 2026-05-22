package StringConstantPool;

public class StringImmutable {

	public static void main(String[] args) {
		String s="JAva";
		s= s+"testing";
		System.out.println(s);
		
		System.out.println("Hello"+"Autoomation"+100_12.33);
		
		//String buffer vs String builder
		System.out.println("------------------------------------");
		
		System.out.println("String is immutable below example");
		
		String str="Automation test engineer";
		str.concat("Testing");
		System.out.println(str);
		System.out.println("index of example:" +str.indexOf("o"));
		System.out.println("charAt method ex: " +str.charAt(9));
		
		
		//Trim
		String tr= "  rohini kumbhare ,chirag my son,my shona beta.     ";
		  System.out.println(tr);
		String trim1= tr.trim();
		System.out.println(trim1);
		
		//String Builder
		System.out.println("-----------String Builder-------");
		
		System.out.println("String builder example is below ");
		StringBuilder sb=new StringBuilder("   testing  ");
		System.out.println(sb);
		System.out.println(sb.length());
		
		

	}

}
