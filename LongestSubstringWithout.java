package com.scott.leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class LongestSubstringWithout {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
   
	public int lengthOfLongestSubstring(String s) {
      int maxLen = 0 , rear = 0 ;
      HashSet<Character> set = new HashSet<>();
      for (int i = 0 ; i < s.length() ; ++i) {
    	  while (set.contains(s.charAt(i))) {
    		  set.remove(s.charAt(rear));
    		  rear++;
    	  }
    	  set.add(s.charAt(i));
    	  maxLen = Math.max(maxLen, i - rear + 1);
      }
      return maxLen;
    }
	
	public int lengthOfLongestSubstring_one_loop(String s) {
	      int maxLen = 0 , rear = 0 ;
	      HashMap<Character,Integer> map = new HashMap<Character,Integer> ();
	      for (int i = 0 ; i < s.length() ; ++i) {
	    	  if (map.containsKey(s.charAt(i)) && map.get(s.charAt(i)) >= rear) {
	    		  rear = map.get(s.charAt(i)) + 1;
	    	  }
	    	  map.put(s.charAt(i),i);
	    	  maxLen = Math.max(maxLen, i - rear + 1) ;
	      }	      	      
	      return maxLen;
	    }

}
