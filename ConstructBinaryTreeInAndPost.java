package com.scott.leetcode;

import java.util.HashMap;

public class ConstructBinaryTreeInAndPost {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConstructBinaryTreeInAndPost c = new ConstructBinaryTreeInAndPost ();
		int [] in = {-1};
		int [] post = {-1};
		c.buildTree(in, post) ;
	}
	
	HashMap <Integer, Integer> map = new HashMap<> ();
    public TreeNode buildTree(int[] inorder, int[] postorder) {  
    	if (inorder.length == 0) return null ;
         for (int i = 0 ; i < inorder.length ; ++i) 
        	 map.put(inorder[i], i) ;
         return build (postorder, postorder.length - 1, 0, inorder.length - 1);
    }
    
    
    public TreeNode build (int [] postorder , int post , int left , int right){
    	if (left > right) return null ;    	
    	TreeNode parent = new TreeNode (postorder[post]);
    	//calculate the len of right tree
    	int offset = right - map.get(postorder[post]) ;
    	parent.left = build (postorder ,  post - offset - 1 , left , map.get(postorder[post]) - 1) ;
        parent.right = build (postorder , post - 1, map.get(postorder[post]) + 1 , right) ;
    	return parent ;
    }

}
