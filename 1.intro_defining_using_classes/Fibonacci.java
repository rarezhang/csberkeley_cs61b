public class Fibonacci {
    public static int fib(int n){
        int fib_forward = 0;
        int fib_after = 1;
        while (n > 0) {
            int temp = fib_forward;
            fib_forward = fib_after;
            fib_after = temp + fib_after; 
            
            n = n - 1;

        }
        return fib_after;
    }
    
    
    public static void main(String[] args) {
        int n = 7;
        int fib_n = fib(n); 
        System.out.println(fib_n);
    }
}