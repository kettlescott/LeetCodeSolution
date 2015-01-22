package com.scott.leetcode;

import java.util.Stack;

public class SymmetricTree {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      String [] data = {"1","2","2","#","4","4","#"};
      TreeNode root = LeetCodeTree.createTree(data) ;
      SymmetricTree t = new SymmetricTree ();
      System.out.println(t.isSymmetric_iter(root));
	}
	
	
	
    public boolean isSymmetric(TreeNode root) {      
    	if (root == null) return true ;
       return doCompare (root.left,root.right) ;
    }
    
    public boolean doCompare (TreeNode left , TreeNode right){
    	if (left == null || right == null) 
    		return left == right ;
    	if (left.val == right.val) 
    		return doCompare (left.left, right.right) && doCompare (left.right, right.left);
    	return false ;
    }
    
    public boolean isSymmetric_iter (TreeNode root){
    	if (root == null) return true ;
    	Stack<TreeNode> stack = new Stack <> ();
    	stack.push(root.left) ;
    	stack.push(root.right) ;
    	while (!stack.isEmpty() && root != null) {
    		TreeNode a = stack.pop() ;
    		TreeNode b = stack.pop() ;
    		if (a == null || b == null) {
    			if (a != b) return false ;
    		}
    		if (a != null && a != null) {
    			if (a.val != b.val) return false ;
    			stack.push(a.left);
        		stack.push(b.right);
        		stack.push(a.right);
        		stack.push(b.left);	
    		}    		    		
    	}    	    
    	return true ; 
    }
    
    

}

