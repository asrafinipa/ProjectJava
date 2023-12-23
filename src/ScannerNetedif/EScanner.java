package ScannerNetedif;

import java.util.Scanner;

public class EScanner {
    public static void main(String[] args) {
        System.out.println("please enter ur name");
        Scanner fetchName= new Scanner(System.in);
        String name=fetchName.next();
        System.out.println(" your name is  "+name);

    }
}
