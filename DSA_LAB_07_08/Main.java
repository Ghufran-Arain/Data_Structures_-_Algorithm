class Node {
    int data;
    Node left;
    Node right;

    public Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}

// Binary Tree class with traversal methods
class BinaryTree {
    Node root;

    // Constructor
    public BinaryTree() {
        root = null;
    }

    // Insert node into the binary tree
    public void insert(int data) {
        root = insertNode(root, data);
    }

    // Helper method to insert node recursively
    private Node insertNode(Node node, int data) {
        if (node == null) {
            node = new Node(data);
            return node;
        }

        if (data < node.data) {
            node.left = insertNode(node.left, data);
        } else if (data > node.data) {
            node.right = insertNode(node.right, data);
        }

        return node;
    }

    // Inorder Traversal (Left-Root-Right)
    public void inorderTraversal(Node node) {
        if (node != null) {
            inorderTraversal(node.left);
            System.out.print(node.data + " ");
            inorderTraversal(node.right);
        }
    }

    // Preorder Traversal (Root-Left-Right)
    public void preorderTraversal(Node node) {
        if (node != null) {
            System.out.print(node.data + " ");
            preorderTraversal(node.left);
            preorderTraversal(node.right);
        }
    }

    // Postorder Traversal (Left-Right-Root)
    public void postorderTraversal(Node node) {
        if (node != null) {
            postorderTraversal(node.left);
            postorderTraversal(node.right);
            System.out.print(node.data + " ");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        BinaryTree binaryTree = new BinaryTree();

        // Insert nodes into the binary tree
        binaryTree.insert(5);
        binaryTree.insert(40);
        binaryTree.insert(3);
        binaryTree.insert(13);
        binaryTree.insert(100);
//        binaryTree.insert(14);
//        binaryTree.insert(4);
//        binaryTree.insert(7);
//        binaryTree.insert(13);

        System.out.println("Inorder Traversal:");
        binaryTree.inorderTraversal(binaryTree.root);

        System.out.println("\n\nPreorder Traversal:");
        binaryTree.preorderTraversal(binaryTree.root);

        System.out.println("\n\nPostorder Traversal:");
        binaryTree.postorderTraversal(binaryTree.root);
    }
}