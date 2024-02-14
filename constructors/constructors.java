package com.constructors;

public class constructors {
	
	public int i;
	String name ="sreeja";
	
	public static void main(String[] args) {
		
		constructors c =new constructors();
		System.out.println(c.i);
		System.out.println(c.name);
	}
	
	public constructors()
	{
		i=20;
		name="dasari";
		System.out.println("explicit non parameterized constructor");
	}
	
	public constructors(int a, String lastname)
	{
		i=a;
		name= lastname;
	}

}
