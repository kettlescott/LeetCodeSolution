package com.scott.code;

import java.util.HashMap;

public class Binary {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	
        int [] index = {1 ,2 ,3, 4, 5, 6, 7, 8, 9} ;
		
//        System.out.println(Binary.bSearch_loop(index, 11));
//        System.out.println(bSearch_recursive(index, 0 , index.length-1 ,11));
        
        Binary binary = new Binary ();
        int n = 5 ;        
        int [][] matrix = binary.generateMatrix(n) ;
        binary.dumpMatrix(matrix) ;
        
	}
	
	
	 public int[][] generateMatrix(int len) {	        
	     int [][] matrix = new int [len][len];
	     int start = 1 ;
	     int horizon = len - 1 ; 
	     int vertical = len;
	     int m = 0 ;
	     int n = 0 ;
	     int count = 0 ;
	     int move = -1 ;	     
	     int group = 0 ;
	     boolean flag = false ;
	     	     
	     while (start <= len * len) {
	    	 if (group % 2 == 0) {
	    		 flag = true ;
	    		 move = 1 ;	 
	    	 }
	    	 
	    	 
	         //horizon 
	    	 while (count++ < horizon) {	   	    		 
	    	    matrix [m][n] = start++ ;
	    	    n += move;	    	    
	    	 }

	    	 count = 0 ;
	    	 
	    
	    	 while (count++ < vertical) {
	    		 matrix [m][n] = start++ ;
		    	   m += move;	    	    
	    	 }
	    	
	    	 	    	 
	    	 horizon -- ;	    	 
	    	 vertical -- ;
	    	 
	    	 if (flag) {
	    		 m--;
	    		 n--;
	    	 } else {
	    		 m++;
	    		 n++;
	    	 }
	    	 	    	 
	    	 group++;
	    	 count = 0 ;
	    	 flag = false ;	    	 
	    	 move = -1 ;
	    		    	 
	     }
	     	  
	     return matrix ;	 	
	 }
	
	 public void dumpMatrix (int [][] mt){
		 
		 int m = mt.length  ;
		 int n = mt[0].length  ;
		 
		 for ( int i = 0 ; i < m ; ++i) {
			 for (int j = 0 ; j < n ; ++j) {
				 System.out.print (mt[i][j] + "  ");
			 }
			 System.out.println();
		 }
		 
	 }
	
	   private static  class TreeNode {
		      int val;
		      TreeNode left;
		      TreeNode right;
		      TreeNode(int x) { val = x; }
		}
	   
	   
	   public TreeNode buildTree_pre_in(int[] preorder, int[] inorder) {
	        HashMap<Integer, Integer> map  = new HashMap<Integer,Integer> ();	
	        calPosition(inorder , map);
	        return reconstruct_pre_in (preorder, inorder, 0, 0, inorder.length - 1 , map) ;
	   } 
	   
	   
	   public TreeNode reconstruct_pre_in (int[] preorder, int[] inorder ,int preStart , int in_left , int in_right, HashMap<Integer,Integer> map ){
		   
		   if (in_left <= in_right) {
			  int val = preorder[preStart] ;
			  TreeNode root = new TreeNode (val);
			  int len = map.get(val) - in_left ;
			  root.left = reconstruct_pre_in(preorder, inorder, preStart + 1 ,in_left ,map.get(val) - 1 , map) ;
			  root.right = reconstruct_pre_in(preorder, inorder, preStart + len + 1 ,map.get(val) + 1 , in_right, map) ;
			  return root ;
		   }		   
		   return null ;		   
	   }
	   
	   public TreeNode buildTree(int[] inorder, int[] postorder) {
	      HashMap <Integer , Integer> map = new HashMap<Integer, Integer> () ;
	      calPosition (inorder , map) ;
	      reconstruct_post_in (postorder , inorder , postorder.length -1 , 0 , inorder.length - 1 , map );
		   return null;
	   }
	   
        public TreeNode reconstruct_post_in (int[] postorder, int[] inorder ,int postStart , int in_left , int in_right, HashMap<Integer,Integer> map ){		  
		   if (in_left <= in_right && postStart >=0) {
			  int val = postorder[postStart] ;
			  TreeNode root = new TreeNode (val);
			  int len = in_right - map.get(val) ;
			  root.right = reconstruct_post_in (postorder, inorder , postStart - 1, map.get(val) -1 , in_right, map ) ;
			  root.left = reconstruct_post_in (postorder, inorder ,postStart - len - 1 , in_left , map.get(val) -1,  map ) ;
			  return root ;
		   }		   
		   return null ;		   
	   }
	   
	   
	   
	   private void calPosition( int[] inorder , HashMap<Integer,Integer> map){		   
		   for (int i = 0 ; i < inorder.length ; ++i) {
			   map.put(inorder[i],i) ;
		   }		   
	   }
	   
	   
	   
	   
	   
	   
	   
	   
	   

	   
	   public int sumNumbers(TreeNode root) {
	        return sum (root, 0);
	    }
	  
	   
	   public int sum(TreeNode root, int result){
		   if (root != null) {			   			 
			   return result * 10  + sum (root.left,  root.val) + sum (root.right ,  root.val) ;
		   }		   
		   return 0 ;
	   }
	  
	
	
	public static int bSearch_loop(int []  index, int target){
		int left = 0;
		int right = index.length-1;
		
		while (left<=right) {
			int mid = (left+right)/2;
			if (index[mid]==target){
				return mid;
			} else if (target<index[mid]){
			   right=mid-1;	
			} else {
				left=mid+1;
			}
		}
		return -1;
		
	}
	
	
	public static int bSearch_recursive(int [] index , int left , int right, int target){
	
		if (left<=right){
			int mid = (left + right)/2 ;
			if (index [mid] == target){
				return mid;
			} else if (target < index [mid]){
				return bSearch_recursive(index , left , mid -1 , target);
			} else{
				return bSearch_recursive(index , mid+1 , right, target);
			}	
		}
		return -1 ;
	}
	
	
}
