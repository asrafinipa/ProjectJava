package Class5;

import java.util.Scanner;

public class AndOr4 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println(" what time it is?");
        int hour= sc.nextInt();

        if (hour>1 && hour <=11){
            System.out.println(" its morning");
        }else if (hour>=12 && hour<= 15){
            System.out.println(" it afternoon");
        } else if (hour>=16 && hour<=20) {
            System.out.println(" its evening");

        }else {
            System.out.println(" its night");
        }


    }
}
