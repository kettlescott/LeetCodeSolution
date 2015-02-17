package com.scott;

import java.util.ArrayList;


public class MaximumSubarrayIII {

	
	/*
	 * Given an array of integers and a number k, find k non-overlapping subarrays which have the largest sum.

       The number in each subarray should be contiguous.

       Return the largest sum.

       Note
       The subarray should contain at least one number

       Example
       Given [-1,4,-2,3,-2,3],k = 2, return 8
	 */
	public int maxSubArray(ArrayList<Integer> nums, int k) {
	        // write your code		
		int [][] dp = new int [k + 1][nums.size() + 1];
		for (int i = 0 ; i <= k ; ++i) {
		  for (int j = 0 ; j <= nums.size() ; ++j) {
			    dp[i][j] = -1 ;
		  }
		}
	     return cal(nums, k, 0, dp) ; 
	 }
	 
	private int cal (ArrayList<Integer> nums, int k, int start, int[][] dp){		
		if (k == 0) {
			return 0 ;
		}
		if (start == nums.size() ) {
			return 0 ;
		}
		int max = Integer.MIN_VALUE ;
		for (int i = start ; nums.size() - i >= k ; ++i) {
			if (dp[k - 1][i + 1] == -1) {
				dp[k - 1][i + 1] = cal (nums, k - 1 , i + 1, dp) ;
			}
			int c_max = getSofar (nums, start, i) + dp[k - 1][i + 1] ;			
			max = Math.max(max, c_max) ;			
		}
		return max ;
	}
	
	 
	 private int getSofar(ArrayList<Integer> nums, int start, int end){
	     int i = start, j = end ;
	     if (i == j) return nums.get(i) ;
	     int max = nums.get(i) , sofarmax = nums.get(i);
	     i++;
	     for (; i <= j; ++i) {
	    	 sofarmax = Math.max(sofarmax + nums.get(i), nums.get(i)) ;
	    	 max = Math.max(max, sofarmax) ;	    	 
	     }
	     return max ;
	 }
	 
	 

}
