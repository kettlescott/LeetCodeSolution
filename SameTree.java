package com.scott.code;

import java.util.Stack;

public class SameTree {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SameTree t = new SameTree ();
		String [] p = { "1" ,"2"} ;
		String [] q = { "1" ,"#","2"} ;
		TreeNode r_p = LeetCodeTree.createTree(p) ;
		TreeNode r_q = LeetCodeTree.createTree(q) ;
		System.out.println(t.isSameTree_rec(r_p, r_q));
		
	}
	
	 public boolean isSameTree(TreeNode p, TreeNode q) {
	     Stack<TreeNode> stack_p = new Stack <> ();       
	     Stack<TreeNode> stack_q = new Stack <> ();
	     if (p != null) stack_p.push( p ) ;
	     if (q != null) stack_q.push( q ) ;
	     while (!stack_p.isEmpty() && !stack_q.isEmpty()) {
	    	 TreeNode pn = stack_p.pop() ;
	    	 TreeNode qn = stack_q.pop() ;	    	
	    	 if (pn.val != qn.val) return false ;
	    	 if (pn.right != null) stack_p.push(pn.right) ;
	    	 if (qn.right != null) stack_q.push(qn.right) ;
	    	 if (stack_p.size() != stack_q.size()) return false ;
	    	 if (pn.left != null) stack_p.push(pn.left) ;	    	 	    	 
	    	 if (qn.left != null) stack_q.push(qn.left) ;
	    	 if (stack_p.size() != stack_q.size()) return false ;
	     }		     
	     return stack_p.size() == stack_q.size() ;	 
	 }
	 
	 public boolean isSameTree_rec(TreeNode p, TreeNode q) {
		 if (p == null || q == null) return p == q ;
		 if ( p.val == q.val) {
			 return isSameTree_rec (p.left,q.left) && isSameTree_rec (p.right,q.right) ;			 
		 }
		 return false ;
	 }

}
