package com.scott.leetcode;

public class MinStack {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MinStack m = new MinStack ();
		m.push(-10);
		m.push(14);
		m.push(-20);
		m.pop();		
		m.push(10);
		m.push(-7);
		System.out.println(m.getMin());
//		System.out.println(m.top());
//		m.pop();
//		System.out.println(m.getMin());
		
		
	}
		
	
	private class Node {
		Node next ;
		int val ;
		int currentMin ;
		public Node (int val){
			this.val = val;
		}
	}
	
   Node  top = null ;
	
   public void push(int x) {
       if (top == null) {
    	   top = new Node (x);
    	   top.currentMin = x ;    	   
       } else{
    	   Node cur = new Node (x);
    	   cur.next = top ;
    	   cur.currentMin = x < top.currentMin ? x : top.currentMin ;
    	   top = cur;    	   
    	  
       }      	     
       
   }
   
   public void pop(){
	   if (top != null) {
		   Node n = top.next ;
		   top = n ;
	   }
   }
   
   public int top(){
	  return top == null ? 0 : top.val ;
   }

   public int getMin() {   	   
	   return top == null ? 0  : top.currentMin;
   }
   
}
