package MapConcept;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class HashMapConcept {

	public static void main(String[] args) {
		//Key-Value pair
		//name:mackbook pro
		//price:1000
		//stock :available
		//Non-order based collection
		
		//HAshmap class (Key value)(parent) ---->LinkedHAshMap(Class) (child)
		HashMap<String, Integer> empMap= new HashMap<String, Integer>();
		// we have to use put method to add data
		
		empMap.put("Tom", 10);
		empMap.put("xyz", 150);
		empMap.put("abc", 1450);
		empMap.put("pqr", 10);
		empMap.put(null, 580);
		empMap.put(null, 980);
	
		//passing the value you can get the value
		System.out.println(empMap.get("Tom"));
		
		System.out.println("-------------------");
		
		System.out.println("HashMap is Non-order Base collection,No Indexing");

		System.out.println(empMap);
		System.out.println("-------------------");

		
		//LinkedHashMap<String, Integer> empMap= new LinkedHashMap<String, Integer>();
		
		LinkedHashMap<String, Integer> empMap1= new LinkedHashMap<String, Integer>();

		empMap1.put("Tom", 10);
		empMap1.put("xyz", 150);
		empMap1.put("abc", 1450);
		empMap1.put("pqr", 10);
		empMap1.put(null, 580);
		empMap1.put(null, 980);
	
		//passing the value you can get the value
		System.out.println(empMap1.get("Tom"));
		
		System.out.println("-------------------");
		
		System.out.println("LinkedHashMap is order Base collection");
		System.out.println(empMap1);
		System.out.println("-------------------");
		
		//3.TreeMap
		TreeMap<String, Integer> empMap2= new TreeMap<String, Integer>();

		empMap2.put("Tom", 10);
		empMap2.put("xyz", 150);
		empMap2.put("abc", 1450);
		empMap2.put("pqr", 10);
		//empMap2.put(null, 580); // in tree map null keys are not allowed
		//empMap2.put(null, 980);
	
		//passing the value you can get the value
		System.out.println(empMap2.get("Tom"));
		
		System.out.println("-------------------");
		
		
		System.out.println("TreeMap null key not allowed,sort the keys");
		System.out.println(empMap2);
		System.out.println("-------------------");
		
		//Top-Casting 
		
		Map<String,Integer> empMap3= new HashMap<String, Integer>();
	
		//collision in storing the data is hashmap -same index and multiple pairs are their then it will create new mode called as -linkedlist node
		 // 
	}

}
