package com.scott.leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;


public class BinaryTreeInorderTraversal {

	
	public List<Integer> inorderTraversal(TreeNode root) {
		List <Integer> result = new ArrayList<> ();
		Stack<TreeNode> stack = new Stack<> ();
		TreeNode curr = root;
		while (!stack.isEmpty() || curr != null) {
			if (curr != null) {
				stack.push(curr);
				curr = curr.left ;
			} else{
				TreeNode tmp = stack.pop();
				result.add(tmp.val);
				curr = tmp.right;
			}
		}
		return result;	        
	}
	
	
	 static class TreeNode { 
		 int val ;
		 TreeNode left ;
		 TreeNode right ;
		 TreeNode(int x) { 
			 val = x; 
		 }
	 }


}
