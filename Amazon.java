package com.scott.code;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.Stack;

public class Amazon {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
//      int [] [] matrix = {{1,2,3,4,5},{6,7,8,9,10}};
//      int x =1;
//      int y =2;
//      System.out.println(findNumOfWays(matrix,x,y));
//      int ways = findWaysDP(matrix,x,y);
//      System.out.println(ways);
//		removeDuplicate("((a+b)*(c+d))");
	
		Amazon a  = new Amazon ();
		
//		String str = a.longestPalindrome("aba");
//		System.out.println(str);
//		System.out.println(a.romanToInt("XIX"));
		
//		int [] A = { -2 , 1  } ;
//		System.out.println(a.maxSubArray(A));
		Amazon.TreeNode r = new Amazon.TreeNode(10); 
		Amazon.TreeNode b = new Amazon.TreeNode(5);
		Amazon.TreeNode c = new Amazon.TreeNode(15);
		Amazon.TreeNode d = new Amazon.TreeNode(6);
		Amazon.TreeNode e = new Amazon.TreeNode(20);
		Amazon.TreeNode f = new Amazon.TreeNode(-2);
		Amazon.TreeNode g = new Amazon.TreeNode(-1);
		r.left = b ;
		r.right = c ;
		c.left = d ;
		c.right = e;
//		System.out.println(a.isValidBST(r));
//		List<List<Integer>> mainList = a.zigzagLevelOrder(r) ;
//		for (List<Integer> ls : mainList) {
//		   for (int i : ls) {
//			   System.out.print(i + " ");
//		   }
//		   System.out.println();
//		}
		
//		b.left = d ;
//		b.right = e ;
//		d.left = g ;
//		c.left = f ;
		
//		int max = a.maxPathSum(r) ;
//		System.out.println(max);
		
		
//		System.out.println(a.lengthOfLongestSubstring("ruowzgiooobpple"));
		int [] A = {1,3,6,0,0,0};
		int [] B = {2,7,9};

//		a.merge (A,3,B,3);
		
//		System.out.println(a.reverseInteger(3, 0));
//		System.out.println(a.reverse(10));
		
		boolean isPalindrome = a.isPalindrome( 	10000021);
		
		
//		System.out.println(isPalindrome);
		System.out.println(a.minWindow("qadddcba", "abc"));
		
//		for (String ip : a.restoreIpAddresses("0279245587303")) {
//			System.out.println(ip);
//		}
//		
//		a.letterCombinations("");
		HashSet<String> dict = new HashSet<String> ();
		dict.add("aaaa");
		dict.add("aa");
		dict.add("a");
//		dict.add("sand");
//		dict.add("dog");
//		a.wordBreak("aaaaaaa", dict);
//		System.out.println(a.wordBreakHasSolution("a", dict));
//		System.out.println(a.simplifyPath("/./"));
//		System.out.println(a.isMatch("aa", "a"));
//		System.out.println(a.isMatch("aa","aa"));
//		System.out.println(a.isMatch("aaa","aa"));
//		System.out.println(a.isMatch("aa", "a*"));
//		System.out.println(a.isMatch("aa", ".*"));
//		System.out.println(a.isMatch("ab", ".*"));
//		System.out.println(a.isMatch("aab", "c*a*b"));
//		System.out.println(a.isMatch("abcd", "d*"));
//		System.out.println(a.isMatch("ab", ".*c"));
	
//		int [] ar = {1,5 ,6 ,7 ,8, 9 ,2} ;
//		a.insertSort(ar);
//		for (int i : ar ) {
//			System.out.print(i);
//		}
		
		Amazon.ListNode n1 = new Amazon.ListNode (2); 
		Amazon.ListNode n2 = new Amazon.ListNode (1);
		Amazon.ListNode n3 = new Amazon.ListNode (9); 
		Amazon.ListNode n4 = new Amazon.ListNode (8);
		Amazon.ListNode n5 = new Amazon.ListNode (7); 
//		Amazon.ListNode n6 = new Amazon.ListNode (8);
		n1.next = n2 ;
		n2.next = n3;
		n3.next = n4;
		n4.next = n5;
		n5.next = null;
//		ListNode head = a.insertionSortList(n1);
//		ListNode p = head ;
//		while (p != null){
//			System.out.println(p.val);
//			p = p.next ;
//		}
		
//		String v = a.convert("A", 1) ;
//		System.out.println(v);
//		a.grayCode(2);
		int [] heights = {3,5,5,2,5,5,6,6,4,4,1,1,2,5,5,6,6,4,1,3} ;
		int sum = a.largestRectangleArea(heights);
		System.out.println(sum);
		List<List<Integer>> result = new ArrayList<List<Integer>> ();
		ArrayList<Integer> list = new ArrayList<Integer> ();
		list.add(1);
		result.add(list);
		int [][] dataSet = {{2} , {3,4} , {6,5,9}, {4,4,8,0} , {6,7,8,9,5}} ;
		result = a.testData(dataSet) ;
		
//		System.out.println(a.minimumTotal(result));
//		System.out.println(a.minimumTotal_recursive(result));
		
		
//		System.out.println(a.numDistinct("CC", "C"));
		TreeNode t1 = new TreeNode (1);
		TreeNode t2 = new TreeNode (2);
		TreeNode t3 = new TreeNode (5);
		TreeNode t4 = new TreeNode (2);
		TreeNode t5 = new TreeNode (5);
		TreeNode t6 = new TreeNode (4);
		TreeNode t7 = new TreeNode (7);
		TreeNode t8 = new TreeNode (4);
		t1.left = t2;
//		t2.left = t4;
//		t2.right = t3;
//		t3.left = t7;
//		t3.right = t6;
//		t1.right = t5;
//		t5.right = t8;
		
