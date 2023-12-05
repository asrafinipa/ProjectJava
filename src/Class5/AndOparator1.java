package Class5;

import java.util.Scanner;

public class AndOparator1 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("please enter the number");
        double num= sc.nextDouble();
        if (num>=1 && num <=10) {
            System.out.println(" this is a small number");
        }else if (num>=11 && num<= 100){
                System.out.println(" this number is medium");


        }else {
            System.out.println(" this is large number");
        }

    }
}
