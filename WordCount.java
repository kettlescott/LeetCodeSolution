package com.scott.code;

public class WordCount {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String words="hello this is a word,how are you? ";
       System.out.println(calWordCount(words));
	}
	
	
	
	public static int calWordCount(String words){
		int count = 0;
		boolean preHasSpace=true;
		char [] chs=words.toCharArray();
		
		for (int i = 0; i < chs.length; ++i){
			if (Character.isAlphabetic(chs[i])||Character.isDigit(chs[i])){
				if (preHasSpace){
					count++;
					preHasSpace=false;
				}
				
			}else{
				preHasSpace=true;
			}
		}
		return count;
	}

}
