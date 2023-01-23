package org.example;

public class BinarySearchTree {
    public class Node {
        int data;
        Node left;
        Node right;

        public Node() {
        }
        public Node(int data) {
            this.data = data;
            this.left = this.right = null;
        }
    }

    public Node root;
    public BinarySearchTree() {
        this.root = null;
    };

    public Node add(int data){
        Node newNode = new Node(data);
        Node current = this.root;
        Node prev = current;
        while(current != null){
            prev = current;
            if (data == current.data){
                System.out.println("The key: "+data+"already exists");
            }
            else if ( data <current.data)
                current = current.left;
            else current= current.right;
        }
    };

    public Node search(Node root, int data){
        if ( root == null || root.data == data) return root;
        else if ( data < root.data)
            return search(root.left,data);
        return search(root.right,data);
    }
}