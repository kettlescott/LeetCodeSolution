package com.scott.leetcode;

public class FindMinimuminRotatedSortedArrayII {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FindMinimuminRotatedSortedArrayII r = new FindMinimuminRotatedSortedArrayII ();
		int [] data = {1,1} ;
		System.out.println(r.findMin(data));
	}
	
    public int findMin(int[] num) {
      int L = 0 , R = num.length - 1; 
      while (L < R && num[L] >= num[R]) {
    	  int M = (L + R) / 2 ;
    	  while (M < R && num[M] == num[R]){
    		  R--;
    	  }    	  
    	  while (M > L && num[M] == num[L]){
    		  L++;
    	  }
    	  if (num[M] > num[R]) {
    		  L = M + 1;
    	  } else{
    		  R = M;
    	  }
      }         
      return num[L];
    }

}
