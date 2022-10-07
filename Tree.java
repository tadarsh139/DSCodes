public class Node {
	int data;
	Node left;
	Node right;
	Node(int data){
		this.data=data;
	}
}
public class treefunctions {
	
public Node insert(Node root,int data) {
	if(root==null) {
		root = new Node(data);
		System.out.println(root.data);
		return root;
	}
	if(data<root.data) {
		insert(root.left,data);
		
	}
	else if(data>=root.data) {
		insert(root.right,data);
	}
	return root;
}
public Node search(Node root,int data) {
	Node p = root;
	Node x=null;
	if(p!=null) {
		if(data==p.data) {
			return p;
		}
		else if(data<p.data) {
			p=p.left;
			search(p,data);
		}
		else if(data>=p.data) {
			p=p.right;
			search(p,data);
		}
	}
	else {
		return x;
	}
	return x;
}
public void delete(Node root,int data) {
	Node p = search(root,data);
	if(p!=null) {
		if(p.right==null && p.left==null) {
			p=null;
		}
		else if(p.right==null && p.left!=null) {
			p.data=p.left.data;
			p.left=null;
		}
		else if(p.right!=null && p.left==null) {
			p.data=p.right.data;
			p.right=null;
		}
	}
}
public void preorder(Node root) {
	if(root==null) {
		return;
	}
	System.out.println(root.data+" ");
	preorder(root.left);
	preorder(root.right);
}
public void postorder(Node n) {
	if(n==null) {
		return;
	}
	postorder(n.left);
	postorder(n.right);
	System.out.println(n.data+" ");
}
public void inorder(Node root) {
	if(root==null) {
		return;
	}
	inorder(root.left);
	System.out.println(root.data+" ");
	inorder(root.right);
}
}
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node root=null;
		treefunctions tree = new treefunctions();
		root=tree.insert(root,8);
		root=tree.insert(root,3);
		root=tree.insert(root,6);
		root=tree.insert(root,10);
		root=tree.insert(root,4);
		root=tree.insert(root,7);
		root=tree.insert(root,1);
		root=tree.insert(root,14);
		root=tree.insert(root,13);
		System.out.println(root.left.data);
		
		
	}

}
