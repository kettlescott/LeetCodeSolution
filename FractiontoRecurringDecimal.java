package com.scott.leetcode;

import java.util.HashMap;

public class FractiontoRecurringDecimal {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FractiontoRecurringDecimal r = new FractiontoRecurringDecimal ();		
		System.out.println(r.fractionToDecimal(9, 17));
	}
	
	
   public String fractionToDecimal(int numerator, int denominator) {
	    StringBuilder sb = new StringBuilder ();
	    if ((numerator > 0 && denominator < 0) || (numerator < 0 && denominator > 0) ) sb.append("-") ;
        long a = numerator , b = denominator;
        a = Math.abs(a); b = Math.abs(b) ;
        HashMap<Long,Integer> map = new HashMap<> ();        
        long res = a / b ;        
        a = a % b * 10 ;
        sb.append(res) ;
        if (a != 0) sb.append(".") ; 
        while (a != 0) {        
        	res = a / b ;              	
        	if (map.containsKey(a)) {
        		sb.insert(map.get(a), "(") ;
        		sb.append(")") ;     		
        		break;
        	}        	
        	map.put(a, sb.length());
        	a = a % b * 10;
        	sb.append(res) ;
        }
      return sb.toString() ;       
   }

}
