package com.scott.leetcode;

import java.util.Arrays;

public class Permutation {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
//		Permutation.permute("83993469");
		int [] array = {1,2,3,4};
		System.out.println(find(array,6,0,0));

	}
	
	public static boolean IsPossible(int arr[], int n, int sum)
	{
		if (n == 1) return sum == Math.abs(arr[0]);
		return IsPossible(arr, n-1,  sum + arr[n-1]) || IsPossible(arr, n-1,  sum - arr[n-1]);

	}
	
	public static boolean find(int array []){
		int sum = 0; 
		for (int i = 0 ;i<array.length ;++i){
			sum+=array[i];
		}
		if (sum%2!=0){
			return false;
		}else{
			return find (array, sum/2,0,0);
		}
	}
	
	public static boolean find (int [] array, int sum ,int n ,int start){
		if (n==sum){
			return true;
		}else if (n>sum){
			return false;
		}else{
			for (int i = start ;i<array.length;++i){
                  n+= array[i];
                  if (find(array,sum,n,start+1)){
                	  return true;
                  }
                 n-= array[i];
                 if (find(array,sum,n,start+2)){
               	  return true;
                 }
			}
			return false;
		}
	
	}
	
	public static void permute(String target){
		char [] chs=target.toCharArray();
		boolean [] used = new boolean [chs.length];
		StringBuilder sb=new StringBuilder();
		int count = 0;
		doPermute(chs,count,chs.length,sb,used);
	}
	
	public static void doPermute(char [] chs, int count, int length, StringBuilder sb,boolean [] used){
		if (length==count){
			System.out.println(sb.toString());
		}else{
			for (int i=0;i<chs.length;++i){
				if (!used[i]){
					sb.append(chs[i]);
					used[i]=true;
					doPermute(chs,count+1,chs.length,sb,used);
					used[i]=false;
					sb.setLength(sb.length()-1);
				}
				
			}
			
		}
		
	}

}
