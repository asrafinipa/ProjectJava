package Polymorphism;
    /*
   E-Commerce System Task: Build a Product class with subclasses like Electronics, Clothing, Furniture, and Books.
Define attributes like price, name, and SKU in the Product class.
Override methods such as calculateTax based on product category.
Introduce unique methods like applyWarranty in Electronics.
Create objects of each subclass, store them in an array, and loop through to display or calculate prices and taxes.

/*bob was here
     */

public class Product {
     double price;
    private String name;
    private int SKU;
    public Product(double price, String name, int SKU) {
        this.price = price;
        this.name = name;
        this.SKU = SKU;
    }
    void PrintInfo(){
        System.out.println(name+" " +price+" " +SKU);
    }
    public void calculateTax(){
        double taxRate=0.6;
        double finalPrice= price + (price* taxRate);
        System.out.println("Before tax, price was: " + price + " After tax, Final Price: " + finalPrice);
    }
    }
class Electronics extends Product{
    Electronics(double price, String name, int SKU){
        super(price, name, SKU);
    }
    @Override
    void PrintInfo() {
        super.PrintInfo();
    }
    public void calculateTax(){
         this. price= price;
        double tRate = 0.075;
        double finalPrice=price + (price * tRate);
        System.out.println("Before tax, price was: " +price  + " After tax, Final Price: " + finalPrice);
    }
    public void applyWarranty(int year){
        System.out.println("All electronics have warranty for 1 years ");
    }

}
class Clothing extends Product {
    Clothing(double price, String name, int SKU) {
        super(price, name, SKU);
    }

    @Override
    void PrintInfo() {
        super.PrintInfo();
    }

    public void calculateTax() {
        this.price=price;
        double taxRate = 0.050;
        double finalPrice = price + (price * taxRate);
        System.out.println("Before tax, price was: " + price + " After tax, Final Price: " + finalPrice);
    }
}

class Book extends Product {
    Book(double price, String name, int SKU) {
            super(price, name, SKU);
        }
        @Override
        void PrintInfo() {
            super.PrintInfo();
        }
        public void calculateTax() {
        this.price=price;
            double taxRate = 0.025;
            double finalPrice = price + (price * taxRate);
            System.out.println("Before tax, price was: " + price + " After tax, Final Price: " + finalPrice);
    }
}

