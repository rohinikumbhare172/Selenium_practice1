package StringConstantPool;

public class DataConversion {

	public static void main(String[] args) {
		//String to int:
		
		String x="100";
		System.out.println(x+20);
		
		//string to int using wrapper class (Integer class) using Integer-parseInt
		int i= Integer.parseInt(x); //string to int
		System.out.println(i+20);
		
		
		//not covert alphanumeric into int,gives exception
		
		/* String y="100A";
		int j=Integer.parseInt(y); //NumberFormatException
		System.out.println(j+20); */
		
		
		String t= "100.12";
		System.out.println(t+20);
		
		String isActive="true";
		boolean isAct =Boolean.parseBoolean(isActive);
		if(isAct) {
			System.out.println("login to app");
		}
		
		//int to string
		int p=100;
		String p1= p+"";
		System.out.println(p1);
		String p2=String.valueOf(p);
		System.out.println(p2.length());
		String p3= String.valueOf(12.2);
		System.out.println(p3+20);
		
		boolean b=true;
		String flg=  String.valueOf(b);
		System.out.println(flg+100);
		
		
		//Byte range
		System.out.println(Byte.MAX_VALUE);
		System.out.println(Byte.MIN_VALUE);
		
// short range 
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
	}

}
