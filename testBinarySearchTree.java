import java.util.*;

class node{
	int data;
	node left,right;

	public node(int x){
		data = x;
	}
}

class tree{
	
	public node root;


	public node delete(int data){
		
	}

	public node insert(node root , int data){
		
		if(this.root == null){
			this.root= new node(data);
			return this.root; 
		}

		if(root == null){
			return new node(data);
		}
		if(root.data>=data){
			root.left = insert(root.left,data);
		}
		else{
			root.right = insert(root.right,data);
		}
		return root;

	}

	public void inorder(node root){

		if(root==null)
			return;

		inorder(root.left);
		System.out.print(root.data+" ");
		inorder(root.right);

	}

	public void uncoveredTraverse(){
			printLeft(this.root);
			printLeaf(this.root);
			printRight(this.root.right);
	}

	private void printLeft(node root){

		if(root.left !=null)
		{
			System.out.print(root.data+" ");
			printLeft(root.left);
		}
	}

	private void printRight(node root){
		if(root.right !=null && this.root!=root)
		{
			printLeft(root.right);
			System.out.print(root.data+" ");
		}	
	}


	private void printLeaf(node root){
		if(root.left == null && root.right == null){
			System.out.print(root.data+" ");
			return;
		}
		if(root.left != null)
			printLeaf(root.left);
		if(root.right != null)
			printLeaf(root.right);
	}

}

public class testBinarySearchTree{
	public static void main(String args[]){
		tree t1 = new tree();
		t1.insert(t1.root,6);
		t1.insert(t1.root,1);
		t1.insert(t1.root,7);
		t1.insert(t1.root,3);
		t1.insert(t1.root,2);
		t1.insert(t1.root,4);
		t1.insert(t1.root,10);
		t1.insert(t1.root,0);
		t1.insert(t1.root,9);
		t1.insert(t1.root,11);
		t1.inorder(t1.root);
		System.out.println();
		t1.uncoveredTraverse();
	}
}