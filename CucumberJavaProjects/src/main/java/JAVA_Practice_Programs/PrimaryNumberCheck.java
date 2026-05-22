package JAVA_Practice_Programs;

public class PrimaryNumberCheck {

	public static void main(String[] args) {
	
		System.out.println(primaryNumber(19));
		System.out.println(primaryNumber(54));

	}
		public static boolean primaryNumber(int i) {
		if(i==1 || i==0) {
			return false;
		}
		if(i==2) {
			return true;
		}
		
		for(int n=2;n<=i/2;n++) {
			if(i % n == 0) {
				return false;
			}
			}
			return true;

	}

}
