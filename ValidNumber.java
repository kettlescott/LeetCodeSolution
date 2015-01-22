package com.scott.leetcode;

public class ValidNumber {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ValidNumber n = new ValidNumber ();
		System.out.println(n.isNumber("005047e+6"));
	}
	
    public boolean isNumber(String s) {
        int i = 0;
        while (i < s.length() && s.charAt(i) == ' ') ++i;
        if (i < s.length() && (s.charAt(i) == '+' || s.charAt(i) == '-')) i++;
        boolean valid = false ;
        while (i < s.length() && Character.isDigit(s.charAt(i))) {
        	valid = true ;
        	i++;
        }        
        if (i < s.length() && s.charAt(i) == '.'){
        	i++;
        	while (i < s.length() && Character.isDigit(s.charAt(i))){
        		valid = true ;
            	i++;
            }        	        	 	
        }
        
        if (valid && i < s.length() && s.charAt(i) == 'e'){
    		i++;        		
    		valid = false ;
    		if (i < s.length() && (s.charAt(i) == '+' || s.charAt(i) == '-')) i++;
        	while (i < s.length() && Character.isDigit(s.charAt(i))){
        		valid = true ;
        		i++;
        	}
    	}        	
    	while (i < s.length() && s.charAt(i) == ' ') i++;      
    	return valid && i == s.length() ;               
    }

}
