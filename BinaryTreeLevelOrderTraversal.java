package com.scott.leetcode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

public class BinaryTreeLevelOrderTraversal {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTreeLevelOrderTraversal t = new BinaryTreeLevelOrderTraversal ();
		String [] data = {"1","2","3","4","5"} ;
		TreeNode root = LeetCodeTree.createTree(data) ;
		for (List<Integer> l : t.levelOrder(root) ) {
			for (int c : l) {
				System.out.print(c + " ");
			}
			System.out.println();
		}
		
	}
		 
	 public List<List<Integer>> levelOrder(TreeNode root) {
	        List<List<Integer>> result = new ArrayList<List<Integer>> ();	        
	        Stack<TreeNode> stack = new Stack<> ();
	        stack.push(root) ;
	        while (!stack.isEmpty() && root != null) {
	            TreeNode curr = stack.pop() ;
	            if (curr.level == result.size()) {
	            	 List<Integer>  tmp = new ArrayList<> ();
	            	 result.add(tmp);
	            }
	            
	            result.get(curr.level).add(curr.val);
	            if (curr.left != null) {
	            	curr.left.level = curr.level + 1 ;
	            	stack.push(curr.left) ;
	            }
	            if (curr.right != null) {
	            	curr.right.level = curr.level + 1 ;
	            	stack.push(curr.right) ;
	            }
	        }	        	        
	        return result ;
	    }
	 
	
	 public void levelOrder_rec(TreeNode root, int level , List<List<Integer>> result ) {
		 if (root == null) return ;
		 if (level == result.size()) {
			 List<Integer>  tmp = new ArrayList<> ();
			 result.add(tmp) ;
		 }
		 result.get(level).add(root.val) ;
		 levelOrder_rec (root.left, level + 1 , result);
		 levelOrder_rec (root.right, level + 1 , result);		 
	 }

}
