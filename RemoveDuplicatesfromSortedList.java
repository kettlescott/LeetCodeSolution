
public class RemoveDuplicatesfromSortedList {

	/**
	    Given a sorted linked list, delete all duplicates such that each element appear only once.
      For example,
      Given 1->1->2, return 1->2.
      Given 1->1->2->3->3, return 1->2->3. 
	 */
    public ListNode deleteDuplicates(ListNode head) {
    	if (head == null) return null ;
         ListNode dummyhead = new ListNode (1);
         dummyhead.next = head; 
         ListNode  tail = head , p  = head ;
         while (p != null) {
        	 if (p.val != tail.val ) {
        		 tail.next = p ;
        		 tail = p ;        		         		 
        	 }
        	 p = p.next ;
         }            
         tail.next = p ;
         return dummyhead.next ;
    }

    
   
}
