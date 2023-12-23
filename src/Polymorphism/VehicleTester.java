package Polymorphism;

public class VehicleTester {

    public static void main(String[] args) {
        Car c1=new Car(90,"black","gas");
        Truck t1= new Truck(100,"white","electric");
        Motorcycle m1=new Motorcycle(70,"black","gas");
        Bicycle b1=new Bicycle(20,"blue","no fuel ");

        Vehicle [] arr={c1,t1,m1,b1};
        for (Vehicle r:arr){
            r.Drive();
            r.brake();
            r.accelarater();
            if (r instanceof Truck ){
                ((Truck) r).loadcargo();
            }
            System.out.println("..............");
        }

        }
    }

