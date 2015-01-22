package com.scott.code;

public class FirstMissingPositive {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FirstMissingPositive  m = new FirstMissingPositive ();
		int [] data = {2, 1} ;
		int r = m.firstMissingPositive(data) ;
//		System.out.println(r);
		System.out.println(m.firstMissingPositive_m(data));
	}

	
	
	
	 public int solution(int[] A) {
	        // write your code in Java SE 8
	    int [] map = new int [A.length] ;
	    for (int i = 0 ; i < A.length ; ++i) {
	    	int target = A[i];
	    	if (target <= A.length){
	    		map[target - 1] = 1 ;
	    	}
	    }
	    for (int c : map) {
	    	if ( c == 0)  return 0 ;
	    }
	    
	   return 1 ;
	 }
	
	
	
	 public int solution(String S) {
	        // write your code in Java SE 8
	       int count = 0 ;
	       for (Character c : S.toCharArray()) {
	    	   if (c == '(') {
	    		   count++;
	    	   } else {
	    		   if (count == 0) return 0 ;
	    		   count--;
	    	   }
	       }	 
	       return count == 0 ?  1 : 0 ;
	 }
	
	
	
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
