package com.collections;


import java.util.*;

public class arrayvector {
	
	public static void main(String[] args) {
		
		
		
		Vector<String> v1 = new Vector<>();
		v1.add("sreeja");
		v1.add("priya");
		v1.add(0,"hari");//0 represents the index in which the element is to be added
		System.out.println(v1);
		
		Vector<String> v2 = new Vector<>();
		v2.add("sreeja1");
		v2.add("priya1");
		System.out.println(v2);
		System.out.println(v1.addAll(v2));
		
		
		System.out.println(v1);
		System.out.println(v1.remove("priya"));
		System.out.println(v1.get(1));
		System.out.println(v1.indexOf("hari"));
		


		
		

		//System.out.println(v1.size());//size :no of elements prrsent in the list
		//System.out.println(v1.capacity()); // capacity:internally created array capacity
			
		
	}

}
