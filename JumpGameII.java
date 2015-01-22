package com.scott.code;

public class JumpGameII {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JumpGameII g = new JumpGameII ();
		int [] data = {2, 3, 1, 1, 4} ;
		int min = g.jump(data);
		System.out.println(min);
	}

    public int jump(int[] A) {
        int [] dp = new int [A.length] ;
        dp[0] = 0 ;
        for (int i = 0 ; i < A.length ; ++i) {
        	int j = i + 1;
        	while (j < A.length && A[i] >= 0) {
        		if (dp[j] == 0) {
        			dp[j] = dp[i] + 1 ;
        		} else{
        			dp[j] = dp[i] + 1 < dp[j] ? dp[i] + 1  : dp[j];	
        		}        		
        		A[i]--;
        		j++;        		
        	}
        }       
       return dp[A.length - 1] ;    	
    }
	
}
