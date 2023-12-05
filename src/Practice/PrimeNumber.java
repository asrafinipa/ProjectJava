package Practice;

import java.util.Scanner;

public class PrimeNumber { //check if a number is prime or not.
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        boolean num=false;
        for(int i=2;i<=x/2;i++){
           if (x%i==0){
               num=true;
               break;
           }
        }
        if (!num){
            System.out.println(x+ " is Prime number");
        }else {
            System.out.println(x+ " is not prime number");
        }
    }
}
