package com.scott;

public class QuickSums {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		QuickSums r = new QuickSums();
		int steps = r.findStep_dp("999999", 8) ;
		System.out.println(steps);
	}
	
	public int minStep (String num, int sum){
		return helper (num, sum, 0) - 1 ;
	}
	
	private int helper (String num, int sum , int index){
		if (index == num.length() && sum == 0) {			
			return 0 ;
		}
		if (sum == 0 || index == num.length()) {
			return -1 ;
		}
		
		int min = Integer.MAX_VALUE;
		int step = 0;
		for (int i = index ; i < num.length() ; ++i) {
		   String n = num.substring(index, i + 1) ;
		   int val = Integer.parseInt(n);
		   if (sum >= val) {			   
			   int r = helper (num, sum - val, i + 1) ;
			   if (r != -1) {
				   step = 1 + r;   
			   }			   
		   }
		   min = Math.min(min, step);
		}				
		return min ;
	}

	public int findStep_dp (String num, int sum){
	  int [][] f = new int [sum + 1][num.length() + 1] ;
	  for (int i = 1 ; i <= sum ; ++i) {
		 for (int j = 1 ; j <= num.length() ; ++j) {
			 f[i][j] = Integer.MAX_VALUE ;
		  for (int k = 0 ; k < j ;++k) {
			  int val = Integer.parseInt(num.substring(k, j));
			  if (i >= val) {
				  f[i][j] = Math.min(f[i][j], f[i - val][k] + 1) ; 
			  }
		  }
		}
	  }		
	  
      return f[sum][num.length()] == Integer.MAX_VALUE ? -1 : f[sum][num.length()] - 1;		
	}
	
}
