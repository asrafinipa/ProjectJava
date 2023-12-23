package ScannerNetedif;

import java.util.Scanner;

public class Scannerclass {
    public static void main(String[] args) {
        System.out.println(" please enter your age");

        Scanner scan= new Scanner(System.in);
        int age= scan.nextInt();
        System.out.println("you are "+ age+ " years old");
    }
}
