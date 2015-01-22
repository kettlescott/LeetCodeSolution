package com.scott.leetcode;

public class MinCoin {

	
	
	public int minCoin (int total , int [] coins){
		int [] dp = new int [total+ 1];
		dp[0] = 0 ;
		for (int i = 1 ; i <= total ; ++i) {
			dp[i] = i ;
			for (int j = 0 ; j < coins.length ; ++j) {
				if (i >= coins[j]) {					
					dp[i] = dp [i] > dp[i - coins[j]] + 1 ? dp[i - coins[j]] + 1  : dp[i] ;
				}
			}
		}
		return dp[total];
	}
	
	public int minCoinRec (int total , int [] coins , int count ){
       if (total == 0) {
    	   return count;
       } else if (total < 0) {
    	   return 0 ;
       } else {
    	  int res = total ; 
    	  for (int i = 0 ; i < coins.length ;++i) {
    		  if (total >= coins[i]) {
    			  res = Math.min(res, minCoinRec (total - coins[i],coins,count + 1));  
    		  }    		  
    	  }
    	  return res ;
       }
	}
	



}
