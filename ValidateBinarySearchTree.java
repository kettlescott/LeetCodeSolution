package com.scott.leetcode;

import java.util.Stack;

public class ValidateBinarySearchTree {


	
   private TreeNode pre = null ;
	
	
  
   public boolean isValidBST(TreeNode root) {
        if (root == null) return true ;
         if (isValidBST (root.left)) {
        	 if (pre != null && root.val <= pre.val) {
        		 return false ;
        	 }
        	 pre = root;
        	 return isValidBST (root.right) ;
         }
        return false ;
   }
   
   
   public boolean isValidBST_iter (TreeNode root){
	   Stack<TreeNode> stack = new Stack<TreeNode> ();
	   TreeNode cur = root ;
	   TreeNode pre = null ;
	   while (!stack.isEmpty() && root != null) {
		   if (cur != null) {
			   stack.push(cur);
			   cur = cur.left ;
		   } else {
			   TreeNode p = stack.pop() ;
			   if (pre != null && p.val <= pre.val) return false ;
			   pre = p ;
			   p = p.right ;
		   }
	   }
	   return true ; 
   }
   
   
  
   static class TreeNode {
	   int val;
	   TreeNode left;
	   TreeNode right;
	   TreeNode(int x) { val = x; }
   }
	
}
