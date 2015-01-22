package com.scott.leetcode;

import java.util.HashMap;

import java.util.Stack;

import com.scott.leetcode.MinimumDepthofBinaryTree.TreeNode;

public class BSearchTreeToDList {


         public TreeNode convertBSTToLinkedList (TreeNode root){
		connect(root);
		return head ;
         }
	
	
	 public void connect (TreeNode t){
		if (t == null) return ;
		if (t.left == null && head == null) head = t ;
	    connect (t.left);
		if (pre != null) {			
			pre.next = t ;
			t.previous = pre ;
		}
		pre = t ;
		connect (t.right);		
	}
	
}
