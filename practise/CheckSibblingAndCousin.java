package com.practise;

class TreeNode {
	int data;
	TreeNode left;
	TreeNode right;

	public TreeNode(int d) {
		data = d;
		left = right = null;
	}

}

public class CheckSibblingAndCousin {

	TreeNode root;
	
	boolean isSibling(TreeNode root, TreeNode a, TreeNode b) {
		if(root == null) {
			return false;
		}
		
		if(root.left == a && root.right == b) {
			return true;
		}
		 return ((root.left==a && root.right==b)
				 || (root.left==b && root.right==a)
				 ||isSibling(root.left, a, b)
				 || isSibling(root.right, a, b));
		
	}
	
	int level(TreeNode node, TreeNode ptr, int level) {
		if (node == null)
			return 0;
		if(node== ptr)
			return level;
		int l = level(node.left,ptr, level+1);
		if(l!=0)
			return l;
		
		return level(node.right, ptr, level + 1);
	}
	
	boolean isCousin(TreeNode node, TreeNode a, TreeNode b) {
		if((level(node, a, 1) == level(node, b, 1)) &&
				(!isSibling(node, a, b)))
			return true;
		return false;
		
	}
	
	
	

	public static void main(String[] args) {
		CheckSibblingAndCousin tree = new CheckSibblingAndCousin();
		tree.root = new TreeNode(1);
		tree.root.left = new TreeNode(2);
		tree.root.right = new TreeNode(3);
		tree.root.left.left = new TreeNode(4); 
        tree.root.left.right = new TreeNode(5); 
        tree.root.left.right.right = new TreeNode(15); 
        tree.root.right.left = new TreeNode(6); 
        tree.root.right.right = new TreeNode(7); 
        tree.root.right.left.right = new TreeNode(8);

	}

}
