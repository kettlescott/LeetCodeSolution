package com.scott.code;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.Stack;

public class GoogleInterview {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println('1' - '1');
//		System.out.println(Math.abs(1-2));

//		int [] denominations = {1,2,3};
//		int count = findPossibleWays(5,denominations);
//		System.out.println(count);
//		int number = findPossibleWays_(5,denominations);
//		System.out.println(number);
//		int [] array = {1 ,2 ,3 ,4 ,2 ,2 ,3 ,2};
//		System.out.println(count(array));
		
//		char [] letters = { 'a', 'c', 't' };
//		String[] words = { "cat", "act", "ac", "stop", "cac" };
//		getWords(words,letters);
//		int [] a ={1,2,2,3,3,3,3,5,6,6,6,6,6,6,6,7,8,8,8}; 
//		findMaxRepeatingNum(a);
//		char [][] maze = {{'a','b','c','d','e'},
//		                  {'f','g','h','i','j'},
//		                  {'k','l','m','n','o'},
//		                  {'p','q','r','s','t'},
//		                  {'u','v','w','x','y'},
//		                  {'z',' ',' ',' ',' '}
//		              };
//		System.out.println(('c' - 'a')/5 + " " + ('c' - 'a')%5);
//		System.out.println(('o' - 'a')/5 + " " + ('o' - 'a')%5);
//		System.out.println(('n' - 'a')/5 + " " + ('n' - 'a')%5);
//		System.out.println(maze [('n' - 'a')/5][('n' - 'a')%5 ]);
//		String a = "99999999999999000000000000099" ;
//		String b = "13" ;
//		add(a,b);
		
//		boolean flag= matches("index.html","*html");
//		System.out.println(flag);
		
//		System.out.println(incrementIPAddr("192.168.1.1",1600));
		
