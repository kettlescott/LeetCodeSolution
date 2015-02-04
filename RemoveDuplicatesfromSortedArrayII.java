package com.scott;

public class RemoveDuplicatesfromSortedArrayII {

 /*
 Follow up for "Remove Duplicates":
What if duplicates are allowed at most twice?

For example,
Given sorted array A = [1,1,1,2,2,3],

Your function should return length = 5, and A is now [1,1,2,2,3].
 */
	public int removeDuplicates(int[] A) {
		return remove_generic (A,2);
	}
	
	 public int remove_generic(int[] A , int p) {
		 int tail = 0 ,  count = 1;
	     if (A.length == 0) {
	    	 return 0 ;
	     }
	     for (int i = 1 ; i < A.length ; ++i) {
	    	if (A[i - 1] == A[i]) {
	    		count++ ;
	    		if (count <= p) {
		    		// move tail forward copy value from A[i] to A[++tail]	    			
		    		A[++tail] = A[i];		    		
		    	}
	    	} else {
	    		A[++tail] = A[i] ;
	    		count = 1;
	    	}	    		    	
	     }	     
	     return tail + 1 ;
	 }

}
