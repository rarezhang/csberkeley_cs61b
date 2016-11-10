public class maxNumber {
    
    public static int max(int[] m) {
        int max_n = 0;
        for (int n : m) {
            if (n > max_n) {
                max_n = n;
            }
        }
        return max_n;
    }
    
    public static void main(String[] args) {
        int[] numbers = new int[]{9,2,15,2,22,10,6};
        int max_num = max(numbers);
        System.out.println(max_num);
    }
}