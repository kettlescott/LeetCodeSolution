package com.scott.code;

public class ReOrder {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//         System.out.println(ReOrder.reorderByPattern("aaccbbde","abce"));
//		float t = 100;
//		System.out.println(t/3);
//		Average.main(new String[]{});
		
//		int nums[]= {1,2,3,4,5};
//		int i;
//		int result=0;
//		for(i=0;i<5;i++){
//			result=result+nums[i];
//			}
//		System.out.println(result);
    
		
//		int i;
//		int result=0;
//		for (i=0;i<=100;i++){
//			result=result+i
//			;		 
//		}
//		System.out.println(result);
		char letters[]={'a','a','a','b','b','b','e','e','e','a','a','a','c','c','c'};
		
		
		int i;
		for(i=0;i<letters.length;i++){
           
		}
		
		
		
		
						
	}

	
	public static String reorderByPattern(String src, String pattern){
		int [] dp = new int [26];
		char [] chs = src.toCharArray();
		for (int i = 0 ;i<chs.length ;++i){
			dp[chs[i]-'a']++;
		}
		
		int j = 0;
		for (int i = 0; i<pattern.length() ;++i){
			int count = dp [pattern.charAt(i)-'a'];
			if (count !=0){
				for (int k = 0 ;k<count ;++k){
					chs [j++] = pattern.charAt(i);
				}
			}
		}
		return new String(chs,0,j);
	}
	
	
	
	
}

//Average an array of values.
class Average {
 public static void main(String args[]) {
 double nums[] = {10.1, 11.2, 12.3, 13.4, 14.5};
 double result = 0;
 int i;
 for(i=0; i<5; i++){
//	 result = result + nums[i]; 
	 result +=  nums[i]; 
 }
 System.out.println("Average is " + result / 5);}}




