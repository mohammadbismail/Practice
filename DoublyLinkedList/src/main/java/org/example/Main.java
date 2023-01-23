package org.example;

public class Main {
    public static void main(String[] args) {
        DLL ll = new DLL();
        ll.insertFirst(1);
        ll.insertFirst(5);
        ll.insertFirst(15);
        ll.insertFirst(25);
        ll.insertAtPosition(3,56);
        ll.insertLast(51);
//        ll.deleteFirst();
//        ll.deleteLast();
//        ll.deleteAtPos(4);
//        ll.deleteElement(70);
        ll.reverseList();
        ll.displayList();
    }
}