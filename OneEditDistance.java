package com.scott.code;

public class OneEditDistance {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OneEditDistance d = new OneEditDistance ();
		System.out.println(d.isOneEditDistance("a", "ba"));
	}

	
    public boolean isOneEditDistance(String s, String t) {
         int m = s.length() , n = t.length() ;
         if ( m > n) return isOneEditDistance (t, s);
         int i = 0 , shift = n - m;
         if ( shift > 1) return false ;        
         while (i < m && s.charAt(i) == t.charAt(i)) ++i;
         //append
         if ( i == m) return shift > 0 ;
         if (shift == 0) ++i ;
         while (i < m && s.charAt(i) == t.charAt(i + shift)) ++i;                          
         return i == m ;
    }
	
}
