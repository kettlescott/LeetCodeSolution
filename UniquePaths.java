package com.scott.leetcode;

public class UniquePaths {


	 public int uniquePaths(int m, int n) {
	    int [][] dp = new int [m] [n];       
	    for (int i = 0 ; i < m ; ++i) {
	    	dp[i][0] = 1;
	    }
	    for (int i = 0 ; i < n ; ++i) {
	    	dp[0][i] = 1;
	    }
	    for (int i = 1 ; i < m ; ++i) {
	    	for (int j = 1 ; j < n ;++j) {
	    		dp[i][j] = dp[i-1][j] + dp [i][j-1];
	    	}
	    }	    
	    return dp[m - 1][n - 1];	 
	 }
	 	 
	 
	 public int uniquePaths_backtrack (int m , int n ,int r ,int c){
		 if (r == m - 1  && c == n - 1)				 
			 // when reach the right corner then get a unique path
			 return 1 ;
		 if (r >= m || c >= n) 
			 return 0 ;		 
		 return uniquePaths_backtrack (m,n,r + 1,c) + uniquePaths_backtrack(m, n , r , c + 1) ;		 
	 }
	 
	 public int uniquePaths_backtrack_back_start (int r ,int c){
		 if (r == 1 && c == 1)	{
			// when reach the right corner then get a unique path					 
			 return 1 ;
		 }			 
		 if (r < 1 || c < 1) 
			 return 0 ;		 
		 return uniquePaths_backtrack_back_start (r - 1,c) + uniquePaths_backtrack_back_start(r , c - 1) ;		 
	 }
	 
	 
	 public int uniquePath_backtrackII (int r ,int c, int [][] matrix){
		 if (r == 1 && c == 1) {
			 return 1;			 
		 }		 
		 if (r < 1 || c < 1) {
			 return 0;
		 }
		 //unvisited
		 if (matrix[r - 1][c] == -1) {
			 matrix[r - 1][c]= uniquePath_backtrackII (r - 1, c, matrix);
		 }
		 if (matrix[r][c - 1] == -1) {
			 matrix[r][c - 1] = uniquePath_backtrackII (r, c - 1, matrix);
		 }
		 return matrix[r - 1][c] + matrix[r][c - 1] ;
	 }
	 
	 public int uniquePaths_II(int m ,int n){
		 int [][] matrix = new int [m + 1][ n + 1] ;
		 for (int i = 0 ; i <= m ;++i) {
			for (int j = 0 ; j <= n ;++j) {
				matrix[i][j] = - 1;
			}
		 }
		 return uniquePath_backtrackII (m, n, matrix);
		 
	 }
	
	
}
