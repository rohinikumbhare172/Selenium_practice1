package abstractClass;

import java.util.ArrayList;
import java.util.LinkedList;

class Geeks {
    public static void main(String[] args) {

    	 LinkedList <String> arr= new LinkedList<String>();
         arr.add("rohini");
         arr.add("rohit");
         arr.add("NANA");
         System.out.println("Arr"+arr);
         for(int i=0;i< arr.size();i++)
         {
             System.out.println("linked list "+i+ ",    value is " +arr.get(i));
         }
         
    }
}
