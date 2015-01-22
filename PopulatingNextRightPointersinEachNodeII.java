package com.scott.code;

public class PopulatingNextRightPointersinEachNodeII {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
    public void connect(TreeLinkNode root) {
    	if (root == null) return ;
    	connect (root.left) ;
    	connect (root.right) ;
    }

}
