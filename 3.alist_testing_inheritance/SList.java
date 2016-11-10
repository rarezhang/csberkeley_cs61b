/* represent a list of stuff
where all the `list` work is 
delegated to a naked recursive data structure */

// <type> : `type` can be any word
// this is Generic class
public class SList<Item> implements List61B<Item> {
    public class Node {
        public Item item;
        public Node next;
        
        public Node(Item i, Node h) {
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
    public SList(Item x) {
        size = 1;
        sentinel = new Node(null, null);
        sentinel.next = new Node(x, null);
    }
    
    //adds an item from the front 
    @Override
    public void insertFront(Item x) {
        size += 1;
        sentinel.next = new Node(x, sentinel.next);
    }
    
    //gets the front item of the list
    @Override
    public Item getFront() {
        return sentinel.next.item;
    }   

    
    //puts an item at the back of the list
    @Override
    public void insertBack(Item x) {
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
    @Override
    public Item getBack() {
        Node back = getBackNode();
        return back.item;
    }
    
    //return size
    @Override
    public int size() {
        return size;
    }    
}