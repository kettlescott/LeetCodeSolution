package com.scott.leetcode;

import java.util.HashMap;

public class TwoSum {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TwoSum t = new TwoSum ();
		int [] data = {1 ,2 ,3} ;
		t.dumpResult(t.twoSum(data, 3)) ;		
	}
	
	public int [] twoSum_Brute_force (int [] numbers,  int target) {
		for (int i = 0 ; i < numbers.length ; ++i) {			 
			for (int j = i + 1 ; j < numbers.length ; ++j) {
				if (numbers[j] == target - numbers[i] ) return new int [] {i+1, j+1};
			}
		}
		throw new IllegalArgumentException("No two sum solution");	 			
	}
	
	
	public int[] twoSum(int[] numbers, int target) {
		HashMap<Integer,Integer> map = new HashMap<>();
		for (int i = 0 ; i < numbers.length ; ++i) {
			if (map.containsKey(numbers[i])) 
					return new int [] {map.get(numbers[i]) + 1, i + 1};
			map.put(target - numbers[i], i);			
		}
		throw new IllegalArgumentException("No two sum solution");	
	}
	
	public void dumpResult (int [] index){
	   for (int c : index) 
		   System.out.print( c + " ");
	   System.out.println();
	}

}
