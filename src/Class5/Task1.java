package Class5;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        double quizMarks,midMarks,finalMarks,avgMarks;
        System.out.println(" please enter the mark for quiz 0-100");
        quizMarks=sc.nextDouble();
        System.out.println(" please enter the mark for midMarks 0-100");
        midMarks= sc.nextDouble();
        System.out.println("please enter finalMarks");
        finalMarks= sc.nextDouble();

        avgMarks=(quizMarks+ midMarks+finalMarks )/3;
char grade;


        if (avgMarks>=90)
        { grade='A';
        } else if (avgMarks>=70) {
            grade= 'B';
        } else if (avgMarks>=50) {
            grade= 'C';
        }else {
            System.out.println(" Grade F");
        }

    }
}
