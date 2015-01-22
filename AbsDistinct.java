package com.scott.code;

import java.util.HashSet;

public class AbsDistinct {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public int solution(int[] A) {
        // write your code in Java SE 8
		HashSet<Integer> set = new HashSet<> ();
		int count = 0 ;
		for (int c : A) {
			if (!set.contains(Math.abs(c))) {
			   count++;
			   set.add(Math.abs(c)) ;
			}
		}
		return count ;
    }

}
