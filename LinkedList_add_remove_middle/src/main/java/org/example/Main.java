package org.example;


public class Main {
    public static void main(String[] args) {
    LinkedList ll = new LinkedList();
        ll.insertEnd(5);
        ll.insertEnd(22);
        ll.insertEnd(10);
        ll.insertEnd(11);
//        ll.insertFirst(1);
//        ll.removeFirst();
//        ll.insertAt(10,2);
//        ll.insertAt(3,33);
//        ll.removePosition(2);
//        ll.removeLast();
//         ll.removeElement(50);
//         ll.removeElement(11);
//         ll.removePosition(2);
//         ll.reverseList();
        ll.displayList();
        ll.search(10);
    }
}