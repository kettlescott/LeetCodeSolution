package com.scott.leetcode;

public class MostWater {

	
	public static void main(String[] args) {
		int [] point = {1,2,4,3}; 
		MostWater m = new MostWater ();
		System.out.println(m.maxArea(point));
		

	}
	
	
	 public int maxArea(int[] height) {
	   int low = 0 ; 
	   int high = height.length - 1 ;
	   int max = 0 ;
		 
	   while (low < high) {
		 max = Math.max(max, (high - low) * Math.min(height[low], height[high])) ;
		 
		 if (height[low] < height[high]) {
			 low++;
		 } else {
			 high--;
		 }
		   
	   }
		 
	   	   
	   return max ;
	 }

}
