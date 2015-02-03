package com.scott;

public class ReverseLinkedlist {
	/*
	reverse linkedlist using iterate and recursive call
	*/
	public ListNode reverse (ListNode node){					
		ListNode p = node , tail = null , next = null ;
		while (p != null ) {
			next = p.next ;
			p.next = tail ;
			tail = p ;
			p = next ;			
		}			
		return tail  ;
	}

	public ListNode reverse_rev(ListNode head){
		return reverse_recursive (head, null);
	}
	
	public ListNode reverse_recursive (ListNode p , ListNode tail){
		if (p == null) return tail ;
		ListNode next = p.next ;
		p.next = tail ;
		return reverse_recursive (next, p);
	}
	
}
