package Class5;

import java.util.Scanner;

public class HomeWorkCalculator2 {
    public static void main(String[] args) {
        Scanner capture=new Scanner(System.in);
        System.out.println(" Please enter two numbers");
        int num1,num2;
        num1= capture.nextInt();
        num2= capture.nextInt();
        System.out.println(" Please enter operator");
        String operator= capture.next();

        switch (operator){
            case ("+"):
                System.out.println(" result is " + (num1+num2));
                break;
            case ("-"):
                System.out.println(" result is "+ (num1-num2));
                break;
            case ("*") :
                System.out.println("result is "+ (num1*num2));
                break;
            case ("/")  :
                System.out.println(" result is "+ num1/num2);
                break;
            default:
                System.out.println(" invalid");
        }

    }
}
