package Inheritance;

public class MultilevelInheritance {



        public static void main(String[] args) {
            Audi a=new Audi();
            a.color="Black";
        }
    }

    class Vehicle{
        String color;
    }

    class Car extends Vehicle{
        int noOfDoors=4;
    }

    class Audi extends Car{

        boolean badEngines=true;
    }




