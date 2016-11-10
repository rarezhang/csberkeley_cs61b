//test the Sort class
import org.junit.Test;
import static org.junit.Assert.*;

public class TestSort {
    //tests the Sort.sort method
    //@org.junit.Test
    @Test
    public static void testSort() {
        String[] inputs = {"milvia", "zero", "josh", "trump"};
        String[] expected = {"josh", "milvia", "trump", "zero"};
        String[] actual = Sort.sort(inputs);
        
        org.junit.Assert.assertArrayEquals(expected, actual);
    }
    
    //@org.junit.Test
    @Test
    public static void testIndexOfSmallest() {
        String[] inputs = {"milvia", "zero", "josh", "trump"};       
        int expected = 2; // index of "josh"
        int actual = Sort.indexOfSmallest(inputs, 2);
        assertEquals(expected, actual);
        
        expected = 3; 
        actual = Sort.indexOfSmallest(inputs, 3);
        assertEquals(expected, actual);
    }
    
    public static void main(String[] args) {
        testSort();
        testIndexOfSmallest();
        
    }

}