package ds.doublylinkedlist;

public class DoublyLinkedList {
    private Node first;
    private Node last;

    public DoublyLinkedList() {
        this.first = null;
        this.last = null;
    }

    public boolean isEmpty() {
        return (first == null);
    }

    public void insertFirst(int data) {
        Node newNode = new Node();
        newNode.data = data;
        if (isEmpty()) {
            last = newNode;
        } else {
            first.previous = newNode;
        }
        newNode.next = first;
        this.first = newNode;
    }

    public void insertLast(int data) {
        Node newNode = new Node();
        newNode.data = data;
        if (isEmpty()) {
            first = newNode;
        } else {
            last.next = newNode;
        }

        newNode.previous = last;
        this.last = newNode;
    }

    //assume non-empty list
    public Node deleteFirst() {
        Node temp = first;
        if (first.next == null) {
            last = null;
        } else {
            first.next.previous = null;
        }
        first = first.next;
        return temp;
    }

    //assume non-empty list
    public Node deleteLast() {
        Node temp = last;
        if (first.next == null) {
            first = null;
        } else {
            last.previous.next = null;
        }
        last = last.previous;
        return temp;
    }

    //assume non-empty list
 /*   public boolean insertAfter(int key, int data) {
        Node newNode = new Node();
        newNode.data = data;

        Node current = first;

        while (current.data != key) {
            current = current.next;
            if (current == null) {
                return false;
            }
        }

        if (current.next == null) {
            last = newNode;
            newNode.next = null;
        } else {
            newNode.next = current.next;
            current.next.previous = newNode;
        }
        current.next = newNode;
        newNode.previous = current;
    }
*/
}