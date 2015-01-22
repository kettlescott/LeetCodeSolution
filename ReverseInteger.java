package com.scott.code;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class ReverseInteger {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReverseInteger r = new ReverseInteger ();
		System.out.println(r.reverse(-123));
		int x = 1463847412 ;
		String [] data = {"JFK","LXA", "SNA", "RKJ", "LXA", "SNA"} ;
		System.out.println(r.findPath(data));
	}
	
    public int reverse(int x) {
       long sum = 0 ;
       while (x != 0) {    	   
    	   sum = sum * 10 + x % 10 ;
    	   x /= 10;
    	   if (sum >= Integer.MAX_VALUE || sum <= Integer.MIN_VALUE)
    		   return 0 ;
       }    
       return  (int)sum ;    
    }
    
    public String findPath (String [] airports){
    	HashSet <String> set = new  HashSet<> ();
    	HashMap<String,String> map = new HashMap<> ();
    	for (int i = 0 ; airports.length - 2 >= i  ; i += 2){
    		map.put(airports[i], airports[i+1]);
    		set.add(airports[i+1]) ;
    	}
    	String from = null ;
    	for (String c : airports) {
    		if (!set.contains(c)) 
    			from = c ;
    	}  
    	StringBuilder sb = new StringBuilder ();
    	sb.append(from) ;
    	while (map.containsKey(from)) {    	   
    	   	sb.append("->") ;
    	   	sb.append(map.get(from)) ;
    	   	from = map.get(from) ;
    	}    	
    	return sb.toString() ;
    }
   

}
