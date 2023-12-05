package ReviewClass5;

import java.util.Arrays;

public class Array2 {
    public static void main(String[] args) {
        String [] student= new String[5];
        student[0]="nipa";
        student[1]="ushna";
        student[2]="nile";
        student[3]="muhit";
        student[4]="whoo";
        for (int i=0; i< student.length;i++){
            if (student[i].equals("ushna")){
                student[i]="good student";
            }
        }

        System.out.println(Arrays.toString(student));
        /*for (int i=0; i< student.length;i++){
            System.out.println(student[i]);*/
        }
    }

