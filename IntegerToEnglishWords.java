package com.google.interview;

import java.util.HashMap;
import java.util.Scanner;

public class IntegerToEnglishWords {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		System.out.println(Integer.MAX_VALUE);
		IntegerToEnglishWords n = new IntegerToEnglishWords ();
		int num = 1234567    ;
		System.out.println(n.numberToWords(num));
	}
	
	HashMap<Integer,String> map ;
	HashMap<Integer,String> m ;
	int [] base = {1000000000,1000000, 1000, 100,10, 1} ;
	
	
	public IntegerToEnglishWords (){
	    map = new HashMap<> ();
	    map.put(1, "One") ;
	    map.put(2, "Two") ;
	    map.put(3, "Three") ;
	    map.put(4, "Four") ;
	    map.put(5, "Five") ;
	    map.put(6, "Six") ;
	    map.put(7, "Seven") ;
	    map.put(8, "Eight") ;
	    map.put(9, "Nine") ;
	    map.put(10, "Ten") ;
	    map.put(11, "Eleven") ;
	    map.put(12, "Twelve") ;
	    map.put(13, "Thirteen") ;
	    map.put(14, "Fourteen") ;
	    map.put(15, "Fifteen") ;
	    map.put(16, "Sixteen") ;
	    map.put(17, "Seventeen") ;
	    map.put(18, "Eighteen") ;
	    map.put(19, "Nineteen") ;
	    map.put(20, "Twenty") ;
	    map.put(30, "Thirty") ;
	    map.put(40, "Forty") ;
	    map.put(50, "Fifty") ;
	    map.put(60, "Sixty") ;
	    map.put(70, "Seventy") ;
	    map.put(80, "Eighty") ;
	    map.put(90, "Ninety") ;
	    m = new HashMap <> ();
	    m.put(100, "Hundred") ;
	    m.put(1000, "Thousand") ;
	    m.put(1000000, "Million") ;
	    m.put(1000000000, "billion");
	}
	
	public String numberToWords(int num) {
	        
	    StringBuilder sb = new StringBuilder ();
	    for (int v : base) {	    	
	    	if (num / v == 0) continue ;
	    	if (sb.length() != 0) {
	    		sb.append(" ");
	    	}
	    	if (map.containsKey(num)) {
	    		sb.append(map.get(num));
	    		break;
	    	}
	    	
	    	int count = num / v ;
	    	
	    	if (num >= 20 && num <= 99) {
	    		sb.append(map.get(count * v)) ;
	    	} else {
	    		String r = parse (count);
	    		sb.append(r) ;
	    		sb.append(" ") ;
	    		sb.append(m.get(v)) ;
	    	}	    		    	    	
	    	num %= v;	    	
	    }	 
	    return sb.toString() ;
	 }

	 public String parse (int n){		
		 
	     int [] base = {100,10, 1} ;
	     StringBuilder sb = new StringBuilder ();
		 for (int v : base) {
			 if (n / v == 0) continue ;
			 if (sb.length() != 0) {
				 sb.append(" ");
			 }
			 if (map.containsKey(n)) {
				 sb.append(map.get(n)) ;
				 break;
			 } else {				 
				 int c = n / v ;		
				 if (map.containsKey(c * v)) {
					 sb.append(map.get(c * v)) ;
				 } else {
					 sb.append(map.get(c)) ;
					 sb.append(" ") ;
					 sb.append(m.get(v)) ;
				 }			 
				 n %= v;	 
			 }			 
		 }		
		 return sb.toString() ;
	 }
}
