package com.scott.code;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.Queue;
import java.util.Stack;

public class BST {
	
	

	class Node {
		int value ;
		Node left;
		Node right;
		public Node(int value){
			this.value = value;
		}
	}
	
	private Node root = null;
	
	
    public int evalRPN(String[] tokens) {
       Stack<String> stack = new Stack<String>();
    	for (String tok : tokens){
    	   	if (isDigit(tok)){
    	   		stack.push(tok);
    	   	}else{
    	   		int a = Integer.parseInt(stack.pop());
    	   		int b = Integer.parseInt(stack.pop());
    	   		stack.push(String.valueOf(result(b,a,tok)));
    	   	}    	   	
    	}
    	return Integer.parseInt(stack.pop()) ;
    }
    
    public boolean isDigit(String number){
    	  boolean bisNumber = false;
	        if (number == null) {
	            bisNumber = false;
	        }
	        try {
	            Integer.parseInt(number);
	            bisNumber = true;
	        } catch (NumberFormatException ne) {
	            bisNumber = false;
	        }
	        return bisNumber;
    }
    
    public int result(int a , int b, String op){
    	if ("+".equals(op)){
    		return a+b;
    	}else if("-".equals(op)){
    		return a-b;
    	}else if("*".equals(op)){
    		return a*b;
    	}else{    	
    		return a/b;
    	}
    }
    
    
	

	
	public Node add(int value){
		if (root ==null){
			root =new Node(value);
			return root;
		}
		
		return addNode(root,value);
	}
	
	public Node addNode(Node node,int value){
		if (node == null){
			return new Node(value);
		}else{
          if (value>node.value){
        	  node.right = addNode(node.right,value);
        	  return node;
          }else if (value<node.value){
        	  node.left = addNode(node.left,value);
        	  return node;
          }else{
        	  throw new RuntimeException("duplicated element");
          }
			
		}		
	}

	public Node search(int value){
		return doSearch(root,value);
	}
	
	public Node doSearch(Node node ,int value){
		if (node==null){
			throw new NoSuchElementException("cannot find " + value);
		}
		if (node.value==value){
			return node ;
		}else if (value>node.value){
			return doSearch(node.right,value);
		}else{
			return doSearch(node.left,value);
		}
		
	}
	
	public void preOrder(){
		doPreOrder(root);
		
	}
	
	public void doPreOrder(Node node){
		if (node!=null){
			System.out.println(node.value);
		}
		if (node.left!=null){
			doPreOrder(node.left);
		}
		if (node.right!=null){
			doPreOrder(node.right);
		}
	}
	
	public void doPostOrder(Node root){
		if (root.left!=null){
			doPostOrder(root.left);
		}
		
		if (root.right!=null){
			doPostOrder(root.right);
		}
		
		if (root!=null){
			System.out.println(root.value);
		}
		
	}
	
	public void doInOrder(Node root){
		if (root.left!=null){
			doInOrder(root.left);
		}
		
		if (root!=null){
			System.out.println(root.value);
		}
		
		if (root.right!=null){
			doInOrder(root.right);
		}
		
		
		
	}
	
	public Stack<Node> trackNode(int value){
		Stack<Node> stack = new Stack<Node>();
		if (doTrack(root ,value, stack)){
			return stack;	
		}
		throw new RuntimeException("cannot find the path for the value" + value);
		
	}
	
	private boolean doTrack(Node node ,int value, Stack<Node> stack){
		if (node==null){
			return false;
		}		
		if (node.value==value){						
			stack.push(node);
			return true;
		} 
		if (node.left!=null){
			if (doTrack(node.left,value,stack)){
				stack.push(node);
				return true;
			}
		} 
		
		if (node.right!=null){
			if (doTrack(node.right,value,stack)){
				stack.push(node);
				return true;
			}
		}
		return false;
	}

    public Node findLeastCommonUpper(int value1, int value2){
    	Node node = find(value1,value2);
    	if (node!=null){
    		return node;
    	}
    	
    	throw new RuntimeException("no least common upper");
    }
    
