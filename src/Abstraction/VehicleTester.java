package Abstraction;

public class VehicleTester {
    public static void main(String[] args) {
        Vehicle []arr={ new Car("Cadillac","Lyriq", "Electric"),
        new Truck("Ford","F150","Gas"),
        new MotorCycle("Harley Davidson", "Road Glide","Gas")};
        for (Vehicle v:arr){
            v.printInfo();
            v.startEngine();
            v.stopEngine();
            v.fuelUp();
            System.out.println("**********************************");
        }

    }
}
