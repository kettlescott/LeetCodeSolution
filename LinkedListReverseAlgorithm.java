package com.scott.leetcode;

public class LinkedListReverseAlgorithm {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedListReverseAlgorithm l = new LinkedListReverseAlgorithm ();
		ListNode head = l.createLinkedList(new int [] {1,2,3,4,5,6,7});
		ListNode p = head ;
		while (p != null) {
			System.out.print(p.val + " ");
			p = p.next ;
		}		
		System.out.println() ;
		head = l.reserveLinkedList(head);		
		p = head ;
		while (p != null) {
			System.out.print(p.val + " ") ;
			p = p.next ;
		}
		System.out.println();
		
	}
	
	public ListNode createLinkedList (int [] A){
		if (A == null || A.length == 0) return null ;
		ListNode dummyHead = new ListNode (-1);
		ListNode p = dummyHead;  
		int i = 0 ;		
		while (i < A.length) {
			p.next = new ListNode(A[i]);
			p = p.next ;
			i++;
		}						
		return dummyHead.next ;
	}

	public ListNode reserveLinkedList (ListNode head){
		if (head == null) return null ;			
		ListNode p = head ;
		ListNode tail = null ;
		while ( p != null) {
			ListNode next = p.next ;			
			p.next = tail ;
			tail = p ;
			p = next ;						
		}				
		return tail ;
	}
	
	
	
}
