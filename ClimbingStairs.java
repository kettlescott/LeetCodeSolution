package com.scott.leetcode;

public class ClimbingStairs {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClimbingStairs  c = new ClimbingStairs ();
		System.out.println(c.climbStairs(22));
		System.out.println(c.climbStairs_II(22));
	}
	
     public int climbStairs(int n) {
       int f1 = 1 , f2 = 1 ;       
       for (int i = 2 ; i <= n ;++i) {
    	   int temp = f2;
    	   f2 += f1 ;
    	   f1 = temp;
       }
       return f2 ;
     }
     
     public int climbStairs_II (int n){
    	 int [] m = new int [n + 1];
    	 for (int i = 0 ; i <= n ; ++i) 
    		 m[i] = -1;
    	 return climb (n,m);
     }

     public int climb(int n , int [] memory){
    	 if (n == 0) 
    		 return 1;
    	 if (n < 0) 
    		 return 0 ;
    	 int total = 0 ;
    	 for (int i = 1 ; n >= i && i <= 2 ; ++i) {
    		 if (memory[ n- i] == -1){
    			 memory[ n- i] = climb(n - 1,memory);	 
    		 }
    		 total += memory[ n- i] ;    		   
    	 }
    	 return total ;
     }
}
