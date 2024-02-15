package com.multithreading;


//method 1 by extending thread class
/*class Employee extends Thread{ 
    	@Override
    	public void run()
    	{
    		System.out.println("multithreading process 2  "+   Thread.currentThread().getName());
    	}
    	
    }*/



// method 2 by implementing runnable interface
class Employee implements Runnable{

	@Override
	public void run() {
		
		System.out.println("multithreading process 2  "+   Thread.currentThread().getName());

		
		
	}

	
	
}


