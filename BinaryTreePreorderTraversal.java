package com.scott.leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class BinaryTreePreorderTraversal {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	 public List<Integer> preorderTraversal(TreeNode root) {
	        List<Integer> result = new ArrayList<Integer> ();
	        Stack<TreeNode> stack = new Stack<TreeNode> ();
	        if (root != null)
	        	stack.push(root);	        		        
	        while (!stack.isEmpty()) {
	        	TreeNode curr = stack.pop() ;
	        	result.add(curr.val) ;
	        	if (curr.left != null) 
	        		stack.push(curr.left) ;
	        	if (curr.right != null)
	        		stack.push(curr.right) ;	        	
	        }	    	        
	        return result ;	 
	 }
	 
	 static class TreeNode { 
		 int val ;
		 TreeNode left ;
		 TreeNode right ;
		 TreeNode(int x) { 
			 val = x; 
		 }
	 }

}
