package variable;

class InstanceVariable {

	public int age=19;
	public String name;
	
	public InstanceVariable()
	{
		this.name=" Rohini Mane";
		
	}
}

class Main{
	public static void main(String[] args) {
		InstanceVariable var =new InstanceVariable();
		System.out.println("Name =" +var.name);
		
	}

}

