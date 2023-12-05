package Class5;

/*
Write a program for user to enter his/hers birth month. Based on the month define the season.
Example: if user is born in March, April, May → season =”Spring”
if user is born in June, July, August →
season =”Summer”  etc …
At the end of the program we should see 1 output as “You were born is season __”.

 */


import java.util.Scanner;

public class TaskAndOr {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println(" whats your birth month?");
        String month= sc.next();
        if (month.equals("march")||month.equals("april")||month.equals("may")){
            System.out.println(" you are born in spring");
        } else if (month.equals("june")||month.equals("july")||month.equals("august")){
            System.out.println(" you are born in summer");

        }else if ((month.equals("december")||month.equals("january")||month.equals("february")))
        {
            System.out.println(" u r born in winter");
        }else if ((month.equals("september")||month.equals("october")||month.equals("november")))
        {
            System.out.println(" u r born in fall");
        }else {
            System.out.println(" its invalid");
        }


    }
}









