package com.scott.code;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	
   public List<Integer> spiralOrder(int[][] matrix) {	        
	  List<Integer> list = new ArrayList<Integer> ();  
	  if (matrix.length == 0) return list;
      int m = matrix.length , n = matrix[0].length ;
      int row = 0 , col = -1 ;
      while (true) {
    	  // from left to right
    	  for (int i = 0 ; i < n ; ++i) {
    		  list.add(matrix[row][++col]);
    	  }    	  
    	  if (--m == 0) break;
    	  //from top to down
    	  for (int i = 0 ; i < m ; ++i) {
    		  list.add(matrix[++row][col]);
    	  }    	  
    	  if (--n == 0) break;
    	  //from right to left
    	  for (int i = 0 ; i < n ; ++i) {
    		  list.add(matrix[row][--col]);
    	  }    	  
    	  if (--m == 0) break;
    	  for (int i = 0 ; i < m ; ++i) {
    		  list.add(matrix[--row][col]);
    	  }    
    	  if (--n == 0) break;    	  
      }	  
	  return list;
   }
	
}
