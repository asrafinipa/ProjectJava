package MethodOverloaded;

public class Vehicle {

    /*
    Create a class named Vehicle. If no arguments are passed while creating an object of the class,
    it should print "I love vehicles". If a String representing the type of vehicle (like "Car", "Bike") is passed,
    it should print "I love [VehicleType]".
    For example, if "Car" is passed, it should print "I love Car"
     */

    public static void vehicle(){
        System.out.println(" I love vehicle");
    }
    public static void vehicle(String x){
        System.out.println(" I love"+ x);
    }
    public static void vehicle(String y, String z){
        System.out.println("I love"+ y+ z);
    }

    public static void main(String[] args) {
        Vehicle v=new Vehicle();
        v.vehicle();
        v.vehicle(" Car ");
        vehicle(" both Car"," & Bike");
    }

}
