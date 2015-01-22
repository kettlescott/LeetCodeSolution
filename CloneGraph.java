package com.scott.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map.Entry;
import java.util.Queue;

public class CloneGraph {



	static class UndirectedGraphNode  {
		int label;
		List<UndirectedGraphNode> neighbors;
		UndirectedGraphNode(int x) { label = x; neighbors = new ArrayList<UndirectedGraphNode>(); }
	}
	
	public UndirectedGraphNode cloneGraph(UndirectedGraphNode node) {
	       if (node == null) return null;	
	       UndirectedGraphNode clone = new UndirectedGraphNode (node.label); 
	       HashMap<UndirectedGraphNode,UndirectedGraphNode> map = new HashMap<>();
	       map.put(node, clone) ;
	       Queue<UndirectedGraphNode> queue = new LinkedList<> ();
	       queue.add(node) ;
	       while (!queue.isEmpty()) {
	    	   UndirectedGraphNode cur = queue.poll();
	    	   for (UndirectedGraphNode sub : cur.neighbors) {
	    		   if (!map.containsKey(sub)) {
	    			   map.put(sub, new UndirectedGraphNode(sub.label));
	    			   queue.add(sub);
	    		   }
	    	   }
	       }       
	       for (Entry<UndirectedGraphNode, UndirectedGraphNode> entry : map.entrySet()) {
	    	   UndirectedGraphNode origNode = entry.getKey();
	    	   UndirectedGraphNode cloneNode = entry.getValue();
	    	   for (UndirectedGraphNode n : origNode.neighbors ) {
	    		   cloneNode.neighbors.add(map.get(n)) ;
	    	   }
	    	}       
	       return clone ;
	    }
	
}
