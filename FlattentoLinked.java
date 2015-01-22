package com.scott.leetcode;

public class FlattentoLinked {

	/**
	 * @param args
	 */
     public TreeNode flatten(TreeNode root) {
        if (root == null) return null ;
        TreeNode leftNode  = flatten (root.left) ;
        TreeNode rightNode = flatten (root.right) ;            
        root.right = leftNode ;
        root.left = null ;
        TreeNode t = root ;        	
    	while (t != null && t.right != null)
    		 t = t.right ;        	
    	if (t != null)
    		t.right = rightNode ;                 
        return root;        
    }

}
