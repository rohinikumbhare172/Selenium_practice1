package JAVA_Practice_Programs;


public class StringReverse {
	public static void main(String args[])
	{
		System.out.println("This is reverse string program");
		String str1= "rohini vilas mane";
		 StringBuilder str2=new StringBuilder(str1);
		 
		 String str3= str2.reverse().toString();
		 System.out.println(str3 );
	}
	}

