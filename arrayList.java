package com.collections;

import java.util.*;

public class arrayList {

	public static void main(String[] args) {
		Integer[] arr1 = new Integer[] {1,2,4,5};
		ArrayList<Integer>  arr = new  ArrayList<>(Arrays.asList(arr1));
		arr.add(5);
		arr.add(null);
		arr.add(0, 15);
		System.out.println(arr);
		System.out.println(arr.size());
		System.out.println(arr.get(0));
		System.out.println(arr.set(0, 37));
		for(int i=0;i<arr.size(); i++)
		{
			System.out.print(arr.get(i)+ " ");
		}
		
		
		
	}
}
