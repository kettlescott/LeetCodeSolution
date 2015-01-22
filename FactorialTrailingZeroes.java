package com.scott.leetcode;

public class FactorialTrailingZeroes {


	
    public int trailingZeroes(int n) {
    	if (n == 0) return 0 ;    	
    	int count = 0 ;
    	while (n != 0){
    	  count += cal (n);    	  
    	  n--;
    	}               
        return count;
    }
    
    public int cal (int n){
    	int count = 0 ;    	
    	while (n % 5 ==0) {
    		n /= 5;
    		count++;
    	}
    	return count;
    }

}
