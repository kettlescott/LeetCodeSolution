package com.scott.leetcode;

import java.util.Stack;

public class FlattenBinaryTreetoLinkedList {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	
    public TreeNode flatten(TreeNode root) {
        if (root == null) return null  ;
        TreeNode left  = flatten (root.left);
        TreeNode right = flatten (root.right);
        root.right = left ;
        root.left = null ;
        TreeNode t = root ;
        while (t != null && t.right != null) {
        	t = t.right ;
        }
        if (t != null) t.right = right;        
        return root ;      
    }
    
    
    public TreeNode flatten_iter(TreeNode root) {
        Stack<TreeNode> stack = new Stack<TreeNode> ();
        TreeNode curr = root ;
        while (!stack.isEmpty() && curr != null) {
            if (curr.left == null) {
            	TreeNode p = stack.peek() ;
            	p.left = null ;
            	TreeNode r = p.right ;
            	if (r == null) {
            		stack.pop() ;
            	}
            } else{
            	stack.push(curr);
            	curr = curr.left ;
            }
        }        
        return root;
        
    }
	
}
