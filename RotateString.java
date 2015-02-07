package com.scott.leetcode;

public class RotateString {


   /*
   Given a string and an offset, rotate string by offset. (rotate from left to right)
Example

Given "abcdefg"

for offset=0, return "abcdefg"

for offset=1, return "gabcdef"

for offset=2, return "fgabcde"

for offset=3, return "efgabcd"
   
   */
   public char[] rotateString(char[] A, int offset) {
	        // wirte your code here
	      if (A.length == 0 ) return A ;
	      offset = offset % A.length ;
	      swap (A, 0, A.length - 1);
	      int start = offset - 0 ;
	      swap (A, 0, offset - 1);
	      swap (A, start, A.length - 1);
	      return A;
   }
   
   
   private void swap(char [] A, int start, int end){
	   for (int i = start , j = end ; i < j ;++i , -- j) {
		   char tmp = A [i] ;
		   A[i] = A[j] ;
		   A[j] = tmp ;		   
	   }
   }

}
