  package com.scott;

public class DecodeWays {

  /*
   A message containing letters from A-Z is being encoded to numbers using the following mapping:

'A' -> 1
'B' -> 2
...
'Z' -> 26
Given an encoded message containing digits, determine the total number of ways to decode it.

For example,
Given encoded message "12", it could be decoded as "AB" (1 2) or "L" (12).

The number of ways decoding "12" is 2.
  
  */
    public int numDecodings(String s) {
    	if (s.length() == 0) return 0 ;
    	int [] dp = new int [s.length() + 1] ;
    	dp[0] = 1 ;
    	dp[1] = Integer.parseInt(s.substring(0, 1)) > 0 ? 1 : 0;
    	for (int i = 2 ; i <= s.length() ; ++i) {    		
    		  if (Integer.parseInt(s.substring(i - 1 ,i)) > 0 ) {
    			  dp[i] = dp[ i- 1] ;
    		  }
    		  int digit = (s.charAt(i -2) - '0') * 10 + (s.charAt(i -1) - '0');    		  
    		  if (digit >= 10 && digit <= 26) {    			  
    			  dp[i] += dp[ i- 2] ;
    		  }
    	}
        return dp [s.length()];
    }
    
    
    public int testnumDecodings_recursive(String s , int start) {
        if (start >= s.length()) return 1 ;
        int count = 0;
        if (s.length() - start >= 2) {
        	if (Integer.parseInt(s.substring(start, start + 2)) <= 26){
        		count += testnumDecodings (s , start + 2);
        	}
        }
        if (s.length() - start >= 1) {
        	if (Integer.parseInt(s.substring(start, start + 1)) > 0){
        		count += testnumDecodings (s , start + 1);
        	}
        }	        
        return count ;
    }

}
