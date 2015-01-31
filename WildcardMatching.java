package com.scott;

public class WildcardMatching {

    /*
     '?' Matches any single character.
'*' Matches any sequence of characters (including the empty sequence).

The matching should cover the entire input string (not partial).

The function prototype should be:
bool isMatch(const char *s, const char *p)

Some examples:
isMatch("aa","a") → false
isMatch("aa","aa") → true
isMatch("aaa","aa") → false
isMatch("aa", "*") → true
isMatch("aa", "a*") → true
isMatch("ab", "?*") → true
isMatch("aab", "c*a*b") → false
    */
	
    public boolean isMatch(String s, String p) {
    	int pl = 0;  
        for (int i = 0; i < p.length(); i++) {  
             if (p.charAt(i) != '*') {  
                  pl++;  
             }  
        }  
        if (pl > s.length()) return false;  
    	int [][] dp = new int [s.length() + 1][p.length() + 1] ;
    	for (int i = 0 ; i <= s.length() ;++i) {
    		for (int j = 0 ; j <= p.length(); ++j) {
    			dp[i][j] = -1;
    		}
    	}    	
        return match (s,p,s.length(),p.length(),dp) == 1;
    }
    
    
    public boolean match_nocache (String s, String p ,int x , int y) {
    	if (x == 0) {
    		while (y > 0  && p.charAt(y - 1) == '*') y--;
    	    return x == y ;
    	}    	
    	if (x < 0 || y <= 0) return false ;
    	if (p.charAt( y - 1) == '?' || s.charAt( x - 1) == p.charAt( y - 1)) {    		
    		return match_nocache (s, p , x - 1, y - 1);     		
    	} else if (p.charAt(y - 1) == '*') {    		    		
    		return match_nocache (s, p , x - 1, y) || match_nocache (s, p , x, y - 1);
    	}
    	return false ;
    }
    
    public int match (String s, String p ,int x , int y , int [][] dp){
    	if (x == 0) {
    		while (y > 0  && p.charAt(y - 1) == '*') y--;
    	    return x == y ? 1 : 0;	
    	}    	
    	if (x < 0 || y <= 0) return 0 ;
    	if (p.charAt( y - 1) == '?' || s.charAt( x - 1) == p.charAt( y - 1)) {
    		if (dp[x - 1][y - 1] == -1) {
    			dp[x - 1][y - 1] = match (s, p , x - 1, y - 1 , dp) ;
    		}
    		return dp[x - 1][y - 1];
    	} else if (p.charAt(y - 1) == '*') {    		
    		if ( dp[x - 1][y] == -1) {
				 dp[x - 1][y] = match (s, p , x - 1, y , dp) ;    				
			}			
			return dp[x - 1][y] == 1 ? dp[x - 1][y] : dp[x][y - 1] == -1 ? match (s, p , x, y - 1,dp) :dp[x][y - 1] ;
    	}
    	return 0 ;
    }
    
    public boolean isMatch_iter(String s, String p) {
		 int pl = 0;
		 for (int i = 0; i < p.length(); i++) {
		    if (p.charAt(i) != '*') {
		           pl++;
		      }
		 }
		if (pl > s.length()) return false; 
	   boolean [][] dp = new boolean[s.length() + 1][p.length() + 1] ;
	   dp[0][0] = true ;
	   for (int i = 1 ; i <= p.length() ; ++i) {
		   if (dp[0][i - 1] && p.charAt(i - 1) == '*') dp[0][i] = true ;
	   }	  
	   for (int i = 1 ; i <= s.length()  ; ++i) {		   
		   for (int j = 1 ; j <= p.length() ; ++j) {
			   if (p.charAt(j - 1) == '?' || s.charAt( i - 1) == p.charAt(j - 1)) {
				  dp [i][j] = dp[i -1][j - 1];
			   } else if (p.charAt(j - 1) == '*') {
				   dp [i][j] = dp[i -1][j] || dp[i][j - 1]; 
			   } else {				   
				   dp [i][j] = false ;
			   }
		   }
	   }	   
	   return dp[s.length()][p.length()] ;	 
	 }

}
