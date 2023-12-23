package ReplitHomework;

import java.util.Scanner;

public class Homework32 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println(" Please enter your gender: M or F");
        char gender = sc.next().charAt(0);
        System.out.println("Please enter your age");
        int age = sc.nextInt();

        if (age > 25) {
            if (gender == 'F') { // cant use ignorecase with charat cause it give the char value not string, Ignorecase method works for string.
                System.out.println("Woman");
            } else {
                System.out.println("Man");
            }
        } else if (age < 25) {
            if (gender == 'F') {
                System.out.println("Girl");
            } else {
                System.out.println("Boy");
            }


        }


    }
}

