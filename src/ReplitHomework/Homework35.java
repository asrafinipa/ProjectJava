package ReplitHomework;

import java.util.Scanner;

public class Homework35 {


        public static void main(String[] args) {

                Scanner sc=new Scanner(System.in);
                System.out.println("Do you need a loan");
                boolean loan=sc.nextBoolean();

                if(loan){
                    System.out.println("What is your credit score");
                    int creditScore=sc.nextInt();
                    if(creditScore<600){
                        System.out.println("Not eligible ");
                    }else if(creditScore>=600&& creditScore<=700){
                        System.out.println("Maybe eligible ");
                    }else if(creditScore>=701&& creditScore<=800){
                        System.out.println("Eligible");

                    }else if(creditScore>801){
                        System.out.println(" Definitely eligible");
                    }
                }else{
                    System.out.println("Unknown");
                }




            }
        }



