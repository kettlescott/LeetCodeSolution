package com.scott.code;

import java.util.Stack;

public class MinStackII {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MinStackII m = new MinStackII ();
		m.push(-10);
		m.push(14);
		m.push(-20);
		m.pop();		
		m.push(10);
		m.push(-7);
		System.out.println(m.getMin());
	}
	
	 Stack<Integer> storage = new Stack<>();
	 Stack<Integer> keepMin = new Stack<>();
	
	 public void push(int x) {
		 storage.push(x) ;
	     if (keepMin.isEmpty() || x <= keepMin.peek()) {
	    	 keepMin.push(x);
	     } 
	     
	 }

	 public void pop() {	     
	     if (storage.pop().equals(keepMin.peek())) keepMin.pop() ;
	 }

	 public int top() {
	    return storage.peek() ;    
	 }

	 public int getMin() {
	    return keepMin.peek() ;    
	 }

}
