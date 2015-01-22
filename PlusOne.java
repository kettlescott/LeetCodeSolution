package com.scott.leetcode;

public class PlusOne {


	
	
	 public int[] plusOne(int[] digits) {
	   int carrier = 1 ;
	   for (int i = digits.length - 1 ; i >= 0 ; --i) {
		   int sum = digits[i] + carrier ;
		   carrier = sum / 10 ;
		   digits[i] = sum % 10;
	   }	    
	   if (carrier > 0) {		   
		   int [] tmp = new int [digits.length + 1] ;
		   System.arraycopy(digits, 0, tmp, 1, digits.length) ;
		   tmp[0] = carrier ;
		   return tmp ;
	   }
	   return digits;		   	 
	 }

}
