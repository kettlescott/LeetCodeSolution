package com.scott.leetcode;

import java.util.HashMap;
import java.util.Stack;

public class EvaluateReversePolishNotation {

	/**
	 * @param args
	 */
	HashMap<String,Operator> OPERATORS = new HashMap<String,Operator>(){
		{
			put ("+", new Operator(){
				public int eval (int a, int b) {return a + b ;}
			});
			put ("-", new Operator(){
				public int eval (int a, int b) {return a + b ;}
			});
			put ("*", new Operator(){
				public int eval (int a, int b) {return a + b ;}
			});
			put ("/", new Operator(){
				public int eval (int a, int b) {return a + b ;}
			});
		}
	};
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EvaluateReversePolishNotation r = new EvaluateReversePolishNotation ();
		String [] exp = {"2", "1", "+", "3", "*"};
		System.out.println(r.evalRPN(exp));
	}
	
    public int evalRPN(String[] tokens) {
        Stack<Integer> eval = new Stack<>() ;
        for (String str : tokens) {
        	if (OPERATORS.containsKey(str)) {
        		int x = eval.pop() ;
        		int y = eval.pop() ;
        		eval.push(OPERATORS.get(str).eval(x, y)) ;
        	} else{
        		eval.push(Integer.parseInt(str));
        	}
        }    
       return eval.pop() ;
    }
    
    
    public int operation (String operator , int a , int b){
    	if ("+".equals(operator)) {
    		return a + b ;
    	} else if ("-".equals(operator)) {
    		return a - b ;
    	} else if ("/".equals(operator)) {      		
    		return a / b ;
    	} else {
    		return a * b ;
    	}
    }

}

interface Operator {
	int eval (int a, int b) ;
}
