package com.scott;

import java.util.ArrayList;
import java.util.List;

public class PalindromePartitioning {

	 /*
	 Given a string s, partition s such that every substring of the partition is a palindrome.

Return all possible palindrome partitioning of s.

For example, given s = "aab",
Return

  [
    ["aa","b"],
    ["a","a","b"]
  ]
	 */
     public List<List<String>> partition(String s) {
    	 List<List<String>> result = new ArrayList<List<String>> ();
    	 List<String> curr = new ArrayList<String> ();
    	 if (s == null || s.length() == 0) return result ;
    	 getPalindrome (s, result ,curr,0);
    	 return result;    	
     }
     
     private void getPalindrome (String s, List<List<String>> result ,List<String> curr , int start) {
    	 if (start >= s.length()) {
    		 result.add(new ArrayList<String> (curr));
    	 }
    	 for (int i = start ; i < s.length() ; ++i) {
    		 String word = s.substring(start, i + 1) ;
    		 if (isPalindrome (word)) {
    			 curr.add(word) ;
    			 getPalindrome (s,result,curr,i + 1);
    			 curr.remove(curr.size() - 1) ;
    		 }
    	 }    	 
     }
	
	
	 public boolean isPalindrome(String s){
		 for (int i = 0 , j = s.length() - 1 ; i < j ; ++i , --j) {
			 if (s.charAt(i) != s.charAt(j)) return false ;
		 }
		 return true ;
	 }
	
}
