package com.scott.code;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class SubstringwithConcatenation {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SubstringwithConcatenation c = new SubstringwithConcatenation ();
		String [] data = {"cac","aaa","aba","aab","abc"} ;
		c.findSubstring("abbaccaaabcabbbccbabbccabbacabcacbbaabbbbbaaabaccaacbccabcbababbbabccabacbbcabbaacaccccbaabcabaabaaaabcaabcacabaa", data);
	}
	
	//barfoothefoobarman
	 public List<Integer> findSubstring(String S, String[] L) {
	        HashMap<String,Integer> dict = new HashMap<>();
	        HashMap<String,Integer> found = new HashMap<> ();	     
	        List<Integer> result = new ArrayList<> ();
	        for (String c : L) {
	        	dict.put(c, dict.containsKey(c) ? dict.get(c) + 1 : 1 );
	        }
	        int eLen = L[0].length() ;
	        int count = 0, rear = 0 ;
	         for (int i = 0 ; i < eLen ; ++i) {
	        	 found.clear() ;	   
	        	 rear = i ; count = 0 ;
	        	 for (int j = i ; j <= S.length() - eLen ; j += eLen) {
	        		 String word = S.substring(j,  j + eLen) ;	        		 
	        		if (dict.containsKey(word)) {	        			
	        			int  c = found.containsKey(word) ?  found.get(word) + 1 : 1 ;
	        			if (c <= dict.get(word))
	        				count++;	        			
	        			found.put(word, c) ;
	        			while (L.length == count) {	        	
	        				//the length equals L.length * eLen, add rear to list	        				
	        				if (j + eLen - rear == L.length * eLen) {	        					
	        					result.add(rear) ; 	        				
	        				}
	        				String w = S.substring(rear, rear + eLen) ;
	        				if( dict.containsKey(w)) {
	        					int o = found.get(w) ;
	        					o--;
	        					found.put(w, o);
	        					if (o < dict.get(w)) 
	        						count--;
	        				}
	        				rear += eLen;
	        			}
	        		} else {	        			
	        			count = 0 ;
	        			found.clear() ;	   	
	        			rear = j + eLen;	
	        		}	        		 	
	        	 }
	         }
		    return result ;	 
	 }
	 
	 public List<Integer> findSubstring_new(String S, String[] L) {
		 HashMap<String,Integer> dict = new HashMap<>();
	        HashMap<String,Integer> found = new HashMap<> ();	     
	        List<Integer> result = new ArrayList<> ();
	        for (String c : L) {
	        	dict.put(c, dict.containsKey(c) ? dict.get(c) + 1 : 1 );
	        }
	        int eLen = L[0].length() ;
	        int count = 0, rear = 0 ;
	         for (int i = 0 ; i < eLen ; ++i) {
	        	 found.clear() ;	   
	        	 rear = i ; count = 0 ;
	        	 for (int j = i ; j <= S.length() - eLen ; j += eLen) {
	        		 String word = S.substring(j,  j + eLen) ;	        		 
	        		if (dict.containsKey(word)) {	        			
	        			int  c = found.containsKey(word) ?  found.get(word) + 1 : 1 ;
	        			if (c <= dict.get(word))
	        				count++;	        			
	        			found.put(word, c) ;
	        			while (found.get(word) > dict.get(word)){
	        				String w = S.substring(rear, rear + eLen) ;
	        				found.put(w, found.get(w) - 1) ;
	        				if (found.get(w) < dict.get(w))
	        					count--;
	        				rear += eLen;
	        			}
	        			if (count == L.length) {
	        				System.out.println(rear);
	        				String w = S.substring(rear, rear + eLen) ;
	        				//advance rear to remove current word from sequence	        				
	        				found.put(w, found.get(w) - 1) ;
	        				count--;
	        				rear += eLen;	        				
	        			}
	        		} else {	        			
	        			count = 0 ;
	        			found.clear() ;	   	
	        			rear = j + eLen;	  	        			
	        		}	        		 	
	        	 }
	         }
		    return result ;	 
	 }
	 
	 
	 

}
