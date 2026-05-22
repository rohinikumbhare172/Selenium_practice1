package StringConstantPool;

public class ImmutableStringExample {

	public static void main(String[] args) {
		String originalString="JAva";
		System.out.println("Original String:" +originalString);
		String modifiedString = originalString.concat("programming");
		System.out.println(modifiedString );
		System.out.println("After modofication original string:"+originalString);
		String upperCase=originalString.toUpperCase();
		System.out.println(upperCase);
		int ch=originalString.indexOf("A");
		System.out.println(ch);

	}

}
