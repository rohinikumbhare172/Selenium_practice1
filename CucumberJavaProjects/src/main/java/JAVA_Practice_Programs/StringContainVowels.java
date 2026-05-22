package JAVA_Practice_Programs;

public class StringContainVowels {

	public static void main(String[] args) {
		System.out.println(StringContainVowel("Hello"));
		System.out.println(StringContainVowel("TVKDG"));
	}

	private static boolean StringContainVowel(String input) {
		return input.toLowerCase().matches(".*[aeiou].*");
	}

}
