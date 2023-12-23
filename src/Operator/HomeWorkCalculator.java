package Operator;

import java.util.Scanner;

public class HomeWorkCalculator {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Enter two integer");
        int  num1, num2;
        num1= input.nextInt();
        num2= input.nextInt();
        System.out.println(" please enter operator");
        String operator = input.next();

        if (operator.equals("+")){
            System.out.println(" Result of 2 numbers addition is " + (num1+num2));

        }else if (operator.equals("-")){
            System.out.println("Result of 2 numbers subtraction is " + (num1-num2 ));
        } else if (operator.equals("*")){
            System.out.println(" Result of 2 numbers subtraction is " + (num1*num2));
        }else if (operator.equals("/")){
            System.out.println(" Result of 2 numbers subtraction is " + (num1/num2));
        }else{
            System.out.println(" number is unknown");
        }






    }
}
