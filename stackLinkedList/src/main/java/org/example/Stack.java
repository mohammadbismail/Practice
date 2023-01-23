package org.example;

import java.util.Iterator;

public interface Stack<Item> extends Iterable<Item> {
    Item pop();
    void push(Item item);
    boolean isEmpty();
    int size();
}
