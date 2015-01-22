package com.scott.code;

public class ArrayInversionCount {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayInversionCount i = new ArrayInversionCount ();
		int [] data = {1,4,3,3,2 } ;
		System.out.println(i.solution("dooernedeevrvn"));
		
	}
	
	
	
	
	
	public int solution(String S) {
        // write your code in Java SE 8
         int [] count = new int[26];
        for( int i = 0; i < S.length(); i++ ){
              char ch = S.charAt(i);
             count[ch-'a']++;
         }
         int oddOccur = 0;
       for( int cnt:count ){
           if( oddOccur > 1)
             return 0;
           if( cnt%2 == 1 )
            oddOccur++;
          }
           return 1; 
    }
	
	
	
	int max = Integer.MIN_VALUE ;
	int count = 0;
	
	class Tree {
		int x ; 
		Tree l ;
		Tree r; 		
	}
	
	public  void calcualate (Tree t){
		if (t == null) return ;
		if (t.x >= max) count++;
		max = Math.max(t.x, max);
		calcualate (t.l);
		calcualate (t.r);				
	}
	
	 public int findVisible(Tree T, int max) {
		 if(T == null) return 0;
		 if(T.x >= max) {
		    return 1 + findVisible(T.l, T.x) + findVisible(T.r, T.x);
		 } else {
		    return findVisible(T.l, max) + findVisible(T.r, max);
		 }
     }
	
	 
	 
	 int equi(int[]A){
		 long r=0;int i,x=i=-1;
		 for(int e:A)r+=e;
		 for(int e:A){++i;r-=2*e;
		 if(-e==r)x=i;
		 }return x;
		 }

}
