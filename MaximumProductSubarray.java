package com.scott.code;

public class MaximumProductSubarray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MaximumProductSubarray m = new MaximumProductSubarray ();
		int [] data = {-4,-3,-2} ;
		System.out.println(m.maxProduct(data));
	}
	
	
	public int maxProduct(int[] A) {		
		int maxSofar = A[0] ,  maxPre = A[0] , minPre = A[0];
		for (int i = 1 ; i < A.length ; ++i) {
			int mx = maxPre, mn = minPre ;
			maxPre = Math.max(Math.max(mx * A[i], A[i]), mn * A[i]) ;
			minPre = Math.min(Math.min(mn * A[i], A[i]), mx * A[i]) ;
			maxSofar = Math.max(maxSofar, maxPre);			
		}
		return maxSofar;
	}

}
