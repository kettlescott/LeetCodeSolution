package com.scott.code;

public class ValidPalindrome {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ValidPalindrome v = new ValidPalindrome ();
		System.out.println(v.isPalindrome("a."));
	}
	
    public boolean isPalindrome(String s) {
        int i = 0 , j = s.length() - 1 ;
        while (i < j) {
        	while (i < j && !Character.isLetterOrDigit(s.charAt(i))) i++;        	
        	while (i < j && !Character.isLetterOrDigit(s.charAt(j))) j--;
        	if (Character.toLowerCase(s.charAt(i)) != Character.toLowerCase(s.charAt(j))) 
        		return false;
        	i++;
        	j--;
        }         	
    	return true;
    }
    
    
    

}
