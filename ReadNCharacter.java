package com.scott.code;

public class ReadNCharacter {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReadNCharacter r = new ReadNCharacter ();
		char [] ch = new char [1] ;
		r.read(ch, 1) ;
		System.out.println(ch[0]);
	}
	
	String text = "a";
	int bytes = 0 ;
	
	int read4(char[] buf){
		int i = text.length() < 4 ? text.length() : 4 ;
		char [] tmp = text.substring(bytes, bytes + i).toCharArray();
		System.arraycopy(tmp, 0, buf, bytes, i);
		bytes += i ;		
		return i ;
	}
	
	
	public int read(char[] buf, int n) {
	    char [] buffer = new char[4];
	    int total = 0 ;
	    boolean eof = false ;
	    while (!eof && total < n) {
	       int cur = read4(buffer);
	       if (cur < 4) {
	    	 eof = true ;   
	       }
	       int bytes = Math.min(n - total, cur) ;
	       System.arraycopy(buffer, 0, buf, total, bytes) ;
	       total += bytes ;
	    }	    
	    return total;
	 }
}
