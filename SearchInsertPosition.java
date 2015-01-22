package com.scott.leetcode;

public class SearchInsertPosition {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SearchInsertPosition p = new SearchInsertPosition () ;
		int [] data = {1 ,3} ;
		System.out.println(p.searchInsert(data, 1));
	}
	
	
	public int searchInsert(int[] A, int target) {
	       int L = 0 , R = A.length - 1;
	       while (L < R) {
	    	   int M = (L + R) / 2 ;
	    	   if (A[M] < target) {
	    		   L = M + 1;
	    	   } else{
	    		   R = M ;
	    	   }
	       }	       	      
	       return A[L] < target ? L + 1: L;
	}

}
