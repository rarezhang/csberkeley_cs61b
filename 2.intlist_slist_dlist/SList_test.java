/* an SList is a list of integers that can be expanded arbitrarily 
all the real work is done by Node */


public class SList_test {
    
    //public IntNode
    public IntNode sentinel;
    
    public int size;
    
    // use `sentinel node`: so `add front` or `add back` will be the same even there it is an empty list
    
    
    // create a new SList of size 1
    public SList_test(int x) {
        sentinel = new IntNode(-999, null);
        sentinel.next = new IntNode(x, null);
        size = 1;
    }
    
    // can also create an empty list easily
    public SList_test() {
        sentinel = new IntNode(-999, null);
        size = 0;
    }

    
    public void insertFront(int x) {
        sentinel.next = new IntNode(x, sentinel.next); 
        size += 1;        
     
    }
    
    public int getFront() {
        return sentinel.next.item;
    }
    
    public void insertBack(int x) {
        IntNode p = sentinel;
        
        // advance p to the end of the list
        while (p.next != null) {
            p = p.next;
        }
        p.next = new IntNode(x, null);
        size += 1;
    }
    
    /**
    // when writing recursive methods, usually create a private helper method that deals with them directly 
    private static int intNodeSize(IntNode n) {
        if (n.next == null) {
            return 1;
        }
        return 1 + intNodeSize(n.next);
    }    
    public int size() {
        
        //if (front.next == null) {
            return 1;
        }
        // return 1 + front.next.size(); // this is wrong, because IntNode dose not have size() method
        return intNodeSize(front);
        
    }
    
    //non recursive version
    public int size() {
        IntNode p = front;
        int s = 1;
        while (p.next != null) {
            p = p.next;
            s += 1;
        }
        return s;
    }
    **/
    
    // keep track size, always fast to get size
    public int size() {
        return size;
    }
    
    public static void main(String[] args) {
        SList s1 = new SList(10);
        s1.insertFront(5);
        s1.insertFront(0);
        
        s1.insertBack(15);
        
        System.out.println(s1.getFront());
        System.out.println(s1.size());
        
    }
    

}