package com.scott.code;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class ValidParentheses {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ValidParentheses v = new ValidParentheses ();
		boolean flag = v.isValid(")}") ;
		System.out.println(flag);
	}
	
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
