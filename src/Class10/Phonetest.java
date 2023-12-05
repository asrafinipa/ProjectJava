package Class10;

public class Phonetest {
    public static void main(String[] args) {
        Phone Samsung=new Phone();
        Samsung.brand="galaxy";
        Samsung.color="black";
        Samsung.model="smart";

        System.out.println(Samsung.brand);
        System.out.println(Samsung.color);
        System.out.println(Samsung.model);
        Samsung.takePicture();
        Samsung.call();
        Samsung.text();

        System.out.println("***************************");

        Phone Iphone=new Phone();
        Iphone.brand="Iphone";
        Iphone.color="titanium blue";
        Iphone.price=1200;
        Iphone.model="15promax";
        System.out.println(Iphone.brand);
        System.out.println(Iphone.color);
        Iphone.call();
        Iphone.takePicture();

        System.out.println("********************");

        Phone pixel=new Phone();
        pixel.color="white";
        pixel.price=1000;
        pixel.brand="google";
        System.out.println(pixel.brand);
        System.out.println(pixel.price);


    }
}
