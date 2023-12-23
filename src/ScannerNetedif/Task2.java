package ScannerNetedif;

public class Task2 {
    public static void main(String[] args) {
        int num1 = 20;
        int num2 = 40;
        int num3 = 30;

        if (num1>num2) {
            if (num1 > num3) {
                System.out.println("num1 is the largest");
            } else {
                if (num2 > num3)
                    System.out.println("num2 is the largest");
            }
        }else {
            System.out.println("num3 is the largest");

        }





        /*if (num2> num1) {
            System.out.println(num2+ " number is larger than "+ num1 );
            if (num2 > num3) {
                System.out.println(num2 +"  one is larger than "+ num2);
            } else if (num3 > num1) {
                System.out.println(num3 + "  number is greatest ");

            }
        } else {
            System.out.println("this is not true");

        }
    }*/



    }
}