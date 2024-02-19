package com.collections;


import java.util.*;

public class Collectionmap {
	public static void main(String[] args) {
		
		Map<Integer, String> m = new Hashtable<>();
		m.put(50034, "hyderabad");// adding elements into map
		m.put(767767, "Delhi");
		Set<Integer> keys =m.keySet();// retrival of keys from the map
		for(Integer key :keys)
		{
			System.out.println(key);
		}
		System.out.println();
	// retrival of values from the map
	
	Collection<String> values = m.values();
	for(String value :values)
	{
		System.out.println(value);
	}
	System.out.println();
	
	//retrival of value from the map based on a key
	//System.out.println(m.get(50034));
	
	for(Integer key :keys) 	//retrival of both ky and value

	{
		System.out.println(key +"::::"+m.get(key));
	}
	
       // m.remove(50034); // deletion of element from map
	
	
	 
		
	}
	
	

}

