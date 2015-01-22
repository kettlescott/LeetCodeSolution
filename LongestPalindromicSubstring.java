package com.scott.leetcode;

public class LongestPalindromicSubstring {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LongestPalindromicSubstring p = new LongestPalindromicSubstring ();
		System.out.println(p.longestPalindrome_dp("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaabcaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"));
	}
	
	
	public String longestPalindrome_dp(String s) {
		if (s.length() == 0) return "" ;
		int [][] dp = new int [s.length()][s.length()] ;
		for (int i = 0 ; i < s.length() ; ++i) {
			for (int j = 0 ; j < s.length() ; ++j) {
				if (i == j) 
					dp[i][j] = 1;
			}
		}
		int start = 0 , end = 0 , maxLen = 0; 
		for (int i = 1 ; i < s.length() ; ++i) {
			for (int j = 0 ; j < i ; ++j) {
				if (s.charAt(i) == s.charAt(j)) {
					if ( i == j + 1 || dp[j +  1][i - 1] != 0) {
						dp[j][i] = dp[j+1][i-1] + 2;
					} 
					if (dp[j][i] >  maxLen) {
						maxLen = dp[j][i];
						start = j ;
						end = i;
					}
				}
			}
		}			
		return s.substring(start, end + 1) ;
	}
	
	
	public String longestPalindrome(String s) {
		int start = 0 , end = 0 ;
		for (int i = 0 ; i < s.length() ; ++i) {
			//like ABA, B will be the center
			int len = expandAroundCenter (s, i , i);
			//like ABBA, BB will be the center
			int len1 = expandAroundCenter (s, i , i + 1);
			len = Math.max(len, len1) ;
			if (len > end - start + 1){
				start = i - (len - 1) / 2 ;
				end = len/2 + i;
			}
		}	
		return s.substring(start, end + 1) ;
	}
	
	private int expandAroundCenter (String s , int left, int right){
		int L = left , R = right ;
		while (L >= 0 && R < s.length() && s.charAt(L) == s.charAt(R)) {
			L--;
			R++;
		}
		return R - L - 1 ;		
	}

}
