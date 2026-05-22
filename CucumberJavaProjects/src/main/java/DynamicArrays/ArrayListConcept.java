package DynamicArrays;

import java.util.ArrayList;

public class ArrayListConcept {

	public static void main(String[] args) {
		//ArrayList -- default class n java
		//order based collection-it maintains the index
		ArrayList ar=new ArrayList();
		System.out.println(ar.size()); //0
		
		ar.add(100); //0
		ar.add(200); //1
		
		System.out.println(ar.size()); //2
		ar.add(300);
		ar.add(400);
		
		System.out.println(ar.size()); //4
		
	}

}
