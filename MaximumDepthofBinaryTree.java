package com.scott.leetcode;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;

import com.scott.leetcode.ValidateBinarySearchTree.TreeNode;

public class MaximumDepthofBinaryTree {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode n1 = new TreeNode (1);
		TreeNode n2 = new TreeNode (2);
		TreeNode n3 = new TreeNode (3);
		TreeNode n4 = new TreeNode (4);
		TreeNode n5 = new TreeNode (5);
		n1.left = n2 ;
//		n1.right = n3;
//		n2.left = n4;
//		n2.right = n5;
		MaximumDepthofBinaryTree m = new MaximumDepthofBinaryTree ();
		System.out.println(m.maxDepth_dfs(n1));
	}
	 
	public int solution(int[] A) {
        // write your code in Java SE 8
		int sum = 0 ;
		for (int c : A) 
			sum += c ;
		int leftSum = 0 ;
		for (int i = 0 ; i < A.length ; ++i) {
			int rightSum = sum - leftSum - A[i] ;
			if (rightSum == leftSum) return i;
		    leftSum += A[i];	
		}				
		return - 1;
    }
	
	
	
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
	
	
	 static class TreeNode {
		   int val;
		   TreeNode left;
		   TreeNode right;
		   TreeNode(int x) { val = x; }
	   }
	 
	 public int equi ( int A[]) {
		 int [] dp = new int [A.length] ;
		 
		 
		 
		 
		 return - 1;
	 }
	 
//	 public int solution(int[] A) {
//	        // write your code in Java SE 8
//		 HashSet<Integer> set = new HashSet<> ();
//		 for (int c : A) 
//			 set.add(c) ;		 
//		 for (int i = 0 ; i < A.length ;++i) {
//			 if (set.contains(A[i])) {
//				 set.remove(A[i]) ;
//			 }
//			 if (set.isEmpty()) {
//				 return i ;
//			 }
//		 }	
//		 return -1 ;
//	 }

}
