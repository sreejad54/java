package com.hierarchialInheritance;

import com.Inheritance.Admin;
import com.Inheritance.Developer;
import com.Inheritance.Guest;

public class HierUser {
	
		public static void main(String args[])
		{
			Guest guest= new Guest();
			guest.read();
			
			Developer developer= new Developer();
			developer.write();
			developer.read();
	        
			Admin admin =new Admin();
	        admin.read();
	        admin.write();
	        admin.manage();
		}
	
	
		}	



