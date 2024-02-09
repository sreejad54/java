package com.hybrid;

public class HybridMain {

	public static void main(String[] args) {
	
		HybridDeveloper h= new HybridDeveloper();
		h.write();
		HybridAdmin A= new HybridAdmin();
		A.write();
		A.manage();
		HybridUser U= new HybridUser();
		U.Access();
		U.manage();
     }

}
