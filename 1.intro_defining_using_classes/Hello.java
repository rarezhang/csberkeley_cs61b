public class Hello {
    public static void main(String[] args) {
        
        // basic conditionals
        int x = 5;
        
        if (x < 10) {
            x = x + 10;
        }
        
        if (x > 10) {
            x = x - 10;
        }
        
        System.out.println(x);
        
        // else
        int y = 9;
        if (y - 3 > 8) {
            System.out.println("x-3 is greater than 8");
        }
        else {
            System.out.println("x-3 is not greater than 8");
        }
    
        // else if
        int dogSize = 20;
        if (dogSize >= 50) {
            System.out.println("woof!");
        }
        else if (dogSize >= 10) {
            System.out.println("bark!");
        }
        else {
            System.out.println("yip!");
        }
        
        // while 
        int bottles = 99;
        while (bottles > 0) {
            System.out.println(bottles + " bottles of beer on the wall.");
            bottles = bottles - 1;
        }
        
        // doubles & strings
        String a = "Achilles";
        String t = "Tortoise";
        double aPos = 0;
        double tPos = 100;
        double aSpeed = 20;
        double tSpeed = 10;
        double totalTime = 0;
        while (aPos < tPos) {
            System.out.println("At time: " + totalTime);
            System.out.println("   " + a + " is at position " + aPos);
            System.out.println("   " + t + " is at position " + tPos);
            
            double timeToReach = (tPos - aPos) / aSpeed;
            totalTime = totalTime + timeToReach;
            aPos = aPos + timeToReach * aSpeed;
            tPos = tPos + timeToReach * tSpeed;
        }
        
        // drawing a triangle
        int starNum = 1;
        String star = "*";
        while (starNum <= 5) {
            String printStar = new String(new char[starNum]).replace("\0", star);
            System.out.println(printStar);
            starNum = starNum + 1;
        }
        
        //arrays
        System.out.println("now test arrays");
        int[] numbers = new int[3];
        numbers[0] = 4;
        numbers[1] = 7;
        numbers[2] = 10;
        for (int n : numbers) {
            System.out.println(n);
        }
        
        System.out.println("simple array ");
        int[] num = {4,5,9};
        System.out.println(num.length);
        for (int n : num) {
            System.out.println(n);
        }
        for (int i=0; i < num.length; i++) {
            System.out.println(num[i]);
        }
    }
}