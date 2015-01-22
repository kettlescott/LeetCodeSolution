package com.scott.code;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
//import java.util.PriorityQueue;



public class Vertex implements Comparable<Vertex>{

	public static int INFINITY = Integer.MAX_VALUE;
	
	public int dist;
	
	public int scrath ;
	
	public LinkedList<Edge> adj;
	
	public String name;
	
	
	public Vertex(String name){
		this.name = name;
		adj = new LinkedList<Edge>();
	}
	
	public void reset(){
		dist = INFINITY;
		scrath = 0;
	}

	
	@Override
	public int compareTo(Vertex v) {		
		return Integer.parseInt(name)-Integer.parseInt(v.name);
	}
	
}