package com.scott;

public class EditDistance {

  /*
    Given two words word1 and word2, find the minimum number of steps required to convert word1 to word2. (each operation is counted as 1 step.)

    You have the following 3 operations permitted on a word:

    a) Insert a character
    b) Delete a character
    c) Replace a character
  */

	 public int minDistance_dp_memory(String word1, String word2) {
		 int [][] dp = new int[word1.length() + 1][word2.length() + 1] ;
		 for (int i = 0 ; i <= word1.length() ; ++i) {
			 for (int j = 0 ; j <= word2.length() ; ++j) {
				 dp[i][j] = -1;
			 }
		 }
		 int edit = cal_memory (word1, word2, word1.length(), word2.length(), dp);
	     return  edit ;
	 }
	 
	 
	 
	 public int cal_memory (String word1, String word2, int x, int y, int [][] memory){
		 if (x == 0) return y ;
		 if (y == 0) return x ;
		 if (memory[x - 1][y - 1] == -1) {			 
			 memory[x - 1][y - 1] = cal_memory (word1, word2, x - 1, y - 1, memory );
		 } 
		 if (memory[x][y - 1] == -1) {
			 memory[x][y - 1] = cal_memory (word1, word2, x , y - 1, memory );
		 } 
		 //delete
		 if (memory[x -1][y] == -1) {
			 memory[x -1][y] = cal_memory (word1, word2, x - 1 , y , memory );
		 } 
		 int sub = memory[x - 1][y - 1] + (word1.charAt(x - 1) == word2.charAt(y - 1) ? 0 : 1) ;
		 int insert = memory[x][y - 1] + 1;
		 int delete = memory[x -1][y] + 1 ;
		 memory[x][y] = Math.min(sub, Math.min(delete, insert)) ;
		 return memory[x][y] ;
	 }
	 
	 public int minDistance_dp(String word1, String word2) {
	        int [] [] dp = new int [word1.length()+1][word2.length()+1];
			for (int i = 0 ;i <= word1.length() ;++i){
				dp[i][0] = i;
			}			
			for (int j = 0 ;j <= word2.length() ;++j){
				dp[0][j] = j;
			}			
			for (int i = 1 ; i <= word1.length() ; ++i) {
				for (int j = 1 ; j <= word2.length() ; ++j) {
				  int sub = dp[i-1][j-1] + (word1.charAt(i -1) == word2.charAt(j-1) ? 0 :1) ;
				  int insert = dp[i][j-1] + 1 ;
				  int delete = dp[i - 1][j] + 1 ;
				  dp[i][j] = Math.min(sub, Math.min(insert,delete));
				}
			}					
			return dp[word1.length()][word2.length()];     
	    }
	 
  public int minDistance_recursive(String word1, String word2) {
		return  cal (word1, word2, word1.length(), word2.length());
	 }

	 public int cal (String word1, String word2, int x, int y){
		 if (x == 0) return y ;
		 if (y == 0) return x ;
		 int sub = cal (word1, word2, x - 1, y - 1) + (word1.charAt(x -1) == word2.charAt(y - 1) ? 0 : 1);
		 int insert = cal (word1, word2, x, y - 1) + 1 ;
		 int delete = cal (word1, word2, x - 1, y) + 1 ;
		 return Math.min(sub, Math.min(delete, insert)) ;
	 }
	 
	 
	 
}
