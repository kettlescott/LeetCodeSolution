package com.scott.leetcode;

public class Anagrampalindrome {

	/**
	 * 

In this problem we consider only strings of lower-case English letters (a-z).

A string is a palindrome if it has exactly the same sequence of characters when traversed left-to-right as right-to-left. For example, the following strings are palindromes:

"kayak"

"codilitytilidoc"

"neveroddoreven"

A string A is an anagram of a string B if it consists of exactly the same characters, but possibly in another order. For example, the following strings are each other's anagrams:

A="mary" B="army" A="rocketboys" B="octobersky" A="codility" B="codility"

Write a function

int isAnagramOfPalindrome(String S);

which returns 1 if the string s is a anagram of some palindrome, or returns 0 otherwise.

For example your function should return 1 for the argument "dooernedeevrvn", because it is an anagram of a palindrome "neveroddoreven". For argument "aabcba", your function should return 0.

	 */
	
public int isAnagramOfPalindrome (String S){
		int [] map = new int [26];
		int count = 0 ;
		for (char c : S.toCharArray())
			map[c - 'a']++;
		for (int c : map) {
			if ( c % 2 != 0) count++;		
	    }
		boolean f = S.length() % 2 != 0 && count == 1 || S.length() % 2 == 0 && count == 0 ;
	    return f ? 1 : 0 ;	
	}

}
