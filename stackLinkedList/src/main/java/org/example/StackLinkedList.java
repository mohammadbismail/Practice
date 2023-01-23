package org.example;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Spliterator;
import java.util.function.Consumer;

public class StackLinkedList<Item> implements Stack<Item>{
    private Node top;
    private int size;


    private class Node{
        Item item;
        Node next;
    }
    public StackLinkedList(){
        top = null;
        size = 0;
    }

    @Override
    public Item pop() {
        Item item = top.item;
        top = top.next;
        size--;
        return item;
    }

    @Override
    public void push(Item item) {
        Node oldTop = top;
        top = new Node();
        top.item = item;
        top.next = oldTop;
        size++;
    }

    @Override
    public boolean isEmpty() {
        return top == null;
    }

    @Override
    public int size() {
        return size;
    }
    public Iterator<Item> iterator(){
        return new LinkedListStackIterator();
    }
    private class LinkedListStackIterator implements Iterator<Item>{
        private int i = size;
        private Node first = top;
        @Override
        public boolean hasNext() {
            return i > 0;
        }

        @Override
        public Item next() {
            Item item = first.item;
            first = first.next;
            i--;
            return item;
        }
    }
}