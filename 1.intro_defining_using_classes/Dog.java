public class Dog {
    
    public int size;
    
    /* constructor, how to construct dog */
    
    public Dog(int s) {
        this.size = s;
    }
    
    
    public void makeNoise() {
        if (this.size < 20) {
            System.out.println("yapping");
        }
        else if (this.size < 50) {
            System.out.println("Bark!");
        }
        else {
            System.out.println("arwoooo");
        }        
    }
    
    // static method
    public static Dog maxDog(Dog d1, Dog d2) {
        if (d1.size > d2.size) {
            return d1;
        }
        else {
            return d2;
        }
    }
    
    
    // non-static method
    public Dog maxDog2(Dog otherDog) {
        if (this.size > otherDog.size) {
            return this;
        }
        else {
            return otherDog;
        }
    }
    

}