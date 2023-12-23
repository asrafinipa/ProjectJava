package MethodOverloaded;

public class Parent {
    Parent(){
        System.out.println("Parent is born");
    }
    String name="Harun";

}
class Child extends Parent{

    Child(){
        System.out.println("child is born");
    }
    void print(){

        System.out.println(name);
    }
}
class Tester{
    public static void main(String[] args) {
        Child c=new Child();
        c.print();
    }
}