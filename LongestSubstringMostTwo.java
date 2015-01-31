package com.scott.leetcode;

public class LongestSubstringMostTwo {

	/**
	 * Given a string, find the length of the longest substring T that contains at most 2 distinct characters.

For example, Given s = “eceba”,

T is "ece" which its length is 3. 
	 */
	
	
	 public int lengthOfLongestSubstringTwoDistinct(String s) {
		 int [] count = new int[256];
	     int i = 0 ,  maxLen = 0 , distinct = 0 ;       	    
	     for (int j = 0 ; j < s.length() ; ++j){
	    	 if (count[s.charAt(j)] == 0) distinct++;
	    	 count[s.charAt(j)]++;
	    	 while (distinct > 2) {
	    		 count[s.charAt(i)]--;
	    		 if (count[s.charAt(i)] == 0) distinct --;	    		
	    		 i++;
	    	 }
	    	 maxLen = Math.max(maxLen, j - i +1);
	     }	     	     	    	    
	     return maxLen;	 
	 }

	 
	 public int lengthOfLongestSubstringTwoDistinct_two_pointer(String s) {
		 int dummy = -1 , rear = 0 , maxLen = 0;
		 for ( int i = 1 ; i < s.length() ; ++i) {
			 if (s.charAt(i) == s.charAt(i-1)) continue;
			 if (dummy >= 0 && s.charAt(dummy) != s.charAt(i)){
				 maxLen = Math.max(maxLen, i - rear);
				 rear = dummy + 1;
			 }
			 dummy = i -1 ;
		 }
		 return Math.max(maxLen, s.length() - rear);
	 }
	 
	 public int lengthOfLongestSubstringTwoDistinct_aother_twopointer(String s) {
	        int maxLen = 0 , move = -1 , tail = 0;
	        int i = 0 ;
	        for (; i < s.length() ; ++i) {
	        	char cur = s.charAt(i);
	        	if (cur == s.charAt(tail)|| move != -1 && cur == s.charAt(move)) continue;
	        	if (move != -1 && cur != s.charAt(move) && cur != s.charAt(tail)) {        		
	        		maxLen = Math.max(maxLen, i - tail) ;        			
	        		int backward = i - 1 ;
	        		while (s.charAt(backward) == s.charAt(i - 1)) backward--;
        			tail = backward + 1;     	                			
	        		move = i ;
	        	}	        	
	        	move = i ;	        	
	        }       	        
	        maxLen = Math.max(maxLen, s.length() - tail);
	        return maxLen ;
	    }
	 
}
