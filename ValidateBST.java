package com.scott.code;

import java.util.Stack;


public class ValidateBST {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ValidateBST v = new ValidateBST ();
		String [] data = {"1" ,"#" , "1"} ;
		TreeNode root = LeetCodeTree.createTree(data) ;
		System.out.println(v.isValidBST_iter(root));
	}
	
	
	
	 public boolean isValidBST_iter (TreeNode root){
		   Stack<TreeNode> stack = new Stack<TreeNode> ();
		   TreeNode cur = root ;
		   TreeNode pre = null ;		   
		   while (!stack.isEmpty() || cur != null) {			   
			   if (cur != null) {
				   stack.push(cur);
				   cur = cur.left ;
			   } else {				   
				   TreeNode p = stack.pop() ;
				   if (pre != null && p.val <= pre.val) {					   
					   return false ;
				   }				   
				   pre = p ;					   
				   cur = p.right ;
			   }
		   }
		   return true ; 
	   }

}
