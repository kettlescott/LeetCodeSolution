package com.scott.leetcode;

import java.util.Stack;

public class SumRoottoLeafNumbers {

	
	
    public int sumNumbers(TreeNode root) {                	
    	return cal (root,0); 
    }
    
    public int cal (TreeNode root, int val){
    	if (root == null) return 0 ;
    	if (root.left == null && root.right == null) return val * 10 + root.val;    	
    	return cal (root.left, val * 10 + root.val) + cal (root.right, val * 10 + root.val);
    }
    
    
    public int sumNumbers_iter (TreeNode root){
    	Stack<TreeNode> stack = new Stack<TreeNode> ();
    	int sum = 0 ;     	
    	stack.push(root) ;    	
    	while (!stack.isEmpty() && root != null) {
    		TreeNode curr = stack.pop() ;    		
    		if (curr.left == null && curr.right == null) {    			
    			sum += curr.pre * 10 + curr.val ;
    		}
    		int pre = curr.pre * 10 + curr.val ;
    		if (curr.right != null) {
    			curr.right.pre = pre;    			
    			stack.push(curr.right) ;
    		}    	
    		if (curr.left != null) {
    			curr.left.pre = pre ;    			
    			stack.push(curr.left) ;
    		}    		    			    	
    	}
    	return sum ;
    }

    
    
}
