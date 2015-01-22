package com.scott.leetcode;

import java.util.LinkedList;
import java.util.Stack;

public class UniquePath {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [][] matrix = {
				{0 , 0, 0},	
				{0 , 1, 0},
				{0 , 0, 0}
				
		} ;
		
		UniquePath p = new UniquePath();
//		
//		System.out.println(p.uniquePathsWithObstacles(matrix));
		
		int len = p.longestValidParentheses(")()())") ;
		
		System.out.println(len) ;
		
		
	}
	
	 public int uniquePaths(int m, int n) {
         int [][] dp = new int [m][n];
	      dp[0][0] = 1;
	      
	      
	      
	      
	      for (int i = 0 ;i < m ; ++i){
	    	  for (int j = 0 ;  j < n ;++j){
	    		  //right
	    		  if (j+1 < n){
	    			  dp [i] [j+1] += dp[i][j] ;  
	    		  }
	    		  
	    		  //down 
	    		  if (i+1 < m){
	    			  dp [i+1] [j] += dp[i][j] ;  
	    		  }
	    		  
	    	  }
	      }
	      
	      
	      return dp[m-1][n-1];
   }
	
	
	
	
     public int uniquePathsWithObstacles(int[][] obstacleGrid) {
      
      int m = obstacleGrid.length ;
      int n = obstacleGrid[0].length ;
      int [][] dp = new int [m][n] ;
      
      if (obstacleGrid[0][0] == 1) {
    	  return 0 ;
      }
      dp [0][0] = 1;
      for (int i = 1 ; i < m ; ++i) {
    	  if (obstacleGrid[i][0] != 1) {
    		  dp[i] [0] = dp[i-1][0];
    	  }
      }
      
      for (int j = 1 ; j < n ; ++j) {
    	  if (obstacleGrid[0][j] != 1) {
    		  dp[0] [j] = dp[0][j-1];
    	  }
      }
      
      for (int i = 1; i < m ; ++i) {
    	  for (int j =1 ; j < n ; ++j) {
    		  if (obstacleGrid[0][j] != 1) {
//    			  dp [i][j] = dp [i-1][j] + dp [i][j -1]; 
    		  }
    	  }
      }
      
      for (int i = 0 ; i < dp.length ;++i) {
    	  for (int j = 0 ; j < dp[0].length ; ++j) {
    		  System.out.print(dp[i][j] + " ");
    	  }
    	  System.out.println();
      }
      
      return dp[dp.length - 1][dp[0].length - 1];
    	 
    }

     
     
     public int longestValidParentheses(String s) {
      char [] chs = s.toCharArray() ;
      Stack<Character> stack = new Stack<Character>();
    	 
      for (int i = 0 ; i < chs.length ; ++i) {
    	  if (chs[i] == '(') {
    		  stack.push(chs[i]) ;
    	  } else {
    		  if (stack.size() == 0) {
    			  stack.push(chs[i]) ;
    		  } else {
    			  if (stack.peek() == '(') {
    				  stack.pop() ;
    			  } else {
    				  stack.push(chs[i]) ;
    			  }
    		  }    		     		 
    	  }
      }
    	 
      
    	 
    	 return  chs.length - stack.size();
     }
     
      private static class TreeNode {
    	      int val;
    	      TreeNode left;
    	      TreeNode right;
    	      TreeNode(int x) { val = x; }
    	 
      }
      public void flatten(TreeNode root) {
          
      }
      
      private void flat (TreeNode root, TreeNode next){
    	  if (root == null) {
    		  return  ;
    	  }
    	  
    	  next = root ;

      }
      
      
      public int searchInsert(int[] A, int target) {
    	 if (A.length == 0 ) {
    		  return 0 ;
    	 }
    	  
    	  
       int left = 0 ;
       int right = A.length -1 ;
       
       while (left <= right) {
    	   int mid = (left + right) / 2 ;
    	   if (A[mid] == target) {
    		   return mid ;
    	   } else if (target > A[mid]) {
    	      left = mid + 1 ;	
    	      if (A[left] > target) {
    	    	  return left - 1 ;
    	      }
    	   } else {
    		  right = mid - 1 ;
    		  if (A[right] < target) {
    			  return right + 1 ;
    		  }
    	   }
       }
              
       return 0 ;    	  
    	  
      }
}
