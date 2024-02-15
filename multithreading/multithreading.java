package com.multithreading;

public class multithreading {
	
	public static void main(String[] args) {
		
		/*System.out.println("Program for multithreading");
	     System.out.println(Thread.currentThread().getName());
	     System.out.println(Thread.activeCount());
	     System.out.println(Thread.currentThread().getPriority());*/
		//Thread t1 =new Thread();
		
		/*Employee e1 = new Employee();
		e1.start();
		
		Manager m1 = new Manager();
		m1.start();
	    System.out.println(Thread.activeCount());*/
		
		
		Employee e1 = new Employee();
		Thread t1 =new Thread(e1);
		t1.start();
		
		Manager m1 = new Manager();
		Thread t2 =new Thread(m1);

		t2.start();
	    System.out.println(Thread.activeCount());
		
	}
	
}

	    
	    
	    
