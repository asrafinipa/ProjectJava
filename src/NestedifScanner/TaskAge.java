package NestedifScanner;

import java.util.Scanner;

public class TaskAge {
    public static void main(String[] args) {
        System.out.println("what is your age");
        Scanner age= new Scanner(System.in);
        int driverAge= age.nextInt();

        if (driverAge>=18){
            System.out.println("you can get a license");
        }else {
            System.out.println("you get a license permit");
        }

    }
}





