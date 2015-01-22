package com.scott.code;

import java.util.List;

public class GrayCode {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		GrayCode g = new GrayCode();
//		g.grayCode(2);
		System.out.println(g.lengthOfLongestSubstring("wlrbbmqbhcdarzowkkyhiddqscdxrjmowfrxsjybldbefsarcbynecdyggxxpklorellnmpapqfwkhopkmco"));

	}
	
	
     public int lengthOfLongestSubstring(String s) {
    	  if (s.length() == 0) {
    		  return 0 ;
    	  }
          int [] dp = new int [s.length()] ;
          dp [0] = 1; 
          boolean  [] flag = new boolean [128] ;
          flag [s.charAt(0)] = true ;
    	  int max = Integer.MIN_VALUE ;
          for (int i = 1 ; i < s.length() ; ++i) {
        	   if (!flag [s.charAt(i)]) {        		   
        		    dp [i] = dp[i-1] + 1;
        		    flag [s.charAt(i)] = true ;
        		    max = Math.max(max, dp[i]) ;
        	   } else {
        		   dp [i] = 1;        		   
        		   for (int j = 0 ; j < flag.length ; ++j) {
        			   flag [j] = false ;
        		   }
        		   
        		   flag [s.charAt(i)] = true ;
        		   max = Math.max(max, dp[i]) ;
        	   }
          }
                   
          
    	 return max; 
    }
	
     public List<Integer> grayCode(int n) {
       int [] bits = new int [n] ;
       boolean [] flag = new boolean [n] ;
       findGary (bits, flag , 0); 
    	 return null ;
     }
     
     private void findGary (int [] bits , boolean [] flag , int count){
    	 if (count == bits.length) {    		
    		 for (int b : bits) {
    			 System.out.print(b);
    		 }
    		 System.out.println();    		 
    	 }    	 
    	 for (int i = 0 ; i < bits.length ; ++i) {
    		 if (flag [i]) {
    			 continue ;
    		 }
    		 flag [i] = true;
    		 for (int j = 0 ; j <= 1 ; ++j) {    			 
    			 bits [i] = j ;    			 
    			 findGary(bits, flag,count + 1);	         		
    		 }   
    		 
    		 flag [i] = false ;    		
    	 }
    	 	 
    	 
    	 
     }

}
