package com.scott.code;

import java.util.LinkedList;
import java.util.Queue;

public class PopulatingNextRight {
	
	 private static class TreeLinkNode {
		  int val;
		  TreeLinkNode left, right, next;
		  TreeLinkNode(int x) { val = x; }
		 }
	
	
	 
	 public void connect(TreeLinkNode root) {
	        if (root == null) {
	        	return ;
	        }
	        
	        // for bfs
	        Queue <TreeLinkNode> queue = new LinkedList<TreeLinkNode> ();
	        // rear 
	        TreeLinkNode anchor = new TreeLinkNode(0) ;
	        TreeLinkNode p = new TreeLinkNode(0) ;	        
	        queue.add(anchor) ;
	        
	        while ( !queue.isEmpty() ) {
	        	TreeLinkNode cur = queue.poll() ;
	        	
	        	if (cur == anchor) {
	        		if (queue.isEmpty()) {
	        			break ;
	        		}
	        		queue.add(anchor) ;
	        		p.next = null;
	        		p = new TreeLinkNode(0) ; 
	        	} else {
	        		p.next = cur ;
	        		p = p.next ;	        		
	        		if (cur.left != null) {
	        		    	queue.add(cur.left) ;
	        		}	        		
	        		if (cur.right != null) {
	        			queue.add(cur.right) ;
	        		}
	        	}	        	
	        }
	       	        
	 }
	
	 
	 public ListNode rotateRight(ListNode head, int n) {
	 
		 
		 return null;
	 }

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
