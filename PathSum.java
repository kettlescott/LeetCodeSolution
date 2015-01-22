package com.scott.leetcode;

import java.util.Stack;

public class PathSum {


	
	 public boolean hasPathSum(TreeNode root, int sum) {
	    Stack <TreeNode> stack = new Stack<> ();	    
	    stack.push(root) ;	    
	    while (!stack.isEmpty() && root != null){
	    	TreeNode cur = stack.pop() ;	
	    	if (cur.left == null && cur.right == null){	    		
	    		if (cur.val == sum ) return true ;
	    	}
	    	if (cur.right != null) {
	    		cur.right.val = cur.val + cur.right.val ;
	    		stack.push(cur.right) ;
	    	}
	    	if (cur.left != null) {
	    		cur.left.val = cur.val + cur.left.val;
	    		stack.push(cur.left);
	    	}
	    }	    
	    return false ;
	 }

}
