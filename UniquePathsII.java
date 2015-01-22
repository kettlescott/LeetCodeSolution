package com.scott.leetcode;

public class UniquePathsII {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int [][] matrix = {
        		  { 0,0,0 } ,
        		  { 0,1,0 },
        		  { 0,0,1 }
        } ;
        UniquePathsII p = new UniquePathsII ();
//        System.out.println(p.uniquePathsWithObstacles(matrix));
        int [] array = {100 , 1} ;
        System.out.println(p.getMax(array, 0, array.length - 1));
	}
	
	
	public int getMax (int [] array , int L , int R) {
		if (L == R) {
			return array[L];
		}
		int M = (L + R) / 2 ;
		int left = getMax (array, L ,M) ;
		int right = getMax (array, M + 1 ,R) ;
		return left >= right ? left : right;
		 			
	}
	
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
    	int m = obstacleGrid.length ;
    	if ( m == 0) return 0 ;
    	int n = obstacleGrid[0].length ;
        int [][] dp = new int [m][n]  ;        
        dp[0][0] = 1;
        for (int i = 1 ; i < m ; ++i) {
        	if (obstacleGrid[i][0] != 1)  {
        		dp[i][0] = dp[i-1][0] ;
        	} 
        }       
        for (int i = 1 ; i < n ; ++i) {
        	if (obstacleGrid[0][i] == 1)  {
        		dp[0][i] = dp[0][i - 1] ;
        	}
        }        
        for (int i = 1; i < m ; ++i ) {
        	for (int j = 1; j < n ; ++j) {
               dp[i][j] = 	obstacleGrid[i][j] != 1 ? dp[ i -1 ][j] + dp[i][j - 1] : 0 ;  	
        	}
        }        
        return dp [ m - 1][ n - 1 ];
    }

}
