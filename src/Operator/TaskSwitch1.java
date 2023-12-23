package Operator;

import java.util.Scanner;

public class TaskSwitch1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println(" Enter the country");
        String country= sc.next();

        switch (country){

            case ("bangladesh"):
                System.out.println( "user speaks bengali");
                break;
            case("usa"):
                System.out.println(" english");
                break;
            case("canada"):
                System.out.println(" canadian");
                break;
            case("uk"):
                System.out.println(" english");
                break;
            case("egypt"):
                System.out.println(" arabic");
                break;


        }

    }
}
