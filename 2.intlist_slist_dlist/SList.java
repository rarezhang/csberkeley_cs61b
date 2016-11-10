/* represent a list of stuff
where all the `list` work is 
delegated to a naked recursive data structure */

// <type> : `type` can be any word
// this is Generic class
public class SList<listType> {
    public class Node {
        public listType item;
        public Node next;
        
        public Node(listType i, Node h) {
            item = i;
            next = h;
        }
    }
    
    private Node sentinel;
    private int size;
    
    //create an empty list
    public SList() {
        size = 0;
        sentinel = new Node(null, null);
    }
    
    //create a list with one item
    public SList(listType x) {
        size = 1;
        sentinel = new Node(null, null);
        sentinel.next = new Node(x, null);
    }
    
    //adds an item from the front 
    public void insertFront(listType x) {
        size += 1;
        sentinel.next = new Node(x, sentinel.next);
    }
    
    //gets the front item of the list
    public listType getFront() {
        return sentinel.next.item;
    }   

    
    //puts an item at the back of the list
    public void insertBack(listType x) {
        size += 1;
        Node p = sentinel;
        //move p until it reaches the end
        while (p.next != null) {
            p = p.next;
        }
        p.next = new Node(x, null);
    }
    
    //returns the back node of list
    private Node getBackNode() {
        Node p = sentinel;
        while (p.next != null) {
            p = p.next;
        }
        return p;        
    }
    
    //returns last item
    public listType getBack() {
        Node back = getBackNode();
        return back.item;
    }
    
    //return size
    public int size() {
        return size;
    }    
}