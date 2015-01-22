package com.scott.leetcode;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class ValidParentheses {

	
	Map<Character , Character> BRACKET = new HashMap<Character , Character>() {{
	    put('(',    ')');
	    put('{', '}');
	    put('[',   ']');
	}};
	
	
	 public boolean isValid(String s) {
	    Stack<Character> stack = new Stack<Character> () ;
        for (Character c: s.toCharArray()) {
        	if (BRACKET.containsKey(c)) {
        		stack.push(c) ;
        	} else if (stack.isEmpty() || BRACKET.get(stack.pop()) != c) {
        		return false;
        	}
        }
	    return stack.isEmpty();
	 }

}
