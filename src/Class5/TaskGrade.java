package Class5;
/*
allow user to enter grade(a,b,c..as grade n then print
 */
import java.util.Scanner;

public class TaskGrade {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        System.out.println(" enter your grade");
        char Grade= sc.next().charAt(0);

        switch (Grade){

            case 'A':
                System.out.println("Excellent");
                break;
            case 'B':
                System.out.println("good");
                break;
            case 'C':
                System.out.println(" Average");
                break;
            case 'D':
                System.out.println("bad");
                break;
            default:
                System.out.println(" not acceptable");

        }

    }
}
