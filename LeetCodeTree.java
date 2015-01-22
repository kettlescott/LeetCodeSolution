package com.scott.leetcode;

import java.util.LinkedList;
import java.util.Queue;

public class LeetCodeTree {


	
	public static TreeNode createTree (String [] val){
		if (val.length == 0 || "#".equals(val[0])) return null;
		Queue<TreeNode> q = new LinkedList<> ();
		TreeNode root = new TreeNode (Integer.parseInt(val[0]));
		q.add(root) ;
		for (int i = 1 ; i < val.length && !q.isEmpty() ; i += 2) {
			TreeNode cur = q.poll() ;
			if (!"#".equals(val[i])) {
				TreeNode leftNode = new TreeNode (Integer.parseInt(val[i]));
				cur.left = leftNode;
				q.add(leftNode);
			}
			if (i + 1 < val.length && !"#".equals(val[i + 1])) {
				TreeNode rightNode = new TreeNode (Integer.parseInt(val[i + 1]));
				cur.right = rightNode ;
				q.add(rightNode);
			}
		}
		return root ;		
	}

}
