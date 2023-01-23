package org.example;

public class LinkedList {
    private Node head;
    private Node tail;
    private int size = 0;

    public boolean isEmpty() {
        return size == 0;
    }

    public void insertFirst(int data) {
        Node newNode = new Node(data);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
        size++;
    }

    public void insertEnd(int data) {
        Node newNode = new Node(data);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            tail = tail.next;
        }
        tail.next = null;
        size++;
    }

    public void displayList() {
        if (isEmpty()) {
            System.out.print("List is empty");
        } else {
            System.out.println("Start of LinkedList");
            Node curr = head;
            while (curr != null) {
                System.out.println(curr.data);
                curr = curr.next;
            }
            System.out.printf("End of LinkedList and Size is: %d\n", size);
        }
    }

    public void insertAt(int pos, int data) {
        if (pos < 0 || pos > size) {
            System.out.println("Invalid index!");
        } else if (pos == 0) {
            insertFirst(data);
        } else if (pos == size) {
            insertEnd(data);
        } else {
            Node newNode = new Node(data);
            Node curr = head;
            for (int i = 1; i < pos; i++) {
                curr = curr.next;
            }
            newNode.next = curr.next;
            curr.next = newNode;
            size++;
        }
    }

    public void removeFirst() {
        if (isEmpty()) {
            System.out.print("List is empty!");
        } else if (size == 1) {
            head = tail = null;
            size--;
        } else {
            head = head.next;
            size--;
        }
    }

    public void removeLast() {
        if (isEmpty()) {
            System.out.println("List is empty");
        } else if (size == 1) {
            head = tail = null;
            size--;
        } else {
            Node curr = head.next;
            Node prev = head;
            while (curr != tail) {
                prev = curr;
                curr = curr.next;
            }
            tail = prev;
            tail.next = null;
            size--;
        }
    }

    public void removeElement(int elementToDelete) {
        if (isEmpty()) {
            System.out.println("List is empty");
        }
        Node curr, prev;
        if (head.data == elementToDelete) {
            head = head.next;
            size--;
        } else {
            curr = head.next;
            prev = head;
            // while element is not found && curr didn't reach end yet, keep traversing through nodes ( keep shifting these two pointer one step)
            while (curr != null && curr.data != elementToDelete) {
                prev = curr;
                curr = curr.next;
            }
            // it will go outside this loop if element is found or curr reached null
            if (curr == null) {
                System.out.println("Element is not found!");
                // if element is found at tail
            } else if (curr == tail) {
                // step back tail pointer to point to prev
                tail = prev;
                // remove the next of tail/prev which is element curr is pointing to which is last element
                tail.next = null;
                // if element is found at middle
            } else {
                // shift prev by making the next of it points to next of curr (curr pointer element is skipped & deleted)
                prev.next = curr.next;
                curr = curr.next;
            }

        }

    }

    public void removePosition(int pos) {
        Node curr = head;
        if (pos < 0 || pos > size) {
            System.out.println("Invalid position");
        } else if (pos == 0) {
            removeFirst();
        }
        for (int i = 0; i < pos; i++) {
            curr = curr.next;
        }
        curr.next = curr.next.next;
        size--;
    }

    public void reverseList() {
        Node prev,curr,next;
        prev = null;
        curr = head;
        next = curr.next;
        if (isEmpty()) {
            System.out.println("List is empty");
        }
        else{
            while(next != null){
                // || curr!= null
                // Next pointer holds the rest nodes
                next = curr.next;
                // curr pointer points to prev location which is null at begin
                // here cut has been made
                curr.next = prev;
                // move prev step front to point at curr location
                prev = curr;
                //move curr one step to point at next location
                curr = next;
            }
            // curr & next are at null, prev is at the last element, then make head points to this last elem
            head= prev;
        }
    }
    public int search(int element){
        Node curr = head;
        int pos = 0;
        while(curr != null){
            if (curr.data == element){
                System.out.printf("Item %d is found at location %d\n",element,pos);
                return pos;
            }
            curr = curr.next;
            pos++;
        }
        return -1;
    }
}



