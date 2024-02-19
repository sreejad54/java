package com.collections;

import java.util.*;

public class stacklifo {
	public static void main(String[] args) {
		
	
	
	Stack<String> books =new  Stack<>();
	books.push("black");
	books.push("red");
	books.push("Yellow");
	books.set(1, "white");
	System.out.println(books);
	System.out.println(books.search("Yellow"));
	System.out.println(books.indexOf("Yellow"));
	System.out.println(books.isEmpty());
			

}
}
