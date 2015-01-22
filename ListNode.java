package com.scott.code;

public class ListNode {
	  int val;
	  ListNode next;
	  ListNode(int x) {
	  val = x;
	  next = null;
	  };
	  
	  public ListNode add(int [] array){
		  ListNode head = null;
		  ListNode point = head; 
		  for (int c : array){
			  if (point == null){
				  point = new ListNode(c);
				  head = point;
			  }else{
				  ListNode tmp = new ListNode(c);
				  point.next = tmp;
				  point =tmp;
			  }
		  }
		  
		  return head;
	  }
	 
	  public ListNode add(ListNode l1, ListNode l2){
		  int carry = 0;
		  ListNode head = null;
		  ListNode cur = head;
		  int value = 0;
  		  while (l1!=null&&l2!=null){
			  value = (l1.val+l2.val+carry)%10;
			  carry = (l1.val+l2.val+carry)/10;
			  ListNode node = new ListNode(value);
			  if (cur==null){
				  cur = node;
				  head = cur;
			  }else{
				  cur.next = node;
				  cur = node;
			  }
			  l1=l1.next;
			  l2=l2.next;
		  }
  		  
  		  while (l1!=null){
  			  value = (l1.val+carry)%10;
			  carry = (l1.val+carry)/10;
			  ListNode node = new ListNode(value);
			  cur.next = node;
			  cur = node;
			  l1=l1.next;
  		  }
 		 
  		  while (l2!=null){
  			value = (l2.val+carry)%10;
			  carry = (l2.val+carry)/10;
			  ListNode node = new ListNode(value);
			  cur.next = node;
			  cur = node;
			  l2=l2.next;
		  }
		  
  		  if (carry>0){
  			  cur.next = new ListNode(carry);
  		  }
		  
		  return head;
	  }
	  
	  public static ListNode rotateRight(ListNode head, int n) {
		  if (head == null) {
			  return null ;
		  }
		  
		  if (n == 0) {
			  return head;
		  }
		  
	     ListNode cur = head ;
	     ListNode newHead = head ;
	     int len = 0;
	     while (cur.next != null) {
	    	 cur = cur.next ;
	    	 len++;
	     }
	      len++ ;
	      	      
	     if (n % len == 0) {	    	 
	    	 return head ;
	     }
	     
	     int move = len - (n % len) ;	     
	    
	     int count = 0 ;
	     ListNode end = cur ;
	     cur = head ;	
	    
	     while (count++ < move - 1) {
	    	 cur = cur.next ;
	     }	    
	     
	     	    
	     newHead = cur.next ;	     
	     end.next = head ;
	     cur.next = null ;
	     	     		  
	     return newHead ;  	  
	  }
	  
	  public static void main(String [] args){
//		  int [] array1 ={2,4,3};
//		  int [] array2 ={5,6,4};
//		  ListNode node = new ListNode(1);
//		  ListNode n1 = node.add(array1);
//		  ListNode n2 = node.add(array2);
//		  node.add(n1, n2);
//		  while (head!=null){
//			  System.out.print(head.val);
//			  head = head.next;
//		  }
		  
		  int [] a= {1,2 , 3 , 4, 5} ;
		  ListNode head = null ;
		  ListNode current = head; 
		  for (int c : a ) {
			  ListNode node = new ListNode(c);
			  if (head == null) {
				  head = node ;
				  current = node ;				  
			  } else {
				  current .next = new ListNode(c);
				  current = current.next ;
			  }
		  }
		  
		  ListNode cur = ListNode.rotateRight(head, 100) ;
		  while (cur != null) {
			  System.out.println(cur.val);
			  cur = cur.next;
		  }
		  
      }
}
