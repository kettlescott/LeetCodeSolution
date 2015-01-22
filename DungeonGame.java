package com.scott.code;

public class DungeonGame {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DungeonGame d = new DungeonGame () ;
		int [] [] data = {
				{-2 , -3, 3} ,	
				{-5 , -10, 1} ,
				{10, 30 , -5} 
		} ;
		d.calculateMinimumHP(data) ;
	}
	
	
	 public int calculateMinimumHP(int[][] dungeon) {
	    int row = dungeon.length , col = dungeon[0].length;    
	    int [][] dp = new int [row][col] ;
	    dp[0][0] = dungeon[0][0];
	    for (int i = 1 ; i < col  ;  ++i) {
	    	dp[0][i] = dp[0][i-1] + dungeon[0][i]; 
	    }
	    for (int i = 1 ; i < row ; ++i) {
	    	dp[i][0] = dp[i-1][0] + dungeon[i][0];
	    }
	    for (int i = 1 ; i < row ; ++i) {
	    	for (int j = 1 ; j < col ; ++j) {
	    		dp[i][j] = Math.min(Math.abs(dp[i][j - 1]), Math.abs(dp[i - 1][j])) + dungeon[i][j];
	    	}
	    }
	    for (int i = 0 ; i < row ; ++i) {
	    	for (int j = 0 ; j < col ; ++j) {
	    		System.out.print(dp[i][j] + " ");
	    	}
	    	System.out.println();
	    }
	   System.out.println(dungeon[row - 1][col - 1]);
	 
	 
	      return 0;
	 }

}
