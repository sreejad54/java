package com.polymorphism;

public class overloading {
	 int add(int a, int b)
	{
		 return a+b;
	}
	
	double add(double a, double b) {
		return a+b;
	}
	
	int add(int a,int b,int c)
	{
		return a+b;
	}
	public static void main(String args[])
	{
		overloading ol=new overloading();
		System.out.println("add with int:" +  ol.add(5, 6));
		System.out.println("add with double:" + ol.add(6.2,3.2));
		System.out.println("add with int:" + ol.add(7, 5));
	}
	}
	


