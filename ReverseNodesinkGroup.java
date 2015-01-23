public class ReverseNodesinkGroup {
    
    /*
       Given a linked list, reverse the nodes of a linked list k at a time and return its modified list.

       If the number of nodes is not a multiple of k then left-out nodes in the end should remain as it is.

       You may not alter the values in the nodes, only nodes itself may be changed.

       Only constant memory is allowed.

       For example,
       Given this linked list: 1->2->3->4->5

       For k = 2, you should return: 2->1->4->3->5

       For k = 3, you should return: 3->2->1->4->5
  
    */


    public ListNode reverseKGroup(ListNode head, int k) {
       ListNode dummyHead = new ListNode(-1);
       dummyHead.next = head ;
       ListNode tail = head , back = dummyHead, p = head  ; 
       int step = 1 ;
       while (p != null && k != 0) {
    	 if (step % k == 0) {
    		 ListNode next = p.next ;
    		 ListNode tmp = reverse (tail, next) ;
    		 back.next = tmp ;
    		 back = tail ;
    		 tail = next ;
    		 p = next ;
    		 back.next = p ;
    	 } else {
    		 p = p.next ;	 
    	 }
    	 step++;
       }
    	return dummyHead.next  ;
    }
    
    public ListNode reverse (ListNode start , ListNode end){
    	ListNode tail = null ;
    	ListNode p = start ;
    	while (p != end) {
    	   ListNode next = p.next ;
    	   p.next = tail ;
    	   tail = p ;
    	   p = next ;    	 
    	}
    	return tail ;
    }
