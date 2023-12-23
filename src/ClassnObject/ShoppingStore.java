package ClassnObject;

    /*
    Create variables as below.
- item,
- price,
- quantity
Create a constructor to initialize instance variables.
Create a method with name itemTotalPrice.
write a logic to calculate the total price of items in stock. and print the result.
return the total value.//??
**In Main Class.**
Create two Object of ShoppingStore and pass the parameters to Constructor.
then using each object call the method itemTotalPrice.
Store the returned value of each object.
Calculate sum of both object and print the result.
Output:```
Blanket Total Value 99.98```
Mattress Total Value 439.18```
You purchased 539.16 Today```
     */
public class ShoppingStore {
    String item;
    int price;
    int quantity;
    ShoppingStore(String item, int price, int quantity) {
        this.item = item;
        this.quantity = quantity;
        this.price = price;
    }
    public double itemTotalPrice(){
        double total_Value=quantity*price;
        System.out.println( item + " Total value "+ total_Value);
        return total_Value;
    }
}

class ShoppingStoreTester{
    public static void main(String[] args) {
        ShoppingStore blanket= new ShoppingStore("Blanket",120,4);
        double BlanketTotal=blanket.itemTotalPrice();
        ShoppingStore mattress= new ShoppingStore("Mattress",500,2);
        double Mattress_Total=mattress.itemTotalPrice();
        System.out.println("You purchased "+ (BlanketTotal+Mattress_Total)+ " Today");

    }
}
