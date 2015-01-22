package com.scott.leetcode;

public class TwoSumII {


	
	public int[] twoSum(int[] numbers, int target){
		for (int i = 0 ; i < numbers.length ; ++i) {
			int index = bsearch (numbers, target - numbers[i] , i + 1) ;
			if (index != -1) return new int[] {i + 1, index};
		}
		throw new IllegalArgumentException("No two sum solution");	 
	}
	
	
	public int bsearch (int [] A , int key , int start){
		int L = start , R = A.length - 1 ;
		while (L < R) {
			int M = (L + R) / 2 ;
			if (A[M] < key) {
				L = M + 1 ;
			} else {
			    R = M ;	
			}
		}
		return A[L] == key ? L + 1 : -1;
	}
	
	public int [] twoSum_oneLoop (int [] numbers, int target){
		for (int i = 0 , j = numbers.length -1 ; i < j ;) {
			if (numbers[i] + numbers[j] > target) {
				j--;
			} else if (numbers[i] + numbers[j] < target){
				i++;
			} else{
				return new int[] {i + 1, j + 1};
			}
		}
		throw new IllegalArgumentException("No two sum solution");
	}
	
}
