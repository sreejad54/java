package com.multiple;

public class admin implements iGuest,iDeveloper {

	@Override
	public void write() {
		System.out.println("writes the code");
		
	}

	@Override
	public void read() {
		System.out.println("reads the code");
		
	}

}
