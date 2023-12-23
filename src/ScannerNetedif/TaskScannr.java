package ScannerNetedif;

import java.util.Scanner;

public class TaskScannr {
    public static void main(String[] args) {
        System.out.println("please enter the loan amount");
        Scanner loan= new Scanner(System.in);
        double loanAmount= loan.nextDouble();
        if ((loanAmount<200000)){
            System.out.println(" you will get this loan");
        }else {
            System.out.println("you cant get loan");
        }

    }
}
