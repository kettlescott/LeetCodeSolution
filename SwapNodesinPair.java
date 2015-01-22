package com.scott.code;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.scott.code.MergeTwoSortedLists.ListNode;

public class SwapNodesinPair {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SwapNodesinPair n = new SwapNodesinPair ();
		ListNode n1 = new ListNode (1);
		ListNode n2 = new ListNode (2);
		ListNode n3 = new ListNode (3);
		ListNode n4 = new ListNode (4);
		ListNode n5 = new ListNode (5);
		n1.next = n2 ;
		n2.next = n3 ;
		n3.next = n4 ;
		n4.next = n5 ;
		ListNode h = n.swapPairs(n1) ;
		while (h != null) {
			System.out.print(h.val + " ") ;
			h = h.next ;
		}

	}
	
	public HashMap<String,List<String>>  rebuild (HashMap<String,String> map){		
		HashMap<String,String> found = new HashMap<> ();
		HashMap<String,List<String>> result = new HashMap<> ();
		for (Map.Entry<String, String> entry : map.entrySet()) {
			if (found.containsKey(entry.getValue())){
				found.put(entry.getValue(), entry.getKey()) ;
				result.put(entry.getKey(), new ArrayList<String>());
			} else{
				List<String> tmp = result.get(found.get(entry.getValue())) ;
				tmp.add(entry.getKey());				
			}				
		}
		return result;
	}
	
	
	 public ListNode swapPairs(ListNode head) {
	    ListNode dummy = new ListNode (-1);
	    ListNode pre = dummy ;
	    ListNode p = head ;
	    dummy.next = p ;
	    while ( p != null && p.next != null) {
	    	ListNode q = p.next ;
	    	ListNode r = q.next ;
	    	p.next = r ;
	    	q.next = p ;
	    	pre.next = q ;
	    	pre = p ;
	    	p = r ;	    	
	    }	    	    
	    return dummy.next ;
	 }
	 
	 
	 static  class ListNode  {
    	 int val;
    	 ListNode next;
    	 ListNode(int x) {
    		 val = x;
    		 next = null;
    	 }
    }

}
