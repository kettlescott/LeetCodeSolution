package com.scott.code;

public class BinarySearchProblem {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int [] A = {1,1,3,1} ;
		BinarySearchProblem bsearch = new BinarySearchProblem ();
//		int position = bsearch.searchInsert(A, 2) ;
//		System.out.println(position) ;
//		bsearch.searchRange(A, 0) ;
//		System.out.println(bsearch.search(A, 3));
		
		int [] prices = { 1,2 } ;
		System.out.println(bsearch.maxProfit(prices));

	}
	
	 public int maxProfit(int[] prices) {
		  
		 if (prices.length == 0 ) {
			 return 0 ;
		 }
		 int max = 0 ;
		 for (int i = 1 ; i < prices.length ; ++i) {
			 for (int j = 0 ; j < i ; ++j ) {
				 System.out.println(prices[i] - prices[j]);
				 max = Math.max(prices[i] - prices[j], max) ;
			 }
		 }
		 
		 return max ;
	  }
	
	  public int search(int[] A, int target) {
			 if (A.length == 0){
				 return -1;
			 }
			 return binaryRotate (A, target , 0 , A.length - 1) ;
	     }
	  
	  private int binaryRotate (int [] A, int target ,int left ,int right){
		  if (left <= right) {			  
			  int mid = (left + right) / 2 ;
			  if (A[mid] == target) {
				  return mid ;
			  }
			  
			  // if left tree is ordered
			  if (A[mid] > A[left] ) {
				  if (target < A[mid] && target >= A[left]) {
					  return binaryRotate (A, target, left, mid - 1);
				  } else {
					  return binaryRotate (A, target, mid + 1, right);
				  }				  
			  }
			  
			  
			  // if right tree is ordered 
			  if (A[mid] < A[right]) {
				  if (target > A[mid] && target <= A[right]) {
					  return binaryRotate (A, target, mid + 1, right);
				  } else {
					  return binaryRotate (A, target, left , mid - 1);
				  }
			  }
			  
			  if ( A[left] == A[right]) {
				  return binaryRotate (A, target, left , mid - 1);
			  }
			  
		  }
		  
		  
		  
		  return -1 ;
	  }
	  
	  private int binaryRepeat(int [] A, int target ,int left ,int right){		 
			 if (left <= right) {
				 int mid = (left + right) / 2 ;
				 if (A[mid] == target) {
					 return mid ;
				 } else if (target > A[mid]) {
					if (A[left] <= A[mid] ) {
						 if ( A[mid] != A[right] ) {
							 return binary (A, target, mid + 1 ,right) ;	 
						 } else {
							 return binary (A, target, left ,mid - 1 ) ;	  
						 }
						
					} else {
						if (target <= A[right]) {
						  return binary(A, target ,mid + 1 ,right) ;
						} else {
						  return binary (A , target , left, mid - 1) ;
						}
						 	 
					}
				 } else {						 
					 if (A[left] <= A[mid] ) {						 						 
						 if (target >= A[left]) {
							 return binary(A, target ,left ,mid - 1) ;	 
						 } else {							
							 return binary(A, target ,mid + 1 ,right) ;
						 }						 
					 } else {
						 return binary(A, target ,left ,mid - 1) ;	 
					 }			 
				 }
			 }		 		 
			 return  -1;
		 }
		 		
	  private int binary(int [] A, int target ,int left ,int right){		 
			 if (left <= right) {
				 int mid = (left + right) / 2 ;
				 if (A[mid] == target) {
					 return mid ;
				 } else if (target > A[mid]) {
					if (A[left] <= A[mid]) {
						return binary (A, target, mid + 1 ,right) ;
					} else {
						if (target <= A[right]) {
						  return binary(A, target ,mid + 1 ,right) ;
						} else {
						  return binary (A , target , left, mid - 1) ;
						}
						 	 
					}
				 } else {						 
					 if (A[left] <= A[mid] ) {
						 if (target >= A[left]) {
							 return binary(A, target ,left ,mid - 1) ;	 
						 } else {							
							 return binary(A, target ,mid + 1 ,right) ;
						 }						 
					 } else {
						 return binary(A, target ,left ,mid - 1) ;	 
					 }			 
				 }
			 }		 		 
			 return  -1;
		 }
	
	  
	 
	
	
	  public int searchInsert(int[] A, int target) {
	    	 if (A.length == 0 ) {
	    		  return 0 ;
	    	 }
	    	  
	    	  
	       int left = 0 ;
	       int right = A.length -1 ;
	       int position = -1;
	       
	       
	       while (left <= right) {
	    	  int  mid = (left + right) / 2 ;
	    	   if (A[mid] == target) {
	    		   position = mid ;
	    		   break;
	    	   } else if (target > A[mid]) {	    		   
	    		
	    		
	    	      left = mid + 1;	 	    	      
	    	      if (left == A.length - 1) {	    	    	  
	    	    	  if (target > A[left]){
	    	    		  return left + 1;
	    	    	  } else {
	    	    		  return left ; 
	    	    	  }
	    	      } 
	    	      
	    	      if (left == A.length ) {	    	    	 
	    	    	  if (target > A[left - 1]){
	    	    		  return left ;
	    	    	  } else {
	    	    		  return 0 ;
	    	    	  }
	    	     }
	    	       
	    	   } else {
	    		 if (mid == A.length - 1 || mid == 0) {
	    			 
	    			return getPosition (target , A, mid);
	    		 } 
	    		
	    		 right = mid - 1 ;
	    		 if (target > A [right]) {
	    			 return right + 1 ;
	    		 }
	    	   }
	       }	 
	       
	      
	       
	       return position ;	    	  
	      }
	  
	  
	  private int getPosition (int target , int [] A , int index){			  
		  if (target < A[index]) {
			  if (index == 0){
				  return 0;
			  } else {
				  return index - 1 ;				  
			  }
		  } else {
			  return index + 1 ;
		  }
	  }

	  
	  public int[] searchRange(int[] A, int target) {
	  
		  int [] range = new int [2] ;
		  range [0] = -1 ;
		  range [1] = -1;
		  int left = 0 ;
		  int right = A.length - 1;
		  int position = -1;
		  while (left <= right) {
			int  mid = (left + right) /2 ;
			  if (A[mid] == target) {
				  if (position == -1) {
					  position = mid ;  
				  }
                 if (mid == 0) {
                	range [0] = 0;
                	break;
                 } else if (A[mid - 1] != target) {
                	 range [0] = mid;
                	 break;
                 } else {
                	 right = mid - 1;
                 }
			  } else if (target > A[mid]) {
				  left = mid + 1;
			  } else {
				  right = mid - 1 ; 
			  }			  
		  }
		  
		  
		  
		  if (position == -1) {
			
			  return range;
		  }
		  
		  if (position == A.length - 1) {
			  range [1] = A.length -1 ;
		  } else if (target != A[position + 1]) {
			  range [1] = position ;
		  } else {
			  right = A.length - 1 ;
			  left = position - 1 ;
			  while (left <= right) {
				  int mid = (left + right) / 2 ;
				  if (A[mid] == target) {
					  if (mid == A.length -1) {
							range [1] = A.length -1;
		                	break;
					  } else if (target != A[mid+1]) {
						    range [1] = mid;
		                	break;
					  } else {
						  left = mid + 1;
					  }
				  }  else if (target > A[mid]) {
					  left = mid + 1;
				  } else {
					  right = mid - 1 ; 
				  }		
			  }
			     
		  }		  		  				 
		  return range ;
	  }
	  
	  
	  
	  
}
