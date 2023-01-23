package org.example;

public class LinkedListQueue {

    private Node front, rear;
    private int size;

    class Node {
        int data;
        Node next;
    }

    public LinkedListQueue() {
        this.front = null;
        this.rear = null;
    }

    public void enqueue(int val) {
        Node n = new Node();
        n.data = val;
        n.next = null;
        if (front == null) {
            front = n;
        } else {
            // add new node to end of rear
            // make rear point to this new node
            rear.next = n;
        }
        rear = n;
        size++;
    }

    public int dequeue() {
        if (front == null) {
            System.out.println("Queue is empty");
        }
        Node temp = front;
        front = front.next;
        // if list is empty
        if (front == null) {
            rear = null;
        }
        size--;
        return temp.data;
    }

    public int peek() {
        if (front == null) {
            System.out.println("Queue is empty");
        }
        System.out.println("Peek Element is:" + front.data);
        return front.data;
    }

    public boolean isEmpty() {
        return front == null && rear == null;
    }

    public int size() {
        return size;
    }

    public void displayQueue() {
        if (front == null) {
            System.out.println("Queue is empty");
        }
        while (front != null){
            System.out.println(front.data);
            front = front.next;
        }
    }
}


