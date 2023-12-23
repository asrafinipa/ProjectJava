package ScannerNetedif;

import java.util.Scanner;

public class E1scanner {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println(" please enter ur full name");
        String fullname=sc.nextLine();
        System.out.println("your full name is  "+ fullname);
        Scanner weight= new Scanner(System.in);
        System.out.println("please enter your weight in lbs");
        double fetchWeight= weight.nextDouble();
        System.out.println("you have "+ fetchWeight+ " weight");
    }
}
