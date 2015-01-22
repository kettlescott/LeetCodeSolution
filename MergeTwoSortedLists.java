package com.scott.leetcode;

public class MergeTwoSortedLists {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
    	ListNode dummyHead = new ListNode (-1);
    	ListNode p = l1 , q = l2 , cur = dummyHead;    	
    	while (p != null && q != null) {
    	   if (p.val < q.val) {
    		   cur.next = p ;
    		   p = p.next ;
    	   } else{
    		   cur.next = q ;
    		   q = q.next ;
    	   }
    	   cur =cur.next ;
    	}    	
    	if (p != null) cur.next = p ;
    	if (q != null) cur.next = q ; 
    	return dummyHead.next ;    	
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
