
package com.scott;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class PermutationsII {

	 /*
	 Given a collection of numbers that might contain duplicates, return all possible unique permutations.

For example,
[1,1,2] have the following unique permutations:
[1,1,2], [1,2,1], and [2,1,1].
	 */
	
    public List<List<Integer>> permuteUnique(int[] num) {
    	List<List<Integer>> result = new ArrayList<List<Integer>> () ;
    	List<Integer> curr = new ArrayList<> () ;
    	boolean [] used = new boolean[num.length];
    	Arrays.sort(num);
    	permutation (result, curr,num , used);
        return result ;
    }
    
    public void permutation (List<List<Integer>> result , List<Integer> curr, int [] num , boolean [] used){    	
    	if (curr.size() == num.length) {    		
    		result.add(new ArrayList<Integer> (curr)) ;
    	}    	
    	for (int i = 0 ; i < num.length ;++i) {    		
    		// if  n - 1 is unused , n will be used
    		if (used[i] ||i != 0 && num[i] == num[i-1] && !used[i - 1]) {    			
    			continue ;
    		}    		    	
    		curr.add(num[i]) ;    		
    		used[i] = true ;
    		permutation (result, curr, num , used);
    		used[i] = false ;
    		curr.remove(curr.size() -1) ;
    	}
    }

    public void permutation_withSet(List<List<Integer>> result , List<Integer> curr, int [] num , boolean [] used ){    	
    	if (curr.size() == num.length) {    		
    		result.add(new ArrayList<Integer> (curr)) ;
    	}  
    	HashSet<Integer> set = new HashSet<> ();
    	for (int i = 0 ; i < num.length ;++i) {    		
    		if (used[i] || set.contains(num[i])) {    			
    			continue ;
    		}    		    	
    		curr.add(num[i]) ;    		
    		set.add(num[i]) ;
    		used[i] = true ;
    		permutation_withSet (result, curr, num , used);
    		used[i] = false ;
    		curr.remove(curr.size() -1) ;
    	}
    }
    
}
