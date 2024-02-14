package com.staticnonstatic;

import java.util.Scanner;

public class staticnonstatic {
	
	static int staticvariable =0;
	int nonstaticvariable =0;
	
	static void staticmethod()
	{
		System.out.println("this is static method");
	}
	
	void nonstaticmethod() 
	{
	System.out.println("This is nonstatic method");	
	}
	
	public static void main(String[] args) {
		
		Scanner scanner =new Scanner(System.in);
		
		//for accessing and modifying static variable 
		System.out.println("enter the value to modify scanner variable");
		staticvariable = scanner.nextInt();
		System.out.println("static variable value:"+ staticvariable);
		
		
		//for accessing and modifying non-static variable 
		staticnonstatic  obj =new staticnonstatic();
		System.out.println("enter the value to modify scanner variable");
		obj.nonstaticvariable = scanner.nextInt();
		System.out.println("static variable value:"+ obj.nonstaticvariable);
		
		staticmethod();   //static method
		obj.nonstaticmethod(); //nonstatic method
		
		scanner.close();
		
	}

}
