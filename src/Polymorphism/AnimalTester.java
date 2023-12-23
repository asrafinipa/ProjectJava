package Polymorphism;

public class AnimalTester {
    public static void main(String[] args) {
        Animal a=new Animal("jackt","brown",10,12);
        Dog d=(Dog) a;
        d.bark();

        Dog d1=new Dog("jacky","bwoen",10,12);
        Cat c1=new Cat("love","white",2,10);
        Animal a1= new Animal("lacuy","red",4,6);

        Animal [] animals={d1,c1,a1};

    }
}
