package Class4;

import java.util.Scanner;

public class Task5scanner {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("how many years have you worked?");
        double years= sc.nextDouble();
        System.out.println("what is your annual salary?");
        double salary= sc.nextDouble();
        if (years>=5){
            System.out.println(" you are eligible for bonus");
            if(salary>50000){
                System.out.println(" you will get 5000 bonus");
            }else {
                System.out.println(" you get 3000 bonus");
            }

        }else {
            System.out.println(" you are not eligible for bonus");
        }


    }
}
