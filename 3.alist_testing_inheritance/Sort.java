public class Sort {
    
    //returns the index of the smallest string starting with k
    //([0,2,3],1) --> 1 --> index of `2`
    public static int indexOfSmallest(String[] inputs, int k) {
        int minDex = k;
        for (int i = k; i < inputs.length; i += 1) {
            int cmp = inputs[i].compareTo(inputs[minDex]);
            if (cmp < 0) {
                minDex = i;
            }
        }
        return minDex;
    }
    
    private static void swap(String[] input, int a, int b) {
        String temp = input[a];
        input[a] = input[b];
        input[b] = temp;
    }
    
    //returns inputs in sorted order
    //sorting only the last k items
    //this is a helper method for Sort.sort
    //([5,3,8,1], 1) --> [5,1,3,8]
    private static String[] sort(String[] inputs, int k) {
        if (k == inputs.length) {
            return inputs;
        }
        int minDex = indexOfSmallest(inputs, k);
        swap(inputs, k, minDex);
        return sort(inputs, k+1);
    }
    
    //return inputs in sorted order 
    public static String[] sort(String[] inputs) {
        //find smallest item
        //move smallest item to front
        //sort rest of the stuff
        //need a helper method
        return sort(inputs, 0);
    }
    
    //prints out strings
    public static void print(String[] inputs) {
        
    }
    
    //prints out the args in order
    public static void main(String[] args) {
        
    }
}