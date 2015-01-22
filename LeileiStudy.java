package com.scott.code;

public class LeileiStudy {


	public static void main(String[] args) {
     char array[]={'a','c','c','b','a'};
//     for(int i=0,j=array.length-1;i<j;++i,--j){
//    	 char temp=array[i];
//    	 array[i]=array[j];
//    	 array[j]=temp;
//     }
//     for(int i=0;i<array.length;++i){
//    	 System.out.print(array[i]);
//     }
     
     
//     boolean flag=true;
//     for(int i=0,j=array.length-1;i<j;++i,--j){
//         if (array [i] !=array[j]){
//        	 flag= false;
//        	 break;
//         }
//     }
//     
//     if (flag){
//    	 System.out.println("corret");
//     }else{
//    	 System.out.println("wrong");
//     }
     
     int [] num = {3,1,5, 9,3,6,7,2};
//     int min= num[0];
//     int sec = Integer.MAX_VALUE;
//     for(int i=1;i<num.length;++i){
//    	 if (min>num[i]){
//    		 sec = min;
//    		 min = num [i];  		 
//    	 } else if (sec >num[i]){
//    		 sec = num[i];
//    	 }
//	}
//     
//     System.out.println(min);
//     System.out.println(sec);
     
     for (int i = 1 ; i<num.length ;++i){
    	 for (int j = 0 ; j<i;++j){
    		  if (num[i]<num[j]){
    			  int tmp = num [j];
    			  num [j] = num [i];
    			  num [i] = tmp;
    		  }
    	 }
     }
     
     for (int c : num){
    	 System.out.print(c);
     }
     
	}

}

