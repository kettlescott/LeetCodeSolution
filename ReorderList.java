package com.scott.leetcode;

import java.util.HashMap;

public class ReorderList {

	/**
	   Given a singly linked list L: L0→L1→…→Ln-1→Ln,
     reorder it to: L0→Ln→L1→Ln-1→L2→Ln-2→…

     You must do this in-place without altering the nodes' values.

     For example,
     Given {1,2,3,4}, reorder it to {1,4,2,3}. 
	 */

	
    public void reorderList(ListNode head) {
    	if (head == null) return ;
        ListNode dummy = new ListNode(1);
        dummy.next = head ;
        ListNode p = head ;
        int i = 0 ;
        HashMap<Integer,ListNode> map = new HashMap<> ();
        while (p != null) {
        	map.put(i++, p);
        	p = p.next ;
        }
        int tail = i - 1; 
        p = dummy ;
        for (int j = 0 ; j <= tail; ++j , --tail) {        	
        	ListNode first = map.get(j) ;
        	ListNode second = map.get(tail) ;        	
        	first.next = second;
        	second.next = null; 
        	p.next = first ;
        	p = second ;
        }
        
    }

}
