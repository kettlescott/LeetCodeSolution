public class RemoveDuplicatesfromSortedListII {

	/**
	  Given a sorted linked list, delete all nodes that have duplicate numbers, leaving only distinct numbers from the original list.
	 For example,
Given 1->2->3->3->4->4->5, return 1->2->5.
Given 1->1->1->2->3, return 2->3. 
	 */

	 public ListNode deleteDuplicates(ListNode head) {
		if (head == null) return null ;
	    ListNode dummyHead = new ListNode (1);	    
	    ListNode tail = dummyHead , p = head.next , pre = null ;
	    dummyHead.next = head ;
	    while (p != null) {
	      if (tail.next.val != p.val) {	    		    	  
	    	 if (tail.next.next == p) {	    		 
	    		 tail = tail.next ;	    	
	    	 }	    	 
	    	 tail.next = p ;
	      }	      	      
	      pre = p ;
	      p = p.next ;
	    }	 	    	    
	    if (pre != null && (tail.val == pre.val || tail.next != pre && tail.next.val == pre.val )) tail.next = null;
	    return dummyHead.next ;
	 }
	
}
