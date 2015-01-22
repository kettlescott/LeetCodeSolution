package com.scott.code;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.PriorityQueue;


public class Graph {

	HashMap<String, Vertex> vertexMap = new HashMap<String,Vertex>();
	
	public Vertex getVertex(String name){
		if (vertexMap.containsKey(name)){
		  return vertexMap.get(name);
		}
		Vertex v = new Vertex(name);
		vertexMap.put(name, v);
		return v;
	}
	
	public void addEdge(String srcName, String desName, int cost){
		Vertex src = getVertex(srcName);
		Vertex des = getVertex(desName);
		src.adj.add(new Edge(cost,des));
	}
	
	
	public void clearAll(){
		for (Vertex v : vertexMap.values()){
			v.reset();
		}
	}
	

	
	
	public void topologySort(){
       clearAll();
       //indegree
       for (Vertex v : vertexMap.values()){
    	   for (Edge e : v.adj){
    		   e.v.scrath++;
    	   }
       }
       
       PriorityQueue<Vertex> pq = new PriorityQueue<Vertex>();
       
       for (Vertex v : vertexMap.values()){
    	   if (v.scrath==0){
    		   pq.add(v);
    	   }
       }
       
       int count = 0;
       while(!pq.isEmpty()){
    	   Vertex v = pq.poll();
    	   System.out.print(v.name + " ");
    	   
    	   for (Edge e : v.adj){    		       		  
    		  if (--e.v.scrath==0){
    		    	pq.add(e.v);
    		    }
    	   }
    	  
    	   count++;
       }      
       if (count!=vertexMap.size()){
    	  System.out.println("Sandro fails.");   
       }
       
	}
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		Graph g = new Graph();
		FileReader fin = new FileReader("plan.txt");
		BufferedReader br=new BufferedReader(fin);
		String line = null ;
		while ((line = br.readLine())!=null){
			String [] txt = line.split("\\s+");
			String src = txt [0];
			String dest = txt [1];
			g.addEdge(src, dest, 0);
		}
		
		g.topologySort();
		
	    

	}

}
