package com.scott.leetcode;

import java.util.ArrayList;
import java.util.List;

public class ReverseWordII {


	
	public void rotate (int[] A, int k){		
		 k = k % (A.length - 1);		 
		 if (k > 0){			 
			 while (k-- > 0){
				 int tmp = A[A.length - 1];
				 for (int j = A.length - 1 ; j > 0 ; --j){
					 A[j] = A[j -1];
				 }
				 A[0] = tmp;				 
			 }
		 }
	}

	public String reverseWords_twoPass(String s) {
		int j = 0 ;
		List<String> words = new ArrayList<>();
		for (int i = 0 ; i < s.length() ; ++i){
		   if (s.charAt(i) == ' ') {
			  j = i ;
		   } else if( i + 1 == s.length() || s.charAt(i + 1) == ' '){
			   int start = s.charAt(j) != ' ' ? j : j + 1;
			   words.add(s.substring(start,i + 1 )) ;   	  
		   }
		}
		
		StringBuilder sb = new StringBuilder ();
		for (int i = words.size() - 1 ; i >= 0 ; --i){
			if (sb.length() != 0) {
				sb.append(" ");
			}
			sb.append(words.get(i));
		}
		return sb.toString() ;
	}
	
	
	public void reverseWords(char[] s) {
		reverse (s, 0 , s.length - 1);
		int i = 0 , j = 0;
		for ( ; j <= s.length ; ++j) {
			if (j ==s.length || s[j] == ' '){
				reverse(s,i, j - 1);
				i = j + 1;
			}
		}
	}

	
	private void reverse (char [] chs , int start, int end){
		for (int i = start , j = end ; i < j ; ++i , --j) {
			char tmp = chs[i] ; 
			chs[i] = chs[j] ;
			chs[j] = tmp;
		}
	}
}
