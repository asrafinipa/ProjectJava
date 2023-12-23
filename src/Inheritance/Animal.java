package Inheritance;

public class Animal {
    String name;
    String color;
    int age;
    double weight;

    void sleep(){
        System.out.println("zzzzz");
    }

    public  void printinfo(){
        System.out.println(name+ " "+age+ ""+ color+ " "+ weight);
    }

}
