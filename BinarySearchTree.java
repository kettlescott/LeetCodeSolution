package com.scott.code;

import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.Queue;
import java.util.Stack;

public class BinarySearchTree {
	

	 private Node root;
	
	 private static class Node {
		 Node left ;
		 Node right;
		 int size ; 
		 int value ;
		 public Node(int value){
			 this.value = value;
		 }
	 }
	 
	 

	public static void main(String[] args) {
		BinarySearchTree t =new BinarySearchTree();
		final int NUMS = 4000;
	    final int GAP  =   37;

	    System.out.println( "Checking... (no more output means success)" );
	   
	    for( int i = GAP; i != 0; i = ( i + GAP ) % NUMS )
            t.insert( i );

//        for( int i = 1; i < NUMS; i += 2 )
//            t.remove( i );
//
//        if( t.findMin( ) != 2 || t.findMax( ) != NUMS - 2 )
//            System.out.println( "FindMin or FindMax error!" );
//
//        for( int i = 2; i < NUMS; i+=2 )
//             if( t.find( i ) != i )
//                 System.out.println( "Find error1!" );

//        for( int i = 1; i < NUMS; i+=2 )
//        {
//            if( t.find( i ) != null )
//                System.out.println( "Find error2!" );
//        }
        
//        for( int i = 2; i < NUMS; i+= 2 )
//            if( t.findKth( i / 2 ) != i )
//                System.out.println( "FindKth error!" );

         t.postOrder();
         t.bfs();
	}

	public void insert(int value){
		root = insert(value,root);
	}
	
	
	public int find(int value){
		Node current = root;
		Node node = find(value, current);
		if (node !=null){
			return node.value ;
		}
		throw new NoSuchElementException();
	}
	
	private Node find(int value , Node root){
		if (root == null){
			return null;
		}else{
			if (value == root.value){
				return root;
			}else if (value<root.value){
                return find(value , root.left);
			}else {
				return find(value , root.right);
			}
		}
	}
	
	public int findMin(){
		return findMin(root).value;
	}
	
	
	public Node findMin(Node t){
		Node current = t;
		while(current.left!=null){
			current = current.left;
		}
		return current;
	}
	
	public int findMax(){
		return findMax(root).value;
	}
	
	public Node findMax(Node t){
		Node current = t;
		while(current.right!=null){
			current  = current.right;
		}
		return current;
	}
	
	
	private Node insert(int value , Node root){
		if (root == null){
			root = new Node(value);
			return root;
		}else{
			if (value>root.value){
				root.right = insert(value,root.right);
			}else if (value<root.value){
				root.left = insert(value,root.left);
			}else {
				throw new DuplicateElementException(new Integer(value).toString());
			}
			root.size++;
			return root;
		}
	}
	
	public Node removeMin(Node t){
		if (t==null){
			throw new NoSuchElementException();
		}
		if (t.left==null){
			return t.right;
		}
		t.left = removeMin(t.left);
		t.size--;
		return t;
		
	}
	
	public void remove(int value){
		root = remove(value,root);
	}
	
	public Node remove(int value, Node root){
		if (root==null){
			throw new NoSuchElementException();
		}
		if (value> root.value){
			root.right = remove(value,root.right);
		}else if (value < root.value){
			root.left = remove(value,root.left);
		}else{
			
			if (root.left!=null&&root.right!=null){
	          root.value = findMin (root.right).value;
	          root.right = removeMin(root.right);
			}else{
				root = (root.left!=null)? root.left:root.right;
				return root;
			}
		}		
		root.size--;
		return root;
	}
	
	public int findKth(int k){
		Node node = findKth(k,root);
		System.out.println(k);
		if (node == null){
			throw new NoSuchElementException();
		}
		return node.value;
	}
	
	private Node findKth(int k ,Node root){
	
		if (root==null){
			return null;
		}
		int leftSize = root.left!=null?root.size:0;
		if( k <= leftSize )
            return findKth( k, root.left );
        if( k == leftSize + 1 ){
        	return root;
        }            
        return findKth( k - leftSize - 1, root.right );
	}
	
 	private class DuplicateElementException extends RuntimeException{
		
		public DuplicateElementException(){
			
		}
		
		public DuplicateElementException(String msg){
			System.err.println();
		}
	}
	
 	public void postOrder(){
 		doPostOrder(root);
 	}
 	
 	public void doPostOrder(Node root){
 		if (root!=null){
 			doPostOrder(root.left);
 			doPostOrder(root.right);
 			System.out.print(root.value);
 		}
 		System.out.println();
 		
 	}
 	
 	public void postOrderWithStack(){
 		Stack<Node> stack = new Stack<Node>();
         while (root.left!=null){
        	 stack.add(root.left);
        	 root = root.left;
         }
   
 		
 	}
 	
 	public void bfs(){
 		Queue<Node> queue = new LinkedList<Node>();
 		queue.add(root);
 		while(queue.size()!=0){
 			Node node = queue.poll();
 			if (node!=null){
 				System.out.println(node.value);
 				queue.add(node.left);
 	 			queue.add(node.right);
 			} 			
 		}
 	}
 	
 	
}
