package com.scott.leetcode;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;

import com.scott.leetcode.ValidateBinarySearchTree.TreeNode;

public class MaximumDepthofBinaryTree {


	
	
	public int maxDepth(TreeNode root) {
	   if (root == null) return 0 ;        
	   return Math.max(maxDepth(root.left) + 1, maxDepth(root.right) + 1); 	
	}
	
	public int maxDepth_dfs(TreeNode root) {
		   if (root == null)  return 0 ;
		   Queue<TreeNode> queue = new LinkedList<> ();
		   if (root.left == null && root.right == null) return 1 ;
		   queue.add(root) ;
		   queue.add(null) ;
		   int depth = 0 ;
		   while (!queue.isEmpty()) {
			   TreeNode node = queue.poll() ;
			   if (node == null) {
				   depth++;
				   if (queue.isEmpty()) break;
				   queue.add(null) ;				 
			   } else{
				   if (node.left != null) queue.add(node.left) ;
				   if (node.right != null) queue.add(node.right) ;
			   }			   
		   }
		   return depth ;
 		}
	

}
