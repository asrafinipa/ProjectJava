package StringBuilder;

import java.util.Scanner;

public class PeopleName {
    public static void main(String[] args) {

        String mom="Mary";
        String dad="Daniel";
        //String boy="danry";
        //String girl="Maiel";
        System.out.println("Is gender a boy?");
        Scanner sc=new Scanner(System.in);
        boolean gender=sc.nextBoolean();

        String temp = "ABCD1234";
        String t2 = temp.substring(0,temp.length()/2);
        String t3 = temp.substring(temp.length()/2);
        System.out.println(t3);

        if(gender){
            // boy
            System.out.println(dad.substring(0,dad.length()/2) + mom.substring(mom.length()/2));
        } else{
    // girl
            System.out.println(mom.substring(0,mom.length()/2) + dad.substring(dad.length()/2));
        }






    }
}
