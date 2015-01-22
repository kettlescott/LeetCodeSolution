package com.scott.leetcode;

public class BinaryTreeMaximumPathSum {


    int max = Integer.MIN_VALUE ;
	
    public int maxPathSum(TreeNode root) {
    	if (root == null) return 0 ;
    	max(root);
        return max ;       
    }
    
    public int max (TreeNode root){
    	if (root == null) return 0 ;
    	int left = max (root.left);
    	int right = max (root.right);    	
    	int leftMax = Math.max(left + root.val, root.val) ;
    	int rightMax = Math.max(right + root.val, root.val) ;   	
    	int maxPath = Math.max(leftMax, rightMax) ;     	
    	int all = left + right + root.val ;
        max = Math.max(max,Math.max(all, maxPath)) ;//    	
        return maxPath ;       
    }
	
	
}
