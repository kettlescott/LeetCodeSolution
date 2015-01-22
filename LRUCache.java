package com.scott.leetcode;

import java.util.HashMap;

public class LRUCache {
	
    private int capacity ;
    private Node head = null;
    private Node tail = null;
    private HashMap<Integer,Node> storage ;
	
	public LRUCache(int capacity) {
        this.capacity = capacity;
        storage = new HashMap<Integer,Node>();        
    }
    
    public int get(int key) {
        if (!check(key)){
        	return -1;
        }                   
        moveToTail(storage.get(key));
        return storage.get(key).val;
    }
    
    private void moveToTail(Node node){
    	Node pre = node.prev;
    	Node next = node.next;
    	if (next!=null){    		
    		//node is head
    		if (pre==null){
    			head = next;
    		}else{
    			pre.next =  next;
    		}    		
    		
    		next.prev = pre;
    		
    		node.prev = tail;
    		node.next = null;
    		tail.next= node;
    		tail = node;    		
    	}
    }
    
    public void set(int key, int value) {
        if (storage.containsKey(key)){
        	Node node = storage.get(key);
        	moveToTail(node);
        	node.val = value;
        }else{
        	Node node = new Node(key,value);
        	if (storage.size()==capacity){
        		//remove the lrc element , the lrc element is located at the head
        		if (head!=null){
        			Node oldHead = head;
        			Node next = head.next;
            		head = next ;
            		next.prev=null;            		
            		storage.remove(oldHead.key);
        		}
        	}
        	
        	if (head==null){
        		head = node;
        		tail = node;
        	}else{
        		tail.next = node;
        		node.prev = tail;
        		tail = node;
        	}
        	
        	storage.put(key, node);
        	
        }
    }
    
   
    
    private boolean check(int key){
    	return storage.containsKey(key);
    }
    
    
    private class Node {
        int key;
        int val;
        Node prev = null;
        Node next = null;
        Node(int k, int v) {
            key = k;
            val = v;
        }   
    }
    
    public static void main(String []args){
    	LRUCache lcu = new LRUCache(2);
//    	lcu.set(1, 2);
//    	lcu.set(3, 4);
//    	lcu.set(5, 6);
//    	System.out.println(lcu.get(1));
//    	System.out.println(lcu.isRoatate("waterbottle","erbottlewat"));
    	lcu.replace("this          is    new ");
    	
    	
    }
    
    public boolean isRoatate(String s1, String s2){
    	s1+=s1;
    	return s1.contains(s2);
    }
    
    public String replace(String txt){
    	 int sp= 0;
    	 char [] chs = txt.toCharArray();
    	 for (int i =0 ;i<chs.length ;++i){
    		 if (chs[i] ==' '){
    			 sp++;
    		 }
    	 }
    	 char [] n_ch = new char [txt.length()+sp*2];
    	 int j =0;
    	 for (int i = 0 ;i<chs.length ;++i){
    		 if (chs[i]==' '){
    			 n_ch[j]   = '%';
    			 n_ch[j+1] = '2';
    			 n_ch[j+2] = '0';
    			 j+=3;
    		 }else{
    			 n_ch[j++] = chs [i] ;
    		 }
    	 }
    	 return new String(n_ch);
    	 
    }
}


