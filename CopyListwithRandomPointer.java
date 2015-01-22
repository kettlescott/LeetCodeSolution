package com.scott.code;

import java.util.HashMap;

public class CopyListwithRandomPointer {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	
	 public RandomListNode copyRandomList(RandomListNode head) {
		 if (head == null) return null ;
		 RandomListNode dummy = new RandomListNode (-1);
		 HashMap<RandomListNode,RandomListNode> map = new HashMap<>();
		 RandomListNode p = head ;
		 RandomListNode q = dummy ;
		 while (p != null) {
			 RandomListNode  clone = new RandomListNode (p.label);
			 q.next = clone ;
			 map.put(p, clone);
			 p = p.next ;
			 q = q.next ;
		 }
		 p = head ;
		 while (p != null) {
			 RandomListNode random = map.get(p.random) ;
			 map.get(p).random = random;
			 p = p.next ;
		 }		 		 		 
		 return dummy.next ;	    
	 }
	 
	 class RandomListNode {
		 int label;
		 RandomListNode next, random;
		 RandomListNode(int x) { this.label = x; }
	 }
	 
	 public RandomListNode copyRandomList_m(RandomListNode head)  {
		 RandomListNode p = head;
		 while (p != null) {
			 RandomListNode n = p.next ;
			 RandomListNode copy = new RandomListNode (p.label);
			 p.next = copy ;
			 copy.next = n ;
			 p = n ;
		 }		 
		 p = head ;
		 while (p != null) {
			 p.next.random = (p.random != null) ? p.random.next : null;
			 p = p.next.next ;
		 }
		 p = head ;
		 RandomListNode h = p != null ? p.next : null ;
		 while (p != null) {
			 RandomListNode copy = p.next ;
			 p.next = copy.next ;
			 p = p.next ;
			 copy.next = (p != null) ? p.next : null ; 
		 }
		
		 return h;
	 }

}
