package superkeyword;

public class BMW extends Car {
	
	public final int minSpeed=200;
	public BMW() {
		System.out.println("BMW--default");
	}
	
	public BMW(int a) {
		super(10.18);
		System.out.println("BMW__one parameter const");
	
	}
	
@Override
public void start(int b) {
		System.out.println("BMW start");
	}
}
