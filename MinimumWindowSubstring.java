package com.scott.leetcode;

import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;

import static java.lang.System.out;
import static java.nio.file.Files.readAllBytes;
import static java.nio.file.Paths.get;
public class MinimumWindowSubstring {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		MinimumWindowSubstring m = new MinimumWindowSubstring ();
		byte [] by = readAllBytes(get("c://input.txt")) ;
		String input = new String(by);
		String output = new String(readAllBytes(get("c://target.txt")));
//		System.out.println(output.length());
		char [] chs = m.minWindow("ADOBECODEBANC","ABC").toCharArray();
		
		System.out.println(m.checkPattern("xyzxyzxyz", "xyz"));
		
		
	}
	
	public void findAll (int [] A , int [] B){
		HashMap<Integer,Integer> map = new HashMap<> ();
		for (int i = 0 ; i < A.length ; ++i) {
			map.put(A[i], i) ;
		}
 		
	}
	
	public boolean checkPattern (String s, String p){
		if (s.length() % p.length() != 0) 
			return false ;
		HashSet<String> set = new HashSet<> ();
		set.add(p) ;
		for (int i = 0 ; s.length() - i >= p.length()  ;  i += p.length()) {
			 String w = s.substring(i, i + p.length()) ;
			 if (!set.contains(p)) return false ;		     
		}					
		return true ;
	}
	
	
	public String removeSpace (String s){
		char [] chs = s.toCharArray() ;
		int j = 0 ;
		boolean preIschar = false ;
		for (int i = 0 ; i < chs.length ; ++i) {
			if (chs[i] != ' ') {				
				chs[j++] = chs[i];	
				preIschar = true ;
			} else {
		        if (preIschar) {
		        	chs[j++] = chs[i];
		        	preIschar = false ;
		        }
			}
		}		
		if (!preIschar)
			j = j - 1 ;
		return new String(chs,0,j);
	}
	
	public String minWindow_one_map(String S, String T) {
		 HashMap<Character,Integer> required = new HashMap<> ();
	        for (Character c : T.toCharArray()) {
	        	int count = required.containsKey(c) ? required.get(c) : 0 ;
	        	required.put(c, count + 1);
	        }
	        int minLen = Integer.MAX_VALUE  , rear = 0 , len = 0 , i = 0 ;
	        String result = "" ;
	        for (; i < S.length() ;  ++i) {
	           if (required.containsKey(S.charAt(i)) && required.get(S.charAt(i)) > 0) {
	        	   required.put(S.charAt(i), required.get(S.charAt(i)) - 1) ;
	        	   len++;
	           }	           
	           while (len == T.length()) {	        	   
	        	   if (i - rear + 1 < minLen) {
	        		   minLen = i - rear + 1;
	        		   result = S.substring(rear, i + 1);	        		   
	        	   }
	        	   if (required.containsKey(S.charAt(rear)) && required.get(S.charAt(rear)) == 0){	    	        	
	        		   required.put(S.charAt(rear), required.get(S.charAt(rear)) + 1);
	        		   len--;	        		   
	        	   }
	        	   rear++;
	           }
	           
	        }	        	        	        
	        return result;
	 }
	
	 public String minWindow(String S, String T) {
	        HashMap<Character,Integer> dict = new HashMap<> ();
	        for (Character c : T.toCharArray()) {
	        	int count = dict.containsKey(c) ? dict.get(c) : 0 ;
	        	dict.put(c, count + 1);
	        }
	        int minLen =  Integer.MAX_VALUE  , rear = 0 , len = 0;
	        String result = "" ;
	        HashMap<Character,Integer> map = new HashMap<Character,Integer> ();
	        for (int i = 0 ; i < S.length() ;++i) {
	        	Character c = S.charAt(i) ;
	        	if (dict.containsKey(c)) {
	        		int count = map.containsKey(c) ? map.get(c) + 1 : 1;
		        	if (count <= dict.get(c))
		        		len++;
		        	map.put(c, count);			        	
	        	}	 	        	               
	        	 while (len == T.length()) {
	        		 if (dict.containsKey(S.charAt(rear))) {
	        			 int count = map.get(S.charAt(rear)) ;
	        			 count--;
	        			 map.put(S.charAt(rear), count) ;
	        			 if (count < dict.get(S.charAt(rear))) 
	        				 len--;	        			 
	        		 }
	        		 if (i - rear + 1 < minLen) {
	        			 minLen = i -rear + 1 ;
	        			 result = S.substring(rear , i + 1) ; 
	        		 }	        		 
	        		 rear++;
	        	 }
	        }	    	 
	     return result ;
	 }	
	
	 public String minWindow_array(String S, String T) {
	       String result = "" ;
	       // ASCII
	       int [] map = new int [256] ;
	       for (Character c: T.toCharArray())
	    	   map[c]++;
	       int j = 0 , count = 0 , minLen = Integer.MAX_VALUE;
	       for (int i = 0 ; i < S.length() ; ++i) {
	    	   map[S.charAt(i)]--;
	    	   if (map[S.charAt(i)] >= 0)
	    		   count++;
	    	   while (count == T.length()) {
	    		   if (i - j + 1 < minLen) {
	    			   minLen = i - j + 1 ;
	    			   result = S.substring(j, i + 1) ;
	    		   }
	    		   map[S.charAt(j)]++;
	    		   if (map[S.charAt(j)] > 0) count--;
	    		   j++;
	    	   }
	       }	       	       
	       return result ;
	 }	
	 

}
