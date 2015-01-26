package com.scott;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Permutations {

    /*
    Given a collection of numbers, return all possible permutations.

For example,
[1,2,3] have the following permutations:
[1,2,3], [1,3,2], [2,1,3], [2,3,1], [3,1,2], and [3,2,1].
    */
	
    public List<List<Integer>> permute(int[] num) {
    	List<List<Integer>> result = new ArrayList<List<Integer>> ();
    	List<Integer> list = new LinkedList<Integer> ();
    	if (num == null || num.length == 0) return result ;
    	boolean [] map = new boolean [num.length] ;
    	doPermutation (num, result, list, map);
    	return result;
    }
    
    
    public void doPermutation(int [] num ,List<List<Integer>> result, List<Integer> list ,boolean [] map){
    	if (list.size() == num.length) {
    		result.add(new LinkedList<Integer> (list));  
    		return ;
    	}
    	for (int i = 0 ; i < num.length ; ++i) {
    		if (map[i]) continue ;
    		list.add(num[i]) ;
    		map[i] = true ;
    		doPermutation (num,result,list,map);
    		map[i] = false ;
    		list.remove(list.size() -1) ;
    	}
    }

}
