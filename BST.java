import java.util.*;
class Node {
int data;
Node left;
Node right;
Node(int data){
this.data=data;
}
}
 class treefunctions {

public Node insert(Node root,int data) {
if(root==null) {
root = new Node(data);
return root;
}
if(data<root.data) {
root.left=insert(root.left,data);

}
else if(data>=root.data) {
root.right=insert(root.right,data);
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
/*public Node delete(Node root,int data) {
if(root==null){
return null;
}
if(data<root.data){
root.left=delete(root.left,data);
}
else if(data>root.data){
root.right=delete(root.right,data);
}
else{
if(root.left!=null && root.right!=null){
Node temp=root;
Node minright = Minval(temp);
root.data=minright.data;
root.right=delete(root.right,root.data);
}
else if(root.left==null && root.right!=null){
root=root.right;
return delete(root,data);
}
else if(root.left!=null && root.right==null){
root=root.left;
return delete(root,data);
}
}


return root;
}*/
public  Node minimumElement(Node root) {
        if (root.left == null)
            return root;
        else {
            return minimumElement(root.left);
        }
    }
 
    public  Node deleteNode(Node root, int value) {
        if (root == null)
            return null;
        if (root.data > value) {
            root.left = deleteNode(root.left, value);
        } else if (root.data < value) {
            root.right = deleteNode(root.right, value);
 
        } else {
       
            if (root.left != null && root.right != null) {
                Node temp = root;
             
                Node minNodeForRight = minimumElement(temp.right);
               
                root.data = minNodeForRight.data;
               
                root.right = deleteNode(root.right, minNodeForRight.data);
 
            }
                  else if (root.left != null) {
                root = root.left;
            }

            else if (root.right != null) {
                root = root.right;
            }
 
            else
                root = null;
        }
        return root;
    }
public void preorder(Node root) {
if(root==null) {
return;
}
System.out.print(root.data+" ");
preorder(root.left);
preorder(root.right);
}
public void postorder(Node n) {
if(n==null) {
return;
}
postorder(n.left);
postorder(n.right);
System.out.print(n.data+" ");
}
public void inorder(Node root) {
if(root==null) {
return;
}
inorder(root.left);
System.out.print(root.data+" ");
inorder(root.right);
}
}
public class Main {

public static void main(String[] args) {
int num,data;
int p;
// TODO Auto-generated method stub
Node root=null;
Node f = null;
treefunctions tree = new treefunctions();
Scanner sc = new Scanner(System.in);
while(true) {
System.out.println("\n Choose an option \n 1->Insert \n 2-> Delete");
int n = sc.nextInt();
switch(n) {
case 1:
p =sc.nextInt();
root=tree.insert(root,p);
System.out.println("Inorder traversal is: ");
tree.inorder(root);
System.out.println("\n Preorder traversal is: ");
tree.preorder(root);
System.out.println("\n Postorder traversal is: ");
tree.postorder(root);
break;
case 2:
int k = sc.nextInt();
f = tree.deleteNode(root,k);
System.out.println("Inorder traversal is: ");
tree.inorder(root);
System.out.println("\n Preorder traversal is: ");
tree.preorder(root);
System.out.println("\n Postorder traversal is: ");
tree.postorder(root);
break;



}
}
}

}
