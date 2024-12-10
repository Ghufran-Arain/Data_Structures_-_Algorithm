/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DSA_LAB_07_08;
class Node{
int data;
Node right;
Node left;

Node(int data){
    this.data=data;
    right=null;
    left=null;
}
}
class BinaryTree{
Node root;

BinaryTree(){
this.root=null;
}

public void insert(int data){
    root=insertNode(root,data);
}
public Node insertNode(Node node,int data){
if(node==null){
node=new Node(data);
return node;
}
if(data<node.data){
node.left=insertNode(node.left,data);
}else if(data>node.data){
node.right=insertNode(node.right,data);
}
return node;
}
public void inorderTraverse(Node node){
if(node!=null){
    inorderTraverse(node.left);
    System.out.println(node.data+" ");
    inorderTraverse(node.right);
}
}
public void preorderTraverse(Node node){
if(node!=null){
    System.out.println(node.data+" ");
    preorderTraverse(node.left);
    preorderTraverse(node.right);
}
}
public void postorderTraverse(Node node){
if(node!=null){
    postorderTraverse(node.left);
    postorderTraverse(node.right);
    System.out.println(node.data+" ");
}
}
}
public class Binart_tree {
    public static void main(String[] args) {
        BinaryTree b1=new BinaryTree();
        b1.insert(5);
        b1.insert(40);
        b1.insert(3);
        b1.insert(13);
        b1.insert(100);
     System.out.println("inorder traversal: ");
        b1.inorderTraverse(b1.root);
        System.out.println("preorder traversal: ");
        b1.preorderTraverse(b1.root);
        System.out.println("postorder traversal: ");
        b1.postorderTraverse(b1.root);
    }
}
