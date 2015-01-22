package com.scott.leetcode;

import java.util.LinkedList;
import java.util.List;

public class TwoSumIII {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TwoSumIII t = new TwoSumIII ();
		t.add(1);							
		t.add(3);			
		t.add(7);
		t.add(6);
		t.add(8);
		t.add(1);
		t.add(1);
		System.out.println(t.find(5));
		
		t.dumpArray() ;
	}
	
	int [] array = new int [10000] ;
	int end = 0 ;
	
    public void add(int number) {
    	if (end >= array.length){
	    	   throw new IllegalArgumentException("out of memory");
	     }    	
	    if (end == 0) {
	    	array[0] = number;
	    }else{
	       int index = add_Binary_search (number, end - 1);	       
	       for (int i = end ; i > index ; --i){	    	   
	    	    array[i] = array[i-1];   	   
	       }
	       array[index] = number;	      	       	       
	    }
	    end++;
	}

	public boolean find(int value) {
        int i  = 0 , j = end - 1;
        while (i < j) {
        	if (array[i] + array[j] > value) {
        		j-- ;
        	} else if (array[i] + array[j] < value) {
        		i++;
        	} else{
        		return  true;
        	}
        }
        return false ;
	}

	
	
	public int add_Binary_search (int number , int end){		
		int L = 0 , R = end ;
		while (L < R) {
			int M = (L + R) / 2 ;
			if (array[M] < number) {
				L = M + 1;
			} else{
				R = M ;
			}
		}
		return number <= array[L] ? L :  L + 1;
	}

	public void dumpArray (){
		for (int i = 0 ; i < end ; ++i) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
		
	}
}
