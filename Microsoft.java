package com.scott.code;

import java.io.File;

public class Microsoft {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println(Microsoft.removeDup("Today is the day"));
		
		//String txt="Today is the day";
		
//		String [] array={"leilei","Lihe"};
//		for (int i=0;i<array.length;++i){
//			
//		}
//		
//		int j=0;
//		 while(j<array.length){
//			 
//			 
//			 j++;
//		 }
		 
		int [] array={1,2,3};
		int count = 0;
		for (int i =0 ;i<array.length; ++i){
			count=count+array[i]*10;	
		}
		
//		String [] name ={"leilei","lihe"};
//		for (int i=0;i<name.length;++i){
//		   System.out.println(name[i]);	
//		}
	   
		for (int i =array.length-1 ;i>=0; --i){
				System.out.println(array[i]);	
		}
		
		File file=new File("C:/log/electricity");
		File [] files=file.listFiles();
		for (int i=0;i<files.length; ++i){
			System.out.println(files[i].getName());
		}
				
	
		
		
		

	}
	
	
	public static String removeDup(String txt){
		boolean [] dp=new boolean [26];
		char []chs=txt.toCharArray();
		int j=0;
		int dif=0;
		for (int i=0;i<chs.length;++i){	
			if (chs[i]>='a'&&chs[i]<='z'){
				dif=chs[i]-'a';
			} else if (chs[i]>='A'&&chs[i]<='Z'){
				dif=chs[i]-'A';
			}
			if (!dp [dif]||chs[i]==' '){
			chs[j++]=chs[i];
			dp [dif]=true;
		}
			
		}
		return new String(chs,0,j);
	}

}
