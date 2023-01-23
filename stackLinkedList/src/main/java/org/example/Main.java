package org.example;

public class Main {
    public static void main(String[] args) {
//        System.out.println("Hello world!");
        Stack<Integer> ll = new StackLinkedList<Integer>();
        ll.push(5);
        ll.push(10);
        System.out.println("Size of Stack is "+ll.size());
        for (Integer i: ll){
            System.out.println(i);
        }
    }
}