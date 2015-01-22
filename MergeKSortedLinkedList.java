package com.scott.code;

import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

import com.scott.code.MergeTwoSortedLists.ListNode;

public class MergeKSortedLinkedList {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	private static final Comparator<ListNode> listComparator = new Comparator<ListNode>(){

		@Override
		public int compare(ListNode n1, ListNode n2) {			
			return n1.val - n2.val;
		}
		
	};
	
	
	 public ListNode mergeKLists(List<ListNode> lists) {
		 if (lists.isEmpty()) return null ;
	       ListNode dummy = new ListNode (-1);
	       ListNode p = dummy ;
	       PriorityQueue<ListNode> queue = new PriorityQueue<>(lists.size() , listComparator);
	       for (ListNode node : lists) {
	    	   if (node != null) {
	    		   queue.add(node) ;   
	    	   }	    	  
	       }	    	   
	       while (!queue.isEmpty()) {
	    	   ListNode cur = queue.poll() ;
	    	   p.next = cur ;
	    	   if (cur.next != null)
	    		   queue.add(cur.next);
	    	   p = p.next ;
	       }
	       return dummy.next ;
	 }
	 
	 
	 static  class ListNode  {
    	 int val;
    	 ListNode next;
    	 ListNode(int x) {
    		 val = x;
    		 next = null;
    	 }
    }

}
