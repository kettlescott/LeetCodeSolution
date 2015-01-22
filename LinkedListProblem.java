package com.scott.code;

public class LinkedListProblem {

	/**
	 * @param args
	 */
	
	public static void main(String[] args) {
		int [] A = {-21,10,17,8,4,26,5,35,33,-7,-16,27,-12,6,29,-12,5,9,20,14,14,2,13,-24,21,23,-21,5} ;
//		System.out.println (A[26]);
//		LinkedListProblem lp = new LinkedListProblem ();
//		LinkedListProblem.ListNode head = lp.add(4) ;
//		
//		LinkedListProblem.ListNode cur = head ;
//		while (cur != null) {
//			System.out.print(cur.val + " ");
//			cur = cur.next ;
//		}
//		
//		System.out.println();
//		
//		head = lp.swapPairs(head) ;
//		cur = head ; 
//		
//		while (cur != null) {
//			System.out.print(cur.val + " ");
//			cur = cur.next; 
//		}
		LinkedListProblem linkedlist = new LinkedListProblem ();
		linkedlist.push(512);
		linkedlist.push(-1024);
		linkedlist.push(-1024);
		linkedlist.push(512);
		
		linkedlist.pop();
		System.out.println(linkedlist.getMin());
		linkedlist.pop();
		System.out.println(linkedlist.getMin());
		linkedlist.pop();
		System.out.println(linkedlist.getMin());
    
	}
	   Node top = null ;	   
	
	   private class Node {
		   
		   public Node (int value){
			   this.value = value;
		   }
		   int value ; 
		   Node next ;
		   int nextMIn ;
	   }
	
	    public void push(int x) {
	        if (top == null) {
	        	top = new Node (x);
	        	top.nextMIn = x;
	        } else {
	        	Node current = new Node (x);
	        	current.next = top;
	        	top = current;
	        	top.nextMIn = Math.min(top.next.nextMIn, x);
	        }
	    }

	    public void pop() {
	        top = top.next ;
	    }

	    public int top() {
	       return top == null ? 0 : top.value;
	    }

	    public int getMin() {
	        return top == null ? 0 : top.nextMIn;
	    }
	
	
	  public ListNode detectCycle(ListNode head) {
	   if (head == null) {
			  return null ;
		  }
	        
	   ListNode slow = head ;
	   ListNode fast = head ;
	   
	   while (true) {
		   if (fast.next == null) {
			   return null ;			   
		   }
		   
		   fast = fast.next.next ;
		   slow = slow.next ;
		   
		   if (fast == null || slow == null) {
			   return null ;
		   }
		   
		   if (fast == slow) {
			  return fast ;			  
		   }
		   
		   if (fast.next == slow) {
			   if (slow.next == fast) {
					  return slow.next ;
				  }
				  
				  if (fast.next == slow) {
					  return fast ;
				  }
		   }
	      		 	   
	   }
	   
	  }
	
	
	
	public ListNode add(int n){
		ListNode head = null ;
		ListNode cur = head;
		for (int i = 1 ; i <= n ; ++i) {
			if (head == null) {
				head = new ListNode (i) ;
				cur = head ;
			} else {
				cur.next = new ListNode(i);
				cur = cur.next ;
			}
		}
		
		return head ;
	}
	
	  private static class ListNode {
		     int val;
		     ListNode next;
		     ListNode(int x) {
		     val = x;
		     next = null;
		   }
		  }

	  public ListNode swapPairs(ListNode head) {
	        if (head == null) {
	        	return null ;
	        }
	    
	        if (head.next == null) {
	        	return head;
	        }
	     
	        ListNode nHead = new ListNode(-1) ;
	        ListNode back = nHead ;
	        ListNode slow = head ;
	        ListNode fast = slow.next ;
	        
	        back.next = slow.next ;
        	slow.next = fast.next ;
        	fast.next = slow ;
        	
        	ListNode tmp = fast ;
        	fast = slow ;
        	slow = fast;
        	
	        
	        while (fast.next != null && fast.next.next != null) {
	        	fast = fast.next.next ;
	        	slow = slow.next.next ;
	        	back = back.next.next ;
	        	back.next = slow.next ;
	        	slow.next = fast.next ;
	        	fast.next = slow ;
	        	fast = slow ;
	        	slow = fast;
	        }
	        		  
		  return nHead.next ;
	  }

	  
	  
}
