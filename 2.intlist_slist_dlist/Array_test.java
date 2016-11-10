/* Arrays
length N: cannot change
a sequence of N memory boxes
all the boxes hold the same type of value & same number of bits
box number: 0 through N-1
can access box i with bracket notation array[i]
*/

import java.util.Arrays;

public class Array_test {
    public static void main(String[] args) {
        /*
        // 1D array
        int[] x, y;
        
        y = new int[3];
        x = new int[]{1,2,3,4,5};
        int[] w = {5,6,7,8};
        System.out.println(y);
        System.out.println(x);
        System.out.println(w);
        */
        
        // 2D array
        int[][] x = {{1,2,3},{4,5,6},{7,8,9}};
        
        int[][] z = new int[3][];
        z[0] = x[0];
        z[1] = x[1];
        z[2] = x[2];
        z[0][0] = -z[0][0];
        
        System.out.println(Arrays.deepToString(x));
        System.out.println(Arrays.deepToString(z));
        
        int[][] w = new int[3][3];
        System.arraycopy(x[0], 0, w[0], 0, 3);
        System.arraycopy(x[1], 0, w[1], 0, 3);
        System.arraycopy(x[2], 0, w[2], 0, 3);
        w[0][0] = -w[0][0];
        System.out.println(Arrays.deepToString(w));
        
        

        
    }
}