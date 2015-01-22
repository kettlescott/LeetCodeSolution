package com.scott.leetcode;

public class PopulatingNextRightPointersinEachNode {


	
    public void connect(TreeLinkNode root) {
    	if (root == null) return ;
    	TreeLinkNode parent = root ;
    	TreeLinkNode next = root.left ;
    	while (parent != null && next != null) {
    		TreeLinkNode pre = null ;
    		while (parent != null) {
    		   	if (pre == null) {
    		   		pre = parent.left;
    		   	} else{
    		   		pre.next = parent.left ;
    		   		pre = pre.next ;
    		   	}
    		   	pre.next = parent.right ;
    		   	pre = pre.next ;
    		   	parent = parent.next ;
    		}
    		parent = next ;
    		next = next.left ;
    	}
    }
    
   

}
