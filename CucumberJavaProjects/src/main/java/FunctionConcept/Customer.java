package FunctionConcept;

import java.util.Arrays;

public class Customer {

	//Acceptance Criteria
	//WAF: to get the cart details with all the product
	//name: getCartDetails(String customerName)
	//return: String[] ---> array of products
	
	public String[] getCartDetails(String customerName) {
		
		System.out.println("getting the cart details for: "+customerName);
		
		if(customerName.equals("snehal")) {
			String product[]= {"mackbook pro","nike Tshirt","samsung TV","iPad"};
			return product;
		}else if(customerName.equals("vijay")) {
			String product[]= {"macbook air","iphone17"};
			return product;
		} else if (customerName.equals("anu")) {
			String product[]= {"keyboard"};
			return  product;
		} else {
			System.out.println("customer is not found.."+customerName);
			
			return null;
			}
		
			
			
		
		
	}
	
	public static void main(String[] args) {
		Customer c1 = new Customer();
		String result[]=c1.getCartDetails("snehal");
		System.out.println(Arrays.toString(result));
		

	}

}
