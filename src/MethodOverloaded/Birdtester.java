package MethodOverloaded;

public class Birdtester {
    public static void main(String[] args) {
        Bird b=new Bird("Cardinal","red,"," medium"," lalala");
        b.printinfo();
        Sparrow s=new Sparrow("House Sparrow","brown,","small","twit twit");

        s.printinfo();
        parrot p=new parrot("Maccaw", "vibrant,","large","crawk crawk");
        p.printinfo();

    }
}
