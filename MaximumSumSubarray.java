package com.scott.leetcode;

public class MaximumSumSubarray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MaximumSumSubarray m = new MaximumSumSubarray ();
		int [] data = {-2 , -1} ;
		System.out.println(m.maxSubArray(data));		
		System.out.println(m.maxSubArray_noAddition(data));
	}
	
	 int max = 0 ;
	
	 public int maxSubArray_dp(int[] A) {
		 if (A.length == 0) return 0;
		 int [] dp = new int [A.length] ;
		 dp [0] = A[0];
		 int max =  dp [0] ;
		 for (int i = 1 ; i < A.length ; ++i) {
			 dp[i] = dp[i - 1] + A[i] > A[i] ? dp[i - 1] + A[i]  : A[i];
			 max = Math.max(max, dp[i]);			 
		 }
		 return max ;
	 }
	 
	 
	 public int maxSubArray_noAddition(int[] A) {
		 if (A.length == 0) return 0;
		 int maxSofar = A[0] , atIndex = A[0] ;
		 for (int i = 1 ; i < A.length ; ++i) {
			 atIndex = Math.max(atIndex  + A[i], A[i]);
			 maxSofar = Math.max(maxSofar, atIndex);
		 }
		 return maxSofar;
	 }
	 
	 public int maxSubArray_prefix_sum (int[] A) {
		 int sum = 0 , max = Integer.MIN_VALUE;
		 for (int i = 0 ; i < A.length ;++i) {
			 if (sum < 0) 
				 sum = 0;
			 sum += A[i];
			 max = Math.max(max, sum);
		 }
		 return 0 ;
	 }
	 
	 public int maxSubArray_recursive (int[] A , int index){
		 if (index == 0) {
			 max = A[0] ;
			 return A[0];
		 }
		 int pre = maxSubArray_recursive (A, index - 1);
		 int atIndex = Math.max(pre + A[index], A[index]) ;
		 max = Math.max(atIndex, max) ;
		 return atIndex ;
	 }
	
	
	public int maxSubArray(int[] A) {
		return maxSubArrayHelper (A, 0 , A.length - 1);
	}
	
	private int maxSubArrayHelper(int[] A, int L, int R) {
		if (L == R) return A[L] ;
		int M = (L + R) / 2 ;
		int leftMax = maxSubArrayHelper (A, L,  M);
		int rightMax = maxSubArrayHelper(A, M + 1, R);
		int maxLeftBorder  = Integer.MIN_VALUE ;
		int sum = 0 ;
		for (int i = M ; i >= L ; --i ) {
			sum += A[i];
			maxLeftBorder = Math.max(maxLeftBorder, sum) ;
		}
		int maxRightBorder = Integer.MIN_VALUE ;
		sum = 0 ;
		for (int i = M + 1 ; i <= R ; ++i ) {
			sum += A[i];
			maxRightBorder = Math.max(maxRightBorder, sum) ;
		}		
		return Math.max(maxLeftBorder +  maxRightBorder, Math.max(leftMax, rightMax));		
	}

}
