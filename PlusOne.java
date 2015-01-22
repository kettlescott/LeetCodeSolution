package com.scott.code;

public class PlusOne {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PlusOne p = new PlusOne ();
        int [] data = {9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,1};
        for (int c : p.plusOne(data)) 
        	System.out.print(c);
        
	}
	
	
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
