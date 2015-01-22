package com.scott.leetcode;

public class FindMinimuminSortedRotatedArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FindMinimuminSortedRotatedArray r = new FindMinimuminSortedRotatedArray ();
        int [] data = {5 ,6 ,7 ,0 ,1 ,2};
        System.out.println(r.findMin(data));
        
	}
	
	//7,6,5,4,3,2,1 
    public int findMin(int[] num) {
      int L = 0 , R = num.length - 1 ;
      while (L < R  && num[L] >= num[R]){
    	 int M = (L + R) / 2;
    	 //sorted from L to M
    	 if (num[M] > num[R]) {
    		 L = M + 1;
    	 } else{
    		 R = M;
    	 }
      }    	
      return num[L];
    }

}
