package com.scott.leetcode;

public class ReadNCharacterII {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	char [] buffer = new char[4];
	int buffersize = 0;
	int offset = 0;
	
	 public int read4(char[] buf) {
		 return 4 ;
	 }
	 
	 public int read(char[] buf, int n) {
	      boolean eof = false ;
	      int readBytes = 0 ;
	      while (!eof && readBytes < n) {
	    	  if (buffersize != 0) {
	    		  buffersize = read4 (buffer);
	    		  eof = buffersize < 4 ;
	    	  }
	    	  int bytes = Math.min(n - readBytes, buffersize);
	    	  buffersize -= bytes;
	      }	    
	      return readBytes ;	 
	 }

}
