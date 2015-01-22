package com.scott.leetcode;

public class BinaryTreeUpsideDown {


	 public TreeNode UpsideDownBinaryTree(TreeNode root) {
	        return 	 doUpsideDown (root,null);   	 
	 }
	 
	 
	 public TreeNode doUpsideDown (TreeNode p, TreeNode parent){
		 if (p == null) return parent ;		 
		 TreeNode root = doUpsideDown (p.left , p);
         p.right = parent ;
         p.left = (parent == null) ? null : parent.right ;
		 return root ;		   
	 }
	 
	 
	 public TreeNode UpsideDownBinaryTree_iter(TreeNode root) {
	        TreeNode p = root , parent = null , right = null ;
	        while (p != null){
	        	TreeNode left = p.left ;
	        	p.left = right ;
	        	right = p.left ;
	        	p.right = parent ;
	        	parent = p ;
	        	p = left ;
	        }	        	        
	        return parent ;
	 }
    
	 
	 
	 
}
