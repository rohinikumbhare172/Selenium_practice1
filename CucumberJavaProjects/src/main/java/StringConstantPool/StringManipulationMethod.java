package StringConstantPool;

public class StringManipulationMethod {
	
		public static void main(String args[]) {
		String s1="I love india and  my favourite state is maharastra";
		String s2="    My name is \"rohini\"";
		
	
		System.out.println(s1);
		System.out.println(s2);
		
		//Concatenation using + and concat()
	
		System.out.println(s1+s2); //+operator
		
		String s3 = s1.concat(s2);
		System.out.println(s3);
		
		System.out.println("------------------------");
		
		//substring
		
		String s4= s1.substring(7);
		System.out.println(s4);
		
		// Extract a substring (from index 7  up to, but not including, index 15)
		String s5 = s1.substring(7, 15);
		System.out.println(s5);
		
		CharSequence s6= s1.subSequence(3, 14);
		System.out.println(s6);
		
		
	 char arr= s1.charAt(14); 
	 System.out.println(arr);
	 
	 //trim
	String arr1= s2.trim();
	System.out.println(arr1);
	
	//uppercase
	String s7=s1.toUpperCase();
	System.out.println(s7);
	
	//lowercase
	String s8=s2.toLowerCase();
	System.out.println(s8);
	
	 
	 //trim
	 int a= s1.length(); //white space is not calculated for length()
	 System.out.println(a);
	 
	 int arr2= s2.trim().length();
	 System.out.println(arr2);
	 
	 //contains
	 
	boolean s10= s1.contains("abc");
	System.out.println(s10);
	
	boolean s11=s2.contentEquals(s7);
	System.out.println(s11);
	
	System.out.println("I love \"india\" very much");
	 
	 
	 
	}

} 