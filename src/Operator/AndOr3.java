package Operator;

import java.util.Scanner;

public class AndOr3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println(" whats the day today?");
        int days=sc.nextInt();

        if( days>=1 && days<=5) {
            System.out.println(" its a weekday");

        }else if (days>=6 && days<=7){
            System.out.println(" its weekend");
        }
        else {
            System.out.println(" its a invalid day");
        }



    }
}
