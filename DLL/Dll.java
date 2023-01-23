// reference 
// https://www.softwaretestinghelp.com/doubly-linked-list-in-java/
public class Dll {
    class Node {
        int item;
        Node next;
        Node prev;

        public Node(int d) {
            this.item = d;
        }
    }

    // initially head & tail nodes have null values
    Node head, tail = null;

    // adding node to list
    public void addNode(int item) {
        Node newNode = new Node(item);
        // if list is empty, head and tail points to newNode
        if (head == null) {
            head = tail = newNode;
            // head prev will be null
            head.prev = null;
            // tail next will be null
            tail.next = null;
        }
        // else add new node
        else {
            //add newNode to the end of list. tail->next set to newNode
            tail.next = newNode;
            //newNode->previous set to tail  
            newNode.prev = tail;
            //newNode becomes new tail 
            tail = newNode;
            //tail's next point to null 
            tail.next = null;
        }
    }
}
