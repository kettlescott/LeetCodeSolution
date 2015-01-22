package com.scott.leetcode;

import java.util.ArrayList;
import java.util.List;

public class MissingRanges {


	  public List<String> findMissingRanges(int[] A, int lower, int upper) {
          int start = lower - 1;
          List<String> result = new ArrayList<> ();
          for (int i = 0 ; i <= A.length ; ++i) {
        	  int end = i == A.length ? upper + 1 : A[i];
        	  if (end - start >= 2) 
        		  result.add(getRange (start + 1, end - 1));
        	  start = end ;        		  
          }    
    	  return result ;
    }
    
    public String getRange (int start , int end){
    	return start == end ? String.valueOf(start) : String.valueOf(start) + "->" + String.valueOf(end) ;
    }

}
