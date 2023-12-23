package OverRiding;

public class Product {

    /*
    Online Shopping Cart:
Construct a class Product with attributes like product_name, price, and quantity.
Create a subclass DiscountedProduct that extends Product and includes an additional discount_rate attribute.
Override a method in DiscountedProduct to calculate the price after applying the discount.
Create instances of both classes and show how prices are calculated
     */
    String name;
    int price;
    int quantity;

    Product(){

    }
    public void CalculatePrice(String name,double price, int quantity){
       double TotalPrice=price*quantity;
        System.out.println("\nTotalPrice for "+ name+ " is "+ TotalPrice);
    }

}
class DiscountedProduct extends Product{
    int additinal_discount=10;
    DiscountedProduct(){

    }

    @Override
    public void CalculatePrice(String name, double price, int quantity) {
        double TotalPrice=price*quantity-additinal_discount;
        System.out.println("Discounted price for "+ name+ " is "+ TotalPrice);
    }
}
class ProductTester{
    public static void main(String[] args) {
        Product p=new Product();
        p.CalculatePrice("Blanket",100,2);
        DiscountedProduct d=new DiscountedProduct();
        d.CalculatePrice("cookie",5,10);
    }
}
