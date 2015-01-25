package com.scott.leetcode;

public class PopulatingNextRightPointersinEachNodeII {

	/**
	  Follow up for problem "Populating Next Right Pointers in Each Node".

    What if the given tree could be any binary tree? Would your previous solution still work?

    Note:

    You may only use constant extra space.
    For example,
    Given the following binary tree,
         1
       /  \
      2    3
     / \    \
    4   5    7
    After calling your function, the tree should look like:
         1 -> NULL
       /  \
      2 -> 3 -> NULL
     / \    \
    4-> 5 -> 7 -> NULL
	 */

	
	public void connect(TreeLinkNode root) {
		TreeLinkNode dummy = new TreeLinkNode (1);
		TreeLinkNode parent = root ;
		while (parent != null) {
			TreeLinkNode nextLevel = null ;
			TreeLinkNode pre = dummy ;
			while (parent != null) {
				if (nextLevel == null) {
					nextLevel = parent.left != null ? parent.left : parent.right ;
				}
				if (parent.left != null) {
					pre.next = parent.left ;
					pre = pre.next ;
				}
				if (parent.right != null) {
					pre.next = parent.right ;
					pre = pre.next ;
				}
				parent = parent.next ;
			}
			parent = nextLevel ;
		}
	}

}
