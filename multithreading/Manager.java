package com.multithreading;

//method 1 by extending thread class
/*
class  Manager extends Thread{
	
	@Override
	
public void run()
{
System.out.println("multithreading method 1");
}
	} */



//method 2 by implementing runnable interface
class Manager implements Runnable{

	@Override
	public void run() {
		
		System.out.println("multithreading  method 2 "+   Thread.currentThread().getName());

		
		
	}

	
	
}



