package com.exceptionhandling;

public class Exceptionhandling {
	
	public static void main(String[] args) {
		
		int a=5;
		int b=0,result=0;
		try {
			result =a/b;
		}
		
		catch(ArithmeticException e)
		{
			System.out.println("ArithmeticException: " +e.getMessage());
			//throw e;
		}
		
		
		finally {
			
			System.out.println("FINALLY BLOCK");
		}
		
		System.out.println("the output is:"  +result);
	}
	
	

}
