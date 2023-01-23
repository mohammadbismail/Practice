public class CircularLinkedList {
    // reference
    // https://www.javatpoint.com/java-program-to-create-and-display-a-circular-linked-list
    public class Node {
        int data;
        // without data assigned to Node, its a pointer in memeory
        Node next;
        // Node prev;

        public Node(int data) {
            this.data = data;
        }
    }

    public Node head = null;
    public Node tail = null;

    public void add(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
            newNode.next = head;
        } else {
            tail.next = newNode;
            tail = newNode;
            tail.next = head;
        }
    }
}