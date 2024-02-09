package com.Interface;

public class Lenovo implements Laptop {

	@Override
	public void copy() {
		System.out.println("lenovo copy");
		
	}

	@Override
	public void paste() {
		System.out.println("lenovo paste");
		
	}

	@Override
	public void cut() {
		System.out.println("lenovo cut");
		
	}

	@Override
	public void keyboard() {
		System.out.println("lenovo keyboard");
		
	}

}
