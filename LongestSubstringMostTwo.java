package com.scott.code;

public class LongestSubstringMostTwo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LongestSubstringMostTwo m = new LongestSubstringMostTwo ();
		System.out.println(m.lengthOfLongestSubstringTwoDistinct_two_pointer("qqqaaaac"));
	}
	
	 public int lengthOfLongestSubstringTwoDistinct(String s) {
		 int [] count = new int[256];
	     int i = 0 ,  maxLen = 0 , distinct = 0 ;       	    
	     for (int j = 0 ; j < s.length() ; ++j){
	    	 if (count[s.charAt(j)] == 0) distinct++;
	    	 count[s.charAt(j)]++;
	    	 while (distinct > 2) {
	    		 count[s.charAt(i)]--;
	    		 if (count[s.charAt(i)] == 0) distinct --;	    		
	    		 i++;
	    	 }
	    	 maxLen = Math.max(maxLen, j - i +1);
	     }	     	     	    	    
	     return maxLen;	 
	 }

	 
	 public int lengthOfLongestSubstringTwoDistinct_two_pointer(String s) {
		 int dummy = -1 , rear = 0 , maxLen = 0;
		 for ( int i = 1 ; i < s.length() ; ++i) {
			 if (s.charAt(i) == s.charAt(i-1)) continue;
			 if (dummy >= 0 && s.charAt(dummy) != s.charAt(i)){
				 maxLen = Math.max(maxLen, i - rear);
				 rear = dummy + 1;
			 }
			 dummy = i -1 ;
		 }
		 return Math.max(maxLen, s.length() - rear);
	 }
	 
}
