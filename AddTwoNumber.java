package com.scott.leetcode;

import com.scott.leetcode.MergeTwoSortedLists.ListNode;

public class AddTwoNumber {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carrier = 0 ;
        ListNode dummyNode = new ListNode (-1);
        ListNode p = l1 , q = l2 , cur = dummyNode ;
        while ( p != null || q != null) {
        	int x = p == null ? 0 : p.val ;
        	int y = q == null ? 0 : q.val ;
        	int sum = x + y + carrier ;
        	cur.next = new ListNode (sum % 10);
        	carrier = sum / 10;
        	p = p != null ? p.next : null ;
        	q = q != null ? q.next : null ;
        	cur = cur.next ;
        }
        if (carrier > 0) 
        	cur.next = new ListNode (carrier);
        return dummyNode.next ;        
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
