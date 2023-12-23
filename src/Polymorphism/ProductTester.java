package Polymorphism;

public class ProductTester {
    public static void main(String[] args) {
        Electronics e1=new Electronics(1200,"Iphone",12345445);
        Clothing c1=new Clothing(299,"Coat",123456);
        Book b1=new Book(45,"Harry potter",123456);

        Product [] arr={e1,c1,b1};
        for (int i = 0; i < arr.length; i++) {
            Product p=arr[i];
            p.PrintInfo();
            p.calculateTax();
            if (p instanceof Electronics){
                ( (Electronics)p).applyWarranty(2);
            }
            System.out.println("-----------------------------------------");
        }




    }

}
