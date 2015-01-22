package com.scott.leetcode;

public class FirstMissingPositive {


	public int firstMissingPositive(int[] A) {		
		for (int i = 0 ; i < A.length ; ++i) {
		   int target = A[i] ;
		   while (target <= A.length && target > 0 && A[target - 1] != target) {
			    int tmp = A[target - 1] ;
			    A[target - 1] = target ;
			    A[i] = tmp ;
			    target = A[i] ;
		   }
		}			
		for (int i = 0 ; i < A.length ; ++i) {
			 if (A[i] != i + 1){
				 return i + 1 ;
			 }
		}		
	     return A.length + 1 ;
	}
	
	public int firstMissingPositive_m(int[] A) {
		int [] map = new int [A.length] ;
		for (int i = 0 ; i < A.length ; ++i) {
		   if (A[i] > 0 && A[i] <= A.length) {
			   map[A[i] - 1] = i ;
		   }
		}			
		for (int i = 0 ; i < A.length ; ++i) {
			if (A[i] != i + 1) {				
				return i + 1;
			}
		}
	     return A.length + 1 ;
	}
}
