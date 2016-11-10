// Array based list

public class AList<Item> implements List61B<Item> {
    
    Item[] items;
    int size;
    
    private static int RFACTOR = 10;
    
    //creates an empty list
    public AList() {
        size = 0;
        items = (Item[]) new Object[100];
    }
    
    //resize the backing array so that it is of the given capacity
    private void resize(int campacity) {
            Item[] a = (Item[]) new Object[campacity];
            System.arraycopy(items,0,a,0,size);
            items = a;
    }
    
    //inserts x into the back of the list
    //the next item always go the size notation
    @Override
    public void insertBack(Item x) {
        if (size == items.length) {
            //dynamic array
            //resize array
            resize(size * RFACTOR);
        }
        items[size] = x;
        size += 1;
    }
    
    //returns the item from the back of the list 
    @Override
    public Item getBack() {
        int lastActualItemIndex = size - 1;
        return items[lastActualItemIndex];
    }
    
    //gets the i-th item in the list (0 is the first item)
    public Item get(int i) {
        return items[i];
    }
    
    //deletes item from back of the list and returns deleted item
    public Item deleteBack() {
        items[size - 1] = null;
        size -= size;
        Item itemToReturn = getBack();
        
        return itemToReturn;
    }
    
    //return the number of items in the list
    @Override
    public int size() {
        return size;
    }
    
}