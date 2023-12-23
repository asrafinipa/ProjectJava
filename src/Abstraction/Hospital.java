package Abstraction;

import Abstraction1.Orthodotist;

public class Hospital {
    public static void main(String[] args) {
        Abstraction.Doctor.hospital = "Inova";
        Surgeon surgeon = new Surgeon("John", "dow", "Surgeon", 23, "DC");
        surgeon.checkVitals();// parent class
        surgeon.checkVitals("jane");//parent class
        surgeon.precribeMedicine("smith");// child class
        Surgeon.work();// accessing static method from parent class in static way using child className
        Doctor.work();// accessing static method in static way from the class where it was defined

        Orthodotist ortho = new Orthodotist("Josh", "sdg", "orthdontist", 23);
        ortho.work();
        ortho.checkVitals();//parent
        ortho.precribeMedicine("pain Killers");//child
        ortho.printSpeciality();//child
    /*
    Polymorphism in java:
    1. Compile Time/static Binding/Early Binding
    Achieve through method overloading
    2. Runtime/ Dynamic Binding/Late Binding
     Achieve through method overriding
     */
        System.out.println("  ------------------------------------------   ");
        Doctor ortho1=new Orthodotist("Josh", "Smith", "Orthodontist", 15);
        ortho1.checkVitals();
        ortho1.checkVitals("Michael");

        //we are achiving a runtime poly through method overriding
        // during run time Java gives preference to the object type(in this case it onject of child class)
        ortho1.precribeMedicine("Pills"); //java executed child class method

        Doctor sur=new Surgeon("John", "Doe", "Surgeon", 20, "Fairfax, VA");
        sur.checkVitals();
        sur.checkVitals("Mohammed");
        sur.precribeMedicine("pills");

    }
}