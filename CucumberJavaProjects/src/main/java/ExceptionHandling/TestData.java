package ExceptionHandling;

public class TestData {

	public static void main(String[] args) {
		String data = null;
		if (data==null)
		{
			throw new RuntimeException("DATANOTFOUNDEXCEPTIONO");
		}
		System.out.println(data);
		System.out.println("Bye");
		
	}

}
