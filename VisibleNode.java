package com.scott.leetcode;

import java.util.Stack;

public class VisibleNode {

	/**
	 * uestioin Name: Count Visible Nodes in Binary Tree

Question: In a binary tree, if in the path from root to the node A, there is no node with greater value than A’s, this node A is visible. We need to count the number of visible nodes in a binary tree. For example, in the following tree:

Example Tree
5 / \ 3 10 / \ / 20 21 1
1
2
3
4
5
	
        5
     /     \
   3        10
  / \      /
20   21   1
	 */

	
	
    public int visibleNodeCount (TreeNode root){
    	return getVisible (root, root.val);
    }
    
    public int getVisible (TreeNode curr , int sofarMax){
    	if (curr == null) return 0 ;
    	if (curr.val >= sofarMax) {
    	  return 1 + getVisible(curr.left, curr.val) + getVisible(curr.right , curr.val);
    	} else{
    		return  getVisible(curr.left, sofarMax) + getVisible(curr.right , sofarMax) ;
    	}
    }

    public int visibleNode_iterate (TreeNode root){
    	if (root == null) return 0 ;
    	int count = 0 ;
    	Stack<TreeNode> stack = new Stack<> ();
    	stack.add(root) ;
    	root.sofarMax = root.val ;
        while (!stack.isEmpty() && root != null) {
        	TreeNode curr = stack.pop() ;
        	if (curr.val >= curr.sofarMax) {
        		count++;        		
        		curr.sofarMax = curr.val;
        	}
        	if (curr.right != null) {
        		curr.right.sofarMax = curr.sofarMax ;
        		stack.push(curr.right) ;
        	}
        	if (curr.left != null) {
        		curr.left.sofarMax = curr.sofarMax ;
        		stack.push(curr.left);
        	}        	
        }
        return count ;        
    }
    
    

}
