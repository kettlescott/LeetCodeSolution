package com.scott.leetcode;

public class JumpGameII {

	
    public int jump(int[] A) {
        int [] dp = new int [A.length] ;
        dp[0] = 0 ;
        for (int i = 0 ; i < A.length ; ++i) {
        	int j = i + 1;
        	while (j < A.length && A[i] >= 0) {
        		if (dp[j] == 0) {
        			dp[j] = dp[i] + 1 ;
        		} else{
        			dp[j] = dp[i] + 1 < dp[j] ? dp[i] + 1  : dp[j];	
        		}        		
        		A[i]--;
        		j++;        		
        	}
        }       
       return dp[A.length - 1] ;    	
    }
	
}
