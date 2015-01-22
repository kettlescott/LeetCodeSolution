package com.scott.code;

public class PalindromeNumber {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PalindromeNumber p = new PalindromeNumber ();
	    System.out.println(p.isPalindrome(-1));
	}
	
    public boolean isPalindrome(int x) {
    	if (x < 0) return false ;
        int divider = 1 ;
        int a = x ;
        while (a >= 10) {
        	divider *= 10 ;
        	a /= 10;
        }
        while (x != 0) {
        	int L = x / divider ;
        	int R = x % 10 ;
        	if (L != R) return false ;
        	x = x % divider / 10 ; ;
        	divider /= 100;
        }                
        return true ;
    }

}
