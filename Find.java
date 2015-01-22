package com.scott.code;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Find {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Find f = new Find ();
//		int [] A = {1,2,0};
//		f.firstMissingPositive(A) ;
//		System.out.println();
		int [] A =  {7,0,9,6,9,6,1,7,9,0,1,2,9,0,3} ;
//		ArrayList<Integer> list = new ArrayList<Integer> ();
//		f.threeSum(A, 0, 0, 0, list) ;
		System.out.println(f.jump(A));
	}
	
	 public int jump(int[] A) {
		 if (A.length == 0) {
	    		return 0 ;
	    	}	    	
	    	if (A[0] == 0 || A.length == 1) {
	    		return 0 ;
	    	}	    	
	       int [] dp = new int [A.length] ;
	       dp[0] = 0;
	       if (A[0] >= A.length){
	    	   dp [A.length - 1] = 1;
	       } else {
	    	   dp [A[0]] = 1;   
	       }
	       
	     int maxSpan = 0;	     	    
	     for (int i = 1; i < A.length ; ++i) {
	    	 if (A[i - 1] + i - 1 <= maxSpan ){
	    		 continue ;
	    	 }	    	 
	    	 maxSpan = A[i -1] + i - 1 >= A.length ?  A.length -1 : A[i -1] + i - 1;
	    	 for (int j = i ; j <= maxSpan ; ++j) {
	    		 if (dp[j] == 0) {
	    			 dp[j] = dp[i - 1] + 1 ;
	    		 }else {
	    			 dp[j] = dp[i - 1] + 1 < dp[j] ? dp[i - 1] + 1 :  dp[j];	 
	    		 }	    		 
	    	 }	    	
	     }	    
	       return dp[A.length - 1] ;   
	 }

	
	
	public void threeSum(int [] A, int start , int index , int sum , List<Integer> list){
		if (sum > 0 || index > 3){
			return ;
		}
		if (sum == 0 && index == 3) {
			for (int i : list) {
				System.out.print(i + " ");
			}
			System.out.println();
		} else {
			for (int i = start ; i < A.length ; ++i) {
				sum += A[i] ;
				list.add(A[i]);
				threeSum (A, start+1 , index + 1 , sum,list);
				sum -= A[i] ;
				list.remove(list.size() - 1) ;
				
			}
			
		}
	}
	
	 public int firstMissingPositive(int[] A) {
		 HashSet <Integer> set = new HashSet<Integer>();
		 for (int i = 0 ; i < A.length ; ++i) {			 
			 set.add(A[i]) ;
		 }
		 
		 int sumCandidate = 0;
		 
		 for (int i = 0 ; i < A.length ; ++i) {
			 int sum = A[i] + 1 ;
			 System.out.println(sum);
			 if (sum <= 0) {
				 continue ;
			 }
			 if (!set.contains(sum)) {
				 sumCandidate = sum ;
				 break ;
			 }
		 }
		
		 int difCandidate = 0;
	        
		 for (int i = 0 ; i < A.length ; ++i) {
			 int difference = A[i] - 1 ;
			 if (difference <= 0) {
				 continue ;
			 }
			 if (!set.contains(difference)) {
				 difCandidate = difference ;
				 break ;
			 }
		 }
		 
		 if (sumCandidate == difCandidate) {
			 return sumCandidate ;
		 }	  
	     return sumCandidate < difCandidate ?  sumCandidate : difCandidate;
	 
	 }
	 
	 
	 
}
