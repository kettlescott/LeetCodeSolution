package com.scott.leetcode;

public class RotateList {

	/**
	 * Given a list, rotate the list to the right by k places, where k is non-negative.

For example:
Given 1->2->3->4->5->NULL and k = 2,
return 4->5->1->2->3->NULL.
	 */
	
	
   public ListNode rotateRight(ListNode head, int n) {
	   if (head == null) return null;
	   int len = getLength(head);	 
	   n =  n % len ;
	   if (n == 0) return head ;
       ListNode dummy = new ListNode (1);
       dummy.next = head ;
       ListNode pre = dummy , p = head ;
       int c = 1 ;
       while (c < n) {
    	   p = p.next ;
    	   c++;
       }       
       while (p != null & p.next != null) {
    	   p = p.next ;
    	   pre = pre.next ;
       }       
       p.next = dummy.next ;
       dummy.next = pre.next ;
       pre.next = null ;
       return dummy.next ;   
   }
   
   private int getLength(ListNode head){
	   ListNode p = head ;
	   int c =  0 ;
	   while (p != null) {
		   p = p.next ;
		   c++;
	   }
	   return c ;
   }

}
