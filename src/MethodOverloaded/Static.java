package MethodOverloaded;

public class Static {
    /*Create 1 class with a static method that has 3 overloaded forms.
    Then call each overloaded method with specific arguments and observe result.
       */

    static void str(String x, String y){
        System.out.println(x+ " to winter Wonderland at "+ y );
    }
    static  void str(String x, String y, String z){
        System.out.println(x+ " Laugh "+ y+ z);
    }
    static void str(String x, String y, String z, String w){
        System.out.println(x+" Java "+ y+ z+ w);
    }

    public static void main(String[] args) {
        Static P=new Static();
        P.str("Welcome","Disney");

        P.str("Live "," Code"," Repeat");
        P.str("Is ","scary"," or", " fun");






    }


}
