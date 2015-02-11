package com.scott;

public class APLUSBProblem {

	
	/*
	For given numbers a and b in function aplusb, return the sum of them.

Note
You don't need to parse the input and output. Just calculate and return.

Example
If a=1 and b=2 return 3

Challenge
Can you do it with out + operation?

Clarification
Are a and b both 32-bit integers?
	*/
	 public int aplusb(int a, int b) {
	        // Click submit, you will get Accepted!
	      if (b > a) return aplusb (b,a);
	      if (a == b) return 2 * a ;	      
	      return (a*a - b*b) / (a- b) ;
	 }

}