		TreeNode root = a.UpsideDownBinaryTree(t1);
		System.out.println(root.right.left);
		
//		System.out.println(a.reverse("hello            world hello"));
	 
//		System.out.println(a.longestValidParentheses("()(())"));
		int [] numbers = {2, 7 , 11 ,15} ;
		int [] answer = a.twoSum(numbers, 9) ;
		System.out.println(answer[0]);
		System.out.println(answer[1]);
	}
	
	
	 public int[] twoSum(int[] numbers, int target) {
	      for (int i = 0 ; i < numbers.length ; ++i) {
	    	  int index = bsearch (numbers, target - numbers[i], i + 1) ;
	    	  if (index != - 1) 
	    		  return new int [] {i + 1,index + 1};
	      }	    
	     throw new RuntimeException("canont find");
	 }
	 
	 public int bsearch (int [] numbers,int target, int left){
		 int L = left , R = numbers.length - 1 ;
		 while (L < R) {
			 int mid = (L + R) / 2 ;
			 if (target <= numbers[mid] ) {
				 R = mid ;				 				 
			 } else{				 
				 L = mid + 1 ;				 
			 }
		 }		 
		 return numbers[L] == target ? L : -1;
	 }
	
	
	 public boolean isOneEditDistance(String s, String t) {
	    if (Math.abs(s.length() - t.length()) > 1) return false ;       
	    if (s.length() == t.length()) {
	    	int i = 0 ,diff = 0;
	    	while (i < s.length()) {
	    		if (s.charAt(i) != t.charAt(i)) {
	    			diff++;
	    		}
	    		i++;
	    	}
	    	return diff == 1 ;
	    } else if (s.length() < t.length()) {
	       return s.equals(t.substring(0,  t.length() - 1)) || s.equals(t.substring(1,  t.length())) || check (s,t);	
	    } else {	    	
	       return t.equals(s.substring(0,  s.length() - 1)) || t.equals(s.substring(1,  s.length())) || check (t,s);	
	    }	    	 
	 }
	
	 private boolean check (String s, String t){
		 int i = 0 ;
		 while (i < s.length() && s.charAt(i) == t.charAt(i)) i++;
		 int j = i + 1;		 		
		 while (i < s.length() && s.charAt(i) == t.charAt(j)) {
			 i++ ; 
			 j++;
		 }
		 return i == s.length();
	 }
	 
	 public int longestValidParentheses(String s)  {
		 Stack<Integer> stack = new Stack<Integer> ();
		 int maxLen = 0 ,count = 0;
		 for (int i = 0 ; i < s.length(); ++i) {
			 if (s.charAt(i) == '(') {
				 stack.push(i) ;
				 continue;
			 }
			 if (!stack.isEmpty()) {				 
				if (stack.peek() + 1 == i || stack.peek() + count  == i - 1) {
					stack.pop();
					count += 2 ;					
				} else {
					maxLen = Math.max(maxLen, count);
					System.out.println(i + " : "  + stack.peek() + " : " + count);
					count = 0 ;
					
				}
			 }	else {				 
				  maxLen = Math.max(maxLen, count);
				  count = 0 ;				  
			 }
		 }		 
		 maxLen = Math.max(maxLen, count);
		 return maxLen;
	 }
	
	 public int lengthOfLongestSubstringI(String s) {
	    int maxLen = 0 ,i = 0;
	    boolean [] map = new boolean[256];
	    for (int j = 0 ; j < s.length()  ;++j) {
	    	while (map[s.charAt(j)]) {
	    		map[s.charAt(i)] = false;
	    		i++;
	    	}
	    	map[s.charAt(j)] = true;
	    	maxLen = Math.max(maxLen, j - i + 1);
	    }	    
	    return maxLen;
	 }
	 
	 public int lengthOfLongestSubstringII(String s) {
		    int maxLen = 0 ,i = 0;
		    int [] map = new int[256];
		    Arrays.fill(map, -1);
		    for (int j = 0 ; j < s.length() ; ++j) {
		    	if (map[s.charAt(j)] >= i) {
		    		i = map[s.charAt(j)] + 1;
		    	}
		    	map[s.charAt(j)] = j;
		    	maxLen = Math.max(maxLen, j - i + 1);
		    }		    
		    return maxLen;
		 }
	
	
	public String reverse (String s){
		char [] chs = s.toCharArray() ;
		int i = 0 , j = s.length() - 1 ;
		while (i < s.length() && Character.isWhitespace(chs[i])) i++;
		while (j >= 0 && Character.isWhitespace(chs[j])) j--;		
		rev (chs,i,j);
		
		int  start = i , move = i;
		for (; i <= j ; ) {
			while (i <= j && Character.isWhitespace(s.charAt(i))) i++;
			int head = move ;
			while (i <= j && !Character.isWhitespace(s.charAt(i))) {
		         chs[move++] = chs[i++];		
			}
			rev (chs,head,move - 1);
			
			//copy empty
			if (i <= j) {
				chs[move] = chs[i];	
				move++;
			}						
		}				
		return new String(chs,start,move - start) ;
	}
	
	
	public void rev (char [] ch , int start, int end){
		int i = start , j = end ;		
		for (; i < j ; ++i, --j) {
			char tmp = ch[i];
			ch[i] = ch[j] ;
			ch[j] = tmp;
		}
	}
	
	
	
    public TreeNode UpsideDownBinaryTree(TreeNode root) {
    	TreeNode nRoot = getLeft (root);
    	doUpsideDownBinaryTree (root);
    	return nRoot;
    	
     }
    
    
    public TreeNode doUpsideDownBinaryTree (TreeNode root){    	
    	if (root == null) {
    		return null;
    	}  else if (root.left == null && root.right == null) {
    		return root;
    	} else {
    		TreeNode left = doUpsideDownBinaryTree (root.left);
    		left.left = doUpsideDownBinaryTree (root.right);
    		left.right = root;
    		root.left = null ;
    		root.right = null ;
    		return root;
    	}
    	
    }
    
    
    public TreeNode getLeft (TreeNode root){
    	if (root == null) {
    		return null ;
    	} else if (root.left == null && root.right == null) {
    		return root;
    	} else {
    		return getLeft (root.left);
    	}
    
	}
	
	
	
	public int pathSum (TreeNode node){
		List<Integer> list = new ArrayList<Integer> ();
		doPathSum (node,0,list);
		int sum = 0 ;
		for (int i= 0 ; i < list.size() ;++i) {
			sum += list.get(i);
		}		
		return sum;
	}
	
	
	public void doPathSum(TreeNode node, int sum, List<Integer> list){
		if (node == null ) {
			return ;
		}
		if (node.left == null && node.right == null) {			
			list.add(sum * 10 + node.val);
		} else{
			sum = sum * 10 + node.val;
			doPathSum (node.left, sum , list);			
			doPathSum (node.right, sum , list);			
		}
	}
	
	
	 public int numDistinct(String S, String T) {
	
		 int [][] dp = new int[T.length() + 1][S.length() + 1];
		 dp[0][0] = 1;
		 
		 
		 for (int i = 1 ; i <= T.length() ;++i) {			 
			 for (int j = 1 ; j <= S.length();++j) {
				 dp[i][j] = dp[i][j - 1] ;
				 if (T.charAt(i - 1)  == S.charAt(j - 1) ) {
					 
					 dp[i][j] +=  dp[i - 1][j - 1] ; 
							 
				 } 
			 }
		 }
		 
		 
		 return  dp[T.length()][S.length()] ;
	 }
	
	
	public int getPath (List<List<Integer>> triangle ,int level , int start, int index){
        if (level == triangle.size()) {
                return start ;
        } else {                       
                List<Integer> row = triangle.get(level) ;              
                start += row.get(index) ;
                int a = getPath (triangle,level + 1 , start , index) ;
                start -= row.get(index) ;
                start += row.get(index + 1) ;
                int b = getPath (triangle,level + 1,start , index + 1);                
                return Math.min(a, b) ;                
        }              
       
}


