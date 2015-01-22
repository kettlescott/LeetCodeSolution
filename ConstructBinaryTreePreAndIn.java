package com.scott.leetcode;

import java.util.HashMap;

public class ConstructBinaryTreePreAndIn {

	
	HashMap<Integer,Integer> map = new HashMap<> ();
 	
    public TreeNode buildTree(int[] preorder, int[] inorder) {
    	   if (preorder.length == 0) return null;
	        for (int i = 0 ; i < preorder.length ;++i)
	        	map.put(preorder[i], i);
	        return build (preorder, 0,0, inorder.length - 1);
	}
	 
	 
	 
	 public TreeNode build (int [] preorder, int pre, int left , int right){
		 if (left > right) return null ;
		 TreeNode parent = new TreeNode (preorder[pre]);
		 //offset indicate the length of left tree;
		 int offset = map.get(preorder[pre]) - left ;
		 parent.left = build (preorder,pre + 1 , left, map.get(preorder[pre]) - 1);
		 parent.right = build (preorder,pre + offset + 1 ,  map.get(preorder[pre]) + 1, right);
		 return parent ;
	 }

}
