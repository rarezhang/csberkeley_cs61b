public class Walrus {
    public int weight;
    public double tuskSize;
    
    public Walrus(int w, double ts) {
        weight = w;
        tuskSize = ts;
    }
    
    public static void doStuff(Walrus W, int x) {
        W.weight = W.weight - 200;
        x = x - 5;
    }
    
    public static void main(String[] args) {
        Walrus wss = new Walrus(3500, 50.6);
        int x = 9;
        
        doStuff(wss, x);
        
        System.out.println(wss.weight);
        System.out.println(x);

    }
}