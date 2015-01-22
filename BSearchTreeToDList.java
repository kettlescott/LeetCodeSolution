package com.scott.code;

import java.util.HashMap;

import java.util.Stack;

import com.scott.code.MinimumDepthofBinaryTree.TreeNode;

public class BSearchTreeToDList {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BSearchTreeToDList t = new BSearchTreeToDList ();
		int [] data = {4,1} ;
		TreeNode root = t.sortedArrayToBST (data);
		root = t.connect(root,null) ;
//		System.out.println(root.next.val);
//		System.out.println(t.solution(data));
//		while (root.pre != null) {
//			root = root.pre ;
//		}
//		while (root != null) {
//			System.out.print(root.val + " ");
//			root = root.next ;
//		}
		int [] array = {1, 3, 6, 4, 1, 1,2};
		System.out.println(t.solution(array));
	}
	
	 public int solution(int X, int Y, int D) {
	        // write your code in Java SE 8
	        long needTojump = Y - X ;
	        long last = needTojump % D ;
	        long jump =  needTojump / D ;
	        return last == 0  ? (int)jump : (int)(jump + 1) ;
	    }
	
	
	 public boolean canJump(int[] A) {
		 if (A[0] == 0 && A.length > 1 ) return false;
	     for (int i = 1 ; i < A.length - 1 ; ++i) {
	    	 A[i] = Math.max(A[i - 1] - 1, A[i]);
	    	 if (A[i] == 0) return false ;
	     }	     	 
		 return true ;
	 }
	
    public TreeNode sortedArrayToBST(int[] num) {
        return createTree (num, 0 , num.length - 1);    
    }
    
    
    private TreeNode createTree (int [] num, int L , int R){
    	if (R < L )  return null; ;
    	int M = (L + R) / 2 ;
    	TreeNode root = new TreeNode (num[M]);
    	root.left = createTree(num, L , M -1 );
    	root.right= createTree(num, M + 1 , R );    	
    	return root;
    }

	
	
	static class TreeNode {
		   int val;
		   TreeNode left;
		   TreeNode right;
		   TreeNode next;
		   TreeNode pre ;
		   TreeNode(int x) { val = x; }
	   }
	
	
	TreeNode pre = null ;
	
	public TreeNode connect (TreeNode root, TreeNode parent){
		if (root == null) return parent;
		TreeNode node = connect (root.left, root);
		node.next = root ;
		root.pre = node;
		TreeNode rnode = connect (root.right, root);
		root.next = rnode;
		rnode.pre = root;
		return node;
	}
	
	
	public int solution(String S) {
        // write your code in Java SE 8
		HashMap<Character,Character> map = new HashMap<Character,Character> (){ {
			put('(',')'); 
			put('{','}');
			put('[',']');
		  }			
		};
		Stack<Character> stack = new Stack<Character> ();
		for (Character c : S.toCharArray()) {
			if (map.containsKey(c)) {
				stack.push(c) ;
			} else if (stack.isEmpty() || map.get(stack.pop()) != c) {
				 return 0 ;
			}							
		}		
		return stack.isEmpty() ? 1 : 0 ;
    }
	
	  	
	public int solution(int[] A) {
        // write your code in Java SE 8
	   int min = Integer.MAX_VALUE , max = Integer.MIN_VALUE ;
	   for (int i = 0 ; i < A.length ; ++i) {
		   min = Math.min(min, A[i]);
		   max = Math.max(max, A[i]) ;
	   }
	   int [] map = new int [max + 1] ;
	   for (int i = 0 ;i < A.length ; ++i) {
		   map[A[i]]++;
	   }
	   for (int i = min ; i <= max ;++i) {
		   if (map[i] == 0)
			   return i;
	   }
	   return - 1;
    }
	
}
