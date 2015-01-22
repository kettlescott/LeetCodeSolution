package com.scott.code;

public class StringSymmetry {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringSymmetry s = new StringSymmetry ();
		System.out.println(s.solution("a"));
	}
	
	
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
