package Polymorphism;

public class Animal2Poly {
    public static void main(String[] args) {
        Dog d1=new Dog("jacky","bwoen",10,12);
        Dog d2=new Dog("micky","grey",13,18);
        Cat c1=new Cat("love","white",2,10);
        Animal a1= new Animal("lacuy","red",4,6);

        Animal [] arr={d1,d2,c1,a1};

        Animal a2=arr[1];
        a2.printInfo();
    }


}
