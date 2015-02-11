package com.scott;

public class APLUSBProblem {

	
	
	 public int aplusb(int a, int b) {
	        // Click submit, you will get Accepted!
	      if (b > a) return aplusb (b,a);
	      if (a == b) return 2 * a ;	      
	      return( a*a - b*b) / (a- b) ;
	 }

}
