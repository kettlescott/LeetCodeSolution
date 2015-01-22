package com.scott.leetcode;

import java.util.LinkedList;
import java.util.Queue;

import com.scott.leetcode.MaximumDepthofBinaryTree.TreeNode;

public class MinimumDepthofBinaryTree {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	 public int minDepth(TreeNode root) {
	   if (root == null) return 0 ;       
	   if (root.left == null) return  minDepth (root.right) + 1 ;
	   if (root.right == null) return minDepth (root.left) + 1 ;
	   return Math.min(minDepth(root.left), minDepth(root.right)) + 1;	   
	 }
	 
	 public int minDepth_bfs(TreeNode root) {
		 if (root == null) return 0 ;
		 Queue<TreeNode> queue = new LinkedList<> ();
		 int depth = 1 ;
		 queue.add(root) ;
		 TreeNode rightMost = root ;
		 while (!queue.isEmpty()) {
			 TreeNode node = queue.poll() ;
			 if (node.left == null && node.right == null)
				 break;
			 if (node.left != null) 
				 queue.add(node.left) ;
			 if (node.right != null) 
				 queue.add(node.right) ;
			 if (node == rightMost) {
				 depth++;
				 rightMost = node.right != null ? node.right : node.left ;
 			 }			 
		 }		
		 return depth ;
	 }
	 
	 
	 static class TreeNode {
		   int val;
		   TreeNode left;
		   TreeNode right;
		   TreeNode(int x) { val = x; }
	   }

}
