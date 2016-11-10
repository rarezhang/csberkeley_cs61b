public class IntList {
    public int head;
    public IntList tail;
    
    //constructor 
    public IntList(int h, IntList t) {
        head = h;
        tail = t;
    }
    
    // return the number of integers in this Intlist, using recursion
    public int size() {
        if (tail == null) {
            // if tail is null, the list has just one item
            return 1;
        }
        
        return 1 + tail.size();
    }
    
    // return the number of integers in this Intlist, using non-recursion
    public int sizeIterative() {
        IntList p = this;
        int size = 0;
        while (p != null) {
            size = size + 1;
            p = p.tail;
        }
        return size;
    }
    
    // get the i th item from IntList
    
    /* no-recursion
    public int get(int i) {
        IntList p = this;
        while (i > 0) {
            p = p.tail; 
            i = i - 1;
        }
        return p.head;
    }
    */
    /* recursion */
    public int get(int i) {
        if (i == 0) {
            return this.head;
        }
        return this.tail.get(i-1);
    }
    
    
    // return an IntList identical to L, but with all values increamented by x
    // values in L cannot change
    public static IntList incrList(IntList L, int x) {
        if (L == null) {
            return null;
        }
        return new IntList(L.head + x, incrList(L.tail, x));
        
    }
    
    // returns an IntList identical to L, but with all values incremented by x 
    // not allowed to use `new` to save memory
    public static IntList dincreList(IntList L, int x) {
        if (L == null) {
            return null;
        }
        L.head = L.head + x;
        dincreList(L.tail, x);
        return L;


    }
    
    
    public static void main(String[] args) {
        IntList L = new IntList(5, null);
        
        /* equivalent to 
        IntList M;
        M.head = 5;
        M.tail = null;
        */
        
        L = new IntList(10, L);
        L = new IntList(15, L);
        
        
        /* print the front item */
        System.out.println(L.head);
        /* print the item after the front item */
        System.out.println(L.tail.head);
        
        //print the size of the IntList
        System.out.println("print the size of the IntList");
        System.out.println(L.size());
        //System.out.println(L.tail.size());
        
        //print the size of the intList-iteratie way 
        System.out.println(L.sizeIterative());
        
        // get the i th item from IntList
        System.out.println("get the i th item from IntList");
        System.out.println(L.get(0));
        System.out.println(L.get(1));
        System.out.println(L.get(2));
        
        // test incrList
        System.out.println("test incrList");
        IntList Q = incrList(L, 2);
        System.out.println(Q.get(0));
        System.out.println(Q.get(1));
        System.out.println(Q.get(2));
        
        // dincreList
        System.out.println("test dincreList");
        dincreList(L, 2);
        System.out.println(L.get(0));
        System.out.println(L.get(1));
        System.out.println(L.get(2));  

    }

}