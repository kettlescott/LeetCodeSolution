package com.scott.leetcode;

import java.util.Stack;

public class InsertNodeinaBinarySearchTree {

	/**
	 * 
44%
Accepted

Given a binary search tree  and a new tree node, insert the node into the tree. You should keep the tree still be a valid binary search tree.
Example

Given binary search tree as follow:

     2

  /    \

1        4

         /   

       3 

after Insert node 6, the tree should be:

     2

  /    \

1        4

         /   \ 

       3        6
Challenge

Do it without recursion

	 */

	
	
	public TreeNode insertNode(TreeNode root, TreeNode node) {
        // write your code here
		return insert (root, node);
    }
	
	private TreeNode insert(TreeNode root, TreeNode node){
		if (root == null) {
			return new TreeNode (node.val) ;
		}
		if (node.val < root.val) {
			root.left = insert (root.left , node);
		}		
		if (node.val > root.val) {
			root.right = insert (root.right , node);
		}		
		return root;
	}

	
	public TreeNode insertNode_iter(TreeNode root, TreeNode node) {		
        // write your code here
		if (root == null) return new TreeNode(node.val);
		Stack<TreeNode> stack = new Stack <> () ;
		stack.push(root) ;
		while (!stack.isEmpty() && root != null) {
		   TreeNode curr = stack.pop() ;
		   System.out.println(curr.val);
		   if (node.val > curr.val) {
			   if (curr.right == null) {				
				   curr.right = new TreeNode(node.val);
			   } else {
				   stack.push(curr.right) ;
			   }
		   } else if (node.val < curr.val) {
			   if (curr.left == null) {
				   curr.left = new TreeNode (node.val);
			   } else {
				   stack.push(curr.left) ;
			   }
		   }
		}		
		return root;
    }
	
}
