package collections;

import java.util.*;
import java.util.Map.Entry;

public class HashMapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//It has implemented Map Interface
		//no ordering--no indexing
		//stores values in key-values pair
		//key can not be duplicates
		//can store multiple null values but only one null key
		//hashmap is not thread-safe and not synchronized
		//Initial capacity is 16 and Load Factor-0.75
		 HashMap<String, String> capitalMap = new HashMap<String, String>();

	        // Adding key-value pairs to the HashMap
	        capitalMap.put("USA", "Washington, D.C.");
	        capitalMap.put("Canada", "Ottawa");
	        capitalMap.put("UK", "London");
	        capitalMap.put("Germany", "Berlin");
	        capitalMap.put("Australia", "Canberra");
	        capitalMap.put("India", "New Delhi");
	        capitalMap.put(null, "Null City"); // One null key
	        capitalMap.put("Null Country", null); // Multiple null values
	        capitalMap.put("Another Null Country", null);;
	        
	        //iterator : over the keys:by using keySet()
	        
	        Iterator<String> it=capitalMap.keySet().iterator();
	        
	        while(it.hasNext())
	        {
	        	String key=it.next();
	            String value=capitalMap.get(key);
	            System.out.println("key="+key+" value="+value);
	        }
	        
	        System.out.println("-------------");
	        //iterator : over the set (pair) : by using entrySet()
	        Iterator<Entry<String, String>> it1=capitalMap.entrySet().iterator();
	        
	        while(it1.hasNext())
	        {
	        	Entry<String, String> entry=it1.next();
	            System.out.println("key="+entry.getKey()+" value="+entry.getValue());
	        }
	        
	        System.out.println("-------------");

	        //using entrySet and enhanced for loop
	        
	        for(Entry<String,String> entry:capitalMap.entrySet())
	        {
	            System.out.println("key="+entry.getKey()+" value="+entry.getValue());
	        }
	        
	        //using keySet and get() method
	        for(String key:capitalMap.keySet())
	        {
	        	System.out.println("key="+key+" value"+capitalMap.get(key));
	        }
		
	}

}
	