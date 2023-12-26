package Abstraction;

public abstract class Vehicle {
    /*
    Vehicle Management System: Design a base class Vehicle with methods like startEngine(), stopEngine(), fuelUp(),
    and fields like make, model, and fuelLevel.
    Create subclasses like Car, Truck, and Motorcycle, each with specific implementations for the methods,
    considering their unique characteristics.
     */
    private String make;
    private String model;
    private String fuelLevel;

    Vehicle(String make,String model, String fuelLevel){
        this.make=make;
        this.model=model;
        this.fuelLevel=fuelLevel;
    }
    void printInfo(){
        System.out.println(make+ " "+model+" "+ fuelLevel);
    }
    public abstract void startEngine();
    public abstract void stopEngine();
    public abstract void fuelUp();
}
class Car extends Vehicle{
    Car(String make,String model,String fuelUp){
        super(make,model,fuelUp);
    }
    @Override
    public void startEngine() {
        System.out.println("My car has auto start engine ");
    }
    @Override
    public void stopEngine() {
        System.out.println("My Car stop engine running when its waiting on red light");
    }
    @Override
    public void fuelUp() {
        System.out.println("My car is a electric vehicle");
    }
}
class Truck extends Vehicle{
    Truck(String make, String model, String fuelLevel) {
        super(make, model, fuelLevel);
    }
    @Override
    public void startEngine() {
        System.out.println("Truck engine is so strong");;
    }
    @Override
    public void stopEngine() {
        System.out.println("truck stopping ");
    }
    @Override
    public void fuelUp() {
        System.out.println("Truck needs lots of fuel");;
    }
}
class MotorCycle extends Vehicle{

    MotorCycle(String make, String model, String fuelLevel) {
        super(make, model, fuelLevel);
    }

    @Override
    public void startEngine() {
        System.out.println("MotorCycle engine starting..vroom vroom ");
    }

    @Override
    public void stopEngine() {
        System.out.println("MotorCycle engine stopping ..");
    }

    @Override
    public void fuelUp() {
        System.out.println("MotorCycle fuel goes long way");
    }
}