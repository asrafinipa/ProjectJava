package OverRiding;

public class Car {
    /*
    Create a class Car with properties like make, model, and year.
Implement a method calculate_rental_price based on the number of rental days.
Create two subclasses: LuxuryCar and EconomyCar.
Override the calculate_rental_price method in LuxuryCar to include additional charges.
Demonstrate the functionality by creating instances of each class and calling their methods
     */

    String make;
    String model;
    int year;

    Car(String make, String model, int year){
    }

    public void calculate_rental_price(int numberOfDays, double rent){

        double TotalRentalCost= rent* numberOfDays;
        System.out.println("\nTotal Rental Cost "+ "for "+ numberOfDays +" days "+ " is "+ TotalRentalCost);
    }
}
class LuxuryCar extends Car{
    int AditionalCharge=250;
    LuxuryCar(String make, String model,int year){
        super(make, model, year);
    }    @Override
    public void calculate_rental_price(int numberOfDays, double rent) {
        double TotalRentalCost= rent* numberOfDays+ AditionalCharge;
        System.out.println("Total Rental Cost "+ "for " + numberOfDays +" days "+ " is "+ TotalRentalCost);
    }}
class EconomicCar extends Car{
            public EconomicCar(String make, String model, int year) {
                super(make, model, year);
            }
            @Override
            public void calculate_rental_price(int numberOfDays, double rent) {
                super.calculate_rental_price(numberOfDays, rent);
            }
        }

        class TesterCar{
            public static void main(String[] args) {
                Car c=new Car("Tesla","y",2022);
                c.calculate_rental_price(7,300);
                LuxuryCar l=new LuxuryCar("Lamborghini","sian",2021);
                l.calculate_rental_price(7,1000);
                EconomicCar e=new EconomicCar("Prius","Prime",2023);
                e.calculate_rental_price(7,330);

            }
        }
