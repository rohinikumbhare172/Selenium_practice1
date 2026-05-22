package DynamicArrays;

import java.util.ArrayList;

public class ArrayListGenerics {

	public static void main(String[] args) {
		
		ArrayList<String> empList=new ArrayList<String>();  //virtual count VC=10, Physical count=0
		
		empList.add("Tom"); //arrraylist is not string datatype
		empList.add("Vijay");
		empList.add("Peter");
		empList.add("Test");
		empList.add("Pooja");
		empList.add("Rohini");
		
		empList.ensureCapacity(30);
		
		System.out.println(empList.size()); //6
		System.out.println(empList);
		
		//iterate the arraylist: using for loop:
		
for(int i=0;i<=empList.size()-1;i++) {
		System.out.println(empList.get(i));
	}

		//using for each loop
	for(String e: empList) {
		System.out.println(e);
		
	}
	
	System.out.println("-----------------------");
	ArrayList<Integer> marksList= new ArrayList<Integer>(); //VC=10,PC=0
	marksList.add(100); //0
	marksList.add(300); //1
	
	ArrayList<Double> empSalaryList= new ArrayList<Double>(); //VC=10,PC=0
	empSalaryList.add(12.33);
	empSalaryList.clear();
	System.out.println(empSalaryList);
	
	//emp data:String ,int, double, isActive, char
	ArrayList<Object> empDataList= new ArrayList<Object>(); //VC=10,PC=0
	empDataList.add("Rohini");
	empDataList.add(20.22);
	empDataList.add(true);
	empDataList.add('r');
	empDataList.add(marksList);
	
	
	for(Object e: empDataList) {
		System.out.println(e);
	}
	
	System.out.println(empDataList); 
	
		
}
}