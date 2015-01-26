package com.scott;

public class MinCostPath {

	/*
	Given a cost matrix cost[][] and a position (m, n) in cost[][], write a function that returns cost of minimum cost path to reach (m, n) from (0, 0). Each cell of the matrix represents a cost to traverse through that cell. Total cost of a path to reach (m, n) is sum of all the costs on that path (including both source and destination). You can only traverse down, right and diagonally lower cells from a given cell, i.e., from a given cell (i, j), cells (i+1, j), (i, j+1) and (i+1, j+1) can be traversed. You may assume that all costs are positive integers.

	*/
	
	public int minCost (int [][] matrix, int r , int c){
		if (r < 0 || c < 0) {
			return Integer.MAX_VALUE ;
		}
		if (r == 0 && c == 0) {
			return matrix [r][c] ;
		}
		return matrix[r][c] + min (minCost (matrix,r - 1, c - 1),
				minCost (matrix,r - 1, c),
				minCost (matrix,r , c - 1)) ;
	}
	
	public int min (int a, int b, int c) {
		return Math.min(Math.min(a, b), c);
	}
	
	public int minCost_dp (int [][] matrix) {
		int r = matrix.length  ;
		int c = matrix[0].length ;
		int [][] dp = new int [r][c];
		dp[0][0] = matrix[0][0];
		for (int i = 1 ; i < c ; ++i) {
			dp[0][i] = dp[0][ i-1 ] + matrix[0][i] ;
		}
		for (int i = 1 ; i < r ; ++i) {
			dp[i][0] = dp[i-1][0] + matrix[i][0] ;
		}
		for (int i = 1 ; i < r ; ++i) {
		  for (int j = 1 ; j < c ; ++j) {
			  dp[i][j] = matrix[i][j] + min (dp[i - 1][j -1], dp[i-1][j] , dp[i][j-1]) ;
		  }
		}
		return dp[r-1][c-1];		
	}
	
	

}
