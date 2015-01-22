package com.scott.code;

public class ReverseWord {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReverseWord r = new ReverseWord ();
		String rev = r.reverseWords("a");
		System.out.println(rev);
	}
	
	 
	public String reverseWords(String s) {	
		StringBuilder sb = new StringBuilder ();
		int j = s.length() ;
		for (int i = s.length() - 1; i >= 0 ; --i) {
		   if (s.charAt(i) == ' ') {
			   j = i ;
		   }else if (i == 0 || s.charAt(i - 1) == ' '){
			   if (sb.length() != 0 ) {
				   sb.append(" ");   
			   }			   			  
			   sb.append(s.substring(i,j));			   
		   }
		}	    			
		return sb.toString();
	}

}

