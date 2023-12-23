package Polymorphism;

public class Computer {
    /*

     */

    public void open(){
        System.out.println("opening");
    }
    public  void close(){
        System.out.println(" closing.....");
    }
    public void programming(){
        System.out.println(" do coding...");
    }

}
class Apple extends Computer{

    @Override
    public void programming() {
        super.programming();
    }

    public void smartGraphics(){
        System.out.println("");
    }
}
class Lenovo extends Computer{

        }