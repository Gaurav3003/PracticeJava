package com.practise;

class ANode{
	int data;
	ANode left, right;
	public ANode(int data) {

		data = data;
	}
}

public class LCAinBST {
	
	ANode root;
	
	

	public static void main(String[] args) {
		LCAinBST tree = new LCAinBST();
		tree.root = new ANode(20);
		tree.root.left = new ANode(8);
		tree.root.right = new ANode(22);
		tree.root.left.left = new ANode(4); 
        tree.root.left.right = new ANode(12); 
        tree.root.left.right.left = new ANode(10); 
        tree.root.left.right.right = new ANode(14); 

        int n1 = 10, n2 = 14;
        ANode t = tree.lca(tree.root,n1,n2);
        System.out.println("LCA of " + n1 + " and " + n2 + " is " + t.data); 
	}



	private ANode lca(ANode root, int n1, int n2) {
		if(root == null)
			return null;
		
		if(root.data> n1 && root.data>n2) {
			lca(root.left,n1,n2);
		}
		if(root.data<n1 && root.data<n2) {
			lca(root.right, n1, n2);
		}
		
		return root;
		
		
	}

}
