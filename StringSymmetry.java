package com.scott.leetcode;

public class StringSymmetry {

	
	
	 public int solution(String S) {
	        // write your code in Java SE 8
	    int i = 0 , j = S.length() - 1 ;
	    while (i < j && S.charAt(i) == S.charAt(j)) {
	    	i++;
	    	j--;
	    }	    
	    return i == j ? i : -1 ;	 
	 }

}
