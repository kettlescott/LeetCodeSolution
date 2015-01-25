package com.scott.leetcode;

import java.util.HashMap;

public class RemoveNthNodeFromEndofList {

	/**
	 *
	 Given a linked list, remove the nth node from the end of list and return its head.

   For example,

   Given linked list: 1->2->3->4->5, and n = 2.

   After removing the second node from the end, the linked list becomes 1->2->3->5.
   Note:
   Given n will always be valid.
   Try to do this in one pass.
	 */

    public ListNode removeNthFromEnd(ListNode head, int n) {
      HashMap<Integer,ListNode> map = new HashMap<>();
      ListNode dummyHead = new ListNode (1);
      dummyHead.next = head ;
      ListNode p = head;
      int i = 0 ;
      while (p != null) {
    	  map.put(i++, p);
    	  p = p.next ;
      }
      int target = i - n ;
      if (target == 0) {
    	  return dummyHead.next = map.get(1) ;
      }
      map.get(target -1).next = map.get(target + 1);
      return dummyHead.next ;    
    }

}