    private Node find(int value1 , int value2){
    	Stack<Node> v1 = trackNode(value1);
    	Stack<Node> v2 = trackNode(value2);
    	HashSet<Node> set = new HashSet<Node>();
    	while (!v1.isEmpty()){
    		set.add(v1.pop());
    	}
    	
    	while (!v2.isEmpty()){
    		Node current = v2.pop();
    		if (set.contains(current)){
    			return current; 
    		}
    	}
    	
    	return null;    	
    }
    
    public boolean checkIfBalanced(Node root){
    	return  maxDeep(root ) - minDeep(root)>1; 
   
    }
    
    public int maxDeep(Node node ){
    	if (node==null){
    		return 0;
    	}else{    		
    		return 1+ Math.max(maxDeep(node.left), maxDeep(node.right));
    	}    	    	
    }
    
    public int minDeep(Node node ){
    	if (node==null){
    		return 0;
    	}else{    		
    		return 1+ Math.min(minDeep(node.left), minDeep(node.right));
    	}
    }
    
    public Node addToTree(int array[], int left ,int right){
    	if (left<=right){
    		int mid = (left+right)/2;
    		Node node = new Node(array[mid]);
    		node.left = addToTree(array,left,mid-1);
    		node.right = addToTree(array,mid+1,right);
    		return node;
    	}
    	return null;
    }
    
     public ArrayList<Integer> postorderTraversal(Node root) {
    	 Stack<Node> stack = new Stack<Node>();
    	 stack.push(root);
        
       return null;
     }
     
     //123
     public int reverse(int x) {
    	 int sign = x>0?1:-1;
    	 x = x<0?x*-1:x;
    	 int res = 0;
    	 while (x>=10){
    		 res = (x%10 + res)*10;
        	 x/=10;
    	 }   	         
         return sign*(res+x);
     }
     
     public boolean isInterleave(String s1, String s2, String s3) {
    	   if (s1.length()+s2.length()!=s3.length()){
    		   return false;
    	   }
    	 
    	   int seenA = 0,seenB = 0;
    	   int flag=0;
    	   
    	   for(int iter=0;iter<s3.length();iter++) {
    	        flag = 0;
    	        if(seenA+1<=s1.length()) {
    	            if(s3.charAt(iter)==s1.charAt(seenA)) {
    	                seenA++;
    	                flag = 1;
    	            }
    	        }
    	        if((seenB+1<=s2.length()&&flag==0)){
    	            if(s3.charAt(iter)==s1.charAt(seenB)) {
    	                seenB++;
    	                flag = 1;
    	            }
    	        }
    	        if(flag==0) {
    	            return false;
    	        }
    	        
    	      
    	   }
    	   return true; 
    	 
     }
     
     
     public int numDecodings(String s) {
    	 if(s.length()==0||s.charAt(0)=='0')return 0;
    	    int cur_2 = 1,cur_1 = 1,cur = 0;

    	    for(int i = 2;i<=s.length();i++){
    	        if(s.charAt(i-1)!='0'){
    	        	cur+=cur_1;
//    	        	System.out.println(cur);
    	        }
    	        if(s.charAt(i-2)=='1'||(s.charAt(i-2)=='2'&&s.charAt(i-1)<'7')){
    	        	cur+=cur_2;
//    	        	System.out.println(cur);
    	        }
    	        cur_2 = cur_1;
    	        cur_1 =  cur;
    	        cur = 0;
    	        System.out.println(cur_1);
    	    }
    	    return cur_1;
     }
    
	public static void main(String[] args) {
//		 int randomData[] = {43,887,11,3,8,33,6,0,46,32,78,76,334,45};
		 BST bst = new BST();
//		 for (int i = 0 ; i<randomData.length ;++i){
//			 bst.add(randomData[i]);
//		 }
		 
		 int count = bst.numDecodings("100");
		 System.out.println(count);
		 
	}
   
    
}