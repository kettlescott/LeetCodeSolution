package com.scott.leetcode;

import java.util.HashMap;
import java.util.Map;

public class TwoSumIIIHash {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	HashMap <Integer,Integer> map = new HashMap<> ();
	
	public void add(int number) {
	    int count = map.containsKey(number) ? map.get(number) : 0 ;
	    map.put(number, count + 1);
	}

	public boolean find(int value) {
	    for (Map.Entry<Integer, Integer> pair : map.entrySet()) {
	    	int number = pair.getKey() ;
	    	int dif =  value - number ;
	    	if (dif == number) {
               if (pair.getValue() >= 2) {
            	   return true ;
               }
	    	}else if (map.containsKey(dif)) {
	    		 return true;
	    	}	    	
	    }
	    return false;
	}
	
}
