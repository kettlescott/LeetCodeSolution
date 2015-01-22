package com.scott.leetcode;

public class SumCombination {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
  
		
		SumCombination.findCombinationCount(2, new int [] {1,2,2,3,4,5});
	}
	
	
	/**
	 * C={1,2,2,3,4,5} 
       Sum=5 
       subset; 
       {1,2,2} 
       {1,4} 
       {2,3} 
	 * @param sum
	 * @param coins
	 */
	public static void findCombinationCount(int sum, int [] array){
		int [] dp=new int [sum+1];
		 dp [0] =1;
		for (int i = 0 ; i < array.length ; ++i ){
			for (int j = array[i] ; j<=sum ;++j){
				dp[j] += dp[j - array[i]];
			}
		}
		
		System.out.println(dp[sum]);
	}

}
