/** the DogLaucher class will test drive the Dog class **/

public class DogLaucher {
    public static void main(String[] args) {
        Dog maya = new Dog(1000);
        
        Dog smallDog;
        smallDog = new Dog(5);
        
        // array of 2 dogs
        Dog[] someDogs = new Dog[2];
        someDogs[0] = new Dog(10);
        someDogs[1] = new Dog(105);

        maya.makeNoise();
        smallDog.makeNoise();
        
        someDogs[0].makeNoise();
        someDogs[1].makeNoise();
        
        Dog bigDog = new Dog(0);
        bigDog = Dog.maxDog(someDogs[0], someDogs[1]);
        System.out.println(bigDog.size);
        
        Dog bigDog2 = bigDog.maxDog2(smallDog);
        System.out.println("what is this"+bigDog2.size);
    }
}
