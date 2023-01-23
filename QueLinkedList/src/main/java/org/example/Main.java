package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        LinkedListQueue q = new LinkedListQueue();
        q.enqueue(5);
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(1);
        q.peek();
        q.dequeue();
        q.displayQueue();
    }
}