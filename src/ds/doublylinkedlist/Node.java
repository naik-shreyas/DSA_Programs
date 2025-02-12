package ds.doublylinkedlist;

public class Node {
    public int data;
    public Node next;
    public Node previous;

    public Node()
    {
        this.next = null;
        this.previous=null;
    }

    public void displayNode(){
        System.out.println("{" + data + "}");
    }
}
