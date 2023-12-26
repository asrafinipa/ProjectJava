package Abstraction;

public abstract class Animal {
    private String name;
    private String color;
    static int noOfLegs=4;

    public abstract void eat();

    void sleep(){
        System.out.println(" Animal sleep");
    }
    public abstract void speak();

}
class  Dog extends Animal{
    public  void eat(){
        System.out.println("dog like to eat meat");
    }
    public void speak(){
        System.out.println(" woof woof");
    }

}
class Cat extends Animal{
    @Override
    public void speak() {
        System.out.println(" mewo meow");
    }

    @Override
    public void eat() {
        System.out.println("cat eat fish");
    }
}






