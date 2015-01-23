
public class ReverseLinkedListII {

     /*
      Reverse a linked list from position m to n. Do it in-place and in one-pass.

      For example:
      Given 1->2->3->4->5->NULL, m = 2 and n = 4,

      return 1->4->3->2->5->NULL.

      Note:
      Given m, n satisfy the following condition:
      1 ≤ m ≤ n ≤ length of list. 
     */

    public ListNode reverseBetween(ListNode head, int m, int n) {
         if (head == null) return null ;
         ListNode dummyHead = new ListNode (1);         
         dummyHead.next = head;
         ListNode pre = dummyHead ;         
         for (int i = 1;  i < m ; ++i) {        	 
        	 pre = pre.next ;           
         }
         ListNode tail = null , next = null , p = pre.next  ;                  
         for (int i = m ; i <= n ;++i) {
        	  next = p.next ;
        	  p.next = tail ;
        	  tail = p ;
        	  p = next ;        	  
         }         
         pre.next.next = next ;
         pre.next = tail;
         return dummyHead.next ;         
    }

}
