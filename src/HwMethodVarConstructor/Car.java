package HwMethodVarConstructor;

public class Car {
    /*
     1. Complete the Car.java class:

Create the following variable (**Choose proper datatype**)
* make
* model
* numberOfDoors
* topSpeed
* price

following the proper naming convention for variables.
Write four constructors:

* The first constructor(with all parameters)
* A secondary constructor Have all parameters **except numberOfDoors. (**numberOfDoors value should assign to 4 inside constructor)
* A third constructor Have all parameters **except make and model .** **(**make and model value should assign to "unknown" inside constructor)
* A fourth constructor Have all parameters **except topSpeed and price**;**(**topSpeed value should assign to "90" and price value should be assign to 0 inside constructor)

Create a display method in Cars class to print the class variable value in console.

2. Test your code with the Main.java class:

Create several Car objects using all Constructors.
then call display method with each object.

Output:```
Toyota Prius 4 120 30000.0
Toyota Prius 4 120 30000.0
unknown unknown 4 120 30000.0
Toyota Prius 4 90 0.0
     */

public String make;
public String model;
public int numOfDoors;
public int topSpeed;
public double price;

Car (String make, String model, int numOfdoor,int speed,double price){
    this.make=make;
    this.model=model;
    this.numOfDoors=numOfdoor;
    this.topSpeed=speed;
    this.price=price;
}
Car (String make, String model, int speed,double price){
    this.make=make;
    this.model=model;
    this.numOfDoors=4;
    this.topSpeed=speed;
    this.price=price;
}
Car(int numOfdoor,int speed, double price){
    this.make="unknown";
    this.model="unknown ";
    this.numOfDoors=numOfdoor;
    this.topSpeed=speed;
    this.price=price;
}
Car(String make,String model,int numOfDoors ){
    this.make=make;
    this.model=model;
    this.numOfDoors=numOfDoors;
    this.topSpeed=90;
    this.price=0;
}

void displayinfo(){
    System.out.println(make+" "+ model+""+ numOfDoors+" "+ topSpeed+ " "+price);
}

    public static void main(String[] args) {
        Car c1=new Car("Toyota", "Prius ",4,120,30000.00);
        Car c2=new Car("Toyota","Prius ",120,30000.0);
        Car c3=new Car(4,120,30000.0);
        Car c4=new Car("Toyota","Prius ",4);
        c1.displayinfo();
        c2.displayinfo();
        c3.displayinfo();
        c4.displayinfo();
    }




















}
