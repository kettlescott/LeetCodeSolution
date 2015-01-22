package com.scott.leetcode;

public class WordCount {

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
