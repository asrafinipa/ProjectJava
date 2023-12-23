package Project;

import java.util.Scanner;

public class PrimeNumber{
    // no idea whatso ever :(
    public static void main(String[] args) {
        // number divisible by 1 && number itself
        // number not divisible by anything other than 1 && itself
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number here: ");
        int number= sc.nextInt();
        if(number <= 1){
            System.out.println(number + " is not prime");
        } else{
            boolean prime = true;
            for(int i=2;i<=number/2;i++)
            {
                if((number%i)==0){
                    prime = false;
                    System.out.println(number + " is divisible by: " + i);
                    break;
                }
            }
            if(prime){
                System.out.println(number + " is PRIME");
            } else{
                System.out.println(number + " is not prime");
            }
        }
    }
}
