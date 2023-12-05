package Class5;


import java.util.Scanner;

public class AndOparator {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        System.out.println(" please enter the height in inches");
        double height=sc.nextDouble();
        if (height<60){
            System.out.println(" you are short");
        } else if (height>=60&& height<=72) {
            System.out.println("you are medium");

        }else {
            System.out.println(" you are tall");
        }


    }
}
