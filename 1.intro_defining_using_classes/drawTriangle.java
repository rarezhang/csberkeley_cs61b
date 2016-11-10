public class drawTriangle {
    public static void triangle(int n) {
        String star = "*";
        int numStar = 1;
        while (numStar <= n) {
            String printStar = new String(new char[numStar]).replace("\0", star);
            System.out.println(printStar);
            numStar = numStar + 1;
        }
    }
    
    public static void main(String[] args) {
        int N = 10;
        triangle(N);
    }
}