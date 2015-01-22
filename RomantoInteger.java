package com.scott.code;

import java.util.HashMap;

public class RomantoInteger {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RomantoInteger r = new RomantoInteger ();
		System.out.println(r.romanToInt("IV"));
	}
	
	public int romanToInt(String s) {
		  HashMap<Character, Integer> map = new HashMap<Character,Integer> ();
		  map.put('I', 1) ;
		  map.put('V', 5) ;
		  map.put('X', 10) ;
		  map.put('L', 50) ;
		  map.put('C', 100) ;
		  map.put('D', 500) ;
		  map.put('M', 1000) ;
		  int total = 0 ,pre = 0 ;
		  for (char c : s.toCharArray()) {
			  int current = map.get(c) ;
			  total += (current > pre) ? current - 2 *pre : current;	  
			  pre = current ;
		  }		  		  
		  return total ;		  
	}

}
