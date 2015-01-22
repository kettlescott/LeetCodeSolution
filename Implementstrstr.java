package com.scott.leetcode;

public class Implementstrstr {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Implementstrstr m = new Implementstrstr ();
		System.out.println(m.strStr("a", "a"));
	}

	 public int strStr(String haystack, String needle) {	    
	    for (int i = 0 ; haystack.length() - i >= needle.length() ; ++i) {
	    	int j = 0 ;
	    	while (j < needle.length() && haystack.charAt(i + j) == needle.charAt(j))
	    		j++;
	    	if (j == needle.length()) return i ;
	    }	    
	    return -1;	 
	 }
	
}
