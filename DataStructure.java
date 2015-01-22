package com.scott.code;

import java.util.HashSet;
import java.util.Stack;

public class DataStructure {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	
	HashSet<Integer> max = new HashSet<>();
	HashSet<Integer> set = new HashSet<>();
	
	public void insert(int x){
		if (set.isEmpty()) {
			
		}
		set.add(x);
	}
	
	public void delete (int x){
		set.remove(x);
	}
	
	public boolean search (int x){
		return set.contains(x);
	}
	
	
}
