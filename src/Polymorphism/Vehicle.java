package Polymorphism;

public class Vehicle {
    /*
     Vehicle Hierarchy Task: Create a class Vehicle with subclasses like Car, Truck, Motorcycle, and Bicycle.
Define common attributes like speed, color, and fuelType in the Vehicle class.
Override methods in the subclasses, like accelerate and brake, with specific behaviors.
Add unique methods in subclasses, like loadCargo in Truck.
Instantiate objects of each subclass and store them in an array. Iterate through the array to demonstrate polymorphism.
     */
    int speed;
    String color;
    String fuelType;
    Vehicle(int speed, String color,String fuelType ){
        this.speed=speed;
        this.color=color;
        this.fuelType=fuelType;
    }
    public void Drive(){
        System.out.println("speed: "+ speed+ " color "+color+" fueltype: "+ fuelType);
    }
    public  void accelarater(){
        System.out.println("accelearte..");
    }
    public  void brake(){
        System.out.println("brake..");
    }
}
class Car extends Vehicle {
    Car(int speed, String color, String fuelType) {
        super(speed, color, fuelType);
    }
    @Override
    public void accelarater() {
        System.out.println("Can pickup 60mph in 6 sec..");
    }
    @Override
    public void brake() {
        System.out.println("have auto brake feature..");
    }
}
class Truck extends Vehicle {
    Truck(int speed, String color, String fuelType) {
        super(speed, color, fuelType);
    }
    @Override
    public void accelarater() {
        System.out.println("Truck can pickup 70 mph in 8sec ");
    }
    @Override
    public void brake() {
        System.out.println("Truck's break is down..");
    }
    public void loadcargo() {
        System.out.println("can load 1 ton of load..");
    }
}
class  Motorcycle extends Vehicle{
Motorcycle(int speed, String color,String fuelType){
    super(speed,color,fuelType);
}
   @Override
    public  void accelarater(){
        System.out.println("Start accelarating  ");
    }@Override
    public  void brake(){
        System.out.println("slowly stopping ");
    }
}class  Bicycle extends Vehicle{
Bicycle(int speed, String color,String fuelType){
    super(speed,color,fuelType);
}
    @Override
    public  void accelarater(){
        System.out.println("biCycle accelaration is slow ");
    }@Override
    public  void brake(){
        System.out.println("brake is not like car ");
    }
}
