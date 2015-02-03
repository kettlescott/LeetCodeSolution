package com.scott;

public class RemoveDuplicateChar {

	
	public String removeDuplicateChar (String s){
		int [] charMap = new int[128];
		char [] chs = s.toCharArray() ;
		int j = 0 ;
		for (int i = 0 ; i < chs.length ; ++i) {
			if (charMap[s.charAt(i)] == 0) {
				chs[j] = chs[i] ;
				j++;
				charMap[s.charAt(i)] = 1 ;
			}
		}
		return new String (chs,0,j) ;
	}
}
