package com.scott;

public class GoogleInterview {

  /*
  You are given a positive integer number N. Return the minimum number K, such that N can be represented as K integer squares. 
Examples: 
9 --> 1 (9 = 3^2) 
8 --> 2 (8 = 4^2 + 4^2) 
15 --> 4 (15 = 3^2 + 2^2 + 1^2 + 1^2) 
First reach a solution without any assumptions,
then you can improve it using this mathematical lemma: For any positive integer N, 
there is at least one representation of N as 4 or less squares.
  */


 /*
   recursive call 
 */
	public int find (double d, int count){
		if (d == 0) return count ;
		if (d < 0) return 0 ; ;		
		int min = Integer.MAX_VALUE;
		for (int i = 1 ; i <= Math.sqrt(d) ;++i) {
			if (d >= Math.pow(i, 2)) {
				int c = find (d - Math.pow(i, 2), count +  1);
				min = Math.min(c, min) ;
			}						
		}
		return min ;
	}
	
	/*
	  dp
	*/
	public int find_dp (int n){
		if (n == 0) return 1 ;
		int [] dp = new int [n + 1] ;
		double bound = Math.sqrt(n) ;
		dp[0] = 0 ;
	    for (int i = 1 ; i <= n  ; ++i) {
	    	dp[i] = Integer.MAX_VALUE ;
	    	for (int j = 1 ; j <= bound ; ++j) {
	    		if (i >= Math.pow(j, 2)) {
	    			dp[i] = dp[i - (int)Math.pow(j, 2)] + 1 < dp[i] ? dp[i - (int)Math.pow(j, 2)] + 1 : dp[i] ; 
	    		}
	    	}
	    }		
		return dp[n] ;
	}
	
}
