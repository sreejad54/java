package com.Interface;

public class Hp implements Laptop {

	@Override
	public void copy() {
		System.out.println("Hp copy");
		
	}

	@Override
	public void paste() {
		System.out.println("Hp paste");
		
	}

	@Override
	public void cut() {
		System.out.println("Hp cut");
		
	}

	@Override
	public void keyboard() {
		System.out.println("Hp keyboard");
		
	}
	public void camera()
	{
		System.out.println("camera code");
	}
}
