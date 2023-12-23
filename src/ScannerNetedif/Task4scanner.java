package ScannerNetedif;

import java.util.Scanner;

public class Task4scanner {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println(" do you have a credit card");
        String creditCard = scan.nextLine();

        if (creditCard.equals("yes")) {

            System.out.println(" whats the balance");
            double cardBalance = scan.nextDouble();
            if (cardBalance > 1000) {
                System.out.println("pay off your debt immediately");
            } else {
                System.out.println("you can spend more, happy shopping");
            }
        } else {
            System.out.println(" do you want a credit card");


        }
    }
}