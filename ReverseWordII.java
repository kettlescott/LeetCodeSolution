package com.scott.code;

import java.util.ArrayList;
import java.util.List;

public class ReverseWordII {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReverseWordII r = new ReverseWordII ();
		char [] chs = "the sky is blue".toCharArray() ;
		r.reverseWords(chs);
//		System.out.println(new String(chs));
		System.out.println(r.reverseWords_twoPass("the sky is blue"));
		int [] data = {0, 1, 2, 3, 4, 5, 6};
		r.rotate(data, 3);
		for (int c : data) {
			System.out.print(c + " ");
		}
		System.out.println();
	}
	
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