		GoogleInterview in = new GoogleInterview ();
//		System.out.println(in.isPalindrome(".,"));
//		System.out.println(in.longestValidParentheses("(())"));
		int [] num = {-3,-2,-1,0,0,1,2,3};
		
		
		GoogleInterview.Pair p1 = new GoogleInterview.Pair(1, 2);
		GoogleInterview.Pair p2 = new GoogleInterview.Pair(1, 2);
//		System.out.println(p1.hashCode());
//		System.out.println(p2.hashCode());
		HashSet<GoogleInterview.Pair> set = new HashSet<GoogleInterview.Pair> ();
		int n  = in.numDistinct("ABCDE", "ACE") ;
		System.out.println(n);
		
//           in.generate(3) ;
//           in.getRow(8) ;
//        Pair [] pair = {new Pair(1,2),new Pair(1,2)};
//        List<List<Integer>> main = in.fourSum_II(num, 0) ;
//        for (List<Integer> list : main) {
//        	for (int i : list) {
//        		System.out.print (i + " ");
//        	}
//        	System.out.println();
//        }
//        for (Pair p : pair) {
//        	System.out.println(p.hashCode());
//        	if (set.contains(p)){
//        		System.out.println("contain");
//        	} else{
//        		set.add(p) ;
//        	}
//        }
		
		
	}
	
	
	 public int numDistinct(String S, String T) {		 		 
          int [][] dp = new int [T.length() + 1][S.length() + 1] ;
          
          dp[0][0] = 1;
          
          for (int i = 1 ; i < T.length() ; ++i) {
        	 for (int j = 1 ; j < S.length() ; ++j) {
        		 if (T.charAt(i - 1) == S.charAt(j - 1)) {
        			 dp[i][j] += dp[i-1][j-1];
        		 }
        	 }
          }
          
          
          System.out.println(dp[1][1]);
                    
          return dp[T.length()][S.length() ] ;
	 }
	 
	 
	 public int num (int start , char [] chs, String t, StringBuilder sb){
		 if (sb.length() > t.length()) {
			 return 0 ;
		 }
		  int total = 0 ;
		 if (t.equals(sb.toString())) {
			 return 1 ;
		 } else {
		    for (int i = start ; i < chs.length ; ++i) {
		    	sb.append(chs[i]) ;
		    	total += num (++start , chs , t , sb);
		    	sb.setLength(sb.length() - 1) ;
		    }
			 
		 }
		 
		 return total ;		 		
	 }
	
	
	
	 public List<Integer> getRow(int rowIndex) {
	        
	    List<Integer> list = new LinkedList<Integer> ();   
	    rowIndex += 1 ;
	    if (rowIndex <= 0) {
           return list ;	
        }
	    
	    list.add(1) ;
	    for (int i = 1 ; i < rowIndex  ;++i) {	    
	      int j = 1 ;
	      list.set(j - 1, 1);
	      int pre = 1 ;
	      for ( ; j < i ; ++j) {
	    	int next =list.get(j ) ;
	    	list.set(j , pre + list.get(j)) ;
	    	pre = next ;
	      }
	      list.add(1);
	    }
	    	    
	    for (int i : list) {
	    	System.out.print(i + " ");
	    }
	  
	    return list ;	 
	 }
	
	
	
	 public List<List<Integer>> generate(int numRows) {
		 List<List<Integer>> list = new LinkedList<List<Integer>> ();
		 if (numRows < 0) {
			 return list ;
		 }
	     	    	    		    
	    List<Integer> subList = new LinkedList<Integer> ();
	    subList.add(1) ;
	    list.add(subList) ;
	    for (int i = 1 ; i < numRows ; ++i) {
	    	int j = 1 ;
	    	List<Integer> element = new LinkedList<Integer> ();
	    	element.add(1) ;
	    	for (; j < i  ; ++j) {	    		
	    		 List<Integer> pre = list.get(i - 1) ;
	             element.add(pre.get(j-1) + pre.get(j)) ;		
	    	}
	    	element.add(1) ;
	    	list.add(element);
	    }
	    
	  
	    return list ;	 
	 }
	
	
    public List<List<Integer>> fourSum(int[] num, int target) {
    	Arrays.sort(num) ;
    	if (num.length == 0 ) {
    		return new LinkedList<List<Integer>> ();
    	}
    	
    	List <Integer> sub = new LinkedList<Integer> (); 
        List<List <Integer>> main = new LinkedList<List <Integer>> ();
        forSum (num,0, 0, target,0,sub,main);    	
        return main ;
    }
    
  
    
    public List<List<Integer>> fourSum_II(int[] num, int target) {
    	Arrays.sort(num) ;
    	    	
    	
        List<List <Integer>> main = new LinkedList<List <Integer>> ();      
        HashMap<Integer, Set<Pair>> map = new HashMap<Integer, Set<Pair>> ();
        
      
          
        
        for (int i = 0 ; i < num.length ; ++i) {
        	for (int j = i + 1 ; j < num.length ;++j) {
        		int a = num[i] + num[j] ;                		
        		if (map.containsKey(target - a)) {        			
        			Set<Pair> s = map.get(target - a) ;                    
        			for (Pair p : s) {        				
        				List <Integer> sub = new LinkedList<Integer> (); 
        				sub.add(p.f);	
         			    sub.add(p.s);
            			sub.add( num[i]);
            			sub.add( num[j]);    
            			if (!main.contains(sub)){
            				main.add(sub) ;	
            			}        			                			 
        			}   
        			
        		}        		
        	}        	
        	for (int j = 0 ; j < i ; ++j) {        		
        		int key = num [i] + num[j] ; 
        		Pair p = new Pair (num[j], num [i]);
        		if (map.containsKey(key)) {
        			if (!map.get(key).contains(p)) {        				
        				map.get(key).add(p) ;        				
        			} 
        			
        		} else {        			
        			HashSet<Pair> subSet = new HashSet<Pair> ();
        			subSet.add(p) ;	        			
        			map.put(key, subSet) ;        			        			
        		}
        	}
        }
                    
        return main ;
    }
    
    static class Pair {
    	int f ;
    	int s ;
    	
    	public Pair (int f , int s){
    		this.f =f ;
    		this.s = s ;
    	}
    	
    	@Override
    	public boolean equals(Object obj){
    		if (!(obj instanceof Pair)) {
    			return false;
    		}
    		Pair p = (Pair) obj;    		
    		return p.f == this.f && p.s == this.s ; 
    	}
    	
    	@Override
        public int hashCode(){
            return Objects.hash(f, s);
        }
    }
    
    
    
    public void forSum (int [] num ,int start, int sum, int target , int count , List<Integer> sub , List<List<Integer>> mainList){
    	if (count > 4) {
    		return  ;
    	}
    	
    	if (target == sum && count == 4) {    		
    		List<Integer> element = new LinkedList<Integer> () ;
    		element.addAll(sub) ;
    		for (int i : sub) {
    			System.out.print(i + " ");
    		}
    		
    		System.out.println();
    		mainList.add(element) ;
    	} else {
    		for (int i = start ; i < num.length ;++i ) {    	
    			sum += num[i] ;
    			sub.add(num[i]) ;
    			forSum (num, ++start,sum ,target, count + 1 , sub, mainList) ;
    			sum -= num[i] ;
    			sub.remove(sub.size() - 1) ;
    		}
    	}
    	    	
    }
	
	
	 public boolean isPalindrome(String s) {
	     char [] chs = s.toCharArray() ;
	     
	     for (int i = 0 , j = chs.length - 1 ;  i < j  ; ++i , --j) {
	     
	    	  while (i < chs.length && (!Character.isAlphabetic(chs[i]) && !Character.isDigit(chs[i]))) {
	    		  i++;
	    	  }
	    	 
	    	  while (j>0 && (!Character.isAlphabetic(chs[j]) && !Character.isDigit(chs[j]))) {
	    		  j--;
	    	  }
	    	  	    	 	    
	    	  if (i < chs.length && j >=0) {
	    		  int diff= Math.abs(chs[i] - chs[j]) ;
		    	  if (diff != 32 && diff != 0) {	    		
		    		  return false ;
		    	  }	    	    
	    	  } else {
	    		return false ;  
	    	  }
	    	  
	     }	    		 	
	    return true ;
	 }
	
	
	 public int longestValidParentheses(String s) {
	      char [] chs = s.toCharArray() ;
	      Stack<Character> stack = new Stack<Character>();
	    	 
	      for (int i = 0 ; i < chs.length ; ++i) {
	    	  if (chs[i] == '(') {
	    		  stack.push(chs[i]) ;
	    	  } else {
	    		  if (stack.size() == 0) {
	    			  stack.push(chs[i]) ;
	    		  } else {
	    			  if (stack.peek() == '(') {
	    				  stack.pop() ;
	    			  } else {
	    				  stack.push(chs[i]) ;
	    			  }
	    		  }    		     		 
	    	  }
	      }
	    	 
	      
	    	 
	    	 return  chs.length - stack.size();
	     }
	
	
	public static String incrementIPAddr(String ip, int increment){
		
		String [] eachPart = ip.split("\\.") ;
		int base = 256; 
		int next = increment ;
		
		for (int i = eachPart.length - 1 ; i >= 0; --i){
			int sum = next + Integer.valueOf(eachPart[i]) ;
			eachPart [i] = String.valueOf(sum % base);
			next = sum / base;
		}
		
		StringBuilder sb = new StringBuilder();
		for (String add : eachPart){
		     sb.append(add);	
		     sb.append(".");
		}
		
		sb.setLength(sb.length() - 1);
		
		return sb.toString();
	}
	
	
	public static boolean matches(String text , String pattern){
		int p_length = 0;
		for (int i = 0 ;i<pattern.length();++i){
			if (pattern.charAt(i)!='*'){
				p_length++;
			}
		}
		
		
		int i = 0 , j = 0;
		int txt_length = 0;
		boolean consecutive = false;
		while (i<text.length()&&j<pattern.length()){
			if (pattern.charAt(j)=='*'){				
				j++;
			}else{
				if (text.charAt(i)!=pattern.charAt(j)){
					 if (consecutive){
						 return false;
					 }
				}else{					
					j++;
					txt_length++;
					consecutive = true;
				}		
			}					
		  i++;
		}
		
		return txt_length==p_length;
	}
	
	
	public static int [] add(String a, String b){
		char [] chs_a = a.toCharArray();
		char [] chs_b = b.toCharArray();
		int m = chs_a.length>=chs_b.length? chs_a.length:chs_b.length;
		int [] result = new int [m+1];
		int carry = 0;
		int i = chs_a.length-1, j = chs_b.length-1;
		while (i>=0&&j>=0){
			result [m--] = ((chs_a[i]-'0') + (chs_b[j]-'0') + carry) %10;			
			carry = ((chs_a[i]-'0') + (chs_b[j]-'0') + carry)/10;			
			i--;
			j--;
		}
		
        while (i>=0){
        	result [m--] = (chs_a[i] -'0' + carry)%10;
        	carry = (chs_a[i] -'0'+ carry)/10;
        	i--;
        }
        
        
        while (j>=0){
        	result [m--] = (chs_b[j] - '0'+ carry)%10;
        	carry = (chs_b[j] -'0'+ carry)/10;
        	j--;
        }
		
        if (carry!=0){
        	result [m--] = carry;
        }
				
		return result;
	}
	
	/*
	 * 
	 * Given a amount and several denominations of coins, 
	 * find all possible ways that amount can be formed? eg amount = 5, denominations = 1,2,3. 
       Ans- 5 ways 
       1) 1,1,1,1,1 
       2) 1,1,1,2 (combinations aren't counted eg 1,2,1,1 etc) 
       3) 1,1,3 
       4) 1,2,2 
       5) 2,3
	 */
	
	public static int findPossibleWays(int val , int [] denominations){
		int []  dp = new int [val+1];
		dp[0] = 1;
	    for (int i =0 ;i<denominations.length ;++i){
	    	for (int j =denominations[i] ; j<=val ;++j){
	    		dp[j]+= dp[j-denominations[i]];
	    	}
	    }
	    return dp[val];	
	}
	
	public static int findPossibleWays_(int val , int [] denominations){
		int []  dp = new int [val+1];
		dp[0] = 1;
	    for (int i =1 ;i<=val ;++i){
	    	for (int j = 0;j<denominations.length ;++j){
	    		if(i>=denominations[j]&&dp[i-denominations[j]]>0){
	    			dp[i]+=dp[i-denominations[j]];
	    		}
	    	}
	    }
	    return dp[val];	
	}
	
	
	public static int count(int [] array){
		int [] dp = new int [10];
		for (int i =0 ;i<array.length ;++i){
			dp[array[i]]++;
		}
		
		return dp[array[array.length-1]]-1;
	}
	
	
	public static void getWords(String [] words , char [] chs ){
		boolean [] dp = new boolean [256];
		boolean flag = true;
		for (int i =0 ;i<chs.length;++i){
			dp[chs[i]]=true;
		}
		for (String word : words){
			for (int j =0; j<word.length() ;++j){
				if (dp[word.charAt(j)]){
					dp[word.charAt(j)] = false;
				}else{
					flag = false ;
					break;
				}
			}
			
			if (flag){
				System.out.println(word);
			}else{
				flag = true;
			}
			
			//reset the dp
			
			for (int j =0 ;j<word.length() ;++j){
				dp[word.charAt(j)] = true;
			}
			
		}
	}
	
	public static void findMaxRepeatingNum(int [] array){
		int maxCount = 0;
		int count = 1;
		int maxCandidate = array [0];
		for (int i =1 ;i<array.length;++i){
			if (array[i]==array[i-1]){
				count ++;
			}else{
				if(count>maxCount){
					maxCount = count;
					maxCandidate = array[i-1];
				}
				count = 1;
			}
		}
		
		System.out.println("max repeating num is " + maxCandidate + " and the total repeating count is " + maxCount);
	}

}
