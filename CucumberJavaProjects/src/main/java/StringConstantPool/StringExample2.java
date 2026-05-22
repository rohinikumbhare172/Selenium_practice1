package StringConstantPool;

public class StringExample2 {

	public static void main(String[] args) {
		String s1=" Start , practice and or java jnd selenium ";
		System.out.println(s1.endsWith("v")); //false
		System.out.println(s1.endsWith("selenium"));  //false
		
		// indexOf function
		
		System.out.println(s1.indexOf("java"));
		System.out.println(s1.indexOf("j",4));
		
		String splite[]=s1.split("j");
		for(String w:splite) {
			System.out.println(w);
		}
		
		//replace
		String replaceString=s1.replaceAll("and", "fg");
		System.out.println(replaceString);
		
		//trim - used to remove white spaces 
		System.out.println(s1.trim() + "Techomanegirial");
		System.out.println(s1+ "techno");
		
		//to lower ,to upper
		System.out.println(s1.toLowerCase());
		System.out.println(s1.toUpperCase());
		
		//length
		System.out.println(s1.length());
		
		System.out.println(s1.concat(" rohini is practicing"));
		System.out.println(s1);
	}

}