public int minimumTotal_recursive(List<List<Integer>> triangle) {   
	    if (triangle.size() == 0) {
	    	return 0 ;
	    }
        return getPath (triangle, 1 , triangle.get(0).get(0), 0);
} 

public int minimumTotal_bootom_up(List<List<Integer>> triangle) {
   int min = 0 ;
   int [][] dp = new int [triangle.size()][triangle.size()];
   
   int row = triangle.size() - 1;
   
   for (int i = 0 ; i < triangle.get(row).size() ; ++i) {
	   dp[row][i] = triangle.get(row).get(i) ;
   }
	
	
   for (int i = row -1 ; i >= 0 ; --i) {
	   for (int j = 0 ; j < triangle.get(i).size()  ; ++j) {
		   dp[i][j] = Math.min(dp[i+1][j],dp[i+1][j+1]) + triangle.get(i).get(j) ;
	   }
   }
   
   min = dp[0][0];
	   
   return min ;
}

public int minimumTotal (List<List<Integer>> triangle){
	
	if (triangle == null || triangle.size() == 0) {
		return 0 ;
	}
	
	int min = Integer.MAX_VALUE ;
	
	int [][] dp = new int[triangle.size()][triangle.size()];
	dp[0][0] = triangle.get(0).get(0);
	
	int row = triangle.size() ;
	
	
	for (int i = 1 ; i < row ; ++i) {
		int preLen = triangle.get(i - 1).size() - 1 ;
		for (int j = 0 ; j < triangle.get(i).size() ; ++j) {
			if ( j == 0) {				
		        dp[i][j] = dp[i -1][ j] +  triangle.get(i).get(j); 		
			} else {
				if ( j <= preLen) {					
					dp[i][j] = Math.min(dp[i -1][ j - 1],dp[i -1][ j])  + triangle.get(i).get(j);
				} else{
					dp[i][j] = dp[i -1][ j - 1] +  triangle.get(i).get(j);
				}
			}
		}					
	}
	
	for (int i = 0 ; i < triangle.get(row - 1).size() ;++i) {
              min = Math.min(dp[row - 1][i], min) ;		
	}			
	return min ;	
}


   public List<List<Integer>> testData(int [][] data){
	   List<List<Integer>> result = new ArrayList<List<Integer>> ();
	   
	   for (int [] row : data) {
		   List<Integer> list = new ArrayList<Integer> ();
		   for ( int i : row ) {
			   list.add(i);
		   }
		   
		   result.add(list);
	   }
	   
	   
	   return result;	   	   	  
   }
	
	
	 public int largestRectangleArea(int[] height) {
	        
	    Stack<Integer> stack = new Stack<Integer> ();
	    
	    int sum = 0 ;
	    int i = 0 ;
	    for ( ; i < height.length ; ++i) {
	    	if (stack.isEmpty()|| height[i] > height[stack.peek()]) {	    		
	    		stack.push(i);
	    	} else {	    		    			    		
	    		while (!stack.isEmpty() && height[i] <= height[stack.peek()]){	    			
	    			int tmp = stack.pop() ;	    				    			
	    			int length = stack.isEmpty() ? i : i -  stack.peek() - 1;		    			
	    			sum = Math.max(sum, height[tmp] * length) ;	   
	    			 
	    		}	    			
	    		stack.push(i) ;	    		
	    	}
	    }
	   	    
	    while (!stack.isEmpty()) {
	    	int tmp = stack.pop() ;
	    	int length = stack.isEmpty() ? i : i -  stack.peek() - 1;
	    	sum = Math.max(sum, height[tmp] * length) ;	  
	    }	    
	    
	   return sum; 
	 
	 }
	
	
	
	
      public List<Integer> grayCode(int n) {
        
         List<Integer> result = new LinkedList<Integer> ();
         if (n == 0) {
        	 result.add(0);
        	 return result;
         }
         
         backtrack (n,"",result);
         
         return result ;
      
      }
	
	
	public void backtrack (int n, String prefix,List<Integer> result ){
		if (n == 0) {
			System.out.println(prefix);
			result.add(Integer.parseInt(prefix, 2));
		} else {
			backtrack (n - 1 , prefix + "0", result );
			backtrack (n - 1 , prefix + "1",result );
		}
	}
	
	
	
	 public String convert(String s, int nRows) {
		 if (nRows == 1) {
			 return s ;
		 }
	        
		   char [][] matrix = new char [nRows][s.length()];    

		   int i = 0 ;
		   int m = 0 ;
		   int n = 0;
		   int  count = 0 ;
		   for (; i < s.length() ; ++i) {
			   if (count % 2 == 0 && m < nRows - 1 ) {
				  // vertical set				  	   
				   matrix [m++][n] = s.charAt(i) ;
			   } else if (m >= 1 ) {
				   // diagonal set		
				   System.out.println(m + " " + n);
				   matrix [m--][n++] = s.charAt(i) ;
			   }
			   
			   if (m >= nRows - 1 || m < 1) {
				   count++;
				   if (count % 2 != 0) {
					   m = nRows - 1; 
				   } else {
					   m = 0 ;
				   }
			   }
			   
			  
		   }
		   
		  
		  
		   return  dunmpMatrix (matrix) ;

		}
	
	 public String  dunmpMatrix (char [][] matrix){
		 int m = matrix.length ;
		 int n = matrix[0].length;
		 StringBuilder sb = new StringBuilder ();
		 for (int i = 0 ; i < m ; ++i ) {
			 for (int j = 0 ; j < n ; ++j) {
				 if (matrix[i][j] != 0) {
					 sb.append(matrix[i][j]) ;	 
//					 System.out.print(matrix[i][j]);
				 } else {
//					 System.out.print(" ");
				 }
			 }			 
//			 System.out.println();			 
		 }
		 
		 return sb.toString() ;
		 
	 }
	
	 public boolean isNumber(String s) {
		 
		 HashMap<Character,Integer> map = new HashMap<Character,Integer> ();
		 map.put('+', 0);
		 map.put('-', 0);
		 map.put('.', 0);
		 map.put('e', 0);
		 
		 
		 
		 for (int i = 0 ; i < s.length() ; ++i) {
			 
		 }
	        
	    
	   return false ;
	 }
	
	
	public void insertSort (int [] sorted){
		if (sorted == null || sorted.length == 0) {
			return ; 
		}
		
		for (int i = 1 ; i < sorted.length ; ++i ) {
			int j = i ;
			int tmp = sorted [i] ;
			
			while (j > 0 && tmp < sorted[j - 1]) {
				//back 
				sorted [j] = sorted[j-1];
				j-- ;
			}
			
			sorted[j] = tmp;
		}
		
	}
	
	
	
	 public ListNode insertionSortList(ListNode head) {
		 if (head == null) {
			 return null;
		 }
		 
		 
		 if (head.next == null) {
			 return head  ;
		 }
		 
		 ListNode pre = head;
		 ListNode current = head.next ;		 
		 
	     
		 while (current != null) {
			 ListNode p = head ;
			 ListNode pre_p = null ;
			 			
			 while (p.val < current.val && p != current) {
				 pre_p = p;
				 p = p.next ;
				 
				 				 
			 }
			 
			 if (p != current) {				 
				 pre.next = current.next ;
				 if (pre_p == null) {
					head = current ; 
				 } else {
			       pre_p.next = current ;	 				
				 }					 
				 current.next = p ;
				 current = pre.next ;
				
			 } else {
				 pre = current ;
				 current = current.next ;
			 }
			 
			 
			 
			 
			 
		 }		 	     		 
		 return head;		 
	 }
	
	
	
	 public boolean isMatch(String s, String p) {
	        
	    
		 int i = 0 , j = 0 ;
		 
		 while (i < s.length() && j < p.length()) {			 
			 if (s.charAt(i) == p.charAt(j) || p.charAt(j) == '.') {
				 i++;
				 j++;
				 continue ;
			 }
			 
			 if (p.charAt(j) == '*') {				 
				 int len = p.length() - j - 1;			
				 while (i < s.length() && s.length() - i > len) {					 
					 i++;
				 }
				 j++;
			 } else {
				if (p.length() - j > s.length() - i) {
					j++;
				}else {
					i++;
				}
			 }
		 }
		 
 
		 return i == s.length() && j == p.length() ;
	 }
	
	
	 public String simplifyPath(String path) {	       	    
	    Stack<String> stack = new Stack<String> ();
	    String [] dirs = path.split("/");
	    for (String dir : dirs) {
	    	if (dir.length() != 0) {	    		
	    		if ("..".equals(dir)) {
	    			if (!stack.isEmpty()) {
	    				stack.pop() ;
	    			}	    				    		
	    		} else if (!".".equals(dir)) {
	    			stack.push(dir) ;
	    		}
	    			    		
	    	}
	    }
	    
	    if (stack.isEmpty()) {
	    	return "/";
	    }
	    
	   StringBuilder result = new StringBuilder();
       for (String s : stack) {
    	   result.append("/" + s);
       }
        
        	    
	    return result.toString() ;
	 }
	
	
	public void doGray (int [] bits , int len){
		if (len ==0) {
			
		} else {
		   for (int i = 0 ; i < bits.length ;++i) {
			   
		   }
		}			
	}
	
	
	 public boolean wordBreakHasSolution(String s, Set<String> dict) {
	        
		 boolean [][] dp = new boolean [s.length() + 1][ s.length() + 1];
	 		 
		 for (int i = 0 ; i <= s.length() ; ++i) {
			 for (int j = i + 1 ; j <= s.length() ; ++j) {
				 String sub= s.substring(i,j) ;				 
				 if ( dict.contains(sub)) {					 
					 dp[i][j] = true ;
					 if (!dp[0][j]) {
						 dp[0][j] = dp[0][i] & dp[i][j];
					 }
				 }
			 }
		 }
			 
		 return  dp[0][s.length()];	 
	 }
	
	
    public List<String> wordBreak(String s, Set<String> dict) {
        
    	List<String> main = new  ArrayList<String> ();
    	if (!wordBreakHasSolution (s,dict)) {
    		return main;
    	}
    	        	     
    	word(0,s,"",main,dict);
    	System.out.println(main.size());
    	main.clear();
    	wordII(0,s.length(),s,"",main,dict);
    	System.out.println(main.size());
    	
    	return main;
    }
    
    
    public void word (int start , String str, String pre , List<String> main , Set<String> dict){
    	if (start >= str.length()) {
    		System.out.println(pre);
    		main.add(pre.trim());
    		return ;    		
    	} else {
    		for (int i = start + 1 ; i <= str.length()  ; ++i) {
        		String sub = str.substring(start, i) ;
        		if (dict.contains(sub)) {           			        			 
        			String t = pre + " " + sub ;
        			word (i ,str, t, main, dict);
        			t = pre ; 

        		}
        	}    	
    	}    	    	
    }
    
    public void wordII (int start, int len , String restPart, String pre , List<String> main , Set<String> dict){    	
    	if (start >= len) {
    		main.add(pre.trim());
    		
    	} else {
    	   for (int i = 1 ; i <= restPart.length() ; ++i) {
    		   String sub = restPart.substring(0,i);
    		   if (dict.contains(sub)) {
    		     String tmp = pre + " " + sub;
    		     wordII (start + i,len,restPart.substring(i,restPart.length()),tmp,main,dict);
    		     tmp = pre ;
    		   }
    	   }    		    		
    	}    	
    }
	
	
     public List<List<String>> partition(String s) {
    	 List<List<String>> main = new ArrayList<List<String>> ();
    	 
    	 if (s.length() == 0 || s == null) {
    		 return main;
    	 }
    	 
    	 ArrayList<String> sub = new ArrayList<String> ();
     
    	 part (s,0,sub,main);
    	 
          return main;
     }
     
     
     private void part (String s, int start , ArrayList<String> sub, List<List<String>> main){
    	 if (s.length() == start) {
    		 ArrayList<String> tmp = new ArrayList<String> ();
    		 tmp.addAll(sub);
    		 main.add(tmp);    		 
    	 } else {
    		for (int i = start + 1 ; i < s.length() ; ++i) {
    			String str = s.substring(start, i) ;
    			if (isPalindrome (str)) {
    		         sub.add(str);
    		         part (s, start + 1, sub, main);
    				 sub.remove(sub.size() - 1) ;
    			}
    		}
    	   	     		 
    	 }
    	     	 
     }
	
     
     private boolean isPalindrome(String str){
    	 int left=0;
    	 int right=str.length()-1;
    	 while (left<right){
    	 if (str.charAt(left)!=str.charAt(right)){
    	 return false;
    	 }
    	 left++;
    	 right--;
    	 }
    	 return true;
    }
	
	
	
	 public TreeNode sortedArrayToBST(int[] num) {	      
		 return construct (num,0, num.length - 1);
	 }
	
	 
	 
	 public TreeNode construct (int [] num , int start , int end){
		 if (start > end) {
			 return null ;
		 }
		 
		 int mid = (start + end) / 2 ;
		 TreeNode t = new TreeNode(num[mid]);
		 t.left = construct (num, start , mid - 1);
		 t.right = construct (num, mid + 1, end);		 
		 return t;				
	 }
	 
	 
	 private int getLength (ListNode head){
		 int len = 0;
		 
		 while (head != null) {
			 head = head.next;
			 len++;
		 }		 
		 return len;
	 }
	 
	 
	 public TreeNode sortedListToBST(ListNode head) {
		 
		 ListNode p = head ;
		 
	     int len = getLength(head);
	     
		 return constructTree (p, 0, len - 1); 
	    }
	 
	 
	 public TreeNode constructTree (ListNode head , int start , int end){
		       if (start > end) {
		    	   return null ;
		       }
		 
		       int mid = (start + end) / 2;
		    
		    TreeNode leftMode = constructTree (head, start, mid - 1);		    
		    TreeNode parent = new TreeNode (head.val);
		    parent.left = leftMode;
		    head = head.next ;
		 	TreeNode rightNode = constructTree (head, mid + 1, end);
		 	parent.right = rightNode;
		 			 
		    return parent;
	 }
	
	
	 public List<String> letterCombinations(String digits) {
		 
		 List<String> result = new LinkedList<String> ();
		 
		 if (digits == null) {			 
			 return result;
		 }
	        
		 char [][] map = {
				 {'a','b','c'},	 
				 {'d','e','f'},
				 {'g','h','i'},
				 {'j','k','l'},
				 {'m','n','o'},
				 {'p','q','r','s'},
				 {'t','u','v'},
				 {'w','x','y','z'}				 
		 } ;
		 
		 
		 boolean [] used = new boolean [digits.length()];
		 
		 letter (0,used,digits.length(), map, digits.toCharArray() , new StringBuilder (),result);
	    
	 
	   return result;
	 }
	
	
	
	 public void letter (int start , boolean [] used, int len, char [][] map , char [] digits , StringBuilder sb, List<String> result){
		 if (len < 0) {
			 return ;
		 } else if (len == 0) {
			 result.add(sb.toString());			 
		 } else {
			 for (int i = start ; i < digits.length ; ++i) {
				 char [] cur_map = map[(digits[i] - '0') - 2];
				 if (used[i]) {
					 continue ;
				 }
				 used[i] = true ;
				 for (int j = 0 ; j < cur_map.length ; ++j) {
					 sb.append(cur_map[j]) ;
					 letter (start + 1,used, len - 1, map, digits, sb, result);
					 sb.setLength(sb.length() - 1) ;
				 }
				 used[i] = false ;
			 }
		 }
	 }
	
	
	
	
     public List<String> restoreIpAddresses(String s) {
      
    	 List<String> result = new LinkedList<String> ();
    	 
    	 if (s == null || s.length() == 0) {
    		 return result ;
    	 }
    	 
    	 if (s.length() > 12) {
    		 return result;
    	 }
    	
    	 
    	 doRestore (0, s, "", result);
    	 
    	 return result ;
    }
	
	
	     public void doRestore (int count, String restPart, String pre, List<String> result){
	    	 
	    	 if (count == 3 && isValid (restPart)) {
	    		 result.add(pre + restPart) ;	    		 
	    	 } else {
	    		 
	    		 // i < 4 because i , number ,at most , contains 3 digits ,then we say it is a valid number
	    		for (int i = 1 ; i < 4 && i < restPart.length() ; ++i) {
	    			String current = restPart.substring(0, i) ;
	    			if (isValid(current)) {
	    				doRestore (count + 1 , restPart.substring(i) ,
	    						pre + current + ".", result);
	    			}
	    		}
	    	 }
	    	 	    	 
	     }
	     
	     public boolean isValid (String addr){
	    	 if (addr.length() > 3) {
	    		 return false ;
	    	 }
	    	 if (addr.charAt(0) == '0') {
	    		 return addr.equals("0") ;
	    	 }	  
	    	 int current = Integer.parseInt(addr);
	    	 return current >= 0 && current <= 255;
	     }
	
	
	    public String minWindow(String S, String T) {
	      
	      //ASCII 
	      int [] needtoFind = new int [256] ;
	      int [] hasFound = new int [256] ;
	      
	      int min = Integer.MAX_VALUE ;
	      int match = 0 ;
	      
	      for (int i = 0 ; i < T.length() ;++i) {
	    	  needtoFind[T.charAt(i)]++;	    	  
	      }
	      
	      int start = 0 ;
	      int end = start ;
	      String window = "" ;
	      
	      for (; end < S.length() ; ++end) {	    	  
	    	  char c = S.charAt(end);
	    	  if (needtoFind[c] == 0) {
	    		  continue ;
	    	  }
	    	  
	    	  hasFound[c]++;
	    	  
	    	  if (hasFound[c] <= needtoFind[c]) {	    		  
	    		  match++;
	    	  }
	    	  
	    	  if (match == T.length()) {
	    		  
	    		  while (hasFound[S.charAt(start)] > needtoFind[S.charAt(start)]) {
	    			  if (needtoFind[S.charAt(start)] != 0) {
		    				 hasFound[S.charAt(start)]--;	    				 	   	    				 
		    			 } 
	    			  start++;
	    		  }
	    		  	    		  
	    		 while (hasFound[S.charAt(start)] == 0) {	    			 	    			 
	    			 start++;
	    			 
	    		 }	    		 
	    		 
	    		 if (end - start + 1 < min) {	    			 
	    			 min = end - start + 1 ;
	    			 window = S.substring(start, end + 1);
	    		 }
	    		  
	    	  }
	    	  
	      }
	      
	    		    	    
	    	return window;
	    }
	
	  
	    public String minWindowVersion(String S, String T) {
	    	int [] needtoFind = new int [256] ;
	    	
	    	for (int i = 0 ; i < T.length() ;++i) {
	    		needtoFind[T.charAt(i)]++;
	    	}
	    	
	    	int start = 0 ;
	    	int end = start ;
	    	int match = 0;
	    	int min = Integer.MAX_VALUE ;
	    	String window = "";
	    	
	    	for (; end < S.length() ; ++end) {
	    		char c = S.charAt(end) ;
	    		if (needtoFind[c] == 0) {
	    			continue ;
	    		}
	    		
	    		needtoFind[c]++;	    	
	    		match++;
	    		
	    		while (match == T.length()) {	 
	    			System.out.println(end);
	    			char begin = S.charAt(start) ;
	    			while (needtoFind[begin] == 0) {
	    				begin = S.charAt(++start);
	    			}
	    				    
	    			
	    			needtoFind[begin]++;
	    			if (needtoFind[begin] > 0) {	    			
	    				if (end - start + 1 < min) {	    					
	    					min = end - start + 1;	    					
	    					window = S.substring(start,end + 1);
	    				}
	    				match--;
	    			}
	    			
	    			start++;
	    		}
	    		
	    	}
	    	
	    	
	    	return window;
	    }
	
	      public boolean isPalindrome (int x){
	    	  
	    	  if (x < 0) {
	    		  return false ;
	    	  }
	    	  
	    	  int div = 1; 
	    	  int i = 0;
	    	  while ((x / div) >= 10) {
	    		  div *= 10;
	    		  i++;
	    	  }
	    	  
	    	  int a = x ,b = x ;
	    	  int j = 0 ;
	    	  while ( i > j) {
	    		  int left = a /div ;
	    		  int right = b % 10 ;	    	
	    		  if (left != right) {
	    			  return false ;
	    		  }	    		 
	    		  a %= div;	    		  
	    		  b /= 10;	    		  	    		
	    		  div /= 10;
	    		  i--;
	    		  j++;
	    	  }
	    	  	    		    	  	    	 	    	
	    	  return true ;
	      }
	
	
	      public int reverseInteger (int n , int result){
	    	  if (n > 10) {
	    		  
	    	     int res = (result + n % 10) * 10;	    		 
	    	     return reverseInteger (n / 10 , res);
	    		  
	    	  }else{	    	     
	    		  return result + n ;
	    	  }	    	  	    	  
	      }
	      
	      
	      
	      public int reverse(int x) {
	 		 int sign = x > 0 ? 1:-1;
	     	 x = x < 0 ? x*-1 : x;    		     	 
	     	 return sign * reverseIterate(x);
	 	 }
	      
	      
	      public int reverseIterate (int n){
	    	  int result = 0;
	    	  
	    	  while (n >= 10) {
	    		 result = (result + n % 10) * 10;
	    		 n /= 10;
	    	  }
	    	  	    	  	    	  
	    	  return result + n % 10 ;
	      }
	      
	      
	      
	       public static class ListNode {
	    	       int val;
	    	       ListNode next;
	    	       ListNode(int x) { val = x; next = null; }
	    	   
	       }
	      
	
	      public static class TreeNode {
		    int val;
	        TreeNode left;
		    TreeNode right;
	        TreeNode(int x) { val = x; }
		  }
	      
	      
	      public int trap(int[] A) {
	        int [][] dp = new int[A.length][A.length] ;
	        
	        
	        
	        return dp[dp.length - 1][dp.length - 1] ;
	      }
	      
	      
	      public void merge(int A[], int m, int B[], int n) {	          
	          int i = 0 ; 
	          int j = 0 ;
	          int count = m ;
	          
	          while (i < m + n && j < n) {
	        	  if (A[i] <= B[j]) {
	        		  i++;
	        	  } else {	        		  
	        		  backMove (A,i, ++count);
	        		  A[i] = B[j] ;
	        		  j++;		
	        		  i++;	        		  
	        	  }
	          }
	          
	          
	          while (j < n) {
	        	 A[count++] = B[j++] ; 	        	 
	          }	         	         
	      }
	      
	      
	      public void backMove (int [] A , int pos , int len){	    	  
	    	  for (int i = len - 1 ; i > pos  ; --i) {	    		
	    		  A[i] = A[i - 1] ;
	    		  
	    	  }
	      }
	      
	      
	      class RandomListNode {
	    	    int label;
	    	    RandomListNode next, random;
	    	    RandomListNode(int x) { this.label = x; }
	    	};
	    	
	    	
	    	 public int numTrees(int n) {
	    	  if (n == 0) {
	    		  return 1 ;
	    	  }
	    	  
	    	  if (n == 1) {
	    		  return 1 ;
	    	  }
	    		 
	    	  int sum = 0 ;
	    	  for (int i = 2 ; i <= n ; ++i) {
	    		  
	    	  }
	    		 
	    		 return sum ;
	    	 }
	    	
	    	
	    	 
	    	
	    	
	    	
	    	public List<List<Integer>> permuteUnique(int[] num) {
	    		List<List<Integer>> mainList = new LinkedList<List<Integer>>();
	    		if (num.length == 0) {
	    			return mainList ;
	    		}
	    		List<Integer> subList = new LinkedList<Integer> ();
	    		boolean [] used = new boolean [num.length];
	    		permute (num,used,0,subList, mainList);	    		
	    		return mainList ;
	        }
	    	
	    	
	    	public void permute (int [] num , boolean [] used, int count , List<Integer> subList, List<List<Integer>> mainList){
	    		if (count == num.length) {
	    			if (!mainList.contains(subList)) {
	    				List<Integer> element = new LinkedList<Integer> ();
	    				element.addAll(subList) ;
	    				mainList.add(element);
	    			}
	    		} else {	    			
	    		  for (int i = 0 ; i < num.length ; ++i) {
	    			  if (used[i]) {
	    				  continue ;
	    			  }
	    			  used[i] = true ;
	    			  subList.add(num[i]) ;
	    			  permute (num,used, count + 1 ,subList, mainList);
	    			  subList.remove(subList.size() - 1) ;
	    			  used[i] = false ;
	    		  }
	    			
	    		}
	    			    	
	    	}
	    	
	  public RandomListNode copyRandomList(RandomListNode head) {
	  
		  
		  
		  return null ;
	  }	
	    	
	  
	  public int singleNumber(int[] A) {
	  
		  if (A.length == 0) {
			  return -1;
		  }
		  
		  if (A.length == 1) {
			  return A[0] ;
		  }
	    
		  Arrays.sort(A) ;
		  
		  for (int i = 1 ; i < A.length ; ++i) {
			  if (A[i] != A[i-1]) {
				  return i ;
			  }
		  }
		  
		  return -1 ;
	  }
	    	
	
   public void flatten(TreeNode root) {
     
	  Stack<TreeNode> stack = new Stack<TreeNode> ();
	  TreeNode current = root ;
	  
	  while (current != null || !stack.isEmpty()) {
		  if (current.right != null) {
			  // push to stack
			  stack.push(current.right) ;
		  }
		  
		  if (current.left != null) {
			  current.right = current.left ;
			  current.left = null ;
		  } else if (!stack.isEmpty()) {
			  TreeNode tmp = stack.pop() ;
			  current.right = tmp ;
		  }		  
		  current = current.right ;
	  }

	
  }
  
  public boolean isValidBST(TreeNode root) {
      if (root == null) {
    	  return true ;
      }
      
      List<Integer> list = new LinkedList<Integer> ();
      inorder (root,list);
      for (int i = 0 ; i < list.size() - 1  ; ++i) {
    	  if (list.get(i) > list.get(i + 1)) {
    		  return false ;
    	  }
    	  
      }
      	  
      return true ;
      
  }
  
  
 public void inorder (TreeNode root, List<Integer> list){
	  
	  if (root == null) {
		  return ;
	  }
	  
	  inorder (root.left , list) ;
	  list.add(root.val);
	  inorder (root.right , list) ;	  	  	  
  }
  
  public List<List<Integer>> zigzagLevelOrder(TreeNode root) {	   	   
	   List<List<Integer>> mainList = new LinkedList<List<Integer>> ();	   
        if (root == null) {		    
       	     return mainList ;
	    }
	   

 	   LinkedList<TreeNode> queue = new LinkedList<TreeNode> ();
 	   int currentLevel = 0 ;
 	   queue.add(root) ;
 	   queue.add(null) ;	   
 	   LinkedList<Integer> subList = new LinkedList<Integer> (); 
 	    	   
 	   while (!queue.isEmpty()){		   
 		  TreeNode node = queue.poll() ;
 		  if (node == null) {
 			  currentLevel++;
 			 if (!queue.isEmpty()) { 			     
 				 queue.add(null) ;
 			 }
 			 List<Integer> element =   new LinkedList<Integer> () ;
 			if (currentLevel % 2 == 0) { 				
 				while (!subList.isEmpty()) {
 					element.add(subList.pollLast()) ;
 				}
 			} else {
 				element.addAll(subList) ;	
 			}
 			
 			subList.clear(); 
 			mainList.add(element) ;
 			 
 		  } else {
 			 if (node.left != null) {					
					queue.add(node.left) ;
				}
				
				if (node.right != null) {					
					queue.add(node.right) ;
		     } 				 
			subList.add(node.val) ;		 
 		  }		   
 	   }
	   	   	   	   
	  return mainList ;
   }

  
  
  public List<Integer> inorderTraversal(TreeNode root) {
	  LinkedList<Integer> list = new LinkedList<Integer> ();
	  inorder (root, list);
	  return list ;	        
  }
  
 
  
  
  public int maxPathSum_(TreeNode root) {
		if (root == null) {
			return 0 ;
		}
		int maxTmp[] = new int[1]; 
		maxTmp[0] = Integer.MIN_VALUE;
		return max(root,maxTmp);	     
  }
  
  public int maxPathSum(TreeNode root) {
		if (root == null) {
			return 0 ;
		}
		return max_bfs(root);	     
}
  
  public int max_bfs (TreeNode root) {
	  int max_so_far = root.val;	  
	  LinkedList<TreeNode> queue = new LinkedList<TreeNode> ();
	  queue.add(root) ;
	  
	  while (!queue.isEmpty()) {
		  TreeNode cur = queue.poll() ;		
		  int left = cur.val ;
		  int left_to_right = cur.val;
		  if (cur.left != null) {
			  left = Math.max(cur.val + cur.left.val, cur.left.val) ;
			  left_to_right += cur.left.val ;
			  max_so_far = Math.max(left, max_so_far) ;
			  cur.left.val = left ;
			  queue.add(cur.left) ;
		  }
		  
		  if (cur.right != null) {
			  int rightMax = Math.max(cur.val + cur.right.val, cur.right.val) ;
			  max_so_far = Math.max(rightMax, max_so_far) ;
			  max_so_far = Math.max(max_so_far, left_to_right + cur.right.val) ;
			  cur.right.val = rightMax ;
			  queue.add(cur.right) ;
		  }
	  }
	  
	 
	  
	  return max_so_far ;
  }
	
	
   public int max(TreeNode root ,int[] max){		
		if (root == null) {
			return 0 ;
		}
		
		int left = max(root.left, max);
		
		int right = max(root.right, max);
		
		int current = Math.max(root.val, Math.max(root.val + left, root.val + right));
		current = Math.max(right + root.val + left , current) ;
		
		max[0] = Math.max(max[0],current);
		
		
       return current;
	}
  
  
  
  public int maxSubArray(int[] A) {
      int [] dp = new int [A.length] ;
      
      dp [0] = A[0]  ;
      int max = Integer.MIN_VALUE ;
      max = Math.max(dp[0], max) ;
      for (int i = 1 ; i < A.length  ; ++i) {
    	 dp[i] = A[i] ;
    	 dp[i] = dp [i-1] + A[i] > dp[i] ? dp [i-1] + A[i] : dp[i] ;
    	 max = Math.max(max, dp[i]) ;
      }    
      return max ;
  }
  
  public String intToRoman(int num) { 	
               String roman = "" ;
          
               if (num >= 1000) {
	    		 int n = num / 1000 ;
	    		 for (int i = 0 ; i < n ; ++i) {
	    			 roman += "M" ;
	    		 }   	    		 
	    		 num -= n * 1000 ;
	    		 
	    	   } 
	    	   if (num >=100) {
	    		  int n = num / 100 ;
	    		  if ( n == 4) {
	    			  roman += "CD";
	    		  } else if (n == 9) {
	    			  roman += "CM" ;
	    		  } else {	    			  
	    			  int t = n /  5 ;
		    			 if (t >= 1) {
		    				 roman += 'D';
		    				 for (int i = 0 ; i < (n -5) ; ++i) {
		    					 roman += "C" ;
		    				 }
		    			 } else {
		    				 
		    				 for (int i = 0 ; i < n  ; ++i) {
		    					 roman += "C" ;
		    				 }
		    			 }
		    		  }
	    		  num -= n * 100 ;	    		  	    		 
	    	   } 
	    	   
	    	   if (num >= 10) {
	    		  int n = num / 10 ;	    		  
	    		  if (n == 9) {
	    				roman += "XC" ;
	    		  } else if (n == 4) {
	    			 roman += "XL" ;  
	    		  } else {	    			
	    			 int t = n /  5 ;
	    			 if (t >= 1) {
	    				 roman += 'L';
	    				 for (int i = 0 ; i < (n -5) ; ++i) {
	    					 roman += "X" ;
	    				 }
	    			 } else {
	    				 
	    				 for (int i = 0 ; i < n  ; ++i) {
	    					 roman += "X" ;
	    				 }
	    			 }
	    		  }
	    		  
	    		  num -= n * 10 ;
	    	   } 
	    	   
	    	   if (num == 9) {
	   				roman += "IX" ;
	   		  } else if (num == 4) {
	   			 roman += "IV" ;  
	   		  } else {
	   			 int t = num /  5 ;	   			
	   			   if (t >= 1) {	   				   
	   				 roman += 'V' ;
	   				 for (int i = 0 ; i < (num - 5) ; ++i) {
	   					 roman += "I" ;
	   				 }
	   			   } else {
	   				for (int i = 0 ; i < num ; ++i) {
	   					 roman += "I" ;
	   				 }
	   			   }	   			
	   		    }

	      	
	    	 	    	   
	    	   

       return roman ;
 }
  
  
  public int romanToInt(String s) {
   
	  
	  HashMap<Character, Integer> map = new HashMap<Character,Integer> ();
	  map.put('I', 1) ;
	  map.put('V', 5) ;
	  map.put('X', 10) ;
	  map.put('L', 50) ;
	  map.put('C', 100) ;
	  map.put('D', 500) ;
	  map.put('M', 1000) ;
	  
	  char [] chs = s.toCharArray() ;
	  int total = map.get(chs[0]) ;
	  for (int i = 1 ; i < chs.length  ; ++i) {
		  if (map.get(chs[i-1]) < map.get(chs[i])) {
			  total += map.get(chs[i]) - 2 * map.get(chs[i-1]) ; 
		  } else {
			  total += map.get(chs[i]) ;
		  }
	  }
	  
	  
	  return total ;
  }
  
  
  
  
  public String longestPalindrome(String s) {
	  if (s.length() == 0) {
		  return "" ;
	  }
	  
	  return length (s);
      
  }
  
  
  public String length (String target){
	  int [][] dp = new int [target.length()][target.length()] ;
	  char [] chs = target.toCharArray() ;
	  for (int i = 0 ; i < chs.length ; ++i) {
		  for (int j = 0 ; j < chs.length ; ++j) {
			  if (i == j) {
				  dp[i][j] = 1 ;
			  }
		  }
	  }
	  
	  int max  = 1 ;
	  int start = 0 ;
	  int end = 0 ;
	  
	  for (int i = 1 ; i < chs.length  ; ++i) {
		  for (int j = 0 ; j < i ; ++j) {
		    if (chs[i] == chs[j]) {
		    	if (j + 1 == i) {		    		
		    		dp[j][i] = 2 ;
		    		if (dp[j][i] > max) {
	    				max = dp[j][i] ;
	    				start = j ;
	    				end = i ;
	    			}
		    	} else {
		    		if (dp[j+1][i-1] != 0) {
		    			dp[j][i] = dp[j+1][i-1] + 2 ;
		    			if (dp[j][i] > max) {
		    				max = dp[j][i] ;
		    				start = j ;
		    				end = i ;
		    			}
		    		}
		    	}		    	
		    }
		  }
	  }
	
	  return new String (chs,start, end - start + 1) ;
	  	  
  }
  
  
  public TreeNode flat (TreeNode root){
	  if (root == null) {
			return null ;				
		}
		
		if (root.left != null && root.right != null) {
			root.left = flat (root.left);
		}		
		root.left = flat (root.right) ;		
		return root ;
  }
	
	 public int lengthOfLongestSubstring(String s) {
		 if (s.length() == 0) {
			 return 0 ;
		 }
	     char [] chs = s.toCharArray() ; 
	     int [] dp = new int [chs.length] ;	     
	     
	     for (int i = 0 ; i < dp.length ; ++i) {
	    	 dp [i] = 1 ;
	     }
	     int max = 1 ;     
	     int start = 0 ;
	     int next = 0 ;
	     for (int i = 1 ; i < chs.length ; ++i) {
	    	for (int  j = start ; j < i  ; ++j) {
	             if (chs[i] == chs[j]) {	 	            	
	            	 dp[i] = 1 ;
	            	 next = j ;
	             } else {
	            	 if (dp[j] == 1) {
	            		dp[i] = 1 ; 
	            	 }	            	 
	            	 dp[i] += 1 ;
	             }	             
	    	}
	    	
	    	start = next ;
	    	
	    	if (dp[i] > dp[i-1] +1) {
	    		dp[i] = dp[i-1] + 1;	    		
	    	}
	    	max = Math.max(max, dp[i]) ;	    	
	     }
		
//	    for (int i = 0 ; i < dp.length ; ++i) {
//	    	max = Math.max(max, dp[i]) ;
//	    }	   
	    return max ;
	 
	 }
	
	
	public static int findNumOfWays(int [] [] matrix,int x, int y){
		int val = matrix [x] [y];
		return dofindNumOfWays(matrix,0,0,val);		
	}
	
	public static int dofindNumOfWays(int [] [] matrix, int i ,int j,int value){
		if (i>=matrix.length||j>=matrix[0].length){
			return 0;
		}else if (matrix[i][j]==value){
			return 1;
		}else{
			int right = 0;
			int down = 0;
			int diagno = 0;
			right = dofindNumOfWays(matrix,i,j+1,value);
			diagno = dofindNumOfWays(matrix,i+1,j+1,value);
			down  = dofindNumOfWays(matrix,i+1,j,value);             
			return right + down + diagno ;
		}
    }
	
	public static int findWaysDP (int [] []matrix , int x, int y){
		int row = matrix.length;
		int col = matrix[0].length;
		int [] [] dp = new int [row][col];
		dp [0][0] = 1;	
		for (int i = 0 ; i<row ;++i){
			for (int j = 0 ; j <col ;++j){
				// horizon
				if (j+1<col){
					dp [i][j+1] += dp[i][j];
				}
				//diagno 
				
				if (j+1<col &&i+1<row){
					dp [i+1][j+1] += dp[i][j];
				}
				
				
				//down
				if (i+1<row){
					dp [i+1][j]+= dp[i][j];
				}
				
			}
		}
		
		
		return dp [x][y];
	}

	public static void removeDuplicate(String exp){		
		int end = exp.length() - 1 ;
		char [] chs = exp.toCharArray() ;
		int preSign = -1 ;
		Stack<Character> stack = new Stack<Character>(); 
		Stack<Character> tmpstack = new Stack<Character>(); 
		for (int i = 0 ; i <= end ; ++i){
			if (chs[i] == '('){
				if (!stack.isEmpty() && stack.peek() == '('){
					System.out.println("find " + stack.peek() + chs[end--]);
					stack.pop();	
					
				}
				
			
			} else if (chs[i] == '+' || chs[i] == '-' || chs[i] == '*' || chs[i] == '/'){
				int cur_sign = getPriority(chs[i]) ;
				 if (stack.peek() == ')'){
					 
					 if (preSign != -1 && cur_sign == preSign){
						 System.out.println("test");
						 while (stack.peek() != '('){
							 char c = stack.pop() ;
							 if (c != ')'){
								 tmpstack.push(c);	 
							 }
							 
						 }
						 stack.pop() ;
						 while (!tmpstack.isEmpty()){
							 stack.push(tmpstack.pop());
						 }
						 
					 }
				 } 
				preSign = cur_sign;
			}
						
			stack.push(chs[i]);
			
		}
		
		
		
		for (Character c : stack){
			System.out.print(c);
		}
	}
	
	private static int getPriority(char sign){
		if (sign == '+' || sign == '-'){
			return 1 ;
		}
		return 2 ;
	}
}
