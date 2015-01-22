package com.scott.code;

import java.util.Stack;

public class BSTIterator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] data = {1,2,3,4,5,6,7,8,9} ;
		TreeNode rootNode = sortedArrayToBST (data); ;				
		BSTIterator b = new BSTIterator (rootNode);
		while (b.hasNext()) {
			System.out.println(b.next());
		}
		
	}
	
	Stack<TreeNode> stack =  null ;
	TreeNode current = null ;
	
    public BSTIterator(TreeNode root) {
    	  current = root;	     
    	  stack = new Stack<> ();
	}

	/** @return whether we have a next smallest number */
	public boolean hasNext() {		  
	      return !stack.isEmpty() || current != null;  
	}

	    /** @return the next smallest number */
	public int next() {
		while (current != null) {
			stack.push(current);
			current = current.left ;
		}		
		TreeNode t = stack.pop() ;		
		current = t.right ;		
		return t.val ;
	}
	
	
	  public static TreeNode sortedArrayToBST(int[] num) {
	        return createTree (num, 0 , num.length - 1);    
	    }
	    
	    
	 private static TreeNode createTree (int [] num, int L , int R){
	    	if (R < L )  return null; ;
	    	int M = (L + R) / 2 ;
	    	TreeNode root = new TreeNode (num[M]);
	    	root.left = createTree(num, L , M -1 );
	    	root.right= createTree(num, M + 1 , R );    	
	    	return root;
	    }

}
