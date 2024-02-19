package com.collections;

import java.util.*;

public class LinkedlistLL {
	public static void main(String[] args) {
	ArrayList<String>  al =	 new ArrayList<>();
	al.add("S1");
	LinkedList<String> ll = new LinkedList<>();
	ll.add("Y1");
	ll.add("Y2");
	ll.add("Y3");
	ll.add(0, "Y");
	ll.addAll(0,al);


	System.out.println(ll);	
	
	
	

}
}

