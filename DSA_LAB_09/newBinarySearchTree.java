/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DSA_LAB_09;

class Node{
    int value;
    Node left,right;

    Node(int value){
        this.value=value;
        left=right=null;
    }
}
public class newBinarySearchTree {
    Node root;
    
     void insert(int value){
        root=insertRec(root,value);
    }
    Node insertRec(Node root, int value){
        if (root==null){
            root=new Node(value);
            return root;
        }
        if(value<root.value){
            root.left=insertRec(root.left,value);
        }else if(value>root.value){
            root.right=insertRec(root.right,value);
        }
        return root;
    }
     int countNodes(){
        return countNodesRec(root);
    }
    int countNodesRec(Node root){
        if(root==null){
            return 0;
        }
        return 1 + countNodesRec(root.left)+countNodesRec(root.right);
    }
    
     void inorder() {
        inorderRec(root);
        System.out.println();
    }
    void inorderRec(Node root) {
        if (root != null) {
            inorderRec(root.left);
            System.out.print(root.value + " ");
            inorderRec(root.right);
        }
    }
    void preorder() {
        preorderRec(root);
        System.out.println();
    }
    void preorderRec(Node root) {
        if (root != null) {
            System.out.print(root.value + " ");
            preorderRec(root.left);
            preorderRec(root.right);
        }
    }
    void postorder() {
        postorderRec(root);
        System.out.println();
    }

    void postorderRec(Node root) {
        if (root != null) {
            postorderRec(root.left);
            postorderRec(root.right);
            System.out.print(root.value + " ");
        }
    }
    
    public static void main(String[] args) {
        newBinarySearchTree b1 = new newBinarySearchTree();
        b1.insert(10);
        b1.insert(15);
        b1.insert(8);
        b1.insert(2);
        b1.insert(12);
        b1.insert(3);
        b1.insert(20);
        System.out.println("In-Order Travesal: ");
        b1.inorder();
        System.out.println("Pre-Order Travesal: ");
        b1.preorder();
        System.out.println("Post-Order Traversal: ");
        b1.postorder();
        System.out.println("Total Nodes in a Tree: ");
        System.out.println(b1.countNodes());
        
    }
}
