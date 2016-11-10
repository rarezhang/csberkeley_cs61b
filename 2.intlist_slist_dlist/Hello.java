public class Hello {
    public static double average(double a, double b) {
        return (a+b)/2;
    }
    
    public static void main(String[] args) {
        int x = 12569;
        double y = 46465.55;
        
        System.out.println(x);
        System.out.println(y);
        
        double avg = average(x, y);
        System.out.println(avg);
        
        int[] a = new int[]{0, 1, 2, 95, 4};
        for(int aa : a) {
            System.out.println(aa);
        }
        
    }
}