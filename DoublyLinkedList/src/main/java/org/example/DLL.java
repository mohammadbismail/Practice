package org.example;

public class DLL {
    Node head, tail;
    int size = 0;

    public boolean isEmpty() {
        return size == 0;
    }

    public void empty() {
        System.out.println("List is empty");
    }

    public void insertFirst(int data) {
        Node newNode = new Node(data);
        if (isEmpty()) {
            head = tail = newNode;
            newNode.next = newNode.prev = null;
        } else {
            newNode.next = head;
            newNode.prev = null;
            head = newNode;
        }
        size++;
    }

    public void insertLast(int data) {
        Node newNode = new Node(data);
        if (isEmpty()) {
            head = tail = newNode;
            newNode.next = newNode.prev = null;
        } else {
            // newNode next pointer --> null
            newNode.next = null;
            // newNode prev pointer --> tail
            newNode.prev = tail;
            // tail next pointer --> newNode
            tail.next = newNode;
            // shift tail by One node to point at last Node.
            tail = tail.next;
        }
        size++;
    }

    public void insertAtPosition(int pos, int data) {
        Node newNode = new Node(data);
        if (pos < 0 || pos > size) {
            System.out.println("Invalid Position");
        } else if (pos == 0) {
            insertFirst(data);
            size++;
        } else if (pos == size) {
            insertLast(data);
        } else {

            Node curr = head;
            // start from 1 since 0 case is handled with if
            for (int i = 1; i < pos; i++) {
                // keep shifting curr pointer until pos is found (exit from loop at one node behind)
                curr = curr.next;
            }
            // connecting
            newNode.next = curr.next;
            newNode.prev = curr;
            curr.next = newNode;
            curr.next.prev = newNode;
            size++;
        }
    }

    public void deleteFirst() {
        if (size == 0) {
            empty();
        } else if (size == 1) {
            head = tail = null;
            size--;
        } else {
            head = head.next;
            head.prev = null;
            size--;
        }
    }

    public void deleteLast() {
        if (size == 0) {
            empty();
        } else if (size == 1) {
            head = tail = null;
            size--;
        } else {
            tail = tail.prev;
            tail.next = null;
            size--;
        }
    }

    public void deleteElement(int element) {
        if (isEmpty()) {
            empty();
            return;
        } else if (head.data == element) {
            deleteFirst();
            size--;
        } else {
            Node curr = head.next;
            while (curr != null) {
                if (curr.data == element) {
                    // shift current to required Node and end loop
                    curr = curr.next;
                    break;
                }
            }
            // if this curr did reach null without finding
            if (curr == null) {
                System.out.println("Item is not found!");
                // if the next of this current is null, means element is found at last node
            } else if (curr.next == null) {
                deleteLast();
                size--;
                // else element is found in middle
            } else {
                curr.prev.next = curr.next;
                curr.next.prev = curr.prev;
                size--;
            }
        }
    }

    public void deleteAtPos(int pos) {
        if (pos < 0 || pos > size) {
            System.out.println("Invalid position");
            return;
        }
        if (isEmpty()) {
            empty();
        }
        if (pos == 0) {
            deleteFirst();
            size--;
            return;
        }
        if (pos == size) {
            deleteLast();
            size--;
            return;
        }
        Node curr = head;
        for (int i = 1; i < pos; i++) {
            curr = curr.next;
        }
        // after stepping at the node just before our node
        curr.next = curr.next.next;
        size--;
    }

    public void reverseList() {
        if (isEmpty()) {
            empty();
        } else {
            Node curr = head;
            Node temp = null;
            while (curr != null) {
                temp = curr.next;
                curr.next = curr.prev;
                curr.prev = temp;
                curr = curr.prev;
            }
            temp = head;
            head = tail;
            tail = temp;

        }
    }


    public void displayList() {
        if (isEmpty()) {
            empty();
        } else {
            Node curr = head;
            System.out.println(" ");
            System.out.print("Items in list: \n[ ");
            while (curr != null) {
                System.out.print(curr.data + " -> ");
                curr = curr.next;
            }
            System.out.println("null ]");
        }
    }
}
