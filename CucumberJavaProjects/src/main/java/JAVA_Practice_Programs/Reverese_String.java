package JAVA_Practice_Programs;

public class Reverese_String {

	public static void main(String[] args) {
		String str= "Rohini Mane";
		System.out.println(str);
		StringBuilder sb =new StringBuilder(str);
		sb.reverse();
		String reversed =sb.toString();
		System.out.println(reversed);
		
		}

}
