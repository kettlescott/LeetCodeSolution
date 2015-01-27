package com.scott;

public class DistinctSubsequences {

	/*
	Given a string S and a string T, count the number of distinct subsequences of T in S.

  A subsequence of a string is a new string which is formed from the original string by deleting some (can be none) of the characters without disturbing the relative positions of the remaining characters. (ie, "ACE" is a subsequence of "ABCDE" while "AEC" is not).

  Here is an example:
  S = "rabbbit", T = "rabbit"

  Return 3.
		*/
	
	/*
	 *  bottom up recursion
	 *  Idea 
	 *  if (S[i] == T[j]) 
	 *  there are two possibilities that T appears in S
	 *  a. T appears in [0...i]
	 *  b. T appears in [0...i - 1];
	 *  if (S[i] != T[j])
	 *  T can only appears in [0...i - 1] ;
	 *  then we come up with the below recursive expression
	 *  numDistinct (S, T , X , Y) = numDistinct (S, T , X - 1 , Y - 1) + numDistinct (S, T , X - 1 , Y) {S[i] == T[j]}
	 *  numDistinct (S, T , X , Y) = umDistinct (S, T , X - 1 , Y) {S[i] != T[j]} 
	 *  Then we create below recursive method.
	 */	
	 public int distinct (String S, String T, int x , int y){
		    if ( x < y) return 0 ;
	    	if ( y == 0) return 1 ;
	    	if (x <= 0 || y < 0) return 0 ;    	
	    	if (S.charAt(x - 1) == T.charAt(y - 1)) {    	
	    		return distinct (S, T, x -1, y -1) + distinct (S , T , x -1, y);
	    	} else{
	    		return distinct (S, T, x -1 , y);
	    	}    	
	 }
	
	
    public int numDistinct(String S, String T) {  
    	int [][] dp = new int[S.length() + 1][T.length() + 1];
    	for (int i = 0 ; i <= S.length() ; ++i) {
    		for (int j = 0 ; j <= T.length() ; ++j) {
    			 dp[i][j] = -1;
    		}
    	}
    	return distinct_memory (S, T , S.length(), T.length(),dp);  
    }

    /*
     * next , we need to identify if we have overlap subproblems when using pure recursive call
     * suppose For S , i = 5 , For T j =3 
     * our expanded tree will looks like below
     *          (5,3)
           (4,2)      (4,3)
        (3,1) (3,2)  (3,2) (3,3) 
     * as we can see (3,2) has been calculated twice
     * Then we could use a table to cache the values that have been calculated
     * next time , if we want to use these values we just need to lookup the table !     
     */
    public int distinct_memory (String S, String T, int x , int y, int [][] memory){
    	if ( x < y) return 0 ;
    	if ( y == 0) return 1 ;    	
    	if ( x <= 0 || y < 0) return 0 ;    	
    	if (S.charAt(x - 1) == T.charAt(y - 1)) {   
    		if(memory[x - 1][ y - 1] == -1) {
    			memory[x - 1][y - 1] = distinct_memory (S, T, x - 1, y - 1, memory) ;    			
    		}
    		if(memory[x - 1][y] == -1) {
    			memory[x - 1][y] = distinct_memory (S, T, x - 1, y ,memory) ;    			
    		}    	
    		memory[x][y] = memory[x -1][ y -1] + memory[x -1][y] ;
    		return memory[x][y]; 
    	} else{
    		return distinct_memory (S,T,x -1 , y ,memory);
    	}    	
    }
  
    /*
     * according to the above memoization version
     * we can easily build up the below solution 
     */
    public int numDistinct_dp(String S, String T) {
    	if (S.length() < T.length()) return 0 ;
    	int [][] dp = new int[S.length() + 1][T.length() + 1];
    	for (int i = 1 ; i <= S.length() ; ++i) {
    		//if T is a empty string we only have one way to convert S to T
    		// which is delete all chars from S
    		dp[i][0] = 1 ;
    	}
    	dp[0][0] = 1;
    	for (int i = 1 ; i <= S.length() ; ++i) {
    		for (int j = 1 ; j <= T.length() ; ++j) {
    			if (S.charAt(i -1) == T.charAt(j -1)) {
    				dp[i][j] = dp[i - 1][j - 1] + dp[i - 1][j];
    			} else{
    				dp[i][j] = dp[i - 1][j];
    			}
    		}
     	}
    	return dp[S.length()][T.length()] ;
    }

}
