public class ReverseNodesinkGroup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReverseNodesinkGroup r = new ReverseNodesinkGroup () ;
		int [] data = {1,2,3} ;
		ListNode head = ListNode.createList(data) ;
		head = r.reverseKGroup_solutionII(head, 2) ;	
		ListNode p = head ;
		 
		while (p != null) {
			System.out.print(p.val + " ");
			p = p.next ;
		}
	}
	
	public ListNode reverseKGroup_solutionII(ListNode head, int k)  {
		ListNode dummyNode = new ListNode (1);
		ListNode p = head ,back = dummyNode  ,tail = null;
		dummyNode.next = head ;
		ListNode n = null ;
		int step = 1 ;
		while (p != null && k != 0) {
			ListNode next = p.next ;
			if (step % k == 0) {
				ListNode tmp = back.next ;
				back.next = next;
				System.out.println(next.val);
				if (n == null){
					n = p ;
				}
				while (n != null) {
					System.out.println(n.val);
					n = n.next ;
				}
		   	}
		   	p.next = tail ;
		   	tail = p ;
		   	p = next ;
		   	step++ ;
		}
		return n ;
	}
	
	
	
	//1->2->3->4->5 , 2->1->4->3->5
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
