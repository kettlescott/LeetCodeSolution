package com.scott.leetcode;

import java.util.LinkedList;
import java.util.Stack;

public class UniquePath {

	
	
        public int uniquePaths(int m, int n) {
	     int [][] matrix = new int [m + 1][ n + 1] ;
		 for (int i = 0 ; i <= m ;++i) {
			for (int j = 0 ; j <= n ;++j) {
				matrix[i][j] = - 1;
			}
		 }
		 return uniquePath_backtrackII (m, n, matrix);
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
}
